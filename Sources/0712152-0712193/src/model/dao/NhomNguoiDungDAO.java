package model.dao;

import java.util.List;

import model.pojo.NhomNguoiDung;

public class NhomNguoiDungDAO extends AbstractDAO {
	public NhomNguoiDungDAO(){
		super();
	}
	
	public List layDanhSach(){
		return super.findAll(NhomNguoiDung.class);
	}
	
	public NhomNguoiDung lay(int id){
		return (NhomNguoiDung)super.find(NhomNguoiDung.class, id);
	}
	
	public void them(NhomNguoiDung nhom){
		super.saveOrUpdate(nhom);
	}
	
	public void xoa(NhomNguoiDung nhom){
		super.delete(nhom);
	}
	
	public void capNhat(NhomNguoiDung nhom){
		super.saveOrUpdate(nhom);
	}
}
