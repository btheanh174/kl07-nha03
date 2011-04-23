package action;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import model.dao.DanhMucDAO;
import model.pojo.DanhMuc;
import model.pojo.SanPham;

import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.ModelDriven;
import com.opensymphony.xwork2.Preparable;

public class DanhMucAction extends ActionSupport implements ModelDriven<DanhMuc>, Preparable{
	private int maDanhMuc;
	private DanhMuc danhMuc;
	private List<DanhMuc> dsDanhMuc = new ArrayList<DanhMuc>();
	private Set<SanPham> dsSanPham = new HashSet<SanPham>();
	public String Chitiet(){
		dsSanPham = danhMuc.getDsSanPham();
		return SUCCESS;
	}
	
	public String populate(){
		
		return "populate";
	}
	
	public String execute(){
		DanhMucDAO dmDao = new DanhMucDAO();
		dsDanhMuc = dmDao.layDanhSach();
		return SUCCESS;
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
}
