package service.impl;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.Transaction;

import model.City;
import service.CityService;
import util.HibernateUtil;

public class CityServiceImpl implements CityService {
	Session session = null;
	Transaction transaction = null;
	public CityServiceImpl() {
		super();
		// TODO Auto-generated constructor stub
		session = HibernateUtil.getSessionFactory().getCurrentSession();
	}

	@Override
	public List<City> findAll() {
		// TODO Auto-generated method stub
		return session.createQuery("from City").list();
	}

}
