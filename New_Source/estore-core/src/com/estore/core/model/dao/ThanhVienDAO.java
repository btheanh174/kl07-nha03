package com.estore.core.model.dao;

import java.util.List;

import org.hibernate.Hibernate;
import org.hibernate.HibernateException;
import org.hibernate.Query;

import com.estore.core.model.pojo.HoaDon;
import com.estore.core.model.pojo.ThanhVien;
import com.estore.core.util.HibernateUtil;



public class ThanhVienDAO extends AbstractDAO{
	public ThanhVienDAO(){
		super();
	}
	
	public ThanhVien lay(int id){
		ThanhVien kq = null;
		try{
			session = HibernateUtil.getSessionFactory().getCurrentSession();
			tx = session.beginTransaction();
			
			
			kq = (ThanhVien) session.load(ThanhVien.class, new Integer(id));
			
			Hibernate.initialize(kq);
			Hibernate.initialize(kq.getTaiKhoan());
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
