package model.dao;

import java.util.List;

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

	public List layDanhSach() {
		return super.findAll(SanPham.class);
	}

	public List layDanhSach(int maDanhMuc) {
		List kq = null;
		try {
			tx = session.beginTransaction();
			Query query = session
					.createQuery("from SanPham where danhMuc =:id");
			query.setParameter("id", maDanhMuc);
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