package dao;

import java.util.List;

import org.hibernate.Session;

import pojo.User;

import util.HibernateUtil;

public class UserDAO {
	public boolean insert(User usr){
		boolean rs = true;
		try{
			Session session = HibernateUtil.getSessionFactory().getCurrentSession();
			session.beginTransaction();
			
			session.save(usr);
			
			session.getTransaction().commit();
		}catch(Exception ex){
			rs = false;
		}finally{
			HibernateUtil.shutdown();
		}
		return true;
	}
	public User getUser(int id){
		User rs = null;
		try{
			Session session = HibernateUtil.getSessionFactory().getCurrentSession();
			session.beginTransaction();
			
			rs = (User) session.createQuery("from User where id = :uid").setParameter("uid", id).uniqueResult();
						
			session.getTransaction().commit();
		}catch(Exception ex){
			
		}finally{
			HibernateUtil.shutdown();
		}
		
		return rs;
	}
	
	public List<User> getAllUser(){
		List rs = null;
		
		Session session = HibernateUtil.getSessionFactory().getCurrentSession();
		try{
			session.beginTransaction();
			rs = session.createQuery("from User").list();
			session.getTransaction().commit();
		}catch(RuntimeException ex){
			throw ex;
		}finally{
			HibernateUtil.shutdown();
		}
		return rs;
	}
	
	public boolean delete(int id){
		User usr = null;
		Session session = HibernateUtil.getSessionFactory().getCurrentSession();
		boolean rs = true;
		try{
			session.beginTransaction();
			// Lay user co id
			usr = (User) session.get(User.class, id);
			// Xoa
			session.delete(usr);
			session.getTransaction().commit();
		}catch(RuntimeException ex){
			if(usr != null)
				session.getTransaction().rollback();
			else
				rs = false;
			throw ex;
		}finally{
			HibernateUtil.shutdown();
		}
		
		return rs;
	}
	public void udpate(User usr){
		Session session = HibernateUtil.getSessionFactory().getCurrentSession();
		try{
			session.beginTransaction();
			
			session.update(usr);
			
			session.getTransaction().commit();
		}catch(RuntimeException ex){
			if(usr != null)
				session.getTransaction().rollback();
			throw ex;
		}finally{
			HibernateUtil.shutdown();
		}
	}
}
