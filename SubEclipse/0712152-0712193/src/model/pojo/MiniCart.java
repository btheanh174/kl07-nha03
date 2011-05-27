package model.pojo;

import java.util.ArrayList;
import java.util.List;

import model.dao.GianHangDAO;
import util.NumberUtil;

public class MiniCart {

	private int maGianHang;
	private List<MatHang> dsMatHang = new ArrayList<MatHang>();

	public MiniCart() {
		super();
	}

	public MiniCart(int maGianHang, List<MatHang> dsMatHang) {
		super();
		this.maGianHang = maGianHang;
		this.dsMatHang = dsMatHang;
	}
	
	public String layTenGianHang(){
		return new GianHangDAO().lay(maGianHang).getTenGianHang();
	}
	

	public void themMatHang(MatHang matHang) {
		if (dsMatHang.contains(matHang)) {
			MatHang mh = (MatHang) dsMatHang.get(dsMatHang.indexOf(matHang));
			mh.setSoLuong(matHang.getSoLuong() + mh.getSoLuong());
		} else {
			dsMatHang.add(matHang);
		}
	}

	public void xoaMatHang(MatHang matHang) {
		if (dsMatHang.contains(matHang)) {
			dsMatHang.remove(matHang);
		}
	}


	public void capNhatSoLuong(MatHang matHang, int soLuong) {
		
		if (dsMatHang.contains(matHang)) {
			MatHang mh = (MatHang) dsMatHang.get(dsMatHang.indexOf(matHang));
			mh.setSoLuong(soLuong);
		} else {
			MatHang mh = new MatHang();
			mh.setSanPham(matHang.getSanPham());
			mh.setSoLuong(soLuong);
			dsMatHang.add(mh);
		}
	}

	public Integer layTongTien() {
		Integer kq = 0;
		for (MatHang matHang : dsMatHang) {
			kq += matHang.getThanhTien();
		}
		return kq;
	}
	
	public String layChuoiTongTien(){
		return NumberUtil.getNumberText(layTongTien());
	}

	public int laySoLuongMatHang() {
		return dsMatHang.size();
	}

	public void xoaTatCa() {
		dsMatHang.clear();
	}

	public List<MatHang> getDsMatHang() {
		return dsMatHang;
	}

	public void setDsMatHang(List<MatHang> dsMatHang) {
		this.dsMatHang = dsMatHang;
	}

	public int getMaGianHang() {
		return maGianHang;
	}

	public void setMaGianHang(int maGianHang) {
		this.maGianHang = maGianHang;
	}
}
