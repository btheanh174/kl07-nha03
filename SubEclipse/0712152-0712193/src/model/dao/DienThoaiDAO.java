package model.dao;

import java.util.List;

import model.pojo.DienThoai;

public class DienThoaiDAO extends AbstractDAO {

	public DienThoaiDAO() {
		super();
	}

	public List<DienThoai> layDanhSach(){
		return super.findAll(DienThoai.class);
	}
	
	public DienThoai lay(int id){
		return (DienThoai)super.find(DienThoai.class, id);
	}
	
	public void them(DienThoai dienThoai){
		super.saveOrUpdate(dienThoai);
	}
	
	public void xoa(DienThoai dienThoai){
		super.delete(dienThoai);
	}
	
	public void capNhat(DienThoai dienThoai){
		super.saveOrUpdate(dienThoai);
	}
}
