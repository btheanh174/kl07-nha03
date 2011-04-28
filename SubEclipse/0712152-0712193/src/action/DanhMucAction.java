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

public class DanhMucAction extends ActionSupport implements ModelDriven<DanhMuc>, Preparable{
	/**
	 * 
	 */
	private static final long serialVersionUID = 648498833054826561L;
	DanhMucDAO dmDao = new DanhMucDAO();
	private int maDanhMuc;
	private DanhMuc danhMuc;
	private List<DanhMuc> dsDanhMuc = new ArrayList<DanhMuc>();
	private Set<SanPham> dsSanPham = new HashSet<SanPham>();
	private List<SanPham> listSanPham = new ArrayList<SanPham>();
	private int idCatalogue;
	
	public String Chitiet(){
		dsSanPham = danhMuc.getDsSanPham();
		return SUCCESS;
	}
	
	public String populate(){
		
		return "populate";
	}
	
	public String execute(){
		khoiTaoDanhSachDanhMuc();
		return SUCCESS;
	}
	
	public void khoiTaoDanhSachDanhMuc()
	{
		if (dsDanhMuc == null)
		{
			 dsDanhMuc = new ArrayList<DanhMuc>();
			 dsDanhMuc = dmDao.layDanhSach();
		}
	}
	
	
	public String getDanhSachSanPham()
	{
		//SanPhamDAO spDao = new SanPhamDAO();
		//List<SanPham> temp = spDao.layDanhSach(idCatalogue);
		List<HinhAnh> dsHinhAnh1 = new ArrayList<HinhAnh>();
		List<HinhAnh> dsHinhAnh2 = new ArrayList<HinhAnh>();
		List<HinhAnh> dsHinhAnh3 = new ArrayList<HinhAnh>();
		List<HinhAnh> dsHinhAnh4 = new ArrayList<HinhAnh>();
		dsHinhAnh1.add(new HinhAnh("Pic1","http://www.vitinhphongvu.com/multidata/sanpham/1105399981499vostro%2033002_150x100_small.jpg",null));
		dsHinhAnh2.add(new HinhAnh("Pic2","http://www.vitinhphongvu.com/multidata/sanpham/390350241962315R_150x100_small.jpg",null));
		dsHinhAnh3.add(new HinhAnh("Pic3","http://www.vitinhphongvu.com/multidata/sanpham/64958172986601458_150x100_small.jpg",null));
		dsHinhAnh4.add(new HinhAnh("Pic4","http://www.vitinhphongvu.com/multidata/sanpham/869484894090514R.-1jpg_150x100_small.jpg",null));
		
		listSanPham.add(new SanPham("DELL Vostro V3300",15650000,"DELL",dsHinhAnh1,null,null));
		listSanPham.add(new SanPham("DELL Inspiron 15R",14315000,"DELL",dsHinhAnh2,null,null));
		listSanPham.add(new SanPham("DELL Studio 1458",17999000,"DELL",dsHinhAnh3,null,null));
		listSanPham.add(new SanPham("DELL Inspiron N4010",13455000,"DELL",dsHinhAnh4,null,null));
		listSanPham.add(new SanPham("DELL Vostro V3300",15650000,"DELL",dsHinhAnh1,null,null));
		listSanPham.add(new SanPham("DELL Inspiron 15R",14315000,"DELL",dsHinhAnh2,null,null));
		listSanPham.add(new SanPham("DELL Studio 1458",17999000,"DELL",dsHinhAnh3,null,null));
		listSanPham.add(new SanPham("DELL Inspiron N4010",13455000,"DELL",dsHinhAnh4,null,null));
		listSanPham.add(new SanPham("DELL Vostro V3300",15650000,"DELL",dsHinhAnh1,null,null));
		
		
		return SUCCESS;
	}
	
	public List<SanPham> getListSanPham() {
		return listSanPham;
	}

	public void setListSanPham(List<SanPham> listSanPham) {
		this.listSanPham = listSanPham;
	}

	public List<DanhMuc> getDsDanhMuc() {
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
		if(maDanhMuc != 0){
			danhMuc = new DanhMucDAO().lay(maDanhMuc);
			dsSanPham = danhMuc.getDsSanPham();
		}else{
			danhMuc = new DanhMuc();
		}
	}

	public void setIdCatalogue(int idCatalogue) {
		this.idCatalogue = idCatalogue;
	}

	public int getIdCatalogue() {
		return idCatalogue;
	}	
}
