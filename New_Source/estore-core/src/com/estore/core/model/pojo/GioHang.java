package com.estore.core.model.pojo;

import java.util.Enumeration;
import java.util.Hashtable;

public class GioHang {

	/*
	 * private Hashtable<Integer, MatHang> dsMatHang = new Hashtable<Integer,
	 * MatHang>();
	 * 
	 * public GioHang() {
	 * 
	 * }
	 * 
	 * public void themMatHang(MatHang matHang) { int key =
	 * matHang.getSanPham().getMaSanPham(); if (dsMatHang.containsKey(key)) {
	 * MatHang mh = (MatHang) dsMatHang.get(key);
	 * mh.setSoLuong(matHang.getSoLuong() + mh.getSoLuong()); } else {
	 * dsMatHang.put(key, matHang); } }
	 * 
	 * public void xoaMatHang(MatHang matHang) { int key =
	 * matHang.getSanPham().getMaSanPham(); if (dsMatHang.containsKey(key)) {
	 * dsMatHang.remove(key); } }
	 * 
	 * public void xoaMatHang(int key) { if (dsMatHang.containsKey(key)) {
	 * dsMatHang.remove(key); } }
	 * 
	 * public void capNhatSoLuong(MatHang matHang, int soLuong) { int key =
	 * matHang.getSanPham().getMaSanPham(); if (dsMatHang.containsKey(key)) {
	 * MatHang mh = (MatHang) dsMatHang.get(key); mh.setSoLuong(soLuong); }else{
	 * dsMatHang.put(key, matHang); } } public void capNhatSoLuong(int key, int
	 * soLuong) { if (dsMatHang.containsKey(key)) { MatHang mh = (MatHang)
	 * dsMatHang.get(key); mh.setSoLuong(soLuong); } }
	 * 
	 * public Enumeration<MatHang> getEnumeration(){ return
	 * dsMatHang.elements(); }
	 * 
	 * 
	 * 
	 * public float layTongTien(){ Enumeration<MatHang> ds =
	 * dsMatHang.elements(); float kq = 0.00f; while(ds.hasMoreElements()){
	 * MatHang mh = ds.nextElement(); kq += mh.getSanPham().getGia() *
	 * mh.getSoLuong(); } return kq; }
	 * 
	 * public int laySoLuongMatHang(){ return dsMatHang.size(); }
	 * 
	 * public void xoaTatCa(){ dsMatHang.clear(); }
	 */

	private Hashtable<Integer, MiniCart> dsMiniCart = new Hashtable<Integer, MiniCart>();

	public Hashtable<Integer, MiniCart> getDsMiniCart() {
		return dsMiniCart;
	}

	public void setDsMiniCart(Hashtable<Integer, MiniCart> dsMiniCart) {
		this.dsMiniCart = dsMiniCart;
	}

	public GioHang() {
		super();
	}

	public void themMiniCart(MiniCart cart) {
		if (dsMiniCart.containsKey(cart.getMaGianHang())) {
			capNhatMiniCart(cart);
		} else {
			dsMiniCart.put(cart.getMaGianHang(), cart);
		}
	}

	public MiniCart layMiniCart(int ma) {
		try {
			MiniCart mc = dsMiniCart.get(ma);
			return mc;
		} catch (Exception ex) {
			System.out.println("Minicart không tồn tại!");
		}
		return null;
	}

	public void capNhatMiniCart(MiniCart cart) {
		// De day tinh sau
	}

	public void themMatHang(int maGianHang, MatHang matHang) {
		if (dsMiniCart.containsKey(maGianHang)) {
			MiniCart cart = dsMiniCart.get(maGianHang);
			Hashtable<Integer, MatHang> dsMH = cart.getDsMatHang();
			int key = matHang.getSanPham().getMaSanPham();
			if (dsMH.contains(key)) {
				MatHang mh = dsMH.get(key);
				mh.setSoLuong(matHang.getSoLuong() + mh.getSoLuong());
			} else {
				cart.themMatHang(matHang);
			}
		} else {
			MiniCart cart = new MiniCart();
			cart.setMaGianHang(maGianHang);
			cart.themMatHang(matHang);
			dsMiniCart.put(maGianHang, cart);
		}
	}

	public void capNhatSoLuong(int maGianHang, int maSanPham, int soLuong) {
		if (dsMiniCart.containsKey(maGianHang)) {
			MiniCart cart = dsMiniCart.get(maGianHang);
			Hashtable<Integer, MatHang> dsMH = cart.getDsMatHang();
			if (dsMH.containsKey(maSanPham)) {
				MatHang mh = dsMH.get(maSanPham);
				mh.setSoLuong(soLuong);
			}
		}
	}

	public void xoaMatHang(int maGianHang, MatHang matHang) {
		if (dsMiniCart.containsKey(maGianHang)) {
			MiniCart cart = dsMiniCart.get(maGianHang);
			int key = matHang.getSanPham().getMaSanPham();
			if (cart.getDsMatHang().containsKey(key)) {
				cart.xoaMatHang(key);
				if (cart.getDsMatHang().size() == 0) {
					dsMiniCart.remove(maGianHang);
				}
			}

		}
	}

	public void xoaMatHang(int maGianHang, int maSanPham) {
		if (dsMiniCart.containsKey(maGianHang)) {
			MiniCart cart = dsMiniCart.get(maGianHang);
			if (cart.getDsMatHang().containsKey(maSanPham)) {
				cart.xoaMatHang(maSanPham);
			}
			if (cart.getDsMatHang().size() == 0) {
				dsMiniCart.remove(maGianHang);
			}
		}

	}

	public Enumeration<MiniCart> layMiniCartEnumeration() {
		return dsMiniCart.elements();
	}

	public int laySoMiniCart() {
		return dsMiniCart.size();
	}

	public void xoaTatCa() {
		dsMiniCart.clear();
	}
}
