package action;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import model.dao.DanhMucDAO;
import model.pojo.DanhMuc;
import model.pojo.HinhAnh;
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
	private int maDanhMuc;
	private DanhMuc danhMuc;

	private Set<SanPham> dsSanPham = new HashSet<SanPham>();
	private List<SanPham> listSanPham = new ArrayList<SanPham>();
	private List<DanhMuc> dsDanhMuc;
	private List<DanhMuc> dsDanhMucShow;
	private int idCatalogue;

	public String Chitiet() {
		dsSanPham = danhMuc.getDsSanPham();
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
			dsDanhMuc= dmDao.layDanhSach();
		}
	}

	public String themDanhMuc() {
		idCatalogue--;
		khoiTaodsDanhMuc();
		danhMuc.setDanhMucCha(dsDanhMuc.get(idCatalogue));
		danhMuc.setCapDanhMuc(dsDanhMuc.get(idCatalogue).getCapDanhMuc() + 1);
		dmDao.them(danhMuc);
		danhMuc = null;
		return SUCCESS;
	}

	public String layDanhSachSanPham() {
		// SanPhamDAO spDao = new SanPhamDAO();
		// List<SanPham> temp = spDao.layDanhSach(idCatalogue);
		List<HinhAnh> dsHinhAnh1 = new ArrayList<HinhAnh>();
		List<HinhAnh> dsHinhAnh2 = new ArrayList<HinhAnh>();
		List<HinhAnh> dsHinhAnh3 = new ArrayList<HinhAnh>();
		List<HinhAnh> dsHinhAnh4 = new ArrayList<HinhAnh>();
		dsHinhAnh1
				.add(new HinhAnh(
						"Pic1",
						"http://www.vitinhphongvu.com/multidata/sanpham/1105399981499vostro%2033002_150x100_small.jpg",
						null));
		dsHinhAnh2
				.add(new HinhAnh(
						"Pic2",
						"http://www.vitinhphongvu.com/multidata/sanpham/390350241962315R_150x100_small.jpg",
						null));
		dsHinhAnh3
				.add(new HinhAnh(
						"Pic3",
						"http://www.vitinhphongvu.com/multidata/sanpham/64958172986601458_150x100_small.jpg",
						null));
		dsHinhAnh4
				.add(new HinhAnh(
						"Pic4",
						"http://www.vitinhphongvu.com/multidata/sanpham/869484894090514R.-1jpg_150x100_small.jpg",
						null));

		listSanPham.add(new SanPham("DELL Vostro V3300", 15650000, "DELL",
				dsHinhAnh1, null, null));
		listSanPham.add(new SanPham("DELL Inspiron 15R", 14315000, "DELL",
				dsHinhAnh2, null, null));
		listSanPham.add(new SanPham("DELL Studio 1458", 17999000, "DELL",
				dsHinhAnh3, null, null));
		listSanPham.add(new SanPham("DELL Inspiron N4010", 13455000, "DELL",
				dsHinhAnh4, null, null));
		listSanPham.add(new SanPham("DELL Vostro V3300", 15650000, "DELL",
				dsHinhAnh1, null, null));
		listSanPham.add(new SanPham("DELL Inspiron 15R", 14315000, "DELL",
				dsHinhAnh2, null, null));
		listSanPham.add(new SanPham("DELL Studio 1458", 17999000, "DELL",
				dsHinhAnh3, null, null));
		listSanPham.add(new SanPham("DELL Inspiron N4010", 13455000, "DELL",
				dsHinhAnh4, null, null));
		listSanPham.add(new SanPham("DELL Vostro V3300", 15650000, "DELL",
				dsHinhAnh1, null, null));

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

	public Set<SanPham> getDsSanPham() {
		return dsSanPham;
	}

	public void setDsSanPham(Set<SanPham> dsSanPham) {
		this.dsSanPham = dsSanPham;
	}

	@Override
	public DanhMuc getModel() {
		return danhMuc;
	}

	@Override
	public void prepare() throws Exception {
		if (maDanhMuc != 0) {
			danhMuc = new DanhMucDAO().lay(maDanhMuc);
			dsSanPham = danhMuc.getDsSanPham();
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
		for(int i = 0; i < dsDanhMuc.size(); i++)
		{
			
			if (dsDanhMuc.get(i).getCapDanhMuc() == 1)
			{
				name = level + "- - -" + dsDanhMuc.get(i).getTenDanhMuc();
				dsDanhMucShow.add(new DanhMuc(dsDanhMuc.get(i).getMaDanhMuc(), 
						name,dsDanhMuc.get(i).getCapDanhMuc(),dsDanhMuc.get(i).getDanhMucCha()));
				if (dsDanhMuc.get(i).getDsDanhMucCon().size() > 0)
				{
					themDanhMucShow(dsDanhMuc.get(i).getDsDanhMucCon(),level + "- - -|");
				}
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
			dsDanhMucShow.add(new DanhMuc(dsdm.get(i).getMaDanhMuc(), 
					name,dsdm.get(i).getCapDanhMuc(),dsdm.get(i).getDanhMucCha()));
			if (dsdm.get(i).getDsDanhMucCon().size() > 0)
			{
				themDanhMucShow(dsdm.get(i).getDsDanhMucCon(),level + "- - -|");
			}
		}
	}
}
