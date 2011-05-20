package model.pojo;

import java.util.HashSet;
import java.util.Set;

public class GianHang {
	
	private int maGianHang;
	private String tenGianHang;
	private String diaChi;
	private String dienThoai;
	private String fax;
	private String yahoo;
	private String thongTin;
	private String banner;
	private String logo;
	private TaiKhoan taiKhoan;
	private TinhThanhPho tinhThanhPho;
	
	private Set<DanhMuc> dsDanhMuc  = new HashSet<DanhMuc>();
	private Set<SanPham> dsSanPham = new HashSet<SanPham>();
	
	public GianHang() {
	
	}

	public GianHang(String tenGianHang, String diaChi, String dienThoai,
			String fax, String thongTin, String banner, String logo,
			TaiKhoan taiKhoan, TinhThanhPho tinhThanhPho,
			Set<DanhMuc> dsDanhMuc, Set<SanPham> dsSanPham) {
		super();
		this.tenGianHang = tenGianHang;
		this.diaChi = diaChi;
		this.dienThoai = dienThoai;
		this.fax = fax;
		this.thongTin = thongTin;
		this.banner = banner;
		this.logo = logo;
		this.taiKhoan = taiKhoan;
		this.tinhThanhPho = tinhThanhPho;
		this.dsDanhMuc = dsDanhMuc;
		this.dsSanPham = dsSanPham;
	}

	public int getMaGianHang() {
		return maGianHang;
	}

	public void setMaGianHang(int maGianHang) {
		this.maGianHang = maGianHang;
	}

	public String getTenGianHang() {
		return tenGianHang;
	}

	public void setTenGianHang(String tenGianHang) {
		this.tenGianHang = tenGianHang;
	}

	public TaiKhoan getTaiKhoan() {
		return taiKhoan;
	}

	public void setTaiKhoan(TaiKhoan taiKhoan) {
		this.taiKhoan = taiKhoan;
	}

	public TinhThanhPho getTinhThanhPho() {
		return tinhThanhPho;
	}

	public void setTinhThanhPho(TinhThanhPho tinhThanhPho) {
		this.tinhThanhPho = tinhThanhPho;
	}

	public Set<DanhMuc> getDsDanhMuc() {
		return dsDanhMuc;
	}

	public void setDsDanhMuc(Set<DanhMuc> dsDanhMuc) {
		this.dsDanhMuc = dsDanhMuc;
	}

	public Set<SanPham> getDsSanPham() {
		return dsSanPham;
	}

	public void setDsSanPham(Set<SanPham> dsSanPham) {
		this.dsSanPham = dsSanPham;
	}

	public String getDiaChi() {
		return diaChi;
	}

	public void setDiaChi(String diaChi) {
		this.diaChi = diaChi;
	}

	public String getDienThoai() {
		return dienThoai;
	}

	public void setDienThoai(String dienThoai) {
		this.dienThoai = dienThoai;
	}

	public String getFax() {
		return fax;
	}

	public void setFax(String fax) {
		this.fax = fax;
	}

	public String getThongTin() {
		return thongTin;
	}

	public void setThongTin(String thongTin) {
		this.thongTin = thongTin;
	}

	public String getBanner() {
		return banner;
	}

	public void setBanner(String banner) {
		this.banner = banner;
	}

	public String getLogo() {
		return logo;
	}

	public void setLogo(String logo) {
		this.logo = logo;
	}

	public String getYahoo() {
		return yahoo;
	}

	public void setYahoo(String yahoo) {
		this.yahoo = yahoo;
	}
	
}
