package com.estore.core.model.pojo;

public class ThamSo {
	private int maThamSo;
	private String tenThamSo;
	private String kieu;
	private String giaTri;
	private int tinhTrang;
	
	
	
	public ThamSo() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
	public ThamSo(int maThamSo, String tenThamSo, String kieu, String giaTri,
			int tinhTrang) {
		super();
		this.maThamSo = maThamSo;
		this.tenThamSo = tenThamSo;
		this.kieu = kieu;
		this.giaTri = giaTri;
		this.tinhTrang = tinhTrang;
	}
	
	public ThamSo(ThamSo thamSo){
		this.maThamSo = thamSo.maThamSo;
		this.tenThamSo = thamSo.tenThamSo;
		this.kieu = thamSo.kieu;
		this.giaTri = thamSo.giaTri;
		this.tinhTrang = thamSo.tinhTrang;
	}
	


	public int getMaThamSo() {
		return maThamSo;
	}
	public void setMaThamSo(int maThamSo) {
		this.maThamSo = maThamSo;
	}
	public String getTenThamSo() {
		return tenThamSo;
	}
	public void setTenThamSo(String tenThamSo) {
		this.tenThamSo = tenThamSo;
	}
	public String getKieu() {
		return kieu;
	}
	public void setKieu(String kieu) {
		this.kieu = kieu;
	}
	public String getGiaTri() {
		return giaTri;
	}
	public void setGiaTri(String giaTri) {
		this.giaTri = giaTri;
	}
	public int getTinhTrang() {
		return tinhTrang;
	}
	public void setTinhTrang(int tinhTrang) {
		this.tinhTrang = tinhTrang;
	}
	
	
}
