package model.pojo;

import java.math.BigDecimal;

public class MatHang {
	
	private SanPham sanPham;
	private int soLuong=1;
	
	
	public MatHang() {
		super();
	}
	
	public MatHang(SanPham sanPham, int soLuong) {
		super();
		this.sanPham = sanPham;
		this.soLuong = soLuong;
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
}
