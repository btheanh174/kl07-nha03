package model.pojo;

public class ChiTietHoaDon {
	
	private int soLuong;
	private float donGia;
	private SanPham sanPham;
	
	
	public ChiTietHoaDon() {
		
	}
	
	public ChiTietHoaDon(int soLuong, float donGia, SanPham sanPham) {
		super();
		this.soLuong = soLuong;
		this.donGia = donGia;
		this.sanPham = sanPham;
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

}
