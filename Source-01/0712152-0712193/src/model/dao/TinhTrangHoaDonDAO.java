package model.dao;

import java.util.List;

import model.pojo.TinhTrangHoaDon;

public class TinhTrangHoaDonDAO extends AbstractDAO {

	public TinhTrangHoaDonDAO() {
		super();
	}
	
	public List layDanhSach(){
		return super.findAll(TinhTrangHoaDon.class);
	}
}
