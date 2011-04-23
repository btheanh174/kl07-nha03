package model.pojo;

import java.util.List;
import java.util.Set;

public class DanhMuc {
	private int maDanhMuc;
	private String tenDanhMuc;
	private int capDanhMuc;
	private DanhMuc danhMucCha;
	private List<DanhMuc> dsDanhMucCon;
	private Set dsSanPham;

	public DanhMuc() {

	}

	public DanhMuc(String tenDanhMuc, int capDanhMuc, DanhMuc danhMucCha,
			List<DanhMuc> dsDanhMucCon, Set dsSanPham) {
		super();
		this.tenDanhMuc = tenDanhMuc;
		this.capDanhMuc = capDanhMuc;
		this.danhMucCha = danhMucCha;
		this.dsDanhMucCon = dsDanhMucCon;
		this.dsSanPham = dsSanPham;
	}

	public DanhMuc(DanhMuc danhMuc) {
		this.maDanhMuc = danhMuc.maDanhMuc;
		this.tenDanhMuc = danhMuc.tenDanhMuc;
		this.capDanhMuc = danhMuc.capDanhMuc;
		this.danhMucCha = danhMuc.danhMucCha;
		this.dsDanhMucCon = danhMuc.dsDanhMucCon;
		this.dsSanPham = danhMuc.dsSanPham;
	}

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

	public Set getDsSanPham() {
		return dsSanPham;
	}

	public void setDsSanPham(Set dsSanPham) {
		this.dsSanPham = dsSanPham;
	}

	public DanhMuc getDanhMucCha() {
		return danhMucCha;
	}

	public void setDanhMucCha(DanhMuc danhMucCha) {
		this.danhMucCha = danhMucCha;
	}
}
