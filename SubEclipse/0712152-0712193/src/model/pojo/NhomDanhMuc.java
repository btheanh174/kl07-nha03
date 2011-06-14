package model.pojo;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

public class NhomDanhMuc  implements Serializable{
	private int maNhom;
	private String tenNhom;
	private int thuTu;
	private GianHang gianHang;
	
	private List<DanhMucGianHang> dsDanhMucGianHang = new ArrayList<DanhMucGianHang>();
	
	public NhomDanhMuc() {
	
	}

	public NhomDanhMuc(String tenNhom, int thuTu, GianHang gianHang) {
		super();
		this.tenNhom = tenNhom;
		this.thuTu = thuTu;
		this.gianHang = gianHang;
	}
	
	public NhomDanhMuc(String tenNhom, int thuTu, GianHang gianHang,
			List<DanhMucGianHang> dsDanhMucGianHang) {
		super();
		this.tenNhom = tenNhom;
		this.thuTu = thuTu;
		this.gianHang = gianHang;
		this.dsDanhMucGianHang = dsDanhMucGianHang;
	}

	//
	public void themDanhMucGianHang(DanhMucGianHang dmgh){
		dmgh.setNhomDanhMuc(this);
		this.dsDanhMucGianHang.add(dmgh);
	}
	//

	public int getMaNhom() {
		return maNhom;
	}

	public void setMaNhom(int maNhom) {
		this.maNhom = maNhom;
	}

	public String getTenNhom() {
		return tenNhom;
	}

	public void setTenNhom(String tenNhom) {
		this.tenNhom = tenNhom;
	}

	public int getThuTu() {
		return thuTu;
	}

	public void setThuTu(int thuTu) {
		this.thuTu = thuTu;
	}

	public GianHang getGianHang() {
		return gianHang;
	}

	public void setGianHang(GianHang gianHang) {
		this.gianHang = gianHang;
	}

	public List<DanhMucGianHang> getDsDanhMucGianHang() {
		return dsDanhMucGianHang;
	}

	public void setDsDanhMucGianHang(List<DanhMucGianHang> dsDanhMucGianHang) {
		this.dsDanhMucGianHang = dsDanhMucGianHang;
	}
	
}
