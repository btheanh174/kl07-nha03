package model.dao;

import java.util.ArrayList;
import java.util.List;

import model.pojo.GianHang;
import model.pojo.NhomDanhMuc;

import org.hibernate.Hibernate;
import org.hibernate.HibernateException;
import org.hibernate.Query;

import util.HibernateUtil;

public class NhomDanhMucDAO extends AbstractDAO {

	public NhomDanhMucDAO() {
		super();
	}

	public NhomDanhMuc lay(int id) {
		NhomDanhMuc kq = null;
		try {

			session = HibernateUtil.getSessionFactory().getCurrentSession();
			tx = session.beginTransaction();

			kq = (NhomDanhMuc) session.load(NhomDanhMuc.class, id);

			Hibernate.initialize(kq);
			Hibernate.initialize(kq.getGianHang());
			Hibernate.initialize(kq.getDsDanhMucGianHang());

			tx.commit();

		} catch (HibernateException e) {
			handleException(e);
		} finally {
			HibernateUtil.shutdown();
		}

		return kq;
	}

	public List<NhomDanhMuc> layDanhSach() {
		return super.findAll(NhomDanhMuc.class);
	}

	public List<NhomDanhMuc> layDanhSach(GianHang gianHang) {
		List<NhomDanhMuc> kq = new ArrayList<NhomDanhMuc>();
		try {

			session = HibernateUtil.getSessionFactory().getCurrentSession();
			tx = session.beginTransaction();

			String hql = "from NhomDanhMuc as ndm where ndm.gianHang =:nhom order by ndm.thuTu asc";
			Query query = session.createQuery(hql);
			query.setParameter("nhom", gianHang);

			kq = query.list();

			for (NhomDanhMuc nhomDanhMuc : kq) {
				Hibernate.initialize(nhomDanhMuc);
				Hibernate.initialize(nhomDanhMuc.getGianHang());
				Hibernate.initialize(nhomDanhMuc.getDsDanhMucGianHang());
			}

			tx.commit();

		} catch (HibernateException e) {
			handleException(e);
		} finally {
			HibernateUtil.shutdown();
		}

		return kq;
	}

	public void them(NhomDanhMuc nhomDanhMuc) {
		super.saveOrUpdate(nhomDanhMuc);
	}

	public void xoa(NhomDanhMuc nhomDanhMuc) {
		super.delete(nhomDanhMuc);
	}

	public void capNhat(NhomDanhMuc nhomDanhMuc) {
		super.saveOrUpdate(nhomDanhMuc);
	}
}
