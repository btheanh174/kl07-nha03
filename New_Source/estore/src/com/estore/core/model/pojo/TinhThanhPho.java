package com.estore.core.model.pojo;

import java.util.Set;

public class TinhThanhPho {

	private int maTinhThanhPho;
	private String tenTinhThanhPho;
	private Set dsThanhVien;
	
	
	public TinhThanhPho() {
		
	}

	public TinhThanhPho(String tenTinhThanhPho, Set dsThanhVien) {
		super();
		this.tenTinhThanhPho = tenTinhThanhPho;
		this.dsThanhVien = dsThanhVien;
	}


	public int getMaTinhThanhPho() {
		return maTinhThanhPho;
	}
	public void setMaTinhThanhPho(int maTinhThanhPho) {
		this.maTinhThanhPho = maTinhThanhPho;
	}
	public String getTenTinhThanhPho() {
		return tenTinhThanhPho;
	}
	public void setTenTinhThanhPho(String tenTinhThanhPho) {
		this.tenTinhThanhPho = tenTinhThanhPho;
	}

	public Set getDsThanhVien() {
		return dsThanhVien;
	}

	public void setDsThanhVien(Set dsThanhVien) {
		this.dsThanhVien = dsThanhVien;
	}
}
