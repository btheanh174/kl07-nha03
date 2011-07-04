package com.estore.core.model.dao;

import java.util.List;


import org.hibernate.HibernateException;
import org.hibernate.Query;

import com.estore.core.model.pojo.Laptop;
import com.estore.core.model.pojo.LaptopTieuChi;
import com.estore.core.util.HibernateUtil;


public class LaptopDAO extends AbstractDAO{

	public LaptopDAO() {
		super();
	}

	public List<Laptop> layDanhSach(){
		return super.findAll(Laptop.class);
	}
	
	public Laptop lay(int id){
		return (Laptop)super.find(Laptop.class, id);
	}
	
	public void them(Laptop laptop){
		super.saveOrUpdate(laptop);
	}
	
	public void xoa(Laptop laptop){
		super.delete(laptop);
	}
	
	public void capNhat(Laptop laptop){
		super.saveOrUpdate(laptop);
	}
	
	public List<Laptop> timKiem(LaptopTieuChi tieuChi){
		List<Laptop> kq = null;
		try{
			session = HibernateUtil.getSessionFactory().getCurrentSession();
			tx = session.beginTransaction();
			String hql = "";
			Query query = session.createQuery(hql);
			kq = query.list();
			tx.commit();
		}catch(HibernateException e){
			handleException(e);
		}finally{
			HibernateUtil.shutdown();
		}
		return kq;
	}
	
	// Tim kiem laptop va tra ra ket qua co phan trang
	public List<Laptop> timKiem(LaptopTieuChi tieuChi, int trang){
		List<Laptop> kq = null;
		try{
			session = HibernateUtil.getSessionFactory().getCurrentSession();
			tx = session.beginTransaction();
			String hql = "";
			Query query = session.createQuery(hql);
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
