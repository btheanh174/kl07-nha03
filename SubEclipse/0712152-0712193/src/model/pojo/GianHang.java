package model.pojo;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class GianHang {
	
	private int maGianHang;
	private String tenGianHang;
	private String diaChi;
	private String dienThoai;
	private String fax;
	private String yahoo;
	private String thongTin;
	private String chinhSach;
	private String gioiThieu;
	private String banner;
	private String logo;
	private TaiKhoan taiKhoan;
	private TinhThanhPho tinhThanhPho;
	
	private List<GianHangDanhMuc> dsGianHangDanhMuc  = new ArrayList<GianHangDanhMuc>();
	private List<GianHangSanPham> dsGianHangSanPham = new ArrayList<GianHangSanPham>();
	private List<HoaDon> dsHoaDon = new ArrayList<HoaDon>();
	private List<NhomDanhMuc> dsNhomDanhMuc = new ArrayList<NhomDanhMuc>();
	
	private Date ngayThamGia;
	
	public GianHang() {
	
	}

	public GianHang(String tenGianHang, String diaChi, String dienThoai,
			String fax, String thongTin, String chinhSach, String gioiThieu, String banner, String logo,
			TaiKhoan taiKhoan, TinhThanhPho tinhThanhPho,
			List<GianHangDanhMuc> dsGianHangDanhMuc, List<GianHangSanPham> dsGianHangSanPham, List<HoaDon> dsHoaDon, List<NhomDanhMuc> dsNhomDanhMuc, Date ngayThamGia) {
		super();
		this.tenGianHang = tenGianHang;
		this.diaChi = diaChi;
		this.dienThoai = dienThoai;
		this.fax = fax;
		this.thongTin = thongTin;
		this.chinhSach = chinhSach;
		this.gioiThieu = gioiThieu;
		this.banner = banner;
		this.logo = logo;
		this.taiKhoan = taiKhoan;
		this.tinhThanhPho = tinhThanhPho;
		this.dsGianHangDanhMuc = dsGianHangDanhMuc;
		this.dsGianHangSanPham = dsGianHangSanPham;
		this.dsHoaDon = dsHoaDon;
		this.dsNhomDanhMuc = dsNhomDanhMuc;
		this.ngayThamGia = ngayThamGia;
	}
	// Nhung ham bo sung
	public void themNhomDanhMuc(NhomDanhMuc nhom){
		nhom.setGianHang(this);
		this.dsNhomDanhMuc.add(nhom);
	}
	
	public void themHoaDon(HoaDon hoaDon){
		hoaDon.setGianHang(this);
		this.dsHoaDon.add(hoaDon);
	}
	
	public void themGianHangSanPham(GianHangSanPham ghsp){
		ghsp.setGianHang(this);
		this.dsGianHangSanPham.add(ghsp);
	}
	
	public void themGianHangDanhMuc(GianHangDanhMuc ghdm){
		ghdm.setGianHang(this);
		this.dsGianHangDanhMuc.add(ghdm);
	}
	//
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

	public List<GianHangDanhMuc> getDsGianHangDanhMuc() {
		return dsGianHangDanhMuc;
	}

	public void setDsGianHangDanhMuc(List<GianHangDanhMuc> dsGianHangDanhMuc) {
		this.dsGianHangDanhMuc = dsGianHangDanhMuc;
	}

	public List<GianHangSanPham> getDsGianHangSanPham() {
		return dsGianHangSanPham;
	}

	public void setDsGianHangSanPham(List<GianHangSanPham> dsGianHangSanPham) {
		this.dsGianHangSanPham = dsGianHangSanPham;
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

	public List<HoaDon> getDsHoaDon() {
		return dsHoaDon;
	}

	public void setDsHoaDon(List<HoaDon> dsHoaDon) {
		this.dsHoaDon = dsHoaDon;
	}

	public String getChinhSach() {
		return chinhSach;
	}

	public void setChinhSach(String chinhSach) {
		this.chinhSach = chinhSach;
	}

	public String getGioiThieu() {
		return gioiThieu;
	}

	public void setGioiThieu(String gioiThieu) {
		this.gioiThieu = gioiThieu;
	}

	public Date getNgayThamGia() {
		return ngayThamGia;
	}

	public void setNgayThamGia(Date ngayThamGia) {
		this.ngayThamGia = ngayThamGia;
	}

	public List<NhomDanhMuc> getDsNhomDanhMuc() {
		return dsNhomDanhMuc;
	}

	public void setDsNhomDanhMuc(List<NhomDanhMuc> dsNhomDanhMuc) {
		this.dsNhomDanhMuc = dsNhomDanhMuc;
	}
}
