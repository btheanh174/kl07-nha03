package com.estore.core.model.dao;

import java.util.List;

import com.estore.core.model.pojo.NguoiNhan;


public class NguoiNhanDAO extends AbstractDAO{

	public NguoiNhanDAO() {
		super();
	}

	public List layDanhSach(){
		return super.findAll(NguoiNhan.class);
	}
	
	public NguoiNhan lay(int id){
		return (NguoiNhan)super.find(NguoiNhan.class, id);
	}
	
	public void them(NguoiNhan nguoiNhan){
		super.saveOrUpdate(nguoiNhan);
	}
	
	public void xoa(NguoiNhan nguoiNhan){
		super.delete(nguoiNhan);
	}
	
	public void capNhat(NguoiNhan nguoiNhan){
		super.saveOrUpdate(nguoiNhan);
	}
}
