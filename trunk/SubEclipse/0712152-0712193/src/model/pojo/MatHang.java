package model.pojo;

import java.math.BigDecimal;

public class MatHang {
	
	private SanPham sanPham;
	private Integer soLuong;
	private Integer thanhTien;
	
	
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
	public void setSoLuong(Integer soLuong) {
		this.soLuong = soLuong;
	}

	public Integer getThanhTien() {
		return soLuong * sanPham.getGia();
	}

	public void setThanhTien(Integer thanhTien) {
		this.thanhTien = thanhTien;
	}
}
