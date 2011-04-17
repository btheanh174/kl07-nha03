package model.dao;

import java.util.List;

import model.pojo.TaiKhoan;

public class TaiKhoanDAO extends AbstractDAO{

	public TaiKhoanDAO(){
		super();
	}
	
	public TaiKhoan lay(int id) {
		return (TaiKhoan)super.find(TaiKhoan.class, id);
	}
	
	public List<TaiKhoan> layDanhSach() {
		return super.findAll(TaiKhoan.class);
	}
	
	public void xoa(TaiKhoan taiKhoan) {
		super.delete(taiKhoan);
	}

	public void them(TaiKhoan taiKhoan) {
		super.saveOrUpdate(taiKhoan);
	}
	
	public void capNhat(TaiKhoan taiKhoan){
		super.saveOrUpdate(taiKhoan);
	}
}
