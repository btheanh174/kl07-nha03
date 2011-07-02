package com.estore.core.model.dao;

import java.util.List;

import com.estore.core.model.pojo.TinNhan;


public class TinNhanDAO extends AbstractDAO{

	public TinNhanDAO() {
		super();
	}
	
	public List layDanhSach(){
		return super.findAll(TinNhan.class);
	}
	
	public TinNhan lay(int id){
		return (TinNhan)super.find(TinNhan.class, id);
	}
	
	public void them(TinNhan tinNhan){
		super.saveOrUpdate(tinNhan);
	}
	
	public void xoa(TinNhan tinNhan){
		super.delete(tinNhan);
	}
	
	public void capNhat(TinNhan tinNhan){
		super.saveOrUpdate(tinNhan);
	}
}
