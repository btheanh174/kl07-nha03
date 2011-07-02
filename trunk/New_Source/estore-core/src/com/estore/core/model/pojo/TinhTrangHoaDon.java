package com.estore.core.model.pojo;

public class TinhTrangHoaDon {

	private int maTinhTrang;
	private String tenTinhTrang;
	
	public TinhTrangHoaDon() {
	}
	

	public TinhTrangHoaDon(int maTinhTrang, String tenTinhTrang) {
		super();
		this.maTinhTrang = maTinhTrang;
		this.tenTinhTrang = tenTinhTrang;
	}


	public int getMaTinhTrang() {
		return maTinhTrang;
	}

	public void setMaTinhTrang(int maTinhTrang) {
		this.maTinhTrang = maTinhTrang;
	}

	public String getTenTinhTrang() {
		return tenTinhTrang;
	}

	public void setTenTinhTrang(String tenTinhTrang) {
		this.tenTinhTrang = tenTinhTrang;
	}

}
