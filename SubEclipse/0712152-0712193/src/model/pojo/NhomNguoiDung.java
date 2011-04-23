package model.pojo;

import java.util.Set;

public class NhomNguoiDung {
	private int maNhom;
	private String tenNhom;
	private String moTa;
	private Set dsTaiKhoan;
	
	public NhomNguoiDung() {
		super();
	}
	
	public NhomNguoiDung(String tenNhom) {
		super();
		this.tenNhom = tenNhom;
	}
	public NhomNguoiDung(String tenNhom, String moTa) {
		super();
		this.tenNhom = tenNhom;
		this.moTa = moTa;
	}
	
	public NhomNguoiDung(NhomNguoiDung nhom){
		this.maNhom = nhom.maNhom;
		this.tenNhom = nhom.tenNhom;
		this.moTa = nhom.moTa;
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

	public String getMoTa() {
		return moTa;
	}

	public void setMoTa(String moTa) {
		this.moTa = moTa;
	}
}