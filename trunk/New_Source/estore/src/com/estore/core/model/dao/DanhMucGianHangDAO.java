package com.estore.core.model.dao;

import java.util.ArrayList;
import java.util.List;


import org.hibernate.Hibernate;
import org.hibernate.HibernateException;
import org.hibernate.Query;

import com.estore.core.model.pojo.DanhMucGianHang;
import com.estore.core.model.pojo.GianHang;
import com.estore.core.model.pojo.NhomDanhMuc;
import com.estore.core.util.HibernateUtil;


public class DanhMucGianHangDAO extends AbstractDAO {

	public DanhMucGianHangDAO() {
		super();
	}
	
	public List<DanhMucGianHang> layDanhSach(GianHang gianHang){
		List<DanhMucGianHang> kq = new ArrayList<DanhMucGianHang>();
		try{
			session = HibernateUtil.getSessionFactory().getCurrentSession();
			tx = session.beginTransaction();
			
			String hql = "select dmgh from NhomDanhMuc ndm " +
					"inner join ndm.dsDanhMucGianHang dmgh " +
					"where ndm.gianHang =:gh";
			
			Query query = session.createQuery(hql);
			query.setParameter("gh", gianHang);
			kq = query.list();
			for (DanhMucGianHang dmgh : kq) {
				Hibernate.initialize(dmgh);
				Hibernate.initialize(dmgh.getDanhMuc());
				Hibernate.initialize(dmgh.getNhomDanhMuc());
			}
			
			tx.commit();
		}catch(HibernateException e){
			handleException(e);
		}finally{
			HibernateUtil.shutdown();
		}
		return kq;
	}
	
	public List<DanhMucGianHang> layDanhSach(NhomDanhMuc nhom){
		List<DanhMucGianHang> kq = new ArrayList<DanhMucGianHang>();
		try{
			session = HibernateUtil.getSessionFactory().getCurrentSession();
			tx = session.beginTransaction();
			
			String hql = "select dmgh from NhomDanhMuc ndm " +
					"inner join ndm.dsDanhMucGianHang dmgh " +
					"where ndm =:nhom";
			
			Query query = session.createQuery(hql);
			query.setParameter("nhom", nhom);
			kq = query.list();
			
			tx.commit();
		}catch(HibernateException e){
			handleException(e);
		}finally{
			HibernateUtil.shutdown();
		}
		return kq;
	}
	
	

}
