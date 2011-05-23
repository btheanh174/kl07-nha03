package model.dao;

import java.util.List;

import model.pojo.GianHang;
import model.pojo.TaiKhoan;

import org.hibernate.Hibernate;
import org.hibernate.HibernateException;

import util.HibernateUtil;

public class GianHangDAO extends AbstractDAO{

	public GianHangDAO() {
		super();
	}

	public List<GianHang> layDanhSach(){
		return super.findAll(GianHang.class);
	}
	
	/*public GianHang lay(int id){
		return (GianHang)super.find(GianHang.class, id);
	}*/
	
	public GianHang lay(int id) throws NullPointerException{
		GianHang kq = null;
		try{
			session = HibernateUtil.getSessionFactory().getCurrentSession();
			tx = session.beginTransaction();
			
			kq = (GianHang)session.createQuery("from GianHang as gh where gh.maGianHang =:id")
			.setParameter("id", id)
			.uniqueResult();
			
			Hibernate.initialize(kq);
			Hibernate.initialize(kq.getDsDanhMuc());
			Hibernate.initialize(kq.getDsSanPham());
			
			tx.commit();
		}catch(HibernateException e){
			handleException(e);
		}finally{
			HibernateUtil.shutdown();
		}
		return kq;
	}
	
	public GianHang lay(TaiKhoan tk){
		GianHang kq = null;
		try{
			session = HibernateUtil.getSessionFactory().getCurrentSession();
			tx = session.beginTransaction();
			
			kq = (GianHang)session.createQuery("from GianHang as gh where gh.taiKhoan =:tk")
			.setParameter("tk", tk)
			.uniqueResult();
			
			Hibernate.initialize(kq);
			Hibernate.initialize(kq.getDsDanhMuc());
			Hibernate.initialize(kq.getDsSanPham());
			
			tx.commit();
		}catch(HibernateException e){
			handleException(e);
		}finally{
			HibernateUtil.shutdown();
		}
		return kq;
	}
	
	public void them(GianHang gianHang){
		super.saveOrUpdate(gianHang);
	}
	
	public void xoa(GianHang gianHang){
		super.delete(gianHang);
	}
	
	public void capNhat(GianHang gianHang){
		super.saveOrUpdate(gianHang);
	}
}
