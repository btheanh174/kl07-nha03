package model.dao;

import java.util.List;

import model.pojo.HoaDon;

public class HoaDonDAO extends AbstractDAO{

	public HoaDonDAO() {
		super();
	}
	
	public List<HoaDon> layDanhSach(){
		return super.findAll(HoaDon.class);
	}
	
	public HoaDon lay(int id){
		return (HoaDon)super.find(HoaDon.class, id);
	}
	
	public void them(HoaDon hoaDon){
		super.saveOrUpdate(hoaDon);
	}
	
	public void xoa(HoaDon hoaDon){
		super.delete(hoaDon);
	}
	
	public void capNhat(HoaDon hoaDon){
		super.saveOrUpdate(hoaDon);
	}
}
