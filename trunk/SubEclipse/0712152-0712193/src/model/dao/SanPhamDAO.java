package model.dao;

import java.util.List;

import model.pojo.DanhMuc;
import model.pojo.SanPham;

import org.hibernate.HibernateException;
import org.hibernate.Query;

import util.HibernateUtil;


public class SanPhamDAO extends AbstractDAO {

	public SanPhamDAO() {
		super();
	}

	public SanPham lay(int id) {
		return (SanPham) super.find(SanPham.class, id);
	}

	public List<SanPham> layDanhSach() {
		return super.findAll(SanPham.class);
	}

	public List<SanPham> layDanhSach(DanhMuc danhMuc) {
		List<SanPham> kq = null;
		try {
			session = HibernateUtil.getSessionFactory().getCurrentSession();
			tx = session.beginTransaction();
			Query query = session
					.createQuery("from SanPham as sp where sp.danhMuc =:dm");
			query.setParameter("dm", danhMuc);
			
			kq = query.list();
			tx.commit();

		} catch (HibernateException e) {
			handleException(e);
		} finally {
			HibernateUtil.shutdown();
		}
		return kq;
	}
	
	// Lay san pham theo danh muc co phan trang
	// Voi tham so dau vao la: trang, danhMuc
	public List<SanPham> layDanhSach(DanhMuc danhMuc, int trang) {
		List<SanPham> kq = null;
		try {
			session = HibernateUtil.getSessionFactory().getCurrentSession();
			tx = session.beginTransaction();

			Query query = session
					.createQuery("from SanPham as sp where sp.danhMuc =:dm");
			query.setParameter("dm", danhMuc);

			// int soSanPhamTrenTrang = new ThamSoDAO().lay(1).getGiaTri();
			int soSanPhamTrenTrang = new ThamSoDAO().layGiaTri(1);
			int batDau = (trang - 1) * soSanPhamTrenTrang;
			
			query.setFirstResult(batDau);
			query.setMaxResults(soSanPhamTrenTrang);

			kq = query.list();

			tx.commit();

		} catch (HibernateException e) {
			handleException(e);
		} finally {
			HibernateUtil.shutdown();
		}
		return kq;
	}

	public void them(SanPham sanPham) {
		super.saveOrUpdate(sanPham);
	}

	public void xoa(SanPham sanPham) {
		super.delete(sanPham);
	}

	public void capNhat(SanPham sanPham) {
		super.saveOrUpdate(sanPham);
	}
}