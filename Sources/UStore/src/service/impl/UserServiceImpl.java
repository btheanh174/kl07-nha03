package service.impl;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.Transaction;

import service.UserService;
import util.HibernateUtil;

import model.User;

public class UserServiceImpl implements UserService {

	Session session = null;
	Transaction transaction = null;

	public UserServiceImpl() {
		super();
		// TODO Auto-generated constructor stub
		session = HibernateUtil.getSessionFactory().getCurrentSession();
	}

	@Override
	public List<User> findAll() {
		// TODO Auto-generated method stub
		return session.createQuery("from User").list();
	}

	@Override
	public User find(int id) {
		// TODO Auto-generated method stub
		return (User) session.createQuery("from User where id = :uid")
				.setParameter("uid", id).uniqueResult();
	}

	@Override
	public void save(User usr){
		// TODO Auto-generated method stub
		try {
			transaction = session.beginTransaction();
			session.save(usr);
			transaction.commit();
		} catch (RuntimeException ex) {
			if (usr != null) {
				transaction.rollback();
				throw ex;
			}
		}
	}

	@Override
	public void remove(int id) {
		// TODO Auto-generated method stub

	}

}
