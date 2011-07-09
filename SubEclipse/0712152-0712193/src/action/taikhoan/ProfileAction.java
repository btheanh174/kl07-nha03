package action.taikhoan;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.UnsupportedEncodingException;
import java.util.Calendar;
import java.util.Map;

import javax.servlet.ServletContext;

import model.dao.TaiKhoanDAO;
import model.dao.ThanhVienDAO;
import model.dao.TinhThanhPhoDAO;
import model.pojo.TaiKhoan;
import model.pojo.ThanhVien;
import model.pojo.TinhThanhPho;

import org.apache.commons.io.FileUtils;
import org.apache.struts2.ServletActionContext;
import org.apache.struts2.interceptor.SessionAware;

import util.HashUtil;

import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.ModelDriven;

public class ProfileAction extends ActionSupport implements SessionAware, ModelDriven<ThanhVien>{

	/**
	 * 
	 */
	private static final long serialVersionUID = -5141509964117628106L;
	private Map<String, Object> sessionMap;

	private int maTaiKhoan;
	private TaiKhoan taiKhoan = new TaiKhoan();

	private ThanhVien thanhVien = new ThanhVien();
	private TaiKhoanDAO tkDao = new TaiKhoanDAO();
	private ThanhVienDAO tvDao = new ThanhVienDAO();
	private int maTTP;
	private String ns;
	private TinhThanhPhoDAO ttpDao = new TinhThanhPhoDAO();

	private String matKhauCu;
	private String matKhauMoi;
	private String xacNhanMatKhau;

	private String matKhau;
	private String email;

	private File image;
	private String imageFileName;
	private String imageContentType;

	public void setSession(Map<String, Object> session) {
		this.sessionMap = session;
	}

	public String doiMatKhau() {
		try {
			System.out.println("Doi mat khau");
			taiKhoan = (TaiKhoan) sessionMap.get("tk");
			if (taiKhoan != null) {
				String salt = taiKhoan.getSalt();
				String hashedPassword = null;
				try {
					hashedPassword = HashUtil.generateHash(salt
							+ getMatKhauCu());
				} catch (UnsupportedEncodingException e) {
					e.printStackTrace();
				}
				if (!hashedPassword.equals(taiKhoan.getMatKhau())) {
					return ERROR;
				} else {
					try {
						hashedPassword = new String(HashUtil.generateHash(salt
								+ getMatKhauMoi()));
					} catch (UnsupportedEncodingException e) {
						e.printStackTrace();
					}
					taiKhoan.setMatKhau(hashedPassword);
					tkDao.capNhat(taiKhoan);
					return SUCCESS;
				}
			} else {
				return ERROR;
			}
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
			return NONE;
		}
	}

	public String doiEmail() {
		try {
			System.out.println("Doi email");
			taiKhoan = (TaiKhoan) sessionMap.get("tk");
			if (taiKhoan != null) {
				String salt = taiKhoan.getSalt();
				String hashedPassword = null;
				try {
					hashedPassword = HashUtil.generateHash(salt + getMatKhau());
				} catch (UnsupportedEncodingException e) {
					e.printStackTrace();
				}

				if (!hashedPassword.equals(taiKhoan.getMatKhau())) {
					return ERROR;
				} else {
					thanhVien = taiKhoan.getThanhVien();
					thanhVien.setEmail(getEmail());

					taiKhoan.setThanhVien(thanhVien);
					tkDao.capNhat(taiKhoan);
					return SUCCESS;
				}
			} else {
				return ERROR;
			}
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
			return NONE;
		}

	}

