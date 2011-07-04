package com.estore.core.model.dao;

import java.util.ArrayList;
import java.util.List;


import org.hibernate.Hibernate;
import org.hibernate.HibernateException;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.Transaction;

import com.estore.core.model.pojo.DanhMuc;
import com.estore.core.model.pojo.DanhMucGianHang;
import com.estore.core.model.pojo.GianHang;
import com.estore.core.model.pojo.GianHangSanPham;
import com.estore.core.model.pojo.SanPham;
import com.estore.core.util.HibernateUtil;


public class GianHangSanPhamDAO {

	Session session = null;
	Transaction tx = null;

	public GianHangSanPhamDAO() {
		session = HibernateUtil.getSessionFactory().getCurrentSession();
	}

	public void xoa(GianHang gianHang, SanPham sanPham, GianHangSanPham ghsp) {
		try {
			session = HibernateUtil.getSessionFactory().getCurrentSession();
			tx = session.beginTransaction();

			gianHang.getDsGianHangSanPham().remove(ghsp);
			sanPham.getDsGianHangSanPham().remove(ghsp);

			session.delete(ghsp);

			tx.commit();
		} catch (HibernateException e) {
			if (tx != null) {
				tx.rollback();
				throw e;
			}
		} finally {
			HibernateUtil.shutdown();
		}
	}

	public List<GianHangSanPham> layDanhSach(GianHang gianHang) {
		List<GianHangSanPham> kq = new ArrayList<GianHangSanPham>();
		try {
			session = HibernateUtil.getSessionFactory().getCurrentSession();
			tx = session.beginTransaction();

			String hql = "select ghsp from GianHang gh inner join gh.dsGianHangSanPham ghsp "
					+ "where ghsp.gianHang =:gh";
			Query query = session.createQuery(hql);
			query.setParameter("gh", gianHang);

			kq = query.list();

			tx.commit();
		} catch (HibernateException e) {
			if (tx != null) {
				tx.rollback();
				throw e;
			}
		} finally {
			HibernateUtil.shutdown();
		}
		return kq;
	}

	public List<GianHangSanPham> layDanhSach(GianHang gianHang, DanhMuc danhMuc) {
		List<GianHangSanPham> kq = null;
		try {
			session = HibernateUtil.getSessionFactory().getCurrentSession();
			tx = session.beginTransaction();

			String hql = "select ghsp from SanPham sp "
					+ "inner join sp.dsGianHangSanPham ghsp "
					+ "where ghsp.gianHang =:gh " + "and sp.danhMuc =:dm";

			Query query = session.createQuery(hql);
			query.setParameter("gh", gianHang);
			query.setParameter("dm", danhMuc);

			kq = query.list();
			for (GianHangSanPham ghsp : kq) {
				Hibernate.initialize(ghsp);
				Hibernate.initialize(ghsp.getSanPham());
			}

			tx.commit();
		} catch (HibernateException e) {
			if (tx != null) {
				tx.rollback();
				throw e;
			}
		} finally {
			HibernateUtil.shutdown();
		}
		return kq;
	}

	public List<GianHangSanPham> layDanhSach(DanhMucGianHang dmgh) {
		List<GianHangSanPham> kq = new ArrayList<GianHangSanPham>();
		try {
			session = HibernateUtil.getSessionFactory().getCurrentSession();
			tx = session.beginTransaction();

			String hql = "select ghsp from GianHang gh " +
					"inner join gh.dsGianHangSanPham ghsp " +
					"inner join ghsp.sanPham sp " +
					"inner join gh.dsNhomDanhMuc ndm " +
					"inner join ndm.dsDanhMucGianHang dmgh " +
					"where (sp.danhMuc = dmgh.danhMuc) and (dmgh.nhomDanhMuc =:value1 and dmgh.danhMuc =:value2)";

			Query query = session.createQuery(hql);
			query.setParameter("value1", dmgh.getNhomDanhMuc());
			query.setParameter("value2", dmgh.getDanhMuc());

			kq = query.list();
			for (GianHangSanPham ghsp : kq) {
				Hibernate.initialize(ghsp);
				Hibernate.initialize(ghsp.getSanPham());
			}

			tx.commit();
		} catch (HibernateException e) {
			if (tx != null) {
				tx.rollback();
				throw e;
			}
		} finally {
			HibernateUtil.shutdown();
		}
		return kq;
	}
}
