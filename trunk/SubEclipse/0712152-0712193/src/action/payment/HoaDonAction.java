package action.payment;

import java.util.Map;

import org.apache.struts2.interceptor.SessionAware;

import model.dao.NguoiNhanDAO;
import model.pojo.NguoiNhan;
import model.pojo.TaiKhoan;

import com.opensymphony.xwork2.ActionSupport;

public class HoaDonAction extends ActionSupport implements SessionAware{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private NguoiNhan nguoiNhan;
	
	
	private Map<String, Object> session;
	private NguoiNhanDAO nnDao = new NguoiNhanDAO();
	
	public String execute() {
		return SUCCESS;
	}

	
	public String xulyNguoiNhanHang()
	{
		TaiKhoan tk = (TaiKhoan)session.get("tk");
		if (tk == null)
			return ERROR;
		nguoiNhan.setThanhVien(tk.getThanhVien());

		if (true ) //Người nhận chưa tồn tại
		nnDao.them(nguoiNhan);
		return SUCCESS;
	}
	
	public void setNguoiNhan(NguoiNhan nguoiNhan) {
		this.nguoiNhan = nguoiNhan;
	}

	public NguoiNhan getNguoiNhan() {
		return nguoiNhan;
	}


	@Override
	public void setSession(Map<String, Object> session) {
		// TODO Auto-generated method stub
		this.session = session;
		
	}
	
	

}
