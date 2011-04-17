package model.pojo;

import java.util.List;
import java.util.Set;

public class DanhMuc {
	private int maDanhMuc;
	private String tenDanhMuc;
	private int danhMucCha;
	private Set dsSanPham;
	
	public DanhMuc() {
		
	}
	public DanhMuc(String tenDanhMuc, int danhMucCha){
		super();
		this.tenDanhMuc = tenDanhMuc;
		this.danhMucCha = danhMucCha;
	}
	public DanhMuc(String tenDanhMuc, int danhMucCha, Set dsSanPham) {
		super();
		this.tenDanhMuc = tenDanhMuc;
		this.danhMucCha = danhMucCha;
		this.dsSanPham = dsSanPham;
	}

	public DanhMuc(DanhMuc danhMuc){
		this.maDanhMuc = danhMuc.maDanhMuc;
		this.tenDanhMuc = danhMuc.tenDanhMuc;
		this.danhMucCha = danhMuc.danhMucCha;
		this.dsSanPham = danhMuc.dsSanPham;
	}

	public int getMaDanhMuc() {
		return maDanhMuc;
	}
	public void setMaDanhMuc(int maDanhMuc) {
		this.maDanhMuc = maDanhMuc;
	}
	public String getTenDanhMuc() {
		return tenDanhMuc;
	}
	public void setTenDanhMuc(String tenDanhMuc) {
		this.tenDanhMuc = tenDanhMuc;
	}
	public int getDanhMucCha() {
		return danhMucCha;
	}
	public void setDanhMucCha(int danhMucCha) {
		this.danhMucCha = danhMucCha;
	}

	public Set getDsSanPham() {
		return dsSanPham;
	}

	public void setDsSanPham(Set dsSanPham) {
		this.dsSanPham = dsSanPham;
	}
}
