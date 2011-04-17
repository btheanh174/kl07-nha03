package action;

import java.util.ArrayList;
import java.util.List;

import model.dao.SanPhamDAO;
import model.pojo.SanPham;

import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.ModelDriven;

public class SanPhamAction extends ActionSupport implements ModelDriven<SanPham> {

	private SanPham sanPham;
	private List dsSanPham = new ArrayList<SanPham>();
	
	public String execute(){
		SanPhamDAO spDao = new SanPhamDAO();
		dsSanPham = spDao.layDanhSach();
		return SUCCESS;
	}
	@Override
	public SanPham getModel() {
		return sanPham;
	}

	public SanPham getSanPham() {
		return sanPham;
	}

	public void setSanPham(SanPham sanPham) {
		this.sanPham = sanPham;
	}

	public List getDsSanPham() {
		return dsSanPham;
	}

	public void setDsSanPham(List dsSanPham) {
		this.dsSanPham = dsSanPham;
	}
	
}
