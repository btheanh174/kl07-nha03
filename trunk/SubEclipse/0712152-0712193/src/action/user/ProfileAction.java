package action.user;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.util.Calendar;
import java.util.Date;
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

public class ProfileAction extends ActionSupport implements SessionAware,
		ModelDriven<ThanhVien> {

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

		System.out.println("Doi mat khau");
		taiKhoan = (TaiKhoan) sessionMap.get("tk");
		if (taiKhoan != null) {
			String salt = taiKhoan.getSalt();
			String hashedPassword = null;
			try {
				hashedPassword = HashUtil.generateHash(salt + getMatKhauCu());
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
	}

	public String doiEmail() {
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

	}

	public String capNhatThongTin() throws IOException {

		ServletContext servletContext = ServletActionContext
				.getServletContext();
		String imagePath = "images/avatar/";

		String rootPath = servletContext.getRealPath("/");
		String newImageName = "";
		if (image != null) {
			// Dat ten lai cho image
			String extension = "";
			if (imageFileName != null && !imageFileName.equals("")) {
				extension = imageFileName.substring(
						imageFileName.lastIndexOf("."), imageFileName.length());
			}
			long longName = Calendar.getInstance().getTimeInMillis();
			newImageName = imagePath + longName + extension;

			// Luu file xuong server
			if (!imageFileName.equals("")) {
				File fileToCreate = new File(rootPath, newImageName);
				if (!fileToCreate.exists()) {
					FileOutputStream fos = new FileOutputStream(fileToCreate);
					fos.write(FileUtils.readFileToByteArray(image));
					fos.flush();
					fos.close();
				}
			}

		}
		System.out.println("Cap nhat thong tin");
		TinhThanhPho ttp = ttpDao.lay(getMaTTP());
		//Date birthday = new Date(getNs());
		//System.out.println(birthday);
		Map sess = ServletActionContext.getContext().getSession();
		taiKhoan = (TaiKhoan) sess.get("tk");

		ThanhVien tv = taiKhoan.getThanhVien();
		System.out.println(thanhVien.getHoTen());
		tv.setHoTen(thanhVien.getHoTen());
		tv.setDiaChi(thanhVien.getDiaChi());
		tv.setDienThoai(thanhVien.getDienThoai());
		tv.setEmail(thanhVien.getEmail());

		tv.setHinh(newImageName);

		//tv.setNgaySinh(birthday);
		tv.setTinhThanhPho(ttp);
		tv.setWebsite(thanhVien.getWebsite());
		tv.setGioiTinh(thanhVien.getGioiTinh());

		taiKhoan.setThanhVien(tv);
		tv.setTaiKhoan(taiKhoan);

		tkDao.capNhat(taiKhoan);

		return SUCCESS;
	}

	public String hienThi() {
		System.out.println("Hien thi");
		// taiKhoan = tkDao.lay(maTaiKhoan);
		// thanhVien = tvDao.lay(maTaiKhoan);
		taiKhoan = (TaiKhoan) sessionMap.get("tk");
		thanhVien = taiKhoan.getThanhVien();
		return SUCCESS;
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

	public ThanhVien getModel() {
		return thanhVien;
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

	public File getHinh() {
		return image;
	}

	public void setHinh(File hinh) {
		this.image = hinh;
	}

	public String getHinhFileName() {
		return imageFileName;
	}

	public void setHinhFileName(String hinhFileName) {
		this.imageFileName = hinhFileName;
	}

	public String getHinhContentType() {
		return imageContentType;
	}

	public void setHinhContentType(String hinhContentType) {
		this.imageContentType = hinhContentType;
	}
}
