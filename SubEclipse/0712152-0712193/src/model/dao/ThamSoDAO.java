package model.dao;

import java.util.List;

import model.pojo.ThamSo;

import org.hibernate.Criteria;
import org.hibernate.criterion.Restrictions;

public class ThamSoDAO extends AbstractDAO{
	
	public ThamSoDAO(){
		super();
	}
	
	public ThamSo lay(int id){
		return (ThamSo)super.find(ThamSo.class, id);
	}
	
	public ThamSo lay(String tenThamSo){
		/*Query query = session.createQuery("select * from ThamSo where tenThamSo like :ten");
		query.setParameter("ten", tenThamSo);
		return (ThamSo)query.uniqueResult();*/
		Criteria crit = session.createCriteria(getClass());
		crit.add(Restrictions.like("tenThamSo", tenThamSo));
		
		return (ThamSo) crit.uniqueResult();
	}
	
	public List layDanhSach(){
		return super.findAll(ThamSo.class);
	}
}
