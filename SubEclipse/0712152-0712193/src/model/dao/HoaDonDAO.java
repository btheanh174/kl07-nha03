package model.dao;

import java.util.List;

import org.hibernate.Hibernate;
import org.hibernate.HibernateException;
import org.hibernate.Query;

import util.HibernateUtil;

import model.pojo.HoaDon;
import model.pojo.SanPham;

public class HoaDonDAO extends AbstractDAO{

	public HoaDonDAO() {
		super();
	}
	
	public List<HoaDon> layDanhSach(){
		return super.findAll(HoaDon.class);
	}
	
	public HoaDon lay(int id){
		HoaDon kq = null;
		try{
			session = HibernateUtil.getSessionFactory().getCurrentSession();
			tx = session.beginTransaction();
			
			String hql = "from HoaDon as hd where hd.maHoaDon =:id";
			Query query = session.createQuery(hql);
			query.setParameter("id", id);
			kq = (HoaDon) query.uniqueResult();
			
			Hibernate.initialize(kq);
			Hibernate.initialize(kq.getDsChiTietHoaDon());
			
			tx.commit();
		}catch(HibernateException e){
			handleException(e);
		}finally{
			HibernateUtil.shutdown();
		}
		return kq;
	}
	
	public void them(HoaDon hoaDon){
		super.saveOrUpdate(hoaDon);
	}
	
	public void xoa(HoaDon hoaDon){
		super.delete(hoaDon);
	}
	
	public void capNhat(HoaDon hoaDon){
		super.saveOrUpdate(hoaDon);
	}
}
