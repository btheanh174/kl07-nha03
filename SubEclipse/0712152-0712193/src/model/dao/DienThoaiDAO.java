package model.dao;

import java.util.List;

import model.pojo.DienThoai;
import model.pojo.DienThoaiTieuChi;

import org.hibernate.HibernateException;
import org.hibernate.Query;

import util.HibernateUtil;

public class DienThoaiDAO extends AbstractDAO {

	public DienThoaiDAO() {
		super();
	}

	public List<DienThoai> layDanhSach(){
		return super.findAll(DienThoai.class);
	}
	
	public DienThoai lay(int id){
		return (DienThoai)super.find(DienThoai.class, id);
	}
	
	public void them(DienThoai dienThoai){
		super.saveOrUpdate(dienThoai);
	}
	
	public void xoa(DienThoai dienThoai){
		super.delete(dienThoai);
	}
	
	public void capNhat(DienThoai dienThoai){
		super.saveOrUpdate(dienThoai);
	}
	
	public List<DienThoai> timKiem(DienThoaiTieuChi tieuChi){
		List<DienThoai> kq = null;
		try{
			session = HibernateUtil.getSessionFactory().getCurrentSession();
			tx = session.beginTransaction();
			// Cau truy van tim kiem
			String hql = "from DienThoai where ";
			Query query = session.createQuery(hql);
			//
			kq = query.list();
			tx.commit();
		}catch(HibernateException e){
			handleException(e);
		}finally{
			HibernateUtil.shutdown();
		}
		
		return kq;
	}
	
	// Tim kiem va tra ra ket qua co phan trang
	public List<DienThoai> timKiem(DienThoaiTieuChi tieuChi, int trang){
		List<DienThoai> kq = null;
		try{
			session = HibernateUtil.getSessionFactory().getCurrentSession();
			tx = session.beginTransaction();
			// Cau truy van tim kiem
			String hql = "";
			Query query = session.createQuery(hql);
			//
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
