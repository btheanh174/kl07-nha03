package action;


import java.util.List;

import model.dao.SanPhamDAO;
import model.pojo.SanPham;

import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.ModelDriven;

public class SanPhamAction extends ActionSupport implements ModelDriven {

	SanPhamDAO spDao = new SanPhamDAO();
	private SanPham sanPham;
	private List dsSanPham;
	public String execute(){
		
		return SUCCESS;
	}

	@Override
	public Object getModel() {
		// TODO Auto-generated method stub
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
