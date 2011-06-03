package model.dao;

import java.util.List;

import model.pojo.ChiTietHoaDon;
import model.pojo.GianHang;
import model.pojo.HoaDon;
import model.pojo.ThanhVien;

import org.hibernate.Hibernate;
import org.hibernate.HibernateException;

import util.HibernateUtil;

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
