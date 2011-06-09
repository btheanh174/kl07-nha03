package action.gianhang.admin;

import java.util.HashMap;
import java.util.Map;
import java.util.ArrayList;
import java.util.List;

import model.dao.DanhMucDAO;
import model.dao.SanPhamDAO;
import model.pojo.GianHang;
import model.pojo.SanPham;
import model.pojo.SanPhamGH;
import model.pojo.TaiKhoan;

import org.apache.struts2.interceptor.SessionAware;

import com.opensymphony.xwork2.ActionSupport;

public class SanPhamAction extends ActionSupport implements SessionAware {
	
	/**
	 * 
	 */
	private List<SanPhamGH> dsSanPhamGH;
	private List<SanPham> dsSanPham;
	private int echo;
	
	private SanPhamDAO spDao = new SanPhamDAO();
	
	
	private static final long serialVersionUID = 1L;
	Map<String, Object> session;
	
	public String execute() {

		return SUCCESS;
	}
	
	public String layDanhSachSanPhamTheoGianHang()
	{
		TaiKhoan tk = (TaiKhoan) session.get("tk");
		if (tk == null) {
			 return ERROR;
		}
		GianHang gianHang = tk.getGianHang();
		dsSanPhamGH = spDao.layDsSanPhamGH(gianHang.getMaGianHang());
		return SUCCESS;	
	}
	
	public String layDanhSachSanPhamTheoDanhMuc()
	{
		if (echo != 0)
		{
			DanhMucDAO dmDao = new DanhMucDAO();
			dsSanPham = spDao.layDanhSach(dmDao.lay(echo));
		}
		else
		{
			dsSanPham = new ArrayList<SanPham>();
		}
		System.out.println("Echo =  "+ echo);
		return SUCCESS;
	}

	@Override
	public void setSession(Map<String, Object> session) {
		// TODO Auto-generated method stub
		this.session = session;
	}

	public void setDsSanPhamGH(List<SanPhamGH> dsSanPhamGH) {
		this.dsSanPhamGH = dsSanPhamGH;
	}

	public List<SanPhamGH> getDsSanPhamGH() {
		return dsSanPhamGH;
	}

	public void setEcho(int echo) {
		this.echo = echo;
	}

	public int getEcho() {
		return echo;
	}

	public void setDsSanPham(List<SanPham> dsSanPham) {
		this.dsSanPham = dsSanPham;
	}

	public List<SanPham> getDsSanPham() {
		return dsSanPham;
	}
}
