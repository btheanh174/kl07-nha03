package model.dao;

import java.util.ArrayList;
import java.util.List;

import model.pojo.DanhMucGianHang;
import model.pojo.GianHang;

import org.hibernate.HibernateException;
import org.hibernate.Query;

import util.HibernateUtil;

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
			
			tx.commit();
		}catch(HibernateException e){
			handleException(e);
		}finally{
			HibernateUtil.shutdown();
		}
		return kq;
	}

}
