package model.pojo;

public class SanPhamDeNghi {

	private int maSanPham;
	private String tenSanPham;
	private String hinhAnh;
	private Long gia;
	private String vat;
	private int soLuong;
	private int baoHanh;
	
	private String chatLuong;
	private String xuatXu;
	private String thongTinKhac;
	private String ghiChu;
	private TinhTrangEnum tinhTrang;
	private GianHang gianHang;
	public SanPhamDeNghi() {
	}
	
	public SanPhamDeNghi(String tenSanPham, String hinhAnh, Long gia,
			String vat, int soLuong, int baoHanh, String chatLuong,
			String xuatXu, String thongTinKhac, String ghiChu,
			TinhTrangEnum tinhTrang, GianHang gianHang) {
		super();
		this.tenSanPham = tenSanPham;
		this.hinhAnh = hinhAnh;
		this.gia = gia;
		this.vat = vat;
		this.soLuong = soLuong;
		this.baoHanh = baoHanh;
		this.chatLuong = chatLuong;
		this.xuatXu = xuatXu;
		this.thongTinKhac = thongTinKhac;
		this.ghiChu = ghiChu;
		this.tinhTrang = tinhTrang;
		this.gianHang = gianHang;
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
	public String getHinhAnh() {
		return hinhAnh;
	}
	public void setHinhAnh(String hinhAnh) {
		this.hinhAnh = hinhAnh;
	}
	public Long getGia() {
		return gia;
	}
	public void setGia(Long gia) {
		this.gia = gia;
	}
	public String getVat() {
		return vat;
	}
	public void setVat(String vat) {
		this.vat = vat;
	}
	public int getSoLuong() {
		return soLuong;
	}
	public void setSoLuong(int soLuong) {
		this.soLuong = soLuong;
	}
	public int getBaoHanh() {
		return baoHanh;
	}
	public void setBaoHanh(int baoHanh) {
		this.baoHanh = baoHanh;
	}
	public String getChatLuong() {
		return chatLuong;
	}
	public void setChatLuong(String chatLuong) {
		this.chatLuong = chatLuong;
	}
	public String getXuatXu() {
		return xuatXu;
	}
	public void setXuatXu(String xuatXu) {
		this.xuatXu = xuatXu;
	}
	public String getThongTinKhac() {
		return thongTinKhac;
	}
	public void setThongTinKhac(String thongTinKhac) {
		this.thongTinKhac = thongTinKhac;
	}
	public String getGhiChu() {
		return ghiChu;
	}
	public void setGhiChu(String ghiChu) {
		this.ghiChu = ghiChu;
	}
	public TinhTrangEnum getTinhTrang() {
		return tinhTrang;
	}
	public void setTinhTrang(TinhTrangEnum tinhTrang) {
		this.tinhTrang = tinhTrang;
	}
	public GianHang getGianHang() {
		return gianHang;
	}
	public void setGianHang(GianHang gianHang) {
		this.gianHang = gianHang;
	}
}
