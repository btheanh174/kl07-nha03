package com.estore.core.model.dao;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Hibernate;
import org.hibernate.HibernateException;
import org.hibernate.Query;

import com.estore.core.model.pojo.DanhMuc;
import com.estore.core.model.pojo.GianHang;
import com.estore.core.model.pojo.NhomDanhMuc;
import com.estore.core.util.HibernateUtil;


public class DanhMucDAO extends AbstractDAO {
	public DanhMucDAO(){
		super();
	}
	
	public List<DanhMuc> layDanhSach(){
		return super.findAll(DanhMuc.class);
	}
	
	public List<DanhMuc> layDanhSach(DanhMuc danhMucCha){
		List kq = null;
		try{
			tx = session.beginTransaction();
			Query query = session.createQuery("from DanhMuc as dm where dm.danhMucCha =:dm")
			.setParameter("dm", danhMucCha);
			kq = query.list();
			for (Object ob : kq) {
				Hibernate.initialize(((DanhMuc)ob).getDsDanhMucCon());
			}
			tx.commit();
		}catch(HibernateException e){
			handleException(e);
		}finally{
			HibernateUtil.shutdown();
		}
		return kq;
	}
	/*
	 * Lay danh sach danh muc cua gian hang
	 */
	public List<DanhMuc> layDanhSach(NhomDanhMuc nhom){
		List<DanhMuc> kq = new ArrayList<DanhMuc>();
		
		try{
			session = HibernateUtil.getSessionFactory().getCurrentSession();
			tx = session.beginTransaction();
			
			String hql = "select distinct dm from DanhMuc dm join dm.dsDanhMucGianHang dmgh" +
					" where dmgh.nhomDanhMuc =:nhom";
			
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
	/*
	 * Lay ds Danh Muc cua gian hang
	 */
	public List<DanhMuc> layDanhSach(GianHang gianHang){
		List<DanhMuc> kq = new ArrayList<DanhMuc>();
		
		try{
			session = HibernateUtil.getSessionFactory().getCurrentSession();
			tx = session.beginTransaction();
			
			String hql = "select dm from DanhMuc dm " +
					"inner join dm.dsDanhMucGianHang dmgh " +
					"inner join dmgh.nhomDanhMuc ndm " +
					"where ndm.gianHang =:gh";
			
			
			Query query = session.createQuery(hql);
			query.setParameter("gh", gianHang);
			
			kq = query.list();
			
			tx.commit();
		}catch(HibernateException e){
			handleException(e);
		}finally{
			HibernateUtil.shutdown();
		}
		
		return kq;
	}
	
	public DanhMuc lay(int id){
		// return (DanhMuc)super.find(DanhMuc.class, id);
		DanhMuc kq = null;
		try{
			session = HibernateUtil.getSessionFactory().getCurrentSession();
			tx = session.beginTransaction();
			kq = (DanhMuc) session.load(DanhMuc.class, new Integer(id));
			Hibernate.initialize(kq.getDsDanhMucCon());
			tx.commit();
		}catch(HibernateException e){
			handleException(e);
		}finally{
			HibernateUtil.shutdown();
		}
		return kq;
	}
	
	public void xoa(DanhMuc danhMuc){
		super.delete(danhMuc);
	}
	
	public void them(DanhMuc danhMuc){
		super.saveOrUpdate(danhMuc);
	}
	
	public void capNhat(DanhMuc danhMuc){
		super.saveOrUpdate(danhMuc);
	}
}
