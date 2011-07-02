package com.estore.core.model.dao;

import java.util.List;


import org.hibernate.Hibernate;
import org.hibernate.HibernateException;

import com.estore.core.model.pojo.ChiTietHoaDon;
import com.estore.core.model.pojo.HoaDon;
import com.estore.core.util.HibernateUtil;


public class ChiTietHoaDonDAO extends AbstractDAO {

	public ChiTietHoaDonDAO() {
		super();
	}

	public List<ChiTietHoaDon> layDanhSach(){
		return super.findAll(ChiTietHoaDon.class);
	}
	
	public List<ChiTietHoaDon> layDanhSach(HoaDon hoaDon){
		List<ChiTietHoaDon> kq = null;
		try{
			session = HibernateUtil.getSessionFactory().getCurrentSession();
			tx = session.beginTransaction();
			
			kq = session.createQuery("from ChiTietHoaDon as ct where ct.hoaDon =:hd")
			.setParameter("hd", hoaDon).list();
			for (ChiTietHoaDon ct : kq) {
				Hibernate.initialize(ct);
				Hibernate.initialize(ct.getSanPham());
			}
			
			tx.commit();
		}catch(HibernateException e){
			handleException(e);
		}finally{
			HibernateUtil.shutdown();
		}
		
		
		return kq;
	}
	
	public ChiTietHoaDon lay(int id){
		return (ChiTietHoaDon)super.find(ChiTietHoaDon.class, id);
	}
	
	public void them(ChiTietHoaDon chiTiet){
		super.saveOrUpdate(chiTiet);
	}
	
	public void xoa(ChiTietHoaDon chiTiet){
		super.delete(chiTiet);
	}
	
	public void capNhat(ChiTietHoaDon chiTiet){
		super.saveOrUpdate(chiTiet);
	}
}
