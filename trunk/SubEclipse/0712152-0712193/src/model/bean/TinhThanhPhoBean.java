package model.bean;

import java.util.List;

import model.dao.TinhThanhPhoDAO;
import model.pojo.TinhThanhPho;

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
