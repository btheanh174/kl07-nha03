package com.estore.core.model.pojo;

import java.util.Date;

public class TinNhan {

	private int maTinNhan;
	private String noiDung;
	private Date ngayGui;
	private ThanhVien thanhVien;
	
	public TinNhan() {
		
	}
	
	public TinNhan(int maTinNhan, String noiDung, Date ngayGui, ThanhVien thanhVien) {
		super();
		this.noiDung = noiDung;
		this.ngayGui = ngayGui;
		this.thanhVien = thanhVien;
	}

	public int getMaTinNhan() {
		return maTinNhan;
	}

	public void setMaTinNhan(int maTinNhan) {
		this.maTinNhan = maTinNhan;
	}

	public String getNoiDung() {
		return noiDung;
	}

	public void setNoiDung(String noiDung) {
		this.noiDung = noiDung;
	}

	public Date getNgayGui() {
		return ngayGui;
	}

	public void setNgayGui(Date ngayGui) {
		this.ngayGui = ngayGui;
	}

	public ThanhVien getThanhVien() {
		return thanhVien;
	}

	public void setThanhVien(ThanhVien thanhVien) {
		this.thanhVien = thanhVien;
	}	
}
