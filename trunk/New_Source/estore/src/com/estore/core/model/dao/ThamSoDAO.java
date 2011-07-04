package com.estore.core.model.dao;

import java.util.List;


import org.hibernate.Criteria;
import org.hibernate.HibernateException;
import org.hibernate.Query;
import org.hibernate.criterion.Restrictions;

import com.estore.core.model.pojo.ThamSo;
import com.estore.core.util.HibernateUtil;


public class ThamSoDAO extends AbstractDAO{
	
	public ThamSoDAO(){
		super();
	}
	
	public ThamSo lay(int id){
		return (ThamSo)super.find(ThamSo.class, id);
	}
	
	public ThamSo lay(String tenThamSo){
		ThamSo kq = null;
		try{
			session = HibernateUtil.getSessionFactory().getCurrentSession();
			tx = session.beginTransaction();
			
			Criteria crit = session.createCriteria(getClass());
			crit.add(Restrictions.like("tenThamSo", tenThamSo));
			
			
			kq = (ThamSo) crit.uniqueResult();
			
			tx.commit();
		}catch(HibernateException e){
			handleException(e);
		}finally{
			HibernateUtil.shutdown();
		}
		
		return kq;
	}
	
	public List<ThamSo> layDanhSach(){
		return super.findAll(ThamSo.class);
	}
	
	public List<ThamSo> layDanhSach(int tinhTrang){
		List<ThamSo> kq = null;
		try{
			session = HibernateUtil.getSessionFactory().getCurrentSession();
			tx = session.beginTransaction();
			
			Query query = session.createQuery("from ThamSo as ts where ts.tinhTrang =:tt").setParameter("tt", tinhTrang);
			kq = query.list();
			
			tx.commit();
		}catch(HibernateException e){
			handleException(e);
		}finally{
			HibernateUtil.shutdown();
		}
		return kq;
	}
	
	public int layGiaTri(int id){
		int kq = -1;
		
		try{
			session = HibernateUtil.getSessionFactory().getCurrentSession();
			tx = session.beginTransaction();
			
			String hql = "from ThamSo as ts where ts.maThamSo =:id and ts.tinhTrang =:tt";
			Query query = session.createQuery(hql).setParameter("id", id).setParameter("tt", 1);
			
			kq = Integer.parseInt(((ThamSo)query.uniqueResult()).getGiaTri());
			
			tx.commit();
		}catch(HibernateException e){
			handleException(e);
		}finally{
			HibernateUtil.shutdown();
		}
		
		return kq;
	}
}
