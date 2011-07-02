package com.estore.core.model.pojo;

public class HinhAnh {
	private int maHinhAnh;
	private String tenHinhAnh;
	private String urlHinhAnh;
	private SanPham sanPham;
	
	public HinhAnh() {
		super();
	}

	public HinhAnh(String tenHinhAnh, String urlHinhAnh, SanPham sanPham) {
		super();
		this.tenHinhAnh = tenHinhAnh;
		this.urlHinhAnh = urlHinhAnh;
		this.sanPham = sanPham;
	}

	public int getMaHinhAnh() {
		return maHinhAnh;
	}
	public void setMaHinhAnh(int maHinhAnh) {
		this.maHinhAnh = maHinhAnh;
	}
	public String getUrlHinhAnh() {
		return urlHinhAnh;
	}
	public void setUrlHinhAnh(String urlHinhAnh) {
		this.urlHinhAnh = urlHinhAnh;
	}

	public String getTenHinhAnh() {
		return tenHinhAnh;
	}

	public void setTenHinhAnh(String tenHinhAnh) {
		this.tenHinhAnh = tenHinhAnh;
	}

	public SanPham getSanPham() {
		return sanPham;
	}

	public void setSanPham(SanPham sanPham) {
		this.sanPham = sanPham;
	}
}
