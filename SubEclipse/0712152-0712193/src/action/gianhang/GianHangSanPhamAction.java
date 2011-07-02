package com.estore.shop.action.gianhang;

import com.estore.core.model.dao.GianHangDAO;
import com.estore.core.model.dao.SanPhamDAO;
import com.opensymphony.xwork2.ActionSupport;

public class GianHangSanPhamAction extends ActionSupport {
	
	private int maGianHang;
	private GianHangDAO ghDao = new GianHangDAO();
	
	private int maSanPham;
	private SanPhamDAO spDao = new SanPhamDAO();
	@Override
	public String execute() throws Exception {
		return super.execute();
	}
	
}
