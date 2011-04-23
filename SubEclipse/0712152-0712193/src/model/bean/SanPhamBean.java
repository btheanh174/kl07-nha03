package model.bean;

import java.util.List;

import model.dao.DanhMucDAO;
import model.dao.SanPhamDAO;
import model.pojo.DanhMuc;
import model.pojo.SanPham;

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
