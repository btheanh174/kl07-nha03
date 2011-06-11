package action.gianhang.admin;

import java.util.Map;
import java.util.List;
import model.dao.GianHangDAO;
import model.dao.NhomDanhMucDAO;
import model.pojo.GianHang;
import model.pojo.TaiKhoan;
import model.pojo.NhomDanhMuc;

import org.apache.struts2.interceptor.SessionAware;

import com.opensymphony.xwork2.ActionSupport;

public class DanhMucAction extends ActionSupport implements SessionAware {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	private List<NhomDanhMuc> dsNhomDanhMuc;
	private GianHang gianHang;
	private NhomDanhMuc nhomDanhMuc;
	private int echo;
	
	
	private NhomDanhMucDAO ndmDao = new NhomDanhMucDAO();
	private GianHangDAO ghDao = new GianHangDAO();
	Map<String, Object> session;

	public String execute() {

		return SUCCESS;
	}

	public String layDanhSachNhomDanhMuc() {
		TaiKhoan tk = (TaiKhoan) session.get("tk");
		if (tk == null) {
			return ERROR;
		}

		GianHang gianHang = ghDao.lay(tk);
		dsNhomDanhMuc = ndmDao.layDanhSach(gianHang);
		return SUCCESS;
	}
	
	public String themNhomDanhMuc()
	{
		try
		{
			TaiKhoan tk = (TaiKhoan) session.get("tk");
			if (tk == null) {
				return ERROR;
			}

			GianHang gianHang = ghDao.lay(tk);
			dsNhomDanhMuc = ndmDao.layDanhSach(gianHang);
			nhomDanhMuc.setGianHang(gianHang);
			sapXepLaiViTriNhomDanhMuc();
			//Sắp xếp lại vị trí các nhóm danh mục trước khi ghi nhóm mới vào
			//Giả sử các nhóm danh mục sẵn có đã theo 1 xếp hạng tăng dần.
		
			ndmDao.them(nhomDanhMuc);
			return SUCCESS;
		}
		catch (Exception e) {
			// TODO: handle exception
			System.out.println("Error: " + e.toString());
		}
		return ERROR;
		
	}
	
	private void sapXepLaiViTriNhomDanhMuc()
	{
		if (nhomDanhMuc.getThuTu() > dsNhomDanhMuc.size())
		{
			nhomDanhMuc.setThuTu(dsNhomDanhMuc.size()+1);
		}
		for (int i = nhomDanhMuc.getThuTu()-1; i < dsNhomDanhMuc.size(); i++)
		{
			dsNhomDanhMuc.get(i).setThuTu(i+2);
		}
		//ndmDao.
	}

	@Override
	public void setSession(Map<String, Object> session) {
		// TODO Auto-generated method stub
		this.session = session;

	}

	public List<NhomDanhMuc> getDsNhomDanhMuc() {
		return dsNhomDanhMuc;
	}

	public void setDsNhomDanhMuc(List<NhomDanhMuc> dsNhomDanhMuc) {
		this.dsNhomDanhMuc = dsNhomDanhMuc;
	}

	public GianHang getGianHang() {
		return gianHang;
	}

	public void setGianHang(GianHang gianHang) {
		this.gianHang = gianHang;
	}

	public int getEcho() {
		return echo;
	}

	public void setEcho(int echo) {
		this.echo = echo;
	}

	public void setNhomDanhMuc(NhomDanhMuc nhomDanhMuc) {
		this.nhomDanhMuc = nhomDanhMuc;
	}

	public NhomDanhMuc getNhomDanhMuc() {
		return nhomDanhMuc;
	}
	
}
