package com.estore.shop.action.bean;

import java.util.List;

import com.estore.core.model.dao.SanPhamDAO;
import com.estore.core.model.pojo.SanPham;

public class SanPhamBean {
	private List<SanPham> dsSanPham;
	private SanPhamDAO spDao = new SanPhamDAO();
	public List<SanPham> getDsSanPham(){
		dsSanPham = spDao.layDanhSach();
		return dsSanPham;
	}
	
	private List<SanPham> dsSanPhamTheoDanhMuc;
	private int maDanhMuc;
	
	public int getMaDanhMuc() {
		return maDanhMuc;
	}
	public void setMaDanhMuc(int maDanhMuc) {
		this.maDanhMuc = maDanhMuc;
	}
}
