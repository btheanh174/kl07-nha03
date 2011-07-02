package com.estore.shop.action;

import java.util.List;

import com.estore.core.model.dao.SanPhamDAO;
import com.estore.core.model.dao.ThamSoDAO;
import com.estore.core.model.pojo.DuLieuTrang;
import com.estore.core.model.pojo.SanPham;
import com.estore.core.util.NumberUtil;
import com.opensymphony.xwork2.ActionSupport;

public class IndexAction extends ActionSupport{

	private List<SanPham> dsLaptop;
	private List<SanPham> dsDienThoai;
	private SanPhamDAO spDao = new SanPhamDAO();
	private ThamSoDAO tsDao  = new ThamSoDAO();
	
	private int trang1 = 1;
	private int trang2 = 1;
	private int tongSoTrang1;
	private int tongSoTrang2;
	private List<Integer> soTrang1;
	private List<Integer> soTrang2;
	
	@Override
	public String execute() throws Exception {
		int soSanPhamTrenTrang = tsDao.layGiaTri(1);
		DuLieuTrang dlt1 =  spDao.layDanhSachTheoLoai("LAPTOP", trang1, soSanPhamTrenTrang);
		tongSoTrang1 = dlt1.getTongSoTrang();
		soTrang1 = NumberUtil.getIntListFromInt(tongSoTrang1);
		dsLaptop = dlt1.getDsDuLieu();
		
		DuLieuTrang dlt2 =  spDao.layDanhSachTheoLoai("DIENTHOAI", trang2, soSanPhamTrenTrang);
		tongSoTrang2 = dlt2.getTongSoTrang();
		soTrang2 = NumberUtil.getIntListFromInt(tongSoTrang2);
		dsDienThoai = dlt2.getDsDuLieu();
		
		return SUCCESS;
	}
	public List<SanPham> getDsLaptop() {
		return dsLaptop;
	}
	public void setDsLaptop(List<SanPham> dsLaptop) {
		this.dsLaptop = dsLaptop;
	}
	public List<SanPham> getDsDienThoai() {
		return dsDienThoai;
	}
	public void setDsDienThoai(List<SanPham> dsDienThoai) {
		this.dsDienThoai = dsDienThoai;
	}
	public int getTrang1() {
		return trang1;
	}
	public void setTrang1(int trang1) {
		this.trang1 = trang1;
	}
	public int getTrang2() {
		return trang2;
	}
	public void setTrang2(int trang2) {
		this.trang2 = trang2;
	}
	public int getTongSoTrang1() {
		return tongSoTrang1;
	}
	public void setTongSoTrang1(int tongSoTrang1) {
		this.tongSoTrang1 = tongSoTrang1;
	}
	public int getTongSoTrang2() {
		return tongSoTrang2;
	}
	public void setTongSoTrang2(int tongSoTrang2) {
		this.tongSoTrang2 = tongSoTrang2;
	}
	public List<Integer> getSoTrang1() {
		return soTrang1;
	}
	public void setSoTrang1(List<Integer> soTrang1) {
		this.soTrang1 = soTrang1;
	}
	public List<Integer> getSoTrang2() {
		return soTrang2;
	}
	public void setSoTrang2(List<Integer> soTrang2) {
		this.soTrang2 = soTrang2;
	}
}
