package model.pojo;

public class ChiTietHoaDon {
	
	private int soLuong;
	private float donGia;
	private SanPham sanPham;
	private HoaDon hoaDon;
	
	
	public ChiTietHoaDon() {
		
	}
	
	public ChiTietHoaDon(int soLuong, float donGia, SanPham sanPham,
			HoaDon hoaDon) {
		super();
		this.soLuong = soLuong;
		this.donGia = donGia;
		this.sanPham = sanPham;
		this.hoaDon = hoaDon;
	}



	public SanPham getSanPham() {
		return sanPham;
	}

	public void setSanPham(SanPham sanPham) {
		this.sanPham = sanPham;
	}

	public int getSoLuong() {
		return soLuong;
	}

	public void setSoLuong(int soLuong) {
		this.soLuong = soLuong;
	}

	public float getDonGia() {
		return donGia;
	}

	public void setDonGia(float donGia) {
		this.donGia = donGia;
	}

	public HoaDon getHoaDon() {
		return hoaDon;
	}

	public void setHoaDon(HoaDon hoaDon) {
		this.hoaDon = hoaDon;
	}
}
