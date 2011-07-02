package com.estore.core.model.dao;

import java.util.List;

import com.estore.core.model.pojo.TinhThanhPho;
import com.estore.core.model.pojo.TinhTrangHoaDon;


public class TinhTrangHoaDonDAO extends AbstractDAO {

	public TinhTrangHoaDonDAO() {
		super();
	}
	
	public List layDanhSach(){
		return super.findAll(TinhTrangHoaDon.class);
	}
	
	public TinhTrangHoaDon lay(int id){
		return (TinhTrangHoaDon)super.find(TinhTrangHoaDon.class, id);
	}
}
