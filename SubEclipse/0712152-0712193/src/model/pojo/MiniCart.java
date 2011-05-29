package model.pojo;

import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.Enumeration;
import java.util.Hashtable;
import java.util.List;

import model.dao.GianHangDAO;
import util.CurrencyConverter;
import util.NumberUtil;

public class MiniCart {

	private int maGianHang;

	private Hashtable<Integer, MatHang> dsMatHang = new Hashtable<Integer, MatHang>();

	public MiniCart() {
		super();
	}

	public MiniCart(int maGianHang, Hashtable<Integer, MatHang> dsMatHang) {
		super();
		this.maGianHang = maGianHang;
		this.dsMatHang = dsMatHang;
	}

	public String layTenGianHang() {
		return new GianHangDAO().lay(maGianHang).getTenGianHang();
	}

	public void themMatHang(MatHang matHang) {
		int key = matHang.getSanPham().getMaSanPham();
		if (dsMatHang.containsKey(key)) {
			MatHang mh = (MatHang) dsMatHang.get(key);
			mh.setSoLuong(matHang.getSoLuong() + mh.getSoLuong());
		} else {
			dsMatHang.put(key, matHang);
		}
	}

	public void xoaMatHang(int maSanPham) {
		if (dsMatHang.containsKey(maSanPham)) {
			dsMatHang.remove(maSanPham);
		}
	}

	public void capNhatSoLuong(MatHang matHang, int soLuong) {

		int key = matHang.getSanPham().getMaSanPham();
		if (dsMatHang.containsKey(key)) {
			MatHang mh = (MatHang) dsMatHang.get(key);
			mh.setSoLuong(soLuong);
		} else {
			MatHang mh = new MatHang();
			mh.setSanPham(matHang.getSanPham());
			mh.setSoLuong(soLuong);
			dsMatHang.put(key, mh);
		}
	}

	public void capNhatSoLuong(int maSanPham, int soLuong) {
		if (dsMatHang.containsKey(maSanPham)) {
			MatHang mh = (MatHang) dsMatHang.get(maSanPham);
			mh.setSoLuong(soLuong);
		}
	}

	public Enumeration<MatHang> layDsMatHang() {
		return dsMatHang.elements();
	}

	public Integer layTongTien() {
		Integer kq = 0;
		Enumeration<MatHang> list = dsMatHang.elements();
		while (list.hasMoreElements()) {
			MatHang mh = list.nextElement();
			kq += mh.getThanhTien();
		}
		return kq;
	}

	public String layChuoiTongTienVND() {
		return NumberUtil.getNumberText(layTongTien());
	}

	public String layChuoiTongTienUSD() {
		float usd = CurrencyConverter.convertVNDtoUSD(layTongTien());
	
		DecimalFormat df = new DecimalFormat("0.0");
		String str = df.format(usd);
		
		return str;
	}

	public int laySoLuongMatHang() {
		return dsMatHang.size();
	}

	public void xoaTatCa() {
		dsMatHang.clear();
	}

	public Hashtable<Integer, MatHang> getDsMatHang() {
		return dsMatHang;
	}

	public void setDsMatHang(Hashtable<Integer, MatHang> dsMatHang) {
		this.dsMatHang = dsMatHang;
	}

	public int getMaGianHang() {
		return maGianHang;
	}

	public void setMaGianHang(int maGianHang) {
		this.maGianHang = maGianHang;
	}
}
