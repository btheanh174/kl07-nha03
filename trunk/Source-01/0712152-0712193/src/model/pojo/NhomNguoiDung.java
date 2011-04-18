package model.pojo;

import java.util.Set;

public class NhomNguoiDung {
	private int maNhom;
	private String tenNhom;
	private Set dsTaiKhoan;
	
	public NhomNguoiDung() {
		super();
	}
	
	public NhomNguoiDung(String tenNhom) {
		super();
		this.tenNhom = tenNhom;
	}
	public NhomNguoiDung(int maNhom, String tenNhom) {
		super();
		this.maNhom = maNhom;
		this.tenNhom = tenNhom;
	}
	
	public NhomNguoiDung(NhomNguoiDung nhom){
		this.maNhom = nhom.maNhom;
		this.tenNhom = nhom.tenNhom;
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
	public Set getDsTaiKhoan() {
		return dsTaiKhoan;
	}
	public void setDsTaiKhoan(Set dsTaiKhoan) {
		this.dsTaiKhoan = dsTaiKhoan;
	}
	
}