package action.user;

import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import model.dao.TaiKhoanDAO;
import model.dao.ThanhVienDAO;
import model.pojo.TaiKhoan;
import model.pojo.ThanhVien;

import org.apache.struts2.ServletActionContext;
import org.apache.struts2.interceptor.SessionAware;

import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.ModelDriven;
import com.opensymphony.xwork2.Preparable;

public class ProfileAction extends ActionSupport implements SessionAware, Preparable, ModelDriven<ThanhVien>{
	
	private Map<String,Object> sessionMap;
	@Override
	public void setSession(Map<String, Object> session) {
		this.sessionMap = session;
	}
	
	private int maTaiKhoan;
	private TaiKhoan taiKhoan;
	private ThanhVien thanhVien;
	private TaiKhoanDAO tkDao = new TaiKhoanDAO();
	private ThanhVienDAO tvDao = new ThanhVienDAO();
	@Override
	public String execute() throws Exception {
		HttpServletRequest request = ServletActionContext.getRequest();
		HttpSession session = request.getSession();
		return super.execute();
	}

	public String capNhatThongTin(){
		tkDao.capNhat(taiKhoan);
		tvDao.capNhat(thanhVien);
		return SUCCESS;
	}

	public String doiMatKhau(){
		tkDao.capNhat(taiKhoan);
		return SUCCESS;
	}
	
	public String hienThi(){
		taiKhoan  = tkDao.lay(maTaiKhoan);
		thanhVien = tvDao.lay(maTaiKhoan);
		return SUCCESS;
	}
	
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
	public void prepare() throws Exception {
		
		if(maTaiKhoan != 0){
			taiKhoan = tkDao.lay(maTaiKhoan);
			thanhVien = taiKhoan.getThanhVien();
		}else{
			taiKhoan = new TaiKhoan();
			thanhVien = new ThanhVien();
		}
	}

	@Override
	public ThanhVien getModel() {
		// TODO Auto-generated method stub
		return thanhVien;
	}
}
