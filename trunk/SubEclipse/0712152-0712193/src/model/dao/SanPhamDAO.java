package model.dao;

import java.util.List;

import model.pojo.DanhMuc;
import model.pojo.DuLieuTrang;
import model.pojo.SanPham;
import model.pojo.SanPhamTieuChi;

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
	
	public List<SanPham> timKiem(SanPhamTieuChi tieuChi){
		List<SanPham> kq = null;
		try{
			session = HibernateUtil.getSessionFactory().getCurrentSession();
			tx = session.beginTransaction();
			
			String ten = "%" + tieuChi.getTenSanPham().toLowerCase() + "%";
			String loai = "%" + tieuChi.getLoaiSanPham().toUpperCase() + "%";
			
			String hql = "from SanPham as sp "
			+ "where lower(sp.tenSanPham) like :ten "
			+ "and ((" + "".equals(tieuChi.getGiaDuoi()) + ") or (sp.gia >=:min)) "
			+ "and ((" + "".equals(tieuChi.getGiaTren()) + ") or (sp.gia <=:max)) "
			+ "and sp.loaiSanPham like :loai";
			
			Query query = session.createQuery(hql)
			.setParameter("ten", ten)
			.setParameter("min", tieuChi.getGiaDuoi())
			.setParameter("max", tieuChi.getGiaTren())
			.setParameter("loai", loai);
			
			tx.commit();
			kq = query.list();
		}catch(HibernateException e){
			handleException(e);
		}finally{
			HibernateUtil.shutdown();
		}
		return kq;
	}
	

	/*public List<SanPham> timKiem(SanPhamTieuChi tieuChi, int trang){
		List<SanPham> kq = null;
		int soSanPhamTrenTrang = new ThamSoDAO().layGiaTri(1);
		try{
			session = HibernateUtil.getSessionFactory().getCurrentSession();
			tx = session.beginTransaction();
			
			String ten = "%" + tieuChi.getTenSanPham().toLowerCase() + "%";
			String loai = "%" + tieuChi.getLoaiSanPham().toUpperCase() + "%";
			
			String hql = "from SanPham as sp "
			+ "where lower(sp.tenSanPham) like :ten "
			+ "and ((" + "".equals(tieuChi.getGiaDuoi()) + ") or (sp.gia >=:min)) "
			+ "and ((" + "".equals(tieuChi.getGiaTren()) + ") or (sp.gia <=:max)) "
			+ "and sp.loaiSanPham like :loai";
			
			Query query = session.createQuery(hql)
			.setParameter("ten", ten)
			.setParameter("min", tieuChi.getGiaDuoi())
			.setParameter("max", tieuChi.getGiaTren())
			.setParameter("loai", loai);
			
			
			int batdau = (trang - 1) * soSanPhamTrenTrang;
			
			query.setFirstResult(batdau);
			query.setMaxResults(soSanPhamTrenTrang);
			
			kq = query.list();
			tx.commit();
		}catch(HibernateException e){
			handleException(e);
		}finally{
			HibernateUtil.shutdown();
		}
		return kq;
	}
	*/

	public DuLieuTrang timKiem(SanPhamTieuChi tieuChi, int trang){
		DuLieuTrang kq = null;
		int soSanPhamTrenTrang = new ThamSoDAO().layGiaTri(1);
		try{
			session = HibernateUtil.getSessionFactory().getCurrentSession();
			tx = session.beginTransaction();
			
			String ten = "%" + tieuChi.getTenSanPham().toLowerCase() + "%";
			String loai = "%" + tieuChi.getLoaiSanPham().toUpperCase() + "%";
			
			String hql = "from SanPham as sp "
			+ "where lower(sp.tenSanPham) like :ten "
			+ "and ((" + "".equals(tieuChi.getGiaDuoi()) + ") or (sp.gia >=:min)) "
			+ "and ((" + "".equals(tieuChi.getGiaTren()) + ") or (sp.gia <=:max)) "
			+ "and sp.loaiSanPham like :loai";
			
			Query query = session.createQuery(hql)
			.setParameter("ten", ten)
			.setParameter("min", tieuChi.getGiaDuoi())
			.setParameter("max", tieuChi.getGiaTren())
			.setParameter("loai", loai);
			int temp = query.list().size();
			
			int tongSoTrang = temp / soSanPhamTrenTrang;
			if(temp % soSanPhamTrenTrang != 0){
				tongSoTrang++;
			}
			kq = new DuLieuTrang(tongSoTrang);
			
			int batdau = (trang - 1) * soSanPhamTrenTrang;
			
			query.setFirstResult(batdau);
			query.setMaxResults(soSanPhamTrenTrang);
			
			kq.setBatdau(batdau);
			kq.setTrangHienTai(trang);
			kq.setDsDuLieu(query.list());
			kq.setLaTrangCuoi(false);
			if(trang * soSanPhamTrenTrang >= tongSoTrang){
				kq.setLaTrangCuoi(true);
			}
			
			tx.commit();
		}catch(HibernateException e){
			handleException(e);
		}finally{
			HibernateUtil.shutdown();
		}
		return kq;
	}

}