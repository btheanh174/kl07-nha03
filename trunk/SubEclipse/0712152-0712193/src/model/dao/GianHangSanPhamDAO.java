package model.dao;

import model.pojo.GianHang;
import model.pojo.GianHangSanPham;
import model.pojo.SanPham;

import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.Transaction;

import util.HibernateUtil;

import com.sun.net.ssl.internal.www.protocol.https.Handler;

public class GianHangSanPhamDAO{

	Session session = null;
	Transaction tx = null;
	
	public GianHangSanPhamDAO(){
		session = HibernateUtil.getSessionFactory().getCurrentSession();
	}
	public void xoa(GianHang gianHang, SanPham sanPham, GianHangSanPham ghsp){
		try{
			session = HibernateUtil.getSessionFactory().getCurrentSession();
			tx = session.beginTransaction();
			
			gianHang.getDsGianHangSanPham().remove(ghsp);
			sanPham.getDsGianHangSanPham().remove(ghsp);
			
			session.delete(ghsp);
			
			tx.commit();
		}catch(HibernateException e){
			if(tx != null){
				tx.rollback();
				throw e;
			}
		}finally{
			HibernateUtil.shutdown();
		}
	}

}
