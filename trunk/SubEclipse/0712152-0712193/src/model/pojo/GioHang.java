package model.pojo;

import java.util.Enumeration;
import java.util.Hashtable;
import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;

import com.opensymphony.xwork2.ActionContext;

import model.dao.SanPhamDAO;

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
		// Khoi tao du lieu gia de test
		MiniCart cart1 = new MiniCart();
		cart1.setMaGianHang(1);
		MatHang mh1 = new MatHang();
		SanPhamDAO spDao = new SanPhamDAO();
		SanPham sp = spDao.lay(12);
		mh1.setSanPham(sp);
		mh1.setSoLuong(10);

		cart1.themMatHang(mh1);

		themMiniCart(cart1);

		MiniCart cart2 = new MiniCart();
		cart2.setMaGianHang(2);
		cart2.themMatHang(mh1);

		themMiniCart(cart2);
		
		Map<String, Object> session = ActionContext.getContext().getSession();
		session.put("gh", this);
	}

	public void themMiniCart(MiniCart cart) {
		if (dsMiniCart.containsKey(cart.getMaGianHang())) {
			capNhatMiniCart(cart);
		} else {
			dsMiniCart.put(cart.getMaGianHang(), cart);
		}
	}

	public void capNhatMiniCart(MiniCart cart) {
		// De day tinh sau
	}

	public void themMatHang(int maGianHang, MatHang matHang) {
		if (dsMiniCart.containsKey(maGianHang)) {
			MiniCart cart = dsMiniCart.get(maGianHang);
			List<MatHang> dsMH = cart.getDsMatHang();
			if (dsMH.contains(matHang)) {
				MatHang mh = dsMH.get(dsMH.indexOf(matHang));
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

	public void capNhatMatHang(int maGianHang, MatHang matHang, int soLuong) {
		if (dsMiniCart.containsKey(maGianHang)) {
			MiniCart cart = dsMiniCart.get(maGianHang);
			List<MatHang> dsMH = cart.getDsMatHang();
			if (dsMH.contains(matHang)) {
				MatHang mh = dsMH.get(dsMH.indexOf(matHang));
				mh.setSoLuong(soLuong);
			} else {
				cart.themMatHang(matHang);
			}
		} else {
			MiniCart cart = new MiniCart();
			cart.setMaGianHang(maGianHang);
			cart.capNhatSoLuong(matHang, soLuong);
			dsMiniCart.put(maGianHang, cart);
		}
	}

	public void xoaMatHang(int maGianHang, MatHang matHang) {
		if (dsMiniCart.containsKey(maGianHang)) {
			MiniCart cart = dsMiniCart.get(maGianHang);
			if (cart.getDsMatHang().contains(matHang))
				cart.xoaMatHang(matHang);
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
