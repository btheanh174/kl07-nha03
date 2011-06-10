package model.pojo;

import java.io.Serializable;

public class NhomDanhMuc  implements Serializable{
	private int maNhom;
	private String tenNhom;
	private int thuTu;
	private GianHang gianHang;
	
	public NhomDanhMuc() {
	
	}

	public NhomDanhMuc(String tenNhom, int thuTu, GianHang gianHang) {
		super();
		this.tenNhom = tenNhom;
		this.thuTu = thuTu;
		this.gianHang = gianHang;
	}

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
}
