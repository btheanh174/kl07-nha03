package model.dao;

import java.util.ArrayList;
import java.util.List;

import model.pojo.GianHang;
import model.pojo.GianHangSanPham;
import model.pojo.SanPham;

import org.hibernate.HibernateException;
import org.hibernate.Query;
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

	public List<GianHangSanPham> layDanhSach(GianHang gianHang){
		List<GianHangSanPham> kq  = new ArrayList<GianHangSanPham>();
		try{
			session = HibernateUtil.getSessionFactory().getCurrentSession();
			tx = session.beginTransaction();
			
			String hql = "select ghsp from GianHang gh inner join gh.dsGianHangSanPham ghsp " +
					"where ghsp.gianHang =:gh";
			Query query = session.createQuery(hql);
			query.setParameter("gh", gianHang);
			
			kq = query.list();
			
			tx.commit();
		}catch(HibernateException e){
			if(tx != null){
				tx.rollback();
				throw e;
			}
		}finally{
			HibernateUtil.shutdown();
		}
		return kq;
	}
}
