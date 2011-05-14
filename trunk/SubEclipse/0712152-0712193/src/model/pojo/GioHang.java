package model.pojo;

import java.util.ArrayList;
import java.util.Enumeration;
import java.util.Hashtable;
import java.util.List;

import model.dao.SanPhamDAO;

public class GioHang {

	private Hashtable<Integer, MatHang> dsMatHang = new Hashtable<Integer, MatHang>();

	public GioHang() {
		/*SanPhamDAO spDao = new SanPhamDAO();
		SanPham sp1 = spDao.lay(6);
		MatHang mh1 = new MatHang(sp1, 1);
		themMatHang(mh1);
		SanPham sp2 = spDao.lay(12);
		MatHang mh2 = new MatHang(sp2, 2);
		themMatHang(mh2);*/
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

	public void xoaMatHang(MatHang matHang) {
		int key = matHang.getSanPham().getMaSanPham();
		if (dsMatHang.containsKey(key)) {
			dsMatHang.remove(key);
		}
	}

	public void xoaMatHang(int key) {
		if (dsMatHang.containsKey(key)) {
			dsMatHang.remove(key);
		}
	}

	public void capNhatSoLuong(MatHang matHang, int soLuong) {
		int key = matHang.getSanPham().getMaSanPham();
		if (dsMatHang.containsKey(key)) {
			MatHang mh = (MatHang) dsMatHang.get(key);
			mh.setSoLuong(soLuong);
		}else{
			dsMatHang.put(key, matHang);
		}
	}
	public void capNhatSoLuong(int key, int soLuong) {
		if (dsMatHang.containsKey(key)) {
			MatHang mh = (MatHang) dsMatHang.get(key);
			mh.setSoLuong(soLuong);
		}
	}
	
	public Enumeration<MatHang> getEnumeration(){
		return dsMatHang.elements();
	}
	
	
	
	public float layTongTien(){
		Enumeration<MatHang> ds = dsMatHang.elements();
		float kq = 0.00f;
		while(ds.hasMoreElements()){
			MatHang mh = ds.nextElement();
			kq += mh.getSanPham().getGia() * mh.getSoLuong();
		}
		return kq;
	}
	
	public int laySoLuongMatHang(){
		return dsMatHang.size();
	}
	
	public void xoaTatCa(){
		dsMatHang.clear();
	}
}
