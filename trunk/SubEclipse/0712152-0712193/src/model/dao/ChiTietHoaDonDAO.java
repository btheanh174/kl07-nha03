package model.dao;

import java.util.List;

import model.pojo.ChiTietHoaDon;

public class ChiTietHoaDonDAO extends AbstractDAO {

	public ChiTietHoaDonDAO() {
		super();
	}

	public List<ChiTietHoaDon> layDanhSach(){
		return super.findAll(ChiTietHoaDon.class);
	}
	
	public ChiTietHoaDon lay(int id){
		return (ChiTietHoaDon)super.find(ChiTietHoaDon.class, id);
	}
	
	public void them(ChiTietHoaDon chiTiet){
		super.saveOrUpdate(chiTiet);
	}
	
	public void xoa(ChiTietHoaDon chiTiet){
		super.delete(chiTiet);
	}
	
	public void capNhat(ChiTietHoaDon chiTiet){
		super.saveOrUpdate(chiTiet);
	}
}
