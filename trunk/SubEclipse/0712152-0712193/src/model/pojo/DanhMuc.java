package model.pojo;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class DanhMuc {
	private int maDanhMuc;
	private String tenDanhMuc;
	private int capDanhMuc;
	private DanhMuc danhMucCha;
	private List<DanhMuc> dsDanhMucCon;
	
	private List<SanPham> dsSanPham = new ArrayList<SanPham>();
	/*private List<GianHang> dsGianHang = new ArrayList<GianHang>();*/

	public DanhMuc() {

	}

/*	public DanhMuc(String tenDanhMuc, int capDanhMuc, DanhMuc danhMucCha,
			List<DanhMuc> dsDanhMucCon, List<SanPham> dsSanPham,
			List<GianHang> dsGianHang) {
		super();
		this.tenDanhMuc = tenDanhMuc;
		this.capDanhMuc = capDanhMuc;
		this.danhMucCha = danhMucCha;
		this.dsDanhMucCon = dsDanhMucCon;
		this.dsSanPham = dsSanPham;
		this.dsGianHang = dsGianHang;
	}*/
	
	
	
	public DanhMuc(int maDanhMuc, String tenDanhMuc, int capDanhMuc, DanhMuc danhMucCha) {
		super();
		this.maDanhMuc = maDanhMuc;
		this.tenDanhMuc = tenDanhMuc;
		this.capDanhMuc = capDanhMuc;
		this.danhMucCha = danhMucCha;
	}



	public DanhMuc(String tenDanhMuc, int capDanhMuc, DanhMuc danhMucCha,
		List<DanhMuc> dsDanhMucCon, List<SanPham> dsSanPham) {
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
		//this.dsGianHang = danhMuc.dsGianHang;
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

	public List<SanPham> getDsSanPham() {
		return dsSanPham;
	}

	public void setDsSanPham(List<SanPham> dsSanPham) {
		this.dsSanPham = dsSanPham;
	}

/*	
 * Chỉ map 1 chiều trong quan hệ nhiều nhiều giữa gian hàng và danh mục
 * Do đó bên danh mục ko thể truy xuất đc dsGianHang
 * public List<GianHang> getDsGianHang() {
		return dsGianHang;
	}

	public void setDsGianHang(List<GianHang> dsGianHang) {
		this.dsGianHang = dsGianHang;
	}*/
}
