package model.bean;

import java.util.List;
import java.util.Set;

import model.dao.DanhMucDAO;
import model.pojo.DanhMuc;
import model.pojo.SanPham;

public class DanhMucBean {
	private static List<DanhMuc> dsDanhMuc;
	private Set<SanPham> dsSanPham; // danh sach san pham cua danh muc
	private int maDanhMuc;
	DanhMucDAO dmDao = new DanhMucDAO();

	public List<DanhMuc> getDsDanhMuc() {
		if (dsDanhMuc == null) {
			dsDanhMuc = dmDao.layDanhSach();
		}
		return dsDanhMuc;
	}

	public Set<SanPham> getDsSanPham() {
		dsSanPham = dmDao.lay(maDanhMuc).getDsSanPham();
		return dsSanPham;
	}

	public void setDsSanPham(Set<SanPham> dsSanPham) {
		this.dsSanPham = dsSanPham;
	}

	public int getMaDanhMuc() {
		return maDanhMuc;
	}

	public void setMaDanhMuc(int maDanhMuc) {
		this.maDanhMuc = maDanhMuc;
	}
}
