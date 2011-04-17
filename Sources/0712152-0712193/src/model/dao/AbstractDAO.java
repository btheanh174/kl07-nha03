package model.dao;

import java.util.List;

import org.hibernate.HibernateException;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.Transaction;

import util.HibernateUtil;

public abstract class AbstractDAO {

	Session session = null;
	Transaction tx = null;
	
	public AbstractDAO() {
		session=HibernateUtil.getSessionFactory().getCurrentSession();
	}
	
	protected Object find(Class clazz, int id) {
		Object obj = null;
		try{
			session = HibernateUtil.getSessionFactory().getCurrentSession();
			tx = session.beginTransaction();
			//obj = session.load(clazz, id);
			obj = session.get(clazz, id);
			tx.commit();
		}catch(HibernateException e){
			handleException(e);
		}finally{
			HibernateUtil.shutdown();
		}
		return obj;
	}
	
	protected List findAll(Class clazz) {
		List ds = null;
		try{
			session = HibernateUtil.getSessionFactory().getCurrentSession();
			tx = session.beginTransaction();
			Query query = session.createQuery("from " + clazz.getName());
			ds = query.list();
			tx.commit();
		}catch(HibernateException e){
			handleException(e);
		}finally{
			HibernateUtil.shutdown();
		}
		return ds;
	} 
	
	protected void delete(Object obj) {
		try{
			session = HibernateUtil.getSessionFactory().getCurrentSession();
			tx = session.beginTransaction();
			session.delete(obj);
			tx.commit();
			
		}catch(HibernateException e){
			handleException(e);
		}finally{
			HibernateUtil.shutdown();
		}
	}
	
	
	protected void saveOrUpdate(Object obj) {
		try{
			session = HibernateUtil.getSessionFactory().getCurrentSession();
			tx = session.getTransaction();
			tx.begin();
			session.saveOrUpdate(obj);
			tx.commit();
			
		}catch(HibernateException e){
			handleException(e);
		}finally{
			HibernateUtil.shutdown();
		}
	}
	
	protected void handleException(HibernateException e) {
		tx.rollback();
	}
}
