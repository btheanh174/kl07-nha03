package com.estore.core.model.dao;

import java.util.List;

import com.estore.core.model.pojo.HinhThucVanChuyen;


public class HinhThucVanChuyenDAO extends AbstractDAO{

	public HinhThucVanChuyenDAO() {
		super();
	}
	
	public List layDanhSach(){
		return super.findAll(HinhThucVanChuyen.class);
	}
	
	public HinhThucVanChuyen lay(int id){
		return (HinhThucVanChuyen)super.find(HinhThucVanChuyen.class, id);
	}
	
}
