package model.dao;

import java.util.List;

import model.pojo.GianHang;

public class GianHangDAO extends AbstractDAO{

	public GianHangDAO() {
		super();
	}

	public List<GianHang> layDanhSach(){
		return super.findAll(GianHang.class);
	}
	
	public GianHang lay(int id){
		return (GianHang)super.find(GianHang.class, id);
	}
	
	public void them(GianHang gianHang){
		super.saveOrUpdate(gianHang);
	}
	
	public void xoa(GianHang gianHang){
		super.delete(gianHang);
	}
	
	public void capNhat(GianHang gianHang){
		super.saveOrUpdate(gianHang);
	}
}
