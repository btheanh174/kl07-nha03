package model.pojo;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class DanhMuc {
	private int maDanhMuc;
	private String tenDanhMuc;
	private int capDanhMuc;
	private DanhMuc danhMucCha;
	private List<DanhMuc> dsDanhMucCon;
	private Set<SanPham> dsSanPham;
	
	private Set<GianHang> dsGianHang = new HashSet<GianHang>();

	public DanhMuc() {

	}

	public DanhMuc(String tenDanhMuc, int capDanhMuc, DanhMuc danhMucCha,
			List<DanhMuc> dsDanhMucCon, Set<SanPham> dsSanPham,
			Set<GianHang> dsGianHang) {
		super();
		this.tenDanhMuc = tenDanhMuc;
		this.capDanhMuc = capDanhMuc;
		this.danhMucCha = danhMucCha;
		this.dsDanhMucCon = dsDanhMucCon;
		this.dsSanPham = dsSanPham;
		this.dsGianHang = dsGianHang;
	}



	public DanhMuc(DanhMuc danhMuc) {
		this.maDanhMuc = danhMuc.maDanhMuc;
		this.tenDanhMuc = danhMuc.tenDanhMuc;
		this.capDanhMuc = danhMuc.capDanhMuc;
		this.danhMucCha = danhMuc.danhMucCha;
		this.dsDanhMucCon = danhMuc.dsDanhMucCon;
		this.dsSanPham = danhMuc.dsSanPham;
		this.dsGianHang = danhMuc.dsGianHang;
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

	public DanhMuc getDanhMucCha() {
		return danhMucCha;
	}

	public void setDanhMucCha(DanhMuc danhMucCha) {
		this.danhMucCha = danhMucCha;
	}

	public Set<SanPham> getDsSanPham() {
		return dsSanPham;
	}

	public void setDsSanPham(Set<SanPham> dsSanPham) {
		this.dsSanPham = dsSanPham;
	}

	public Set<GianHang> getDsGianHang() {
		return dsGianHang;
	}

	public void setDsGianHang(Set<GianHang> dsGianHang) {
		this.dsGianHang = dsGianHang;
	}
}
