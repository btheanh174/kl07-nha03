package action.user;

import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import model.dao.TaiKhoanDAO;
import model.pojo.TaiKhoan;
import model.pojo.ThanhVien;

import org.apache.struts2.ServletActionContext;
import org.apache.struts2.interceptor.SessionAware;

import util.NumberUtil;

import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.Preparable;

public class ProfileAction extends ActionSupport implements SessionAware, Preparable{
	
	private Map<String,Object> sessionMap;
	@Override
	public void setSession(Map<String, Object> session) {
		this.sessionMap = session;
	}
	
	
	private int maTaiKhoan;
	private TaiKhoan taiKhoan;
	private ThanhVien thanhVien;
	private TaiKhoanDAO tkDao = new TaiKhoanDAO();
	
	public int getMaTaiKhoan() {
		return maTaiKhoan;
	}

	public void setMaTaiKhoan(int maTaiKhoan) {
		this.maTaiKhoan = maTaiKhoan;
	}

	public TaiKhoan getTaiKhoan() {
		return taiKhoan;
	}

	public void setTaiKhoan(TaiKhoan taiKhoan) {
		this.taiKhoan = taiKhoan;
	}

	public ThanhVien getThanhVien() {
		return thanhVien;
	}

	public void setThanhVien(ThanhVien thanhVien) {
		this.thanhVien = thanhVien;
	}

	@Override
	public String execute() throws Exception {
		HttpServletRequest request = ServletActionContext.getRequest();
		HttpSession session = request.getSession();
		return super.execute();
	}

	public String update(){
		
		return SUCCESS;
	}

	@Override
	public void prepare() throws Exception {
		HttpServletRequest request = ServletActionContext.getRequest();
		int maTaiKhoan = NumberUtil.parse(request.getParameter("maTaiKhoan"));
		if(maTaiKhoan != 0){
			taiKhoan = tkDao.lay(maTaiKhoan);
			thanhVien = taiKhoan.getThanhVien();
		}
	}
}