	public String capNhatThongTin() throws IOException {
		try {
			System.out.println("Cập nhật thông tin cá nhân");
			ServletContext servletContext = ServletActionContext
					.getServletContext();
			String imagePath = "/images/avatar";

			Map sess = ServletActionContext.getContext().getSession();
			
			TaiKhoan tk = (TaiKhoan) sess.get("tk");
			
			ThanhVien tv = tk.getThanhVien();

			if (image != null) {
				System.out.println("Hinh khac null");
				// Dat ten lai cho image
				String extension = "";
				if (imageFileName != null && !imageFileName.equals("")) {
					extension = imageFileName.substring(
							imageFileName.lastIndexOf("."),
							imageFileName.length());
				}

				// Luu file xuong server
				if (!imageFileName.equals("")) {
					File dir = new File(servletContext.getRealPath(imagePath));

					if (!dir.exists()) {
						dir.mkdirs();
					}

					long tmp = Calendar.getInstance().getTimeInMillis();
					String newImageName = tmp + extension;
					File fileToCreate = new File(dir, newImageName);
					FileUtils.copyFile(this.image, fileToCreate);
					
					if(!fileToCreate.exists()){
						
						FileOutputStream fos = new FileOutputStream(fileToCreate);
						InputStream is = new FileInputStream(this.image);
						
						byte[] buffer = new byte[(int) this.image.length()];
						is.read(buffer);
						
						fos.write(buffer);
						fos.flush();
						fos.close();
						
						is.close();
					}
					
					tv.setHinh(imagePath + "/" + newImageName);

				}

			}
			System.out.println("Cap nhat thong tin");
			TinhThanhPho ttp = ttpDao.lay(getMaTTP());
			// Date birthday = new Date(getNs());
			// System.out.println(birthday);

			System.out.println(thanhVien.getHoTen());
			tv.setHoTen(thanhVien.getHoTen());
			tv.setDiaChi(thanhVien.getDiaChi());
			tv.setDienThoai(thanhVien.getDienThoai());
			tv.setEmail(thanhVien.getEmail());

			// tv.setNgaySinh(birthday);
			tv.setTinhThanhPho(ttp);
			tv.setWebsite(thanhVien.getWebsite());
			tv.setGioiTinh(thanhVien.getGioiTinh());

			tk.setThanhVien(tv);
			tv.setTaiKhoan(tk);

			tkDao.capNhat(tk);

			return SUCCESS;
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
			return "redirect";
		}
	}

	public String hienThi() {
		try {
			System.out.println("Hien thi");
			taiKhoan = (TaiKhoan) sessionMap.get("tk");
			thanhVien = taiKhoan.getThanhVien();
			return SUCCESS;
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
			return NONE;
		}
	}

	public int getMaTaiKhoan() {
		return maTaiKhoan;
	}

	public void setMaTaiKhoan(int maTaiKhoan) {
		this.maTaiKhoan = maTaiKhoan;
	}

	public TaiKhoan getTaiKhoan() {
		return taiKhoan;
	}

	public void setTaiKhoan(TaiKhoan taiKhoan) {
		this.taiKhoan = taiKhoan;
	}

	public ThanhVien getThanhVien() {
		return thanhVien;
	}

	public void setThanhVien(ThanhVien thanhVien) {
		this.thanhVien = thanhVien;
	}

	public String getMatKhauCu() {
		return matKhauCu;
	}

	public void setMatKhauCu(String matKhauCu) {
		this.matKhauCu = matKhauCu;
	}

	public String getMatKhauMoi() {
		return matKhauMoi;
	}

	public void setMatKhauMoi(String matKhauMoi) {
		this.matKhauMoi = matKhauMoi;
	}

	public String getXacNhanMatKhau() {
		return xacNhanMatKhau;
	}

	public void setXacNhanMatKhau(String xacNhanMatKhau) {
		this.xacNhanMatKhau = xacNhanMatKhau;
	}

	public String getMatKhau() {
		return matKhau;
	}

	public void setMatKhau(String matKhau) {
		this.matKhau = matKhau;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public int getMaTTP() {
		return maTTP;
	}

	public void setMaTTP(int maTTP) {
		this.maTTP = maTTP;
	}

	public String getNs() {
		return ns;
	}

	public void setNs(String ns) {
		this.ns = ns;
	}

	public File getImage() {
		return image;
	}

	public void setImage(File image) {
		this.image = image;
	}

	public String getImageFileName() {
		return imageFileName;
	}

	public void setImageFileName(String imageFileName) {
		this.imageFileName = imageFileName;
	}

	public String getImageContentType() {
		return imageContentType;
	}

	public void setImageContentType(String imageContentType) {
		this.imageContentType = imageContentType;
	}

	@Override
	public ThanhVien getModel() {
		// TODO Auto-generated method stub
		return thanhVien;
	}

}
