package model.dao;

import model.pojo.DanhMuc;
import model.pojo.GianHang;
import model.pojo.GianHangDanhMuc;

import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.Transaction;

import util.HibernateUtil;

public class GianHangDanhMucDAO {

	Session session = null;
	Transaction tx = null;
	public GianHangDanhMucDAO() {
		session = HibernateUtil.getSessionFactory().getCurrentSession();
	}
	
	public void xoa(GianHang gianHang, DanhMuc danhMuc, GianHangDanhMuc ghdm){
		try{
			session = HibernateUtil.getSessionFactory().getCurrentSession();
			tx = session.beginTransaction();
			
			gianHang.getDsGianHangDanhMuc().remove(ghdm);
			danhMuc.getDsGianHangDanhMuc().remove(ghdm);
			
			session.delete(ghdm);
			
			tx.commit();
		}catch(HibernateException e){
			if(tx != null){
				tx.rollback();
				throw e;
			}
		}finally{
			HibernateUtil.shutdown();
		}
	}

}
