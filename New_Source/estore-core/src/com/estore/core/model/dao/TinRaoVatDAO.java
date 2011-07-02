package com.estore.core.model.dao;

import java.util.List;

import com.estore.core.model.pojo.TinRaoVat;


public class TinRaoVatDAO extends AbstractDAO{
	public TinRaoVatDAO(){
		super();
	}
	
	public List<TinRaoVat> layDanhSach(){
		return super.findAll(TinRaoVat.class);
	}
	
	public TinRaoVat lay(int id){
		return (TinRaoVat)super.find(TinRaoVat.class, id);
	}
	
	public void them(TinRaoVat tin){
		super.saveOrUpdate(tin);
	}
	
	public void xoa(TinRaoVat tin){
		super.delete(tin);
	}
	
	public void capNhat(TinRaoVat tin){
		super.saveOrUpdate(tin);
	}
}
