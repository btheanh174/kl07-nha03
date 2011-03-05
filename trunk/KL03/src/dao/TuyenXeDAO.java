package dao;

import java.util.List;


import org.hibernate.Session;

import pojo.TuyenXe;

import util.HibernateUtil;

public class TuyenXeDAO {
	public boolean delete(int id){
		Session session = HibernateUtil.getSessionFactory().getCurrentSession();
		TuyenXe tx = null;
		boolean rs = true;
		try{
			session.beginTransaction();
			
			tx = (TuyenXe)session.get(TuyenXe.class, id);
			session.delete(tx);
			
			session.getTransaction().commit();
			
		}catch(RuntimeException ex){
			if(tx != null)
				session.getTransaction().rollback();
			else
				rs = false;
			throw ex;
		}finally{
			HibernateUtil.shutdown();
		}
		return rs;
	}

	public boolean insert(TuyenXe tuyen) {
		// TODO Auto-generated method stub
		Session session = HibernateUtil.getSessionFactory().getCurrentSession();
		boolean rs = true;
		try{
			session.beginTransaction();
			
			session.saveOrUpdate(tuyen);
			
			session.getTransaction().commit();
			
		}catch(RuntimeException ex){
			if(tuyen != null)
				session.getTransaction().rollback();
			else
				rs = false;
			throw ex;
		}finally{
			HibernateUtil.shutdown();
		}
		return rs;
	}
	
	public TuyenXe getById(int id){
		Session session = HibernateUtil.getSessionFactory().getCurrentSession();
		session.beginTransaction();
		TuyenXe tx = null;
		tx = (TuyenXe) session.get(TuyenXe.class, id);
		session.getTransaction().commit();
		
		return tx;
	}
	
	public List getAll() {
		// TODO Auto-generated method stub
		Session session = HibernateUtil.getSessionFactory().getCurrentSession();
		session.beginTransaction();
		List ds = session.createQuery("from TuyenXe").list();
		session.getTransaction().commit();
		return ds;
	}
}
