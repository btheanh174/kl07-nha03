package action.user;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.List;
import java.util.Map;

import model.dao.HoaDonDAO;
import model.pojo.HoaDon;
import model.pojo.TaiKhoan;

import org.apache.struts2.interceptor.SessionAware;

import com.opensymphony.xwork2.ActionSupport;

public class HoaDonAction extends ActionSupport implements SessionAware {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private List<HoaDon> dsHoaDon;
	private int maHoaDon;
	private HoaDon hoaDon;
	private DateFormat formatter;

	Map<String, Object> session;
	private HoaDonDAO hdDao = new HoaDonDAO();

	public String execute() {

		return SUCCESS;
	}

	public String layDanhSachHoaDon() {

		TaiKhoan tk = (TaiKhoan) session.get("tk");
		// lay dsHWoaDon theo tai khoan | thanh vien
		dsHoaDon = hdDao.layDanhSach(tk.getThanhVien());
		formatter = new SimpleDateFormat("dd/MM/yyyy");
		//System.out.println(dsHoaDon.get(0).getGianHang().getTenGianHang());
		session.put("dsHoaDon", dsHoaDon);
		return SUCCESS;

	}
	
	public String layChiTietHoaDon()
	{
		dsHoaDon = (List<HoaDon>)session.get("dsHoaDon");
		for (int i = 0; i < dsHoaDon.size(); i++)
		{
			if (dsHoaDon.get(i).getMaHoaDon() == maHoaDon)
			{
				hoaDon = dsHoaDon.get(i);
				return SUCCESS;
			}
				
		}
		return SUCCESS;
	}

	public List<HoaDon> getDsHoaDon() {
		return dsHoaDon;
	}

	public void setDsHoaDon(List<HoaDon> dsHoaDon) {
		this.dsHoaDon = dsHoaDon;
	}

	public int getMaHoaDon() {
		return maHoaDon;
	}

	public void setMaHoaDon(int maHoaDon) {
		this.maHoaDon = maHoaDon;
	}


	public void setSession(Map<String, Object> session) {
		// TODO Auto-generated method stub
		this.session = session;

	}

	public void setFormatter(DateFormat formatter) {
		this.formatter = formatter;
	}

	public DateFormat getFormatter() {
		return formatter;
	}

	public void setHoaDon(HoaDon hoaDon) {
		this.hoaDon = hoaDon;
	}

	public HoaDon getHoaDon() {
		return hoaDon;
	}

}
