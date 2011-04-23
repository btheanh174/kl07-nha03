package model.pojo;

import java.util.HashSet;

public class GioHang {
	
	private HashSet<MonHang> dsMonHang;
	private double tongTien;
	
	public GioHang() {
		super();
	}
	
	
	public GioHang(HashSet<MonHang> dsMonHang, double tongTien) {
		super();
		this.dsMonHang = dsMonHang;
		this.tongTien = tongTien;
	}


	public HashSet<MonHang> getDsMonHang() {
		return dsMonHang;
	}
	public void setDsMonHang(HashSet<MonHang> dsMonHang) {
		this.dsMonHang = dsMonHang;
	}
	public double getTongTien() {
		return tongTien;
	}
	public void setTongTien(double tongTien) {
		this.tongTien = tongTien;
	}
	
	
}
