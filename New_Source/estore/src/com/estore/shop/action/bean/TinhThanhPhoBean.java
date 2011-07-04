package com.estore.shop.action.bean;

import java.util.List;

import com.estore.core.model.dao.TinhThanhPhoDAO;
import com.estore.core.model.pojo.TinhThanhPho;

public class TinhThanhPhoBean {
	private static List<TinhThanhPho> dsTinhThanhPho;

	public List<TinhThanhPho> getDsTinhThanhPho() {

		if (dsTinhThanhPho == null) {
			TinhThanhPhoDAO ttpDao = new TinhThanhPhoDAO();
			dsTinhThanhPho = ttpDao.layDanhSach();
		}
		return dsTinhThanhPho;
	}
}
