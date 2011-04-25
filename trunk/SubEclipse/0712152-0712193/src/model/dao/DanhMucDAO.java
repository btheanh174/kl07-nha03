package model.dao;

import java.util.List;

import org.hibernate.HibernateException;
import org.hibernate.Query;

import util.HibernateUtil;

import model.pojo.DanhMuc;

public class DanhMucDAO extends AbstractDAO {
	public DanhMucDAO(){
		super();
	}
	
	public List<DanhMuc> layDanhSach(){
		return super.findAll(DanhMuc.class);
	}
	
	public List<DanhMuc> layDanhSach(DanhMuc danhMucCha){
		List kq = null;
		try{
			tx = session.beginTransaction();
			Query query = session.createQuery("from DanhMuc where danhMucCha =:dm")
			.setParameter("dm", danhMucCha);
			kq = query.list();
			tx.commit();
		}catch(HibernateException e){
			handleException(e);
		}finally{
			HibernateUtil.shutdown();
		}
		return kq;
	}
	
	public DanhMuc lay(int id){
		return (DanhMuc)super.find(DanhMuc.class, id);
	}
	
	public void xoa(DanhMuc danhMuc){
		super.delete(danhMuc);
	}
	
	public void them(DanhMuc danhMuc){
		super.saveOrUpdate(danhMuc);
	}
	
	public void capNhat(DanhMuc danhMuc){
		super.saveOrUpdate(danhMuc);
	}
}
