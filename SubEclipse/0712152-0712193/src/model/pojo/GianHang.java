package model.pojo;

import java.util.HashSet;
import java.util.Set;

public class GianHang {
	
	private int maGianHang;
	private String tenGianHang;
	private TaiKhoan taiKhoan;
	private TinhThanhPho tinhThanhPho;
	
	private Set<DanhMuc> dsDanhMuc  = new HashSet<DanhMuc>();
	private Set<SanPham> dsSanPham = new HashSet<SanPham>();
	
	public GianHang() {
	
	}

	public GianHang(String tenGianHang, TaiKhoan taiKhoan,
			TinhThanhPho tinhThanhPho, Set<DanhMuc> dsDanhMuc,
			Set<SanPham> dsSanPham) {
		super();
		this.tenGianHang = tenGianHang;
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
}
