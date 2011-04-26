package model.dao;

import java.util.List;

import model.pojo.Laptop;

public class LaptopDAO extends AbstractDAO{

	public LaptopDAO() {
		super();
	}

	public List<Laptop> layDanhSach(){
		return super.findAll(Laptop.class);
	}
	
	public Laptop lay(int id){
		return (Laptop)super.find(Laptop.class, id);
	}
	
	public void them(Laptop laptop){
		super.saveOrUpdate(laptop);
	}
	
	public void xoa(Laptop laptop){
		super.delete(laptop);
	}
	
	public void capNhat(Laptop laptop){
		super.saveOrUpdate(laptop);
	}
}
