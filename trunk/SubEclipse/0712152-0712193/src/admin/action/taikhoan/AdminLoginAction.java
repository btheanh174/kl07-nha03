package admin.action.taikhoan;

import java.util.Date;
import java.util.Map;

import model.dao.TaiKhoanDAO;
import model.pojo.TaiKhoan;

import org.apache.struts2.interceptor.SessionAware;

import util.HashUtil;

import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;

public class AdminLoginAction extends ActionSupport implements SessionAware {

	private String tenTruyCap;
	private String matKhau;
	private TaiKhoanDAO tkDao = new TaiKhoanDAO();

	Map<String, Object> session;
	final static String ADMIN = "admin";
	final static String NHOM = "nhom";
	final static String THOIDIEM = "thoidiem";
	private boolean isOk = false;

	public String login() {
		TaiKhoan tk = tkDao.lay(getTenTruyCap().trim());
		isOk = check(tk);

		if (isOk) {
			session.put(ADMIN, tk.getTenTruyCap());
			session.put(NHOM, tk.getNhomNguoiDung().getMaNhom());
			session.put(THOIDIEM, new Date());
			return SUCCESS;
		}
		return INPUT;
	}

	public boolean check(TaiKhoan tk) {
		try {
			if (tk != null) {
				String salt = tk.getSalt();
				String saltedPassword = salt + tk.getMatKhau();
				String hashedPassword = HashUtil.generateHash(saltedPassword);
				String storedPassword = tk.getMatKhau();

				if (hashedPassword.equals(storedPassword)) {
					return true;
				}
			}
		} catch (Exception e) {
			return false;
		}
		return false;
	}

	public String logout() {
		Map sess = ActionContext.getContext().getSession();
		sess.remove(ADMIN);
		sess.remove(NHOM);
		sess.remove(THOIDIEM);
		return "loggedout";
	}

	public String getTenTruyCap() {
		return tenTruyCap;
	}

	public void setTenTruyCap(String tenTruyCap) {
		this.tenTruyCap = tenTruyCap;
	}

	public String getMatKhau() {
		return matKhau;
	}

	public void setMatKhau(String matKhau) {
		this.matKhau = matKhau;
	}

	@Override
	public void setSession(Map<String, Object> session) {
		this.session = session;
	}
}
