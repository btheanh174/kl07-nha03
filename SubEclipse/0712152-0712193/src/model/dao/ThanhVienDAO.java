package model.dao;

import java.util.List;

import org.hibernate.Hibernate;
import org.hibernate.HibernateException;
import org.hibernate.Query;

import util.HibernateUtil;

import model.pojo.HoaDon;
import model.pojo.ThanhVien;

public class ThanhVienDAO extends AbstractDAO{
	public ThanhVienDAO(){
		super();
	}
	
	public ThanhVien lay(int id){
		ThanhVien kq = null;
		try{
			session = HibernateUtil.getSessionFactory().getCurrentSession();
			tx = session.beginTransaction();
			
			String hql = "from ThanhVien as tv where tv.maTaiKhoan =:id";
			Query query = session.createQuery(hql);
			query.setParameter("id", id);
			kq = (ThanhVien) query.uniqueResult();
			
			Hibernate.initialize(kq);
			Hibernate.initialize(kq.getDsHoaDon());
			Hibernate.initialize(kq.getDsNguoiNhan());
			
			tx.commit();
		}catch(HibernateException e){
			handleException(e);
		}finally{
			HibernateUtil.shutdown();
		}
		return kq;
	}
	
	public List layDanhSach(){
		return super.findAll(ThanhVien.class);
	}
	
	public void them(ThanhVien thanhVien){
		super.saveOrUpdate(thanhVien);
	}
	
	public void xoa(ThanhVien thanhVien){
		super.delete(thanhVien);
	}
	
	public void capNhat(ThanhVien thanhVien){
		super.saveOrUpdate(thanhVien);
	}
}
