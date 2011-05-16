package action;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import org.hibernate.Hibernate;
import org.hibernate.HibernateException;

import model.dao.DanhMucDAO;
import model.dao.SanPhamDAO;
import model.pojo.DanhMuc;
import model.pojo.SanPham;

import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.ModelDriven;
import com.opensymphony.xwork2.Preparable;

public class DanhMucAction extends ActionSupport implements
		ModelDriven<DanhMuc>, Preparable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 648498833054826561L;
	DanhMucDAO dmDao = new DanhMucDAO();
	SanPhamDAO spDao = new SanPhamDAO();
	private int maDanhMuc;
	private DanhMuc danhMuc;

	private List<SanPham> dsSanPham = new ArrayList<SanPham>();
	private List<SanPham> listSanPham = new ArrayList<SanPham>();
	private List<DanhMuc> dsDanhMuc;
	private List<DanhMuc> dsDanhMucShow;
	private int idCatalogue;

	private DanhMuc danhMucGoc;

	public String Chitiet() {
		System.out.println("Chi tiet");
		danhMuc  = dmDao.lay(maDanhMuc);
		
		return SUCCESS;
	}

	public String populate() {
		return "populate";
	}

	public String execute() {
		return SUCCESS;
	}

	public void khoiTaodsDanhMuc() {
		if (dsDanhMuc == null) {
			dsDanhMuc = dmDao.layDanhSach();
		}
	}

	public String themDanhMuc() {
		khoiTaodsDanhMuc();
		int index = timViTriDanhMuc(idCatalogue);
		danhMuc.setDanhMucCha(dsDanhMuc.get(index));
		danhMuc.setCapDanhMuc(dsDanhMuc.get(index).getCapDanhMuc() + 1);
		dmDao.them(danhMuc);
		danhMuc = null;
		return SUCCESS;
	}

	public int timViTriDanhMuc(int idCatalogue) {
		for (int i = 0; i < dsDanhMuc.size(); i++) {
			if (dsDanhMuc.get(i).getMaDanhMuc() == idCatalogue)
				return i;
		}
		return -1;
	}

	public String xoaDanhMuc() {
		 khoiTaodsDanhMuc();
         danhMuc = dsDanhMuc.get(timViTriDanhMuc(idCatalogue));
         dmDao.xoa(danhMuc);
         danhMuc = null;
         return SUCCESS;
	}
	
	public String capNhatDanhMuc(){
		 khoiTaodsDanhMuc();
         DanhMuc danhMucCha = dsDanhMuc.get(timViTriDanhMuc(idCatalogue));
         
         if (danhMucCha.getMaDanhMuc() == danhMuc.getMaDanhMuc())
         {
        	 return ERROR;
         }
         danhMuc.setDanhMucCha(danhMucCha);
         danhMuc.setCapDanhMuc(danhMucCha.getCapDanhMuc()+1);
         dmDao.capNhat(danhMuc);
         danhMuc = null;
         return SUCCESS;
	}

	public String layDanhSachSanPham() {
		System.out.println("Lay danh sach");
		DanhMuc danhMuc = dmDao.lay(maDanhMuc);
		listSanPham = spDao.layDanhSach(danhMuc);
		return SUCCESS;
	}
	
	

	public List<SanPham> getListSanPham() {
		return listSanPham;
	}

	public void setListSanPham(List<SanPham> listSanPham) {
		this.listSanPham = listSanPham;
	}

	public List<DanhMuc> getDsDanhMuc() {
		khoiTaodsDanhMuc();
		return dsDanhMuc;
	}

	public void setDsDanhMuc(List<DanhMuc> dsDanhMuc) {
		this.dsDanhMuc = dsDanhMuc;
	}

	public int getMaDanhMuc() {
		return maDanhMuc;
	}

	public void setMaDanhMuc(int maDanhMuc) {
		this.maDanhMuc = maDanhMuc;
	}

	public DanhMuc getDanhMuc() {
		return danhMuc;
	}

	public void setDanhMuc(DanhMuc danhMuc) {
		this.danhMuc = danhMuc;
	}

	

	public List<SanPham> getDsSanPham() {
		return dsSanPham;
	}

	public void setDsSanPham(List<SanPham> dsSanPham) {
		this.dsSanPham = dsSanPham;
	}

	@Override
	public DanhMuc getModel() {
		return danhMuc;
	}

	@Override
	public void prepare() throws Exception {
		if (maDanhMuc != 0) {
			danhMuc = dmDao.lay(maDanhMuc);
		} else {
			danhMuc = new DanhMuc();
		}
	}

	public void setIdCatalogue(int idCatalogue) {
		this.idCatalogue = idCatalogue;
	}

	public int getIdCatalogue() {
		return idCatalogue;
	}

	public void setDsDanhMucShow(List<DanhMuc> dsDanhMucShow) {
		this.dsDanhMucShow = dsDanhMucShow;
	}

	public List<DanhMuc> getDsDanhMucShow() {
		khoiTaodsDanhMuc();
		String name;
		String level = "|";
		dsDanhMucShow = new ArrayList<DanhMuc>();
		for (int i = 0; i < dsDanhMuc.size(); i++) {

			if (dsDanhMuc.get(i).getCapDanhMuc() == 1) {
				name = level + "- - -" + dsDanhMuc.get(i).getTenDanhMuc();
				dsDanhMucShow.add(new DanhMuc(dsDanhMuc.get(i).getMaDanhMuc(),
						name, dsDanhMuc.get(i).getCapDanhMuc(), dsDanhMuc
								.get(i).getDanhMucCha()));
				if (dsDanhMuc.get(i).getDsDanhMucCon().size() > 0) {
					themDanhMucShow(dsDanhMuc.get(i).getDsDanhMucCon(), level
							+ "- - -|");
				}
			}
		}
		return dsDanhMucShow;
	}

	public void themDanhMucShow(List<DanhMuc> dsdm, String level) {
		String name;
		for (int i = 0; i < dsdm.size(); i++) {

			name = level + "- - -" + dsdm.get(i).getTenDanhMuc();
			dsDanhMucShow.add(new DanhMuc(dsdm.get(i).getMaDanhMuc(), name,
					dsdm.get(i).getCapDanhMuc(), dsdm.get(i).getDanhMucCha()));
			if (dsdm.get(i).getDsDanhMucCon().size() > 0) {
				themDanhMucShow(dsdm.get(i).getDsDanhMucCon(), level + "- - -|");
			}
		}
	}

	public void setDanhMucGoc(DanhMuc danhMucGoc) {
		this.danhMucGoc = danhMucGoc;
	}

	public DanhMuc getDanhMucGoc() {
		khoiTaodsDanhMuc();
		if (danhMucGoc == null)
		{
			danhMucGoc = new DanhMuc(0,"Root",0,null);
			danhMucGoc.setDsDanhMucCon(new ArrayList<DanhMuc>()); 
			for (int i = 0; i < dsDanhMuc.size(); i++)
			{
				if (dsDanhMuc.get(i).getCapDanhMuc() == 1)
				{
					danhMucGoc.getDsDanhMucCon().add(dsDanhMuc.get(i));
				}
			}
		}
		return danhMucGoc;
	}
}
