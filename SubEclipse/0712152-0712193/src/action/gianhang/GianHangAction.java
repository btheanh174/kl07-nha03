package action.gianhang;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;
import java.util.Map;

import javax.servlet.ServletContext;
import javax.servlet.http.HttpServletRequest;

import model.dao.DanhMucDAO;
import model.dao.DanhMucGianHangDAO;
import model.dao.GianHangDAO;
import model.dao.GianHangSanPhamDAO;
import model.dao.NhomDanhMucDAO;
import model.dao.SanPhamDAO;
import model.dao.ThamSoDAO;
import model.pojo.DanhMuc;
import model.pojo.DanhMucGianHang;
import model.pojo.DuLieuTrang;
import model.pojo.GianHang;
import model.pojo.GianHangSanPham;
import model.pojo.NhomDanhMuc;
import model.pojo.SanPham;
import model.pojo.SanPhamTieuChi;
import model.pojo.TaiKhoan;

import org.apache.commons.io.FileUtils;
import org.apache.struts2.ServletActionContext;
import org.apache.struts2.interceptor.ServletRequestAware;
import org.apache.struts2.interceptor.SessionAware;

import util.NumberUtil;

import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.ModelDriven;
import com.opensymphony.xwork2.Preparable;

public class GianHangAction extends ActionSupport implements SessionAware,
		ServletRequestAware {
	// Tim nhanh
	private static final String TIM_NHANH = "search";
	private String loai;
	private String ten;
	private String min;
	private String max;
	private ThamSoDAO tsDao = new ThamSoDAO();
	//
	private String module;

	private int maGianHang;
	private GianHang gianHang = new GianHang();
	private GianHangDAO ghDao = new GianHangDAO();

	private int maSanPham;
	private SanPham sanPham = new SanPham();
	private List<GianHangSanPham> dsSanPhamCungLoai = new ArrayList<GianHangSanPham>();
	private int trang;
	private int tongSoTrang;
	private List<Integer> soTrang;
	private int maDanhMuc;
	private List<SanPham> dsSanPham = new ArrayList<SanPham>();
	private SanPhamDAO spDao = new SanPhamDAO();
	private DanhMucDAO dmDao = new DanhMucDAO();

	private Map<String, Object> session;
	private HttpServletRequest servletRequest;

	private TaiKhoan tk = new TaiKhoan();
	// Danh cho upload
	private File logo;
	private String logoFileName;
	private String logoContentType;

	private File banner;
	private String bannerFileName;
	private String bannerContentType;

	private static final String LOGO_UPLOAD = "/images/logo";
	private static final String BANNER_UPLOAD = "/images/banner";
	// Hien thi danh muc gian hang
	private List<NhomDanhMuc> dsNhomDanhMuc = new ArrayList<NhomDanhMuc>();
	private List<DanhMucGianHang> dsDanhMucGianHang = new ArrayList<DanhMucGianHang>();
	private NhomDanhMucDAO ndmDao = new NhomDanhMucDAO();
	private DanhMucGianHangDAO dmghDao = new DanhMucGianHangDAO();
	//
	private GianHangSanPham gianHangSanPham = new GianHangSanPham();
	private List<GianHangSanPham> dsGianHangSanPham = new ArrayList<GianHangSanPham>();
	
	private GianHangSanPhamDAO ghspDao = new GianHangSanPhamDAO();

	public String hienThi() {
		System.out.println("Hien thi store");
		tk = (TaiKhoan) session.get("tk");
		if (tk != null) {
			gianHang = tk.getGianHang();
			session.put("store", gianHang);
			System.out.println("Ngay tham gia: " + gianHang.getNgayThamGia());
		}
		return SUCCESS;
	}

	public String capNhat() throws IOException {
		try {
			System.out.println("Cap nhat store");

			this.session = ServletActionContext.getContext().getSession();

			GianHang gh = (GianHang) session.get("store");
			if (gh == null) {
				gh = new GianHang();
			}

			ServletContext servletContext = ServletActionContext
					.getServletContext();
			// Khởi tạo đường dẫn để lưu logo và banner
			String rootPath = servletContext.getResource("/").toString();
			System.out.println(rootPath);
			// Tạo tên cho logo và banner dựa theo miliseconds để khỏi bị trùng

			String logoExtension = "";
			if (logoFileName != null && !logoFileName.equals("")) {
				logoExtension = logoFileName.substring(
						logoFileName.lastIndexOf("."), logoFileName.length());
			}

			String newLogoName = "";

			String bannerExtension = "";
			if (bannerFileName != null && !bannerFileName.equals("")) {
				bannerExtension = bannerFileName.substring(
						bannerFileName.lastIndexOf("."),
						bannerFileName.length());
			}
			String newBannerName = "";

			// Lưu file lên server
			if (logo != null) {
				if (!logoFileName.equals("")) {
					System.out
							.println("Lưu logo vào đường dẫn: " + newLogoName);

					File logoDir = new File(
							servletContext.getRealPath(LOGO_UPLOAD));

					if (!logoDir.exists()) {
						logoDir.mkdirs();
					}

					long tmp = Calendar.getInstance().getTimeInMillis();
					newLogoName = tmp + logoExtension;

					File fileToCreate = new File(logoDir, newLogoName);
					FileUtils.copyFile(this.logo, fileToCreate);

					gianHang.setLogo(LOGO_UPLOAD + "/" + newLogoName);
					gh.setLogo(gianHang.getLogo());
				}
			}
			if (banner != null) {
				if (!bannerFileName.equals("")) {
					System.out.println("Lưu banner vào đường dẫn: "
							+ newBannerName);
					File bannerDir = new File(
							servletContext.getRealPath(BANNER_UPLOAD));

					if (!bannerDir.exists()) {
						bannerDir.mkdirs();
					}

					long tmp = Calendar.getInstance().getTimeInMillis();
					newBannerName = tmp + bannerExtension;

					File fileToCreate = new File(bannerDir, newBannerName);
					FileUtils.copyFile(this.banner, fileToCreate);

					gianHang.setBanner(BANNER_UPLOAD + "/" + newBannerName);
					gh.setBanner(gianHang.getBanner());
				}
			}

			// Gán giá trị cho gh
			gh.setTenGianHang(gianHang.getTenGianHang());

			gh.setChinhSach(gianHang.getChinhSach());
			gh.setDiaChi(gianHang.getDiaChi());
			gh.setDienThoai(gianHang.getDienThoai());
			gh.setFax(gianHang.getFax());
			gh.setYahoo(gianHang.getYahoo());
			gh.setGioiThieu(gianHang.getGioiThieu());
			gh.setThongTin(gianHang.getThongTin());

			ghDao.capNhat(gh);
			return SUCCESS;
		} catch (Exception ex) {
			ex.printStackTrace();
			return INPUT;
		}
	}

	public String intro() {
		System.out.println("Cap nhat thong tin gioi thieu gian hang");
		try {

			this.session = ServletActionContext.getContext().getSession();
			TaiKhoan tk = (TaiKhoan) this.session.get("tk");
			GianHang gh = tk.getGianHang();
			if (gh == null) {
				gh = new GianHang();
			}

			if (gianHang.getGioiThieu() != null
					|| !"".equals(gianHang.getGioiThieu())) {
				gh.setGioiThieu(gianHang.getGioiThieu());
			}

			ghDao.capNhat(gh);
			return SUCCESS;
		} catch (Exception e) {
			e.printStackTrace();
			return "redirect";
		}
	}

	public String policy() {
		try {

			this.session = ServletActionContext.getContext().getSession();
			TaiKhoan tk = (TaiKhoan) this.session.get("tk");
			GianHang gh = tk.getGianHang();
			if (gh == null) {
				gh = new GianHang();
			}

			if (gianHang.getChinhSach() != null
					|| !"".equals(gianHang.getChinhSach())) {
				gh.setChinhSach(gianHang.getChinhSach());
			}

			ghDao.capNhat(gh);
			return SUCCESS;
		} catch (Exception e) {
			e.printStackTrace();
			return "redirect";
		}
	}

	public String footer() {
		return SUCCESS;
	}

	@Override
	public String execute() throws Exception {
		// Hien thi store

		System.out.println("invoke execute in GianHangAction");
		System.out.println(module);
		try {
			gianHang = ghDao.lay(maGianHang);
			dsNhomDanhMuc = ndmDao.layDanhSach(gianHang);
			dsDanhMucGianHang = dmghDao.layDanhSach(gianHang);
			System.out.println("So danh muc cua gian hang " + maGianHang
					+ " = " + dsDanhMucGianHang.size());
			for (int i = 0; i < dsDanhMucGianHang.size(); i++) {
				System.out.println(dsDanhMucGianHang.get(i).getDanhMuc()
						.getTenDanhMuc());
			}

			System.out.println(gianHang.getGioiThieu());
		} catch (NullPointerException e) {
			return "error";
		}
		if (module != null) {
			if (TIM_NHANH.equalsIgnoreCase(module)) {
				System.out.println("Tim kiem san pham don gian");
				SanPhamTieuChi tieuChi = new SanPhamTieuChi(getTen(), getMax(),
						getMin(), getLoai());
				int soSanPhamTrenTrang = tsDao.layGiaTri(1);
				DuLieuTrang duLieuTrang = spDao.timKiem(tieuChi, trang,
						soSanPhamTrenTrang);
				tongSoTrang = duLieuTrang.getTongSoTrang();
				dsSanPham = duLieuTrang.getDsDuLieu();
				System.out.println(dsSanPham.size());
			}
			return module;
		} else if (maSanPham > 0) {
			System.out.println("Chi tiet san pham");
			sanPham = spDao.lay(maSanPham);
			gianHangSanPham = ghspDao.lay(gianHang, sanPham);
			//dsSanPhamCungLoai = spDao.layDanhSach(sanPham.getDanhMuc());
			dsSanPhamCungLoai = ghspDao.layDanhSach(gianHang, sanPham.getDanhMuc());
			if (dsSanPhamCungLoai.contains(gianHangSanPham)) {
				System.out.println("blah");
				dsSanPhamCungLoai.remove(gianHangSanPham);
			}

			return "detail";
		} else if (maDanhMuc > 0) {
			System.out.println("Lay danh sach san pham cua danh muc: "
					+ maDanhMuc);
			DanhMuc danhMuc = dmDao.lay(maDanhMuc);
			dsGianHangSanPham = ghspDao.layDanhSach(gianHang, danhMuc);
			System.out.println("so san pham cua gian hang theo danh muc "
					+ maDanhMuc + " = " + dsGianHangSanPham.size());

			return "list";
		}
		return "index";
	}

	public void setSession(Map<String, Object> session) {
		this.session = session;
	}

	public int getMaGianHang() {
		return maGianHang;
	}

	public void setMaGianHang(int maGianHang) {
		this.maGianHang = maGianHang;
	}

	public GianHang getGianHang() {
		return gianHang;
	}

	public void setGianHang(GianHang gianHang) {
		this.gianHang = gianHang;
	}

	public File getLogo() {
		return logo;
	}

	public void setLogo(File logo) {
		this.logo = logo;
	}

	public String getLogoFileName() {
		return logoFileName;
	}

	public void setLogoFileName(String logoFileName) {
		this.logoFileName = logoFileName;
	}

	public String getLogoContentType() {
		return logoContentType;
	}

	public void setLogoContentType(String logoContentType) {
		this.logoContentType = logoContentType;
	}

	public File getBanner() {
		return banner;
	}

	public void setBanner(File banner) {
		this.banner = banner;
	}

	public String getBannerFileName() {
		return bannerFileName;
	}

	public void setBannerFileName(String bannerFileName) {
		this.bannerFileName = bannerFileName;
	}

	public String getBannerContentType() {
		return bannerContentType;
	}

	public void setBannerContentType(String bannerContentType) {
		this.bannerContentType = bannerContentType;
	}

	public void setServletRequest(HttpServletRequest request) {
		this.servletRequest = request;
	}

	public String getModule() {
		return module;
	}

	public void setModule(String module) {
		this.module = module;
	}

	public int getMaSanPham() {
		return maSanPham;
	}

	public void setMaSanPham(int maSanPham) {
		this.maSanPham = maSanPham;
	}

	public SanPham getSanPham() {
		return sanPham;
	}

	public void setSanPham(SanPham sanPham) {
		this.sanPham = sanPham;
	}

	public int getTrang() {
		return trang;
	}

	public void setTrang(int trang) {
		this.trang = trang;
	}

	public int getTongSoTrang() {
		return tongSoTrang;
	}

	public void setTongSoTrang(int tongSoTrang) {
		this.tongSoTrang = tongSoTrang;
	}

	public List<Integer> getSoTrang() {
		this.soTrang = NumberUtil.getIntListFromInt(this.tongSoTrang);
		return soTrang;
	}

	public void setSoTrang(List<Integer> soTrang) {
		this.soTrang = soTrang;
	}

	public List<SanPham> getDsSanPham() {
		return dsSanPham;
	}

	public void setDsSanPham(List<SanPham> dsSanPham) {
		this.dsSanPham = dsSanPham;
	}

	public int getMaDanhMuc() {
		return maDanhMuc;
	}

	public void setMaDanhMuc(int maDanhMuc) {
		this.maDanhMuc = maDanhMuc;
	}

	public List<GianHangSanPham> getDsSanPhamCungLoai() {
		return dsSanPhamCungLoai;
	}

	public void setDsSanPhamCungLoai(List<GianHangSanPham> dsSanPhamCungLoai) {
		this.dsSanPhamCungLoai = dsSanPhamCungLoai;
	}

	public String getLoai() {
		return loai;
	}

	public void setLoai(String loai) {
		this.loai = loai;
	}

	public String getTen() {
		return ten;
	}

	public void setTen(String ten) {
		this.ten = ten;
	}

	public String getMin() {
		return min;
	}

	public void setMin(String min) {
		this.min = min;
	}

	public String getMax() {
		return max;
	}

	public void setMax(String max) {
		this.max = max;
	}

	public List<NhomDanhMuc> getDsNhomDanhMuc() {
		return dsNhomDanhMuc;
	}

	public void setDsNhomDanhMuc(List<NhomDanhMuc> dsNhomDanhMuc) {
		this.dsNhomDanhMuc = dsNhomDanhMuc;
	}

	public List<DanhMucGianHang> getDsDanhMucGianHang() {
		return dsDanhMucGianHang;
	}

	public void setDsDanhMucGianHang(List<DanhMucGianHang> dsDanhMucGianHang) {
		this.dsDanhMucGianHang = dsDanhMucGianHang;
	}

	public List<GianHangSanPham> getDsGianHangSanPham() {
		return dsGianHangSanPham;
	}

	public void setDsGianHangSanPham(List<GianHangSanPham> dsGianHangSanPham) {
		this.dsGianHangSanPham = dsGianHangSanPham;
	}

	public GianHangSanPham getGianHangSanPham() {
		return gianHangSanPham;
	}

	public void setGianHangSanPham(GianHangSanPham gianHangSanPham) {
		this.gianHangSanPham = gianHangSanPham;
	}

}
