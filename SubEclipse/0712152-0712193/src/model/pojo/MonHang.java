package model.pojo;

import java.math.BigDecimal;

public class MonHang {
	private int maSanPham;
	private int tenSanPham;
	private String hinhAnh;
	private int soLuong=1;
	private BigDecimal donGia;
	
	
	public MonHang() {
		super();
	}
	
	public MonHang(int maSanPham, int tenSanPham, String hinhAnh, int soLuong,
			BigDecimal donGia) {
		super();
		this.maSanPham = maSanPham;
		this.tenSanPham = tenSanPham;
		this.hinhAnh = hinhAnh;
		this.soLuong = soLuong;
		this.donGia = donGia;
	}
	
	public MonHang(MonHang monHang){
		this.maSanPham = monHang.maSanPham;
		this.tenSanPham = monHang.tenSanPham;
		this.hinhAnh = monHang.hinhAnh;
		this.soLuong = monHang.soLuong;
		this.donGia = monHang.donGia;
	}



	public int getMaSanPham() {
		return maSanPham;
	}
	public void setMaSanPham(int maSanPham) {
		this.maSanPham = maSanPham;
	}
	public int getTenSanPham() {
		return tenSanPham;
	}
	public void setTenSanPham(int tenSanPham) {
		this.tenSanPham = tenSanPham;
	}
	public String getHinhAnh() {
		return hinhAnh;
	}
	public void setHinhAnh(String hinhAnh) {
		this.hinhAnh = hinhAnh;
	}
	public int getSoLuong() {
		return soLuong;
	}
	public void setSoLuong(int soLuong) {
		this.soLuong = soLuong;
	}
	public BigDecimal getDonGia() {
		return donGia;
	}
	public void setDonGia(BigDecimal donGia) {
		this.donGia = donGia;
	}
}
