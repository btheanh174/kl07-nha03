package com.estore.shop.action.gianhang;

import java.util.ArrayList;
import java.util.List;

import com.estore.core.model.dao.GianHangDAO;
import com.estore.core.model.dao.ThamSoDAO;
import com.estore.core.model.pojo.DuLieuTrang;
import com.estore.core.model.pojo.GianHang;
import com.estore.core.model.pojo.SanPham;
import com.opensymphony.xwork2.ActionSupport;

public class ListingGianHangAction extends ActionSupport {
	private GianHang gianHang;
	private List<GianHang> dsGianHang;
	private SanPham sanPham;
	private GianHangDAO ghDao = new GianHangDAO();
	
	private int trang = 1;
	private int tongSoTrang;
	private List<Integer> soTrang = new ArrayList<Integer>();
	
	@Override
	public String execute() throws Exception {
		
		int soGianHangTrenTrang = new ThamSoDAO().layGiaTri(3);
		DuLieuTrang dlt = ghDao.layDanhSach(soGianHangTrenTrang, trang);
		tongSoTrang = dlt.getTongSoTrang();
		dsGianHang = dlt.getDsDuLieu();
		
		return "list";
	}

	public GianHang getGianHang() {
		return gianHang;
	}

	public void setGianHang(GianHang gianHang) {
		this.gianHang = gianHang;
	}

	public List<GianHang> getDsGianHang() {
		return dsGianHang;
	}

	public void setDsGianHang(List<GianHang> dsGianHang) {
		this.dsGianHang = dsGianHang;
	}

	public SanPham getSanPham() {
		return sanPham;
	}

	public void setSanPham(SanPham sanPham) {
		this.sanPham = sanPham;
	}

	public int getTrang() {
		return trang;
	}

	public void setTrang(int trang) {
		this.trang = trang;
	}

	public int getTongSoTrang() {
		return tongSoTrang;
	}

	public void setTongSoTrang(int tongSoTrang) {
		this.tongSoTrang = tongSoTrang;
	}

	public List<Integer> getSoTrang() {
		for(int i = 1; i <= getTongSoTrang(); i++){
			this.soTrang.add(i);
		}
		return soTrang;
	}

	public void setSoTrang(List<Integer> soTrang) {
		
		this.soTrang = soTrang;
	}
}
