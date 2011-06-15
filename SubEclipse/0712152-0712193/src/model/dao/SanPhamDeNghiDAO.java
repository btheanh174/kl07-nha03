package model.dao;

import java.util.List;

import model.pojo.SanPhamDeNghi;

public class SanPhamDeNghiDAO extends AbstractDAO{

	public SanPhamDeNghiDAO() {
		super();
	}
	
	public void them(SanPhamDeNghi spdn){
		super.saveOrUpdate(spdn);
	}
	
	public void xoa(SanPhamDeNghi spdn){
		super.delete(spdn);
	}

	public void capNhat(SanPhamDeNghi spdn){
		super.saveOrUpdate(spdn);
	}
	
	public List<SanPhamDeNghi> layDanhSach(){
		return super.findAll(SanPhamDeNghi.class);
	}
}
