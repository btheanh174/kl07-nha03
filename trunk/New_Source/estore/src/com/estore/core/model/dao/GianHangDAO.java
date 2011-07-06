package com.estore.core.model.dao;

import java.util.ArrayList;
import java.util.List;


import org.hibernate.Hibernate;
import org.hibernate.HibernateException;
import org.hibernate.Query;

import com.estore.core.model.pojo.DuLieuTrang;
import com.estore.core.model.pojo.GianHang;
import com.estore.core.model.pojo.GianHangSanPham;
import com.estore.core.model.pojo.SanPham;
import com.estore.core.model.pojo.TaiKhoan;
import com.estore.core.util.HibernateUtil;


public class GianHangDAO extends AbstractDAO {

	public GianHangDAO() {
		super();
	}

	public List<GianHang> layDanhSach() {
		return super.findAll(GianHang.class);
	}

	public DuLieuTrang layDanhSach(int soGianHangTrenTrang, int trang) {
		DuLieuTrang kq = null;
		try {
			session = HibernateUtil.getSessionFactory().getCurrentSession();
			tx = session.beginTransaction();
			Query query = session.createQuery("from GianHang");

			int soGianHang = query.list().size();

			int tongsotrang = soGianHang / soGianHangTrenTrang;
			if (soGianHang % soGianHangTrenTrang != 0) {
				tongsotrang++;
			}

			kq = new DuLieuTrang(tongsotrang);

			int batdau = (trang - 1) * soGianHangTrenTrang;
			query.setFirstResult(batdau);
			query.setMaxResults(soGianHangTrenTrang);

			kq.setBatdau(batdau);

			List list = query.list();
			for (Object gianHang : list) {
				Hibernate.initialize((GianHang) gianHang);
				Hibernate.initialize(((GianHang) gianHang)
						.getDsGianHangSanPham());
			}

			kq.setDsDuLieu(list);
			kq.setLaTrangCuoi(false);

			if (trang * soGianHangTrenTrang >= soGianHang) {
				kq.setLaTrangCuoi(true);
			}

			tx.commit();

		} catch (HibernateException e) {
			handleException(e);
		} finally {
			HibernateUtil.shutdown();
		}
		return kq;
	}

	/*
	 * public GianHang lay(int id){ return (GianHang)super.find(GianHang.class,
	 * id); }
	 */

	public GianHang lay(int id) throws NullPointerException {
		GianHang kq = null;
		try {
			session = HibernateUtil.getSessionFactory().getCurrentSession();
			tx = session.beginTransaction();

			/*
			 * kq = (GianHang) session
			 * .createQuery("from GianHang as gh where gh.maGianHang =:id")
			 * .setParameter("id", id).uniqueResult();
			 */
			kq = (GianHang) session.get(GianHang.class, new Integer(id));
			Hibernate.initialize(kq);
			Hibernate.initialize(kq.getDsGianHangSanPham());
			for (GianHangSanPham ghsp : kq.getDsGianHangSanPham()) {
				Hibernate.initialize(ghsp);
				Hibernate.initialize(ghsp.getSanPham());
			}
			Hibernate.initialize(kq.getDsHoaDon());
			Hibernate.initialize(kq.getDsNhomDanhMuc());

			tx.commit();
		} catch (HibernateException e) {
			handleException(e);
		} finally {
			HibernateUtil.shutdown();
		}
		return kq;
	}

	public GianHang lay(TaiKhoan tk) {
		GianHang kq = null;
		try {
			session = HibernateUtil.getSessionFactory().getCurrentSession();
			tx = session.beginTransaction();

			kq = (GianHang) session
					.createQuery("from GianHang as gh where gh.taiKhoan =:tk")
					.setParameter("tk", tk).uniqueResult();

			Hibernate.initialize(kq);
			Hibernate.initialize(kq.getDsGianHangSanPham());
			for (GianHangSanPham ghsp : kq.getDsGianHangSanPham()) {
				Hibernate.initialize(ghsp);
				Hibernate.initialize(ghsp.getSanPham());
			}
			Hibernate.initialize(kq.getDsHoaDon());

			tx.commit();
		} catch (HibernateException e) {
			handleException(e);
		} finally {
			HibernateUtil.shutdown();
		}
		return kq;
	}

	public void them(GianHang gianHang) {
		super.saveOrUpdate(gianHang);
	}

	public void xoa(GianHang gianHang) {
		super.delete(gianHang);
	}

	public void capNhat(GianHang gianHang) {
		super.saveOrUpdate(gianHang);
	}

	public void xoaGianHangSanPham(GianHang gianHang, GianHangSanPham ghsp) {
		try {
			session = HibernateUtil.getSessionFactory().getCurrentSession();
			tx = session.beginTransaction();

			gianHang.getDsGianHangSanPham().remove(ghsp);
			session.delete(ghsp);

			tx.commit();
		} catch (HibernateException e) {
			handleException(e);
		} finally {
			HibernateUtil.shutdown();
		}
	}
}