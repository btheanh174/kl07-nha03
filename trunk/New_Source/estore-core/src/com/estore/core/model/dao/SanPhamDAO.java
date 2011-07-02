package com.estore.core.model.dao;

import java.util.ArrayList;
import java.util.List;


import org.hibernate.Hibernate;
import org.hibernate.HibernateException;
import org.hibernate.Query;

import com.estore.core.model.pojo.DanhMuc;
import com.estore.core.model.pojo.DienThoaiTieuChi;
import com.estore.core.model.pojo.DuLieuTrang;
import com.estore.core.model.pojo.GianHang;
import com.estore.core.model.pojo.GianHangSanPham;
import com.estore.core.model.pojo.LaptopTieuChi;
import com.estore.core.model.pojo.SanPham;
import com.estore.core.model.pojo.SanPhamGH;
import com.estore.core.model.pojo.SanPhamTieuChi;
import com.estore.core.util.HibernateUtil;


public class SanPhamDAO extends AbstractDAO {

	public SanPhamDAO() {
		super();
	}

	/*
	 * public SanPham lay(int id) { return (SanPham) super.find(SanPham.class,
	 * id); }
	 */

	public SanPham lay(int id) {
		SanPham kq = null;
		try {
			session = HibernateUtil.getSessionFactory().getCurrentSession();
			tx = session.beginTransaction();

			/*String hql = "from SanPham as sp where sp.maSanPham =:id";
			Query query = session.createQuery(hql);
			query.setParameter("id", id);
			kq = (SanPham) query.uniqueResult();*/
			kq = (SanPham)session.load(SanPham.class, new Integer(id));
			/*
			 * Su dung khi lazy cua association voi HinhAnh la true
			 * Hibernate.initialize(kq);
			 * Hibernate.initialize(kq.getDsHinhAnh());
			 */
			Hibernate.initialize(kq);
			Hibernate.initialize(kq.getDsGianHangSanPham());

			tx.commit();
		} catch (HibernateException e) {
			handleException(e);
		} finally {
			HibernateUtil.shutdown();
		}
		return kq;
	}

	public List<SanPham> layDanhSach() {
		return super.findAll(SanPham.class);
	}


	public List<SanPham> layDanhSach(DanhMuc danhMuc) {
		List<SanPham> kq = new ArrayList<SanPham>();
		try {
			session = HibernateUtil.getSessionFactory().getCurrentSession();
			tx = session.beginTransaction();
			Query query = session
					.createQuery("from SanPham as sp where sp.danhMuc =:dm");
			query.setParameter("dm", danhMuc);

			List<SanPham> list = query.list();

			for (SanPham sanPham : list) {
				Hibernate.initialize(sanPham);
				Hibernate.initialize(sanPham.getDsHinhAnh());
				Hibernate.initialize(sanPham.getDsGianHangSanPham());
			}
			
			kq.addAll(kq.size(), list);

			tx.commit();
			
			if (danhMuc.getDsDanhMucCon().size() > 0) {
				for (DanhMuc dm : danhMuc.getDsDanhMucCon()) {
					kq.addAll(kq.size(), layDanhSach(dm));
				}
			}

		} catch (HibernateException e) {
			handleException(e);
		} finally {
			HibernateUtil.shutdown();
		}
		return kq;
	}

	/*
	 * Lay san pham theo danh muc co phan trang
	 * Voi tham so dau vao la: trang, danhMuc
	 */
	public List<SanPham> layDanhSach(DanhMuc danhMuc, int trang,
			int soSanPhamTrenTrang) {
		List<SanPham> kq = new ArrayList<SanPham>();
		try {
			session = HibernateUtil.getSessionFactory().getCurrentSession();
			tx = session.beginTransaction();
			String hql = "from SanPham as sp where sp.danhMuc =:dm";

			Query query = session.createQuery(hql);
			query.setParameter("dm", danhMuc);

			int batDau = (trang - 1) * soSanPhamTrenTrang;

			query.setFirstResult(batDau);
			query.setMaxResults(soSanPhamTrenTrang);

			List<SanPham> list = query.list();
			
			// * Su dung khi lazy cua association voi HinhAnh la true
			for (SanPham sanPham : list) {
				Hibernate.initialize(sanPham);
				Hibernate.initialize(sanPham.getDsHinhAnh());
				Hibernate.initialize(sanPham.getDsGianHangSanPham());
			}
			kq.addAll(kq.size(), list);

			tx.commit();
			
			if (danhMuc.getDsDanhMucCon().size() > 0) {
				for (DanhMuc dm : danhMuc.getDsDanhMucCon()) {
					kq.addAll(kq.size(), layDanhSach(dm, trang, soSanPhamTrenTrang));
				}
			}

		} catch (HibernateException e) {
			handleException(e);
		} finally {
			HibernateUtil.shutdown();
		}
		return kq;
	}

	public List<SanPham> layDanhSach(int trang, int soSanPhamTrenTrang) {
		List<SanPham> kq = null;
		try {
			session = HibernateUtil.getSessionFactory().getCurrentSession();
			tx = session.beginTransaction();

			Query query = session.createQuery("from SanPham");

			int batDau = (trang - 1) * soSanPhamTrenTrang;

			query.setFirstResult(batDau);
			query.setMaxResults(soSanPhamTrenTrang);

			kq = query.list();

			// * Su dung khi lazy cua association voi HinhAnh la true
			for (SanPham sanPham : kq) {
				Hibernate.initialize(sanPham);
				Hibernate.initialize(sanPham.getDsGianHangSanPham());
			}

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

	public List<SanPham> timKiem(SanPhamTieuChi tieuChi) {
		List<SanPham> kq = null;
		try {
			session = HibernateUtil.getSessionFactory().getCurrentSession();
			tx = session.beginTransaction();

			String ten = "%" + tieuChi.getTenSanPham().toLowerCase() + "%";
			String loai = "%" + tieuChi.getLoaiSanPham().toUpperCase() + "%";

			String hql = "from SanPham as sp "
					+ "where lower(sp.tenSanPham) like :ten " + "and (("
					+ "".equals(tieuChi.getGiaDuoi())
					+ ") or (sp.gia >=:min)) " + "and (("
					+ "".equals(tieuChi.getGiaTren())
					+ ") or (sp.gia <=:max)) "
					+ "and sp.loaiSanPham like :loai";

			Query query = session.createQuery(hql).setParameter("ten", ten)
					.setParameter("min", tieuChi.getGiaDuoi())
					.setParameter("max", tieuChi.getGiaTren())
					.setParameter("loai", loai);

			kq = query.list();
			for (SanPham sp : kq) {
				Hibernate.initialize(sp);
				Hibernate.initialize(sp.getDsGianHangSanPham());
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
	 * public List<SanPham> timKiem(SanPhamTieuChi tieuChi, int trang){
	 * List<SanPham> kq = null; int soSanPhamTrenTrang = new
	 * ThamSoDAO().layGiaTri(1); try{ session =
	 * HibernateUtil.getSessionFactory().getCurrentSession(); tx =
	 * session.beginTransaction();
	 * 
	 * String ten = "%" + tieuChi.getTenSanPham().toLowerCase() + "%"; String
	 * loai = "%" + tieuChi.getLoaiSanPham().toUpperCase() + "%";
	 * 
	 * String hql = "from SanPham as sp " +
	 * "where lower(sp.tenSanPham) like :ten " + "and ((" +
	 * "".equals(tieuChi.getGiaDuoi()) + ") or (sp.gia >=:min)) " + "and ((" +
	 * "".equals(tieuChi.getGiaTren()) + ") or (sp.gia <=:max)) " +
	 * "and sp.loaiSanPham like :loai";
	 * 
	 * Query query = session.createQuery(hql) .setParameter("ten", ten)
	 * .setParameter("min", tieuChi.getGiaDuoi()) .setParameter("max",
	 * tieuChi.getGiaTren()) .setParameter("loai", loai);
	 * 
	 * 
	 * int batdau = (trang - 1) * soSanPhamTrenTrang;
	 * 
	 * query.setFirstResult(batdau); query.setMaxResults(soSanPhamTrenTrang);
	 * 
	 * kq = query.list(); tx.commit(); }catch(HibernateException e){
	 * handleException(e); }finally{ HibernateUtil.shutdown(); } return kq; }
	 */
	public DuLieuTrang layDanhSachTheoLoai(String loaiSanPham, int trang,
			int soSanPhamTrenTrang) {
		DuLieuTrang kq = null;
		try {
			session = HibernateUtil.getSessionFactory().getCurrentSession();
			tx = session.beginTransaction();

			Query query = session
					.createQuery("from SanPham as sp where sp.loaiSanPham like :loai");
			query.setParameter("loai", loaiSanPham);

			int batDau = (trang - 1) * soSanPhamTrenTrang;
			int soSanPham = query.list().size();
			int tongSoTrang = soSanPham / soSanPhamTrenTrang;
			if (soSanPham % soSanPhamTrenTrang != 0) {
				tongSoTrang++;
			}

			kq = new DuLieuTrang(tongSoTrang);

			query.setFirstResult(batDau);
			query.setMaxResults(soSanPhamTrenTrang);

			kq.setBatdau(batDau);
			kq.setDsDuLieu(query.list());
			kq.setLaTrangCuoi(false);
			if (trang * soSanPhamTrenTrang >= soSanPham) {
				kq.setLaTrangCuoi(true);
			}
			// * Su dung khi lazy cua association voi HinhAnh la true
			for (Object sanPham : kq.getDsDuLieu()) {
				Hibernate.initialize(((SanPham) sanPham));
				Hibernate
						.initialize(((SanPham) sanPham).getDsGianHangSanPham());
			}

			tx.commit();

		} catch (HibernateException e) {
			handleException(e);
		} finally {
			HibernateUtil.shutdown();
		}
		return kq;
	}

	public DuLieuTrang timKiem(SanPhamTieuChi tieuChi, int trang,
			int soSanPhamTrenTrang) {
		DuLieuTrang kq = null;
		try {
			System.out.println("Tim kiem dao");
			session = HibernateUtil.getSessionFactory().getCurrentSession();
			tx = session.beginTransaction();

			String ten = "%" + tieuChi.getTenSanPham().toLowerCase() + "%";
			String loai = "%" + tieuChi.getLoaiSanPham().toUpperCase() + "%";

			String hql = "from SanPham as sp "
					+ "where lower(sp.tenSanPham) like :ten "
					+ "and sp.loaiSanPham like :loai " + "and (("
					+ "".equals(tieuChi.getGiaDuoi())
					+ ") or (sp.gia >=:min)) " + "and (("
					+ "".equals(tieuChi.getGiaTren()) + ") or (sp.gia <=:max))";

			Query query = session.createQuery(hql).setParameter("ten", ten)
					.setParameter("min", tieuChi.getGiaDuoi())
					.setParameter("max", tieuChi.getGiaTren())
					.setParameter("loai", loai);

			int soSanPham = query.list().size();

			int tongSoTrang = soSanPham / soSanPhamTrenTrang;
			if (soSanPham % soSanPhamTrenTrang != 0) {
				tongSoTrang++;
			}
			kq = new DuLieuTrang(tongSoTrang);

			int batdau = (trang - 1) * soSanPhamTrenTrang;

			query.setFirstResult(batdau);
			query.setMaxResults(soSanPhamTrenTrang);

			List<SanPham> list = query.list();

			for (SanPham sp : list) {
				Hibernate.initialize(sp);
				Hibernate.initialize(sp.getDsGianHangSanPham());
			}

			kq.setBatdau(batdau);
			kq.setDsDuLieu(list);
			kq.setLaTrangCuoi(false);

			if (trang * soSanPhamTrenTrang >= soSanPham) {
				kq.setLaTrangCuoi(true);
			}

			tx.commit();
		} catch (HibernateException e) {
			System.out.println("Exception tim kiem");
			handleException(e);
		} finally {
			HibernateUtil.shutdown();
		}
		return kq;
	}

	public DuLieuTrang timKiem(LaptopTieuChi tieuChi, int trang) {
		DuLieuTrang kq = null;
		int soSanPhamTrenTrang = new ThamSoDAO().layGiaTri(1);
		try {
			session = HibernateUtil.getSessionFactory().getCurrentSession();
			tx = session.beginTransaction();

			String tatca = "--[Bạn hãy ch�?n]--";

			tx.commit();
		} catch (HibernateException e) {
			handleException(e);
		} finally {
			HibernateUtil.shutdown();
		}
		return kq;
	}

	public DuLieuTrang timKiem(DienThoaiTieuChi tieuChi, int trang) {
		DuLieuTrang kq = null;
		int soSanPhamTrenTrang = new ThamSoDAO().layGiaTri(1);
		try {
			session = HibernateUtil.getSessionFactory().getCurrentSession();
			tx = session.beginTransaction();

			String tatca = "--[Bạn hãy ch�?n]--";

			String hql = "from SanPham as sp " + "left outer join DienThoai "
					+ "where lower(sp.tenSanPham) like :ten "
					+ "and sp.loaiSanPham like :loai " + "and (("
					+ tatca.equals(tieuChi.getHangSanXuat())
					+ ") or (lower(sp.hangSanXuat) like :hangSanXuat)) "
					+ "and (("
					+ tatca.equals(tieuChi.getMang())
					+ ") or (lower(sp.mang) like :mang)) "
					+ "and (("
					+ tatca.equals(tieuChi.getKieuDang())
					+ ") or (lower(sp.kieuDang) like :kieuDang)) "
					+ "and sp.trongLuong < :trongLuong "
					+ "and sp.manHinh > :manHinh "
					+ "and sp.doPhanGiai > :doPhanGiai "
					+ "and (("
					+ tatca.equals(tieuChi.getKieuChuong())
					+ ") or (lower(sp.kieuChuong) like :kieuChuong)) "
					+ "and sp.sim = :sim "
					+ "and (("
					+ tatca.equals(tieuChi.getLoaiTheNho())
					+ ") or (lower(sp.theNho) like :theNho)) "
					+ "and sp.boNhoTrong > :boNhoTrong "
					+ "and sp.ram > :ram "
					+ "and (("
					+ tatca.equals(tieuChi.getMauSac())
					+ ") or (lower(sp.heDieuHanh) like :heDieuHanh)) "
					+ "and (("
					+ tatca.equals(tieuChi.getTinNhan())
					+ ") or (lower(sp.tinNhan) like :tinNhan)) "
					+ "and sp.camera > :camera "
					+ "and (("
					+ tatca.equals(tieuChi.getMauSac())
					+ ") or (lower(sp.mauSac) like :mauSac)) "
					+ "and (("
					+ tatca.equals(tieuChi.getTinhNangCoBan())
					+ ") or (lower(sp.tinhNangCoBan) like :tinhNangCoBan)) "
					+ "and sp.pin > :pin "
					+ "and sp.thoiGianDamThoai > :thoiGianDamThoai "
					+ "and sp.thoiGianCho > :thoiGianCho "
					+ "and (("
					+ "".equals(tieuChi.getGiaDuoi())
					+ ") or (sp.gia >=:min)) "
					+ "and (("
					+ "".equals(tieuChi.getGiaTren())
					+ ") or (sp.gia <=:max)) ";

			String loaiSanPham = "DIENTHOAI";
			String ten = "%" + tieuChi.getTenSanPham().toLowerCase() + "%";
			String loai = "%" + loaiSanPham + "%";

			String hangSanXuat = "%" + tieuChi.getHangSanXuat() + "%";
			String mang = "%" + tieuChi.getMang() + "%";
			String kieuDang = "%" + tieuChi.getKieuDang() + "%";
			String kieuChuong = "%" + tieuChi.getKieuChuong() + "%";
			String theNho = "%" + tieuChi.getLoaiTheNho() + "%";
			String heDieuHanh = "%" + tieuChi.getHeDieuHanh() + "%";
			String tinNhan = "%" + tieuChi.getTinNhan() + "%";
			String mauSac = "%" + tieuChi.getMauSac() + "%";
			String tinhNangCoBan = "%" + tieuChi.getTinhNangCoBan() + "%";

			Query query = session
					.createQuery(hql)
					.setParameter("ten", ten)
					.setParameter("min", tieuChi.getGiaDuoi())
					.setParameter("max", tieuChi.getGiaTren())
					.setParameter("loai", loai)

					// set parameter chuoi
					.setParameter("hangSanXuat", hangSanXuat)
					.setParameter("mang", mang)
					.setParameter("kieuDang", kieuDang)
					.setParameter("kieuChuong", kieuChuong)
					.setParameter("theNho", theNho)
					.setParameter("heDieuHanh", heDieuHanh)
					.setParameter("tinNhan", tinNhan)
					.setParameter("mauSac", mauSac)
					.setParameter("tinhNangCoBan", tinhNangCoBan)
					// set parameter so
					.setParameter("sim", tieuChi.getSoSim())
					.setParameter("trongLuong", tieuChi.getTrongLuong())
					.setParameter("manHinh", tieuChi.getLoaiManHinh())
					.setParameter("doPhanGiai", tieuChi.getDoPhanGiai())
					.setParameter("boNhoTrong", tieuChi.getBoNhoTrong())
					.setParameter("ram", tieuChi.getRam())
					.setParameter("camera", tieuChi.getCamera())
					.setParameter("pin", tieuChi.getPin())
					.setParameter("thoiGianDamThoai",
							tieuChi.getThoiGianDamThoai())
					.setParameter("thoiGianCho", tieuChi.getThoiGianCho());

			int temp = query.list().size();

			int tongSoTrang = temp / soSanPhamTrenTrang;
			if (temp % soSanPhamTrenTrang != 0) {
				tongSoTrang++;
			}
			kq = new DuLieuTrang(tongSoTrang);

			int batdau = (trang - 1) * soSanPhamTrenTrang;

			query.setFirstResult(batdau);
			query.setMaxResults(soSanPhamTrenTrang);

			kq.setBatdau(batdau);
			kq.setDsDuLieu(query.list());
			kq.setLaTrangCuoi(false);
			if (trang * soSanPhamTrenTrang >= tongSoTrang) {
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
	 * Lay danh sách gian hàng bán sản phẩm này và được sắp xếp
	 */
	public List<GianHangSanPham> layDanhSachGianHangSapXep(int id, String order) {
		List<GianHangSanPham> kq = null;

		try {
			session = HibernateUtil.getSessionFactory().getCurrentSession();
			tx = session.beginTransaction();

			String hql = "from SanPham as sp join sp.dsGianHangSanPham "
					+ "where sp.maSanPham =:id and order by ghsp.giaRieng :order";
			Query query = session.createQuery(hql);
			query.setParameter("id", id);
			query.setParameter("order", order);
			kq = query.list();

			tx.commit();
		} catch (HibernateException e) {
			handleException(e);
		} finally {
			HibernateUtil.shutdown();
		}

		return kq;
	}

	public List<SanPhamGH> layDsSanPhamGH(int id) {
		List<SanPhamGH> kq = new ArrayList<SanPhamGH>();
		try {
			session = HibernateUtil.getSessionFactory().getCurrentSession();
			tx = session.beginTransaction();

			String hql = "" + "from SanPham as sp where sp.maSanPham =:id";

			Query query = session.createQuery(hql);
			query.setParameter("id", id);

			SanPham sp = (SanPham) query.uniqueResult();
			List<GianHangSanPham> list = sp.getDsGianHangSanPham();
			SanPhamGH temp = null;
			for (GianHangSanPham ghsp : list) {
				Integer gia = (ghsp.getGiaRieng() != null) ? ghsp.getGiaRieng()
						: 0;
				GianHang gh = ghsp.getGianHang();

				temp = new SanPhamGH(gh, gia, ghsp.getBaoHanh(),
						ghsp.getSoLuong(), ghsp.getCapNhat());
				kq.add(temp);
			}

			tx.commit();
		} catch (HibernateException e) {
			handleException(e);
		} finally {
			HibernateUtil.shutdown();
		}
		return kq;
	}
	
	public List<SanPham> layDanhSach(GianHang gianHang){
		List<SanPham> kq  = new ArrayList<SanPham>();
		try{
			session = HibernateUtil.getSessionFactory().getCurrentSession();
			tx = session.beginTransaction();
			
			String hql = "select sp from SanPham sp join sp.dsGianHangSanPham ghsp " +
					"where ghsp.gianHang =:gh";
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