package model.bean;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import model.dao.DanhMucDAO;
import model.pojo.DanhMuc;
import model.pojo.SanPham;

public class DanhMucBean {
	private static List<DanhMuc> dsDanhMuc;
	private Set<SanPham> dsSanPham; // danh sach san pham cua danh muc
	private int maDanhMuc;
	private List<DanhMuc> dsDanhMucShow;
	DanhMucDAO dmDao = new DanhMucDAO();

	public List<DanhMuc> getDsDanhMuc() {
		khoiTaodsDanhMuc();
		return dsDanhMuc;
	}
	
	public void khoiTaodsDanhMuc(){
		if (dsDanhMuc == null) {
			List<DanhMuc> temp = dmDao.layDanhSach();
			dsDanhMuc = new ArrayList<DanhMuc>();
			for (int i = 0; i < temp.size(); i++)
			{
				if (temp.get(i).getCapDanhMuc() == 1)
				{
					dsDanhMuc.add(temp.get(i));
				}
			}
		}
	}
	

	public Set<SanPham> getDsSanPham() {
		dsSanPham = dmDao.lay(maDanhMuc).getDsSanPham();
		return dsSanPham;
	}

	public void setDsSanPham(Set<SanPham> dsSanPham) {
		this.dsSanPham = dsSanPham;
	}

	public int getMaDanhMuc() {
		return maDanhMuc;
	}

	public void setMaDanhMuc(int maDanhMuc) {
		this.maDanhMuc = maDanhMuc;
	}


	public void setDsDanhMucShow(List<DanhMuc> dsDanhMucShow) {
		this.dsDanhMucShow = dsDanhMucShow;
	}


	public List<DanhMuc> getDsDanhMucShow() {
		khoiTaodsDanhMuc();
		String name;
		String level = "|";
		dsDanhMucShow = new ArrayList<DanhMuc>();
		for(int i = 0; i < dsDanhMuc.size(); i++)
		{
			
			name = level + "- - -" + dsDanhMuc.get(i).getTenDanhMuc();
			dsDanhMucShow.add(new DanhMuc(name,dsDanhMuc.get(i).getCapDanhMuc(),
					dsDanhMuc.get(i).getDanhMucCha(),null,null,null));
			if (dsDanhMuc.get(i).getDsDanhMucCon().size() > 0)
			{
				themDanhMucShow(dsDanhMuc.get(i).getDsDanhMucCon(),level + "- - -|");
			}
		}
		return dsDanhMucShow;
	}
	
	public void themDanhMucShow(List<DanhMuc> dsdm, String level)
	{
		String name;
		for(int i = 0; i < dsdm.size(); i++)
		{
			
			name = level + "- - -" + dsdm.get(i).getTenDanhMuc();
			dsDanhMucShow.add(new DanhMuc(name,dsdm.get(i).getCapDanhMuc(),
					dsdm.get(i).getDanhMucCha(),null,null,null));
			if (dsdm.get(i).getDsDanhMucCon().size() > 0)
			{
				themDanhMucShow(dsdm.get(i).getDsDanhMucCon(),level + "- - -|");
			}
		}
	}
}
