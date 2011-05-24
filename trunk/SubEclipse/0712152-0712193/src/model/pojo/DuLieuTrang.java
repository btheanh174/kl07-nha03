package model.pojo;

import java.util.ArrayList;
import java.util.List;

public class DuLieuTrang {

	private boolean laTrangCuoi = false;
	private int batdau;
	private int tongSoTrang;
	private List dsDuLieu = new ArrayList();
	
	public DuLieuTrang() {
		
	}
	
	public DuLieuTrang(boolean laTrangCuoi, int batdau, int tongSoTrang,
			List dsDuLieu) {
		super();
		this.laTrangCuoi = laTrangCuoi;
		this.batdau = batdau;
		this.tongSoTrang = tongSoTrang;
		this.dsDuLieu = dsDuLieu;
	}



	public DuLieuTrang(int tongSoTrang){
		this.tongSoTrang = tongSoTrang;
	}


	public boolean isLaTrangCuoi() {
		return laTrangCuoi;
	}

	public void setLaTrangCuoi(boolean laTrangCuoi) {
		this.laTrangCuoi = laTrangCuoi;
	}

	public int getBatdau() {
		return batdau;
	}

	public void setBatdau(int batdau) {
		this.batdau = batdau;
	}

	public int getTongSoTrang() {
		return tongSoTrang;
	}

	public void setTongSoTrang(int tongSoTrang) {
		this.tongSoTrang = tongSoTrang;
	}

	public List getDsDuLieu() {
		return dsDuLieu;
	}

	public void setDsDuLieu(List dsDuLieu) {
		this.dsDuLieu = dsDuLieu;
	}
}
