package action;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

import javax.servlet.ServletContext;

import model.dao.DanhMucDAO;
import model.dao.DienThoaiDAO;
import model.dao.HinhAnhDAO;
import model.dao.LaptopDAO;
import model.dao.SanPhamDAO;
import model.dao.ThamSoDAO;
import model.pojo.DanhMuc;
import model.pojo.DienThoai;
import model.pojo.DienThoaiTieuChi;
import model.pojo.DuLieuTrang;
import model.pojo.HinhAnh;
import model.pojo.Laptop;
import model.pojo.LaptopTieuChi;
import model.pojo.SanPham;
import model.pojo.SanPhamTieuChi;

import org.apache.commons.io.FileUtils;
import org.apache.struts2.ServletActionContext;
import org.apache.struts2.interceptor.SessionAware;

import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.ModelDriven;
import com.opensymphony.xwork2.Preparable;

public class SanPhamAction extends ActionSupport implements
		ModelDriven<SanPham>, Preparable, SessionAware {

	/**
	 * 
	 */
	private static final long serialVersionUID = -6399634351690725889L;
	public static final String STEP2 = "step2";
	public static final String FINISH = "finish";

	private Map<String, Object> session;

	private List<File> dsImages = new ArrayList<File>(3);
	private List<String> dsImagesContentType = new ArrayList<String>(3);
	private List<String> dsImagesFileName = new ArrayList<String>(3);

	SanPhamDAO spDao = new SanPhamDAO();
	HinhAnhDAO haDao = new HinhAnhDAO();
	DanhMucDAO dmDao = new DanhMucDAO();
	ThamSoDAO tsDao = new ThamSoDAO();

	private int maSanPham;
	private SanPham sanPham;
	private Laptop laptop;
	private DienThoai dienthoai;
	private List<SanPham> dsSanPham = new ArrayList<SanPham>();
	private List<SanPham> dsSanPhamCungLoai = new ArrayList<SanPham>();

	private SanPhamTieuChi tieuChi;
	private DienThoaiTieuChi dt = new DienThoaiTieuChi();
	private LaptopTieuChi lt = new LaptopTieuChi();
	private String loaiSanPham;

	private int trang = 1;
	private int tongSoTrang;
	private List<Integer> soTrang = new ArrayList<Integer>();

	private static final String PRODUCT_PATH = "images/product";

	public String execute() {
		dsSanPham = spDao.layDanhSach();
		return SUCCESS;
	}

	public String chiTiet() {
		sanPham = spDao.lay(maSanPham);
		dsSanPhamCungLoai = spDao.layDanhSach(sanPham.getDanhMuc());
		if (dsSanPhamCungLoai.contains(sanPham)) {
			dsSanPhamCungLoai.remove(sanPham);
		}
		return SUCCESS;
	}

	public String timNhanh() {
		System.out.println("Trang hien tai = " + trang);
		int soSanPhamTrenTrang = tsDao.layGiaTri(1);
		DuLieuTrang duLieuTrang = spDao.timKiem(tieuChi, trang,
				soSanPhamTrenTrang);
		tongSoTrang = duLieuTrang.getTongSoTrang();
		System.out.println("Tong so trang = " + tongSoTrang);
		dsSanPham = duLieuTrang.getDsDuLieu();
		return SUCCESS;
	}

	public String timNangCao() {

		System.out.println(loaiSanPham);
		if ("DIENTHOAI".equalsIgnoreCase(loaiSanPham)) {
			System.out.println(dt.getTenSanPham());
			DuLieuTrang duLieuTrang = spDao.timKiem(dt, trang);
			tongSoTrang = duLieuTrang.getTongSoTrang();
			dsSanPham = duLieuTrang.getDsDuLieu();
			return SUCCESS;
		} else if ("LAPTOP".equalsIgnoreCase(loaiSanPham)) {
			DuLieuTrang duLieuTrang = spDao.timKiem(lt, trang);
			tongSoTrang = duLieuTrang.getTongSoTrang();
			dsSanPham = duLieuTrang.getDsDuLieu();
			return SUCCESS;
		} else {
			return "error";
		}
	}

	public String themSanPham_step1() throws IOException {

		ServletContext servletContext = ServletActionContext
				.getServletContext();

		String dataDir = servletContext.getRealPath(PRODUCT_PATH);
		File folder = new File(dataDir);
		if (!folder.exists()) {
			folder.mkdirs();
		}

		Set<HinhAnh> dsHinhAnh = new HashSet<HinhAnh>();
		for (int i = 0; i < dsImages.size(); i++)
			if (dsImages.get(i) != null) {
				// attachment will be null if there's an error,
				// such as if the uploaded file is too large

				long tmp = Calendar.getInstance().getTimeInMillis();
				String fileName = dsImagesFileName.get(i);
				fileName = fileName.replaceAll(" ", "");
				String onlyName = fileName.substring(0,
						fileName.lastIndexOf("."));
				System.out.println("file name = " + fileName);

				String extension = fileName.substring(
						fileName.lastIndexOf("."), fileName.length());
				String newImageName = onlyName + "_" + tmp + extension;
				File fileToCreate = new File(folder, newImageName);
				FileUtils.copyFile(dsImages.get(i), fileToCreate);

				/*
				 * // Lưu hình vào images/product của project String
				 * dataDirProject =
				 * "C:\\Documents and Settings\\Mai Thanh Huy\\Desktop\\SVN Workspace\\Workspace1\\0712152-0712193\\WebContent\\images\\product"
				 * ; File folderProject = new File(dataDirProject); if
				 * (!folderProject.exists()) { folderProject.mkdirs(); } File
				 * fileInProject = new File(folderProject, newImageName);
				 * FileUtils.copyFile(dsImages.get(i), fileInProject); // Hết!
				 */
				HinhAnh ha = new HinhAnh(null, PRODUCT_PATH + "/"
						+ newImageName, null);
				dsHinhAnh.add(ha);

			}
		session.put("dsHinhAnh", dsHinhAnh);
		DanhMuc dmTemp = dmDao.lay(sanPham.getDanhMuc().getMaDanhMuc());
		if (sanPham.getLoaiSanPham().equals("1")) // Là laptop
		{
			laptop = new Laptop(sanPham.getTenSanPham(), sanPham.getGia(),
					sanPham.getHangSanXuat(), sanPham.getDsHinhAnh(), dmTemp,
					sanPham.getDsGianHangSanPham());
			session.put("lt", laptop);

		} else {
			dienthoai = new DienThoai(sanPham.getTenSanPham(),
					sanPham.getGia(), sanPham.getHangSanXuat(),
					sanPham.getDsHinhAnh(), dmTemp,
					sanPham.getDsGianHangSanPham());
			session.put("dt", dienthoai);
		}
		session.put("loai", sanPham.getLoaiSanPham());
		return STEP2;
	}

	public String themSanPham_step2() {
		loaiSanPham = (String) session.get("loai");
		if (loaiSanPham.equals("1")) {
			Laptop laptopTemp = (Laptop) session.get("lt");
			laptop.setTenSanPham(laptopTemp.getTenSanPham());
			laptop.setGia(laptopTemp.getGia());
			laptop.setHangSanXuat(laptopTemp.getHangSanXuat());
			laptop.setDsHinhAnh(laptopTemp.getDsHinhAnh());
			laptop.setDanhMuc(laptopTemp.getDanhMuc());
			laptop.setDsGianHangSanPham(laptopTemp.getDsGianHangSanPham());
			session.put("lt", laptop);
		} else {
			DienThoai dienthoaiTemp = (DienThoai) session.get("dt");
			dienthoai.setTenSanPham(dienthoaiTemp.getTenSanPham());
			dienthoai.setGia(dienthoaiTemp.getGia());
			dienthoai.setHangSanXuat(dienthoaiTemp.getHangSanXuat());
			dienthoai.setDsHinhAnh(dienthoaiTemp.getDsHinhAnh());
			dienthoai.setDanhMuc(dienthoaiTemp.getDanhMuc());
			dienthoai
					.setDsGianHangSanPham(dienthoaiTemp.getDsGianHangSanPham());
			session.put("dt", dienthoai);
		}

		return SUCCESS;
	}

	public String themSanPham_step3() {
		try {
			String loai = (String) session.get("loai");
			Set<HinhAnh> dsHinhAnh = (Set<HinhAnh>) session.get("dsHinhAnh");
			if (loai.equals("1")) {
				laptop = (Laptop) session.get("lt");
				LaptopDAO ltDao = new LaptopDAO();
				ltDao.them(laptop);
				// Lưu hình vào csdl

				// Iterating over the elements in the set
				Iterator<HinhAnh> it = dsHinhAnh.iterator();
				while (it.hasNext()) {
					// Get element
					HinhAnh element = it.next();
					element.setSanPham(laptop);
					haDao.them(element);
				}
				session.remove("lt");
			} else {
				dienthoai = (DienThoai) session.get("dt");
				DienThoaiDAO dtDao = new DienThoaiDAO();
				dtDao.them(dienthoai);
				// Lưu hình vào csdl

				// Iterating over the elements in the set
				Iterator<HinhAnh> it = dsHinhAnh.iterator();
				while (it.hasNext()) {
					// Get element
					HinhAnh element = it.next();
					element.setSanPham(dienthoai);
					haDao.them(element);
				}
				session.remove("dt");
			}

			return FINISH;
		} catch (Exception e) {
			// TODO: handle exception
			return ERROR;
		}
	}

	public SanPham getModel() {
		// TODO Auto-generated method stub
		return sanPham;
	}

	public SanPham getSanPham() {
		return sanPham;
	}

	public void setSanPham(SanPham sanPham) {
		this.sanPham = sanPham;
	}

	/*
	 * public List<SanPham> getListSanPham() { return listSanPham; }
	 * 
	 * public void setListSanPham(List<SanPham> listSanPham) { this.listSanPham
	 * = listSanPham; }
	 */

	public int getMaSanPham() {
		return maSanPham;
	}

	public List<SanPham> getDsSanPham() {
		return dsSanPham;
	}

	public void setDsSanPham(List<SanPham> dsSanPham) {
		this.dsSanPham = dsSanPham;
	}

	public void setMaSanPham(int maSanPham) {
		this.maSanPham = maSanPham;
	}

	public void prepare() throws Exception {
		if (maSanPham != 0) {
			sanPham = spDao.lay(maSanPham);
		} else {
			sanPham = new SanPham();
		}
	}

	public SanPhamTieuChi getTieuChi() {
		return tieuChi;
	}

	public void setTieuChi(SanPhamTieuChi tieuChi) {
		this.tieuChi = tieuChi;
	}

	public DienThoaiTieuChi getDt() {
		return dt;
	}

	public void setDt(DienThoaiTieuChi dt) {
		this.dt = dt;
	}

	public LaptopTieuChi getLt() {
		return lt;
	}

	public void setLt(LaptopTieuChi lt) {
		this.lt = lt;
	}

	public int getTrang() {
		return trang;
	}

	public void setTrang(int trang) {
		this.trang = trang;
	}

	public List<Integer> getSoTrang() {
		for (int i = 1; i <= getTongSoTrang(); i++) {
			soTrang.add(i);
		}
		return soTrang;
	}

	public void setSoTrang(List<Integer> soTrang) {
		this.soTrang = soTrang;
	}

	public int getTongSoTrang() {
		return tongSoTrang;
	}

	public void setTongSoTrang(int tongSoTrang) {
		this.tongSoTrang = tongSoTrang;
	}

	public String getLoaiSanPham() {
		return loaiSanPham;
	}

	public void setLoaiSanPham(String loaiSanPham) {
		this.loaiSanPham = loaiSanPham;
	}

	public void setLaptop(Laptop laptop) {
		this.laptop = laptop;
	}

	public Laptop getLaptop() {
		return laptop;
	}

	public List<File> getDsImages() {
		return dsImages;
	}

	public void setDsImages(List<File> dsImages) {
		this.dsImages = dsImages;
	}

	public List<String> getDsImagesContentType() {
		return dsImagesContentType;
	}

	public void setDsImagesContentType(List<String> dsImagesContentType) {
		this.dsImagesContentType = dsImagesContentType;
	}

	public List<String> getDsImagesFileName() {
		return dsImagesFileName;
	}

	public void setDsImagesFileName(List<String> dsImagesFileName) {
		this.dsImagesFileName = dsImagesFileName;
	}

	public void setSession(Map<String, Object> session) {
		// TODO Auto-generated method stub
		this.session = session;
	}

	public void setDienthoai(DienThoai dienthoai) {
		this.dienthoai = dienthoai;
	}

	public DienThoai getDienthoai() {
		return dienthoai;
	}

	public List<SanPham> getDsSanPhamCungLoai() {
		return dsSanPhamCungLoai;
	}

	public void setDsSanPhamCungLoai(List<SanPham> dsSanPhamCungLoai) {
		this.dsSanPhamCungLoai = dsSanPhamCungLoai;
	}

}
