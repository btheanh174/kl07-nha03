package com.estore.core.model.pojo;

import java.util.ArrayList;
import java.util.List;

public class DanhMuc {
	private int maDanhMuc;
	private String tenDanhMuc;
	private int capDanhMuc;
	private DanhMuc danhMucCha;
	private List<DanhMuc> dsDanhMucCon;
	private List<SanPham> dsSanPham = new ArrayList<SanPham>();
	private List<DanhMucGianHang> dsDanhMucGianHang = new ArrayList<DanhMucGianHang>();

	public DanhMuc() {

	}
	
	public DanhMuc(int maDanhMuc, String tenDanhMuc, int capDanhMuc, DanhMuc danhMucCha) {
		super();
		this.maDanhMuc = maDanhMuc;
		this.tenDanhMuc = tenDanhMuc;
		this.capDanhMuc = capDanhMuc;
		this.danhMucCha = danhMucCha;
	}

	
	public DanhMuc(String tenDanhMuc, int capDanhMuc, DanhMuc danhMucCha,
		List<DanhMuc> dsDanhMucCon, List<SanPham> dsSanPham,
		List<DanhMucGianHang> dsDanhMucGianHang) {
	super();
	this.tenDanhMuc = tenDanhMuc;
	this.capDanhMuc = capDanhMuc;
	this.danhMucCha = danhMucCha;
	this.dsDanhMucCon = dsDanhMucCon;
	this.dsSanPham = dsSanPham;
	this.dsDanhMucGianHang = dsDanhMucGianHang;
}

	public DanhMuc(DanhMuc danhMuc) {
		this.maDanhMuc = danhMuc.maDanhMuc;
		this.tenDanhMuc = danhMuc.tenDanhMuc;
		this.capDanhMuc = danhMuc.capDanhMuc;
		this.danhMucCha = danhMuc.danhMucCha;
		this.dsDanhMucCon = danhMuc.dsDanhMucCon;
		this.dsSanPham = danhMuc.dsSanPham;
		this.dsDanhMucGianHang = danhMuc.dsDanhMucGianHang;
	}
	
	// Nhung ham bo sung de thao tac nhanh hon
	public void themSanPham(SanPham sanPham){
		sanPham.setDanhMuc(this);
		this.dsSanPham.add(sanPham);
	}
	
	public void themDanhMuc(DanhMuc danhMucCon){
		danhMucCon.setDanhMucCha(this);
		this.dsDanhMucCon.add(danhMucCon);
	}
	
	public void themDanhMucGianHang(DanhMucGianHang dmgh){
		dmgh.setDanhMuc(this);
		this.dsDanhMucGianHang.add(dmgh);
	}
	//

	public int getCapDanhMuc() {
		return capDanhMuc;
	}

	public void setCapDanhMuc(int capDanhMuc) {
		this.capDanhMuc = capDanhMuc;
	}

	public List<DanhMuc> getDsDanhMucCon() {
		return dsDanhMucCon;
	}

	public void setDsDanhMucCon(List<DanhMuc> dsDanhMucCon) {
		this.dsDanhMucCon = dsDanhMucCon;
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

	public DanhMuc getDanhMucCha() {
		return danhMucCha;
	}

	public void setDanhMucCha(DanhMuc danhMucCha) {
		this.danhMucCha = danhMucCha;
	}

	public List<SanPham> getDsSanPham() {
		return dsSanPham;
	}

	public void setDsSanPham(List<SanPham> dsSanPham) {
		this.dsSanPham = dsSanPham;
	}

	public List<DanhMucGianHang> getDsDanhMucGianHang() {
		return dsDanhMucGianHang;
	}

	public void setDsDanhMucGianHang(List<DanhMucGianHang> dsDanhMucGianHang) {
		this.dsDanhMucGianHang = dsDanhMucGianHang;
	}
}
