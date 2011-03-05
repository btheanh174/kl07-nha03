package dao;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Session;

import pojo.ChuyenXe;

import util.HibernateUtil;


public class ChuyenXeDAO {

	public List<ChuyenXe> layChuyenTheoTuyen(int id) {
		// TODO Auto-generated method stub
		List<ChuyenXe> rs = new ArrayList<ChuyenXe>();
		Session session = (Session) HibernateUtil.getSessionFactory().getCurrentSession();
		session.beginTransaction();
		rs = session.createQuery("from ChuyenXe where tuyen.id =:tx").setParameter("tx", id).list();
		session.getTransaction().commit();
		
		return rs;
	}
	
	public ChuyenXe layChuyen(int id){
		Session session = HibernateUtil.getSessionFactory().getCurrentSession();
		session.beginTransaction();
		ChuyenXe rs = null;
		rs = (ChuyenXe) session.createQuery("from ChuyenXe where id=:ma").setParameter("ma", id).uniqueResult();
		session.getTransaction().commit();
		return rs;
	}
	
	public boolean xoaChuyen(int id){
		boolean rs = true;
		ChuyenXe cx = null;
		Session session = HibernateUtil.getSessionFactory().getCurrentSession();
		try{
		session.beginTransaction();
		cx = (ChuyenXe) session.get(ChuyenXe.class, id);
		session.delete(cx);
		session.getTransaction().commit();
		}catch(RuntimeException ex){
			if(cx != null)
				session.getTransaction().rollback();
			else
				rs = false;
			throw ex;
		}finally{
			HibernateUtil.shutdown();
		}
		return rs;
	}
	
	public boolean themChuyen(ChuyenXe cx){
		boolean rs = true;
		Session session = HibernateUtil.getSessionFactory().getCurrentSession();
		try{
			session.beginTransaction();
			session.save(cx);
			session.getTransaction().commit();
		}catch(RuntimeException ex){
			if(cx != null)
				session.getTransaction().rollback();
			else
				rs = false;
		}finally{
			HibernateUtil.shutdown();
		}
		return rs;
	}
}
