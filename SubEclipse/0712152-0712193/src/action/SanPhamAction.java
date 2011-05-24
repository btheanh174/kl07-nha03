package action;

import java.io.File;
import java.util.ArrayList;
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
	private List<SanPham> dsSanPham;

	private SanPhamTieuChi tieuChi;
	private DienThoaiTieuChi dt = new DienThoaiTieuChi();
	private LaptopTieuChi lt = new LaptopTieuChi();
	private String loaiSanPham;

	private int trang = 1;
	private int tongSoTrang;
	private List<Integer> soTrang = new ArrayList<Integer>();

	public String execute() {
		dsSanPham = spDao.layDanhSach();
		return SUCCESS;
	}

	public String chiTiet() {
		sanPham = spDao.lay(maSanPham);
		return SUCCESS;
	}

	public String timNhanh() {
		System.out.println("Trang hien tai = " + trang);
		int soSanPhamTrenTrang = tsDao.layGiaTri(1);
		DuLieuTrang duLieuTrang = spDao.timKiem(tieuChi, trang, soSanPhamTrenTrang);
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

	public String themSanPham_step1() {

		ServletContext servletContext = ServletActionContext
				.getServletContext();
		// String dataDir = servletContext.getRealPath("/WEB-INF");

		String dataDir = servletContext.getRealPath("/WEB-INF")
				+ "\\uploadPicture";
		File folder = new File(dataDir);
		if (!folder.exists()) {
			folder.mkdir();
		}

		Set<HinhAnh> dsHinhAnh = new HashSet<HinhAnh>();
		for (int i = 0; i < dsImages.size(); i++)
			if (dsImages.get(i) != null) {
				// attachment will be null if there's an error,
				// such as if the uploaded file is too large

				File savedFile = new File(dataDir, dsImagesFileName.get(i));
				dsImages.get(i).renameTo(savedFile);
				dsHinhAnh.add(new HinhAnh(sanPham.getTenSanPham(),
						dsImagesFileName.get(i), null));

			}
		session.put("dsHinhAnh", dsHinhAnh);
		DanhMuc dmTemp = dmDao.lay(sanPham.getDanhMuc().getMaDanhMuc());
		if (sanPham.getLoaiSanPham().equals("1")) // Là laptop
		{
			laptop = new Laptop(sanPham.getTenSanPham(), sanPham.getGia(),
					sanPham.getHangSanXuat(), sanPham.getDsHinhAnh(), dmTemp,
					sanPham.getDsGianHang());
			session.put("lt", laptop);

		} else {
			dienthoai = new DienThoai(sanPham.getTenSanPham(),
					sanPham.getGia(), sanPham.getHangSanXuat(),
					sanPham.getDsHinhAnh(), dmTemp, sanPham.getDsGianHang());
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
			laptop.setDsGianHang(laptopTemp.getDsGianHang());
			session.put("lt", laptop);
		} else {
			DienThoai dienthoaiTemp = (DienThoai) session.get("dt");
			dienthoai.setTenSanPham(dienthoaiTemp.getTenSanPham());
			dienthoai.setGia(dienthoaiTemp.getGia());
			dienthoai.setHangSanXuat(dienthoaiTemp.getHangSanXuat());
			dienthoai.setDsHinhAnh(dienthoaiTemp.getDsHinhAnh());
			dienthoai.setDanhMuc(dienthoaiTemp.getDanhMuc());
			dienthoai.setDsGianHang(dienthoaiTemp.getDsGianHang());
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
			}
			else
			{
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

	@Override
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

	/*public List<SanPham> getListSanPham() {
		return listSanPham;
	}

	public void setListSanPham(List<SanPham> listSanPham) {
		this.listSanPham = listSanPham;
	}*/

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

	@Override
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

	@Override
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
}
