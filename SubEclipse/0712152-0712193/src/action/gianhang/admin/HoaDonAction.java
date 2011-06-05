package action.gianhang.admin;

import util.SendMail;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Map;
import java.util.List;
import java.util.ArrayList;

import model.dao.HoaDonDAO;
import model.pojo.GianHang;
import model.pojo.TaiKhoan;
import model.pojo.HoaDon;

import org.apache.struts2.interceptor.SessionAware;

import com.opensymphony.xwork2.ActionSupport;

public class HoaDonAction extends ActionSupport implements SessionAware {

	/**
	 * 
	 */

	private static final long serialVersionUID = 1L;
	private HoaDon hoaDon;
	private List<HoaDon> dsHoaDon;
	private DateFormat formatter;
	private int maHoaDon;

	private Map<String, Object> session;
	private HoaDonDAO hdDao = new HoaDonDAO();

	public String execute() {

		return SUCCESS;
	}

	public String xemChiTietHoaDon() {
		hoaDon = hdDao.lay(maHoaDon);

		// Test send email
		return SUCCESS;
		
	}

	public String layDanhSachHoaDon() {

		TaiKhoan tk = (TaiKhoan) session.get("tk");
		if (tk == null) {
			 return ERROR;
		}
		GianHang gianHang = tk.getGianHang();
		formatter = new SimpleDateFormat("dd/MM/yyyy");
		dsHoaDon = hdDao.layDanhSach(gianHang);
		return SUCCESS;
	}

	@Override
	public void setSession(Map<String, Object> session) {
		// TODO Auto-generated method stub
		this.session = session;
	}

	public void setDsHoaDon(List<HoaDon> dsHoaDon) {
		this.dsHoaDon = dsHoaDon;
	}

	public List<HoaDon> getDsHoaDon() {
		return dsHoaDon;
	}

	public DateFormat getFormatter() {
		return formatter;
	}

	public void setFormatter(DateFormat formatter) {
		this.formatter = formatter;
	}

	public int getMaHoaDon() {
		return maHoaDon;
	}

	public void setMaHoaDon(int maHoaDon) {
		this.maHoaDon = maHoaDon;
	}

	public HoaDon getHoaDon() {
		return hoaDon;
	}

	public void setHoaDon(HoaDon hoaDon) {
		this.hoaDon = hoaDon;
	}

}
