package com.estore.core.model.dao;

import java.util.List;


import org.hibernate.Hibernate;
import org.hibernate.HibernateException;

import com.estore.core.model.pojo.ChiTietHoaDon;
import com.estore.core.model.pojo.GianHang;
import com.estore.core.model.pojo.HoaDon;
import com.estore.core.model.pojo.ThanhVien;
import com.estore.core.util.HibernateUtil;


public class HoaDonDAO extends AbstractDAO{

	public HoaDonDAO() {
		super();
	}
	
	public List<HoaDon> layDanhSach(){
		List<HoaDon> kq = null;
		try{
			session = HibernateUtil.getSessionFactory().getCurrentSession();
			tx = session.beginTransaction();
			
			kq = session.createQuery("from HoaDon").list();
			for (HoaDon hoaDon : kq) {
				Hibernate.initialize(hoaDon);
				Hibernate.initialize(hoaDon.getNguoiNhan());
				Hibernate.initialize(hoaDon.getThanhVien());
				Hibernate.initialize(hoaDon.getTinhTrang());
				Hibernate.initialize(hoaDon.getHinhThuc());
				Hibernate.initialize(hoaDon.getPhuongThuc());
				Hibernate.initialize(hoaDon.getDsChiTietHoaDon());
			}
			
			tx.commit();
		}catch(HibernateException e){
			handleException(e);
		}finally{
			HibernateUtil.shutdown();
		}
		return kq;
	}
	
	public List<HoaDon> layDanhSach(GianHang gianHang){
		List<HoaDon> kq = null;
		try{
			session = HibernateUtil.getSessionFactory().getCurrentSession();
			tx = session.beginTransaction();
			
			kq = session.createQuery("from HoaDon as hd where hd.gianHang =:gh")
			.setParameter("gh", gianHang)
			.list();
			for (HoaDon hoaDon : kq) {
				Hibernate.initialize(hoaDon);
				Hibernate.initialize(hoaDon.getNguoiNhan());
				Hibernate.initialize(hoaDon.getThanhVien());
				Hibernate.initialize(hoaDon.getTinhTrang());
				Hibernate.initialize(hoaDon.getHinhThuc());
				Hibernate.initialize(hoaDon.getPhuongThuc());
				Hibernate.initialize(hoaDon.getDsChiTietHoaDon());
			}
			
			tx.commit();
		}catch(HibernateException e){
			handleException(e);
		}finally{
			HibernateUtil.shutdown();
		}
		return kq;
	}
	
	public List<HoaDon> layDanhSach(ThanhVien thanhVien){
		List<HoaDon> kq = null;
		
		try{
			session = HibernateUtil.getSessionFactory().getCurrentSession();
			tx = session.beginTransaction();
			
			kq = session.createQuery("from HoaDon as hd where hd.thanhVien =:tv")
			.setParameter("tv", thanhVien)
			.list();
			for (HoaDon hoaDon : kq) {
				Hibernate.initialize(hoaDon);
				Hibernate.initialize(hoaDon.getGianHang());
				Hibernate.initialize(hoaDon.getNguoiNhan());
				Hibernate.initialize(hoaDon.getThanhVien());
				Hibernate.initialize(hoaDon.getTinhTrang());
				Hibernate.initialize(hoaDon.getHinhThuc());
				Hibernate.initialize(hoaDon.getPhuongThuc());
				Hibernate.initialize(hoaDon.getDsChiTietHoaDon());
			}
			
			tx.commit();
		}catch(HibernateException e){
			handleException(e);
		}finally{
			HibernateUtil.shutdown();
		}
		
		return kq;
	}
	
	public HoaDon lay(int id){
		HoaDon kq = null;
		try{
			session = HibernateUtil.getSessionFactory().getCurrentSession();
			tx = session.beginTransaction();
			
			//kq = (HoaDon)session.load(HoaDon.class, new Integer(id));
			kq = (HoaDon)session.get(HoaDon.class, id);
			
			Hibernate.initialize(kq);
			Hibernate.initialize(kq.getDsChiTietHoaDon());
			for (ChiTietHoaDon ct : kq.getDsChiTietHoaDon()) {
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
