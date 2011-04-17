package model.pojo;

public class SanPham {
	private int maSanPham;
	private String tenSanPham;
	private float gia;
	private String moTaNgan;
	private String moTaDai;
	private String hinhNho;
	private String hinhLon;
	private String nhaSanXuat;
	private DanhMuc danhMuc;
	
	private String danhSachGianHang; // tap tin xml mo ta danh sach gian hang ban san pham nay
	public SanPham() {
		super();
	}
	
	// Khoi tao khi khong biet truoc danhMuc
	public SanPham(String tenSanPham, float gia,
			String moTaNgan, String moTaDai, String hinhNho, String hinhLon,
			String nhaSanXuat, String danhSachGianHang) {
		super();
		this.tenSanPham = tenSanPham;
		this.gia = gia;
		this.moTaNgan = moTaNgan;
		this.moTaDai = moTaDai;
		this.hinhNho = hinhNho;
		this.hinhLon = hinhLon;
		this.nhaSanXuat = nhaSanXuat;
		this.danhSachGianHang = danhSachGianHang;
	}
	// Khoi tao khi biet truoc danhMuc
	public SanPham(String tenSanPham, float gia,
			String moTaNgan, String moTaDai, String hinhNho, String hinhLon,
			String nhaSanXuat, DanhMuc danhMuc, String danhSachGianHang) {
		super();
		this.tenSanPham = tenSanPham;
		this.gia = gia;
		this.moTaNgan = moTaNgan;
		this.moTaDai = moTaDai;
		this.hinhNho = hinhNho;
		this.hinhLon = hinhLon;
		this.nhaSanXuat = nhaSanXuat;
		this.danhSachGianHang = danhSachGianHang;
		
		this.danhMuc = danhMuc;
	}
	
	public int getMaSanPham() {
		return maSanPham;
	}
	public void setMaSanPham(int maSanPham) {
		this.maSanPham = maSanPham;
	}
	
	public String getTenSanPham() {
		return tenSanPham;
	}
	public void setTenSanPham(String tenSanPham) {
		this.tenSanPham = tenSanPham;
	}
	
	public float getGia() {
		return gia;
	}
	public void setGia(float gia) {
		this.gia = gia;
	}
	
	public String getMoTaNgan() {
		return moTaNgan;
	}
	public void setMoTaNgan(String moTaNgan) {
		this.moTaNgan = moTaNgan;
	}
	
	public String getMoTaDai() {
		return moTaDai;
	}
	public void setMoTaDai(String moTaDai) {
		this.moTaDai = moTaDai;
	}
	
	public String getHinhNho() {
		return hinhNho;
	}
	public void setHinhNho(String hinhNho) {
		this.hinhNho = hinhNho;
	}
	
	public String getHinhLon() {
		return hinhLon;
	}
	public void setHinhLon(String hinhLon) {
		this.hinhLon = hinhLon;
	}
	
	public String getNhaSanXuat() {
		return nhaSanXuat;
	}
	public void setNhaSanXuat(String nhaSanXuat) {
		this.nhaSanXuat = nhaSanXuat;
	}
	
	public String getDanhSachGianHang() {
		return danhSachGianHang;
	}
	public void setDanhSachGianHang(String danhSachGianHang) {
		this.danhSachGianHang = danhSachGianHang;
	}
	/*public int getDanhMuc() {
		return danhMuc;
	}
	public void setDanhMuc(int danhMuc) {
		this.danhMuc = danhMuc;
	}*/
	
	public DanhMuc getDanhMuc() {
		return danhMuc;
	}
	public void setDanhMuc(DanhMuc danhMuc) {
		this.danhMuc = danhMuc;
	}
	
}
