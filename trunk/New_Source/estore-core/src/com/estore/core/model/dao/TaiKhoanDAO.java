package com.estore.core.model.dao;

import java.util.List;

import org.hibernate.Hibernate;
import org.hibernate.HibernateException;

import com.estore.core.model.pojo.TaiKhoan;
import com.estore.core.util.HibernateUtil;



public class TaiKhoanDAO extends AbstractDAO{

	public TaiKhoanDAO(){
		super();
	}
	
	public TaiKhoan lay(int id){
		TaiKhoan tk = null;
		try{
			session = HibernateUtil.getSessionFactory().getCurrentSession();
			tx = session.beginTransaction();
			tk = (TaiKhoan)session.load(TaiKhoan.class, new Integer(id));
			Hibernate.initialize(tk.getThanhVien());
			Hibernate.initialize(tk.getGianHang());
			
			tx.commit();
		}catch(HibernateException e){
			handleException(e);
		}finally{
			HibernateUtil.shutdown();
		}
		return tk;
	}
	
	public TaiKhoan lay(String userName){
		TaiKhoan tk = null;
		try{
			session = HibernateUtil.getSessionFactory().getCurrentSession();
			tx = session.beginTransaction();
			tk = (TaiKhoan) session.createQuery("from TaiKhoan as tk where lower(tk.tenTruyCap) like '" +userName.toLowerCase() +"'").uniqueResult();
			tx.commit();
		}catch(HibernateException e){
			handleException(e);
		}finally{
			HibernateUtil.shutdown();
		}
		return tk;
	}
	
	public List<TaiKhoan> layDanhSach() {
		return super.findAll(TaiKhoan.class);
	}
	
	public void xoa(TaiKhoan taiKhoan) {
		super.delete(taiKhoan);
	}

	public void them(TaiKhoan taiKhoan) {
		super.saveOrUpdate(taiKhoan);
	}
	
	public void capNhat(TaiKhoan taiKhoan){
		super.saveOrUpdate(taiKhoan);
	}
}
