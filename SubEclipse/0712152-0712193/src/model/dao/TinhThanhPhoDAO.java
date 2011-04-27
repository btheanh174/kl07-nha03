package model.dao;

import java.util.List;

import model.pojo.TinhThanhPho;

public class TinhThanhPhoDAO extends AbstractDAO{

	public TinhThanhPhoDAO() {
		super();
	}
	
	public List layDanhSach(){
		return super.findAll(TinhThanhPho.class);
	}
	
	public TinhThanhPho lay(int id){
		return (TinhThanhPho)super.find(TinhThanhPho.class, id);
	}
	
	public void them(TinhThanhPho ttp){
		super.saveOrUpdate(ttp);
	}
}
