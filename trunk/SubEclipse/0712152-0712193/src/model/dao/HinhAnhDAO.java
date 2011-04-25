package model.dao;

import java.util.List;

import model.pojo.HinhAnh;
import model.pojo.SanPham;

import org.hibernate.HibernateException;
import org.hibernate.Query;

import util.HibernateUtil;

public class HinhAnhDAO extends AbstractDAO{

	public HinhAnhDAO() {
		super();
	}
	
	public HinhAnh lay(int id){
		return (HinhAnh) super.find(HinhAnh.class, id);
	}
	
	public List<HinhAnh> layDanhSach(){
		return super.findAll(HinhAnh.class);
	}
	
	public void them(HinhAnh hinhAnh){
		super.saveOrUpdate(hinhAnh);
	}
	
	public void xoa(HinhAnh hinhAnh){
		super.delete(hinhAnh);
	}
	
	public void capNhat(HinhAnh hinhAnh){
		super.saveOrUpdate(hinhAnh);
	}
	
	public List<HinhAnh> layDanhSach(SanPham sanPham){
		List<HinhAnh> kq = null;
		try{
			tx = session.beginTransaction();
			Query query = session.createQuery("from HinhAnh where sanPham =: sp");
			query.setParameter("sp", sanPham);
			kq = query.list();
			tx.commit();
		}catch(HibernateException e){
			handleException(e);
		}finally{
			HibernateUtil.shutdown();
		}
		return kq;
	}
}
