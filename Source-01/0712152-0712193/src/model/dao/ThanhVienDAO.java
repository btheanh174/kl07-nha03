package model.dao;

import java.util.List;

import model.pojo.ThanhVien;

public class ThanhVienDAO extends AbstractDAO{
	public ThanhVienDAO(){
		super();
	}
	
	public ThanhVien lay(int id){
		return (ThanhVien)super.find(ThanhVien.class, id);
	}
	
	public List layDanhSach(){
		return super.findAll(ThanhVien.class);
	}
	
	public void them(ThanhVien thanhVien){
		super.saveOrUpdate(thanhVien);
	}
	
	public void xoa(ThanhVien thanhVien){
		super.delete(thanhVien);
	}
	
	public void capNhat(ThanhVien thanhVien){
		super.saveOrUpdate(thanhVien);
	}
}
