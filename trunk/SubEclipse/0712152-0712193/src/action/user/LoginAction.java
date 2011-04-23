package action.user;

import java.io.UnsupportedEncodingException;
import java.util.Date;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import model.dao.TaiKhoanDAO;
import model.pojo.TaiKhoan;

import org.apache.struts2.dispatcher.SessionMap;
import org.apache.struts2.interceptor.ServletRequestAware;
import org.apache.struts2.interceptor.SessionAware;

import util.HashUtil;

import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionInvocation;
import com.opensymphony.xwork2.ActionSupport;

public class LoginAction extends ActionSupport implements ServletRequestAware, SessionAware {
	private String tenTruyCap;
	private String matKhau;
	private HttpServletRequest servletRequest;
	private Map session;
	private TaiKhoanDAO tkDao = new TaiKhoanDAO();
	
	@Override
	public void setServletRequest(HttpServletRequest servletRequest) {
		this.servletRequest = servletRequest;
	}
	@Override
	public void setSession(Map<String, Object> session) {
		// TODO Auto-generated method stub
		this.session = session;
	}
	
	public String login() throws UnsupportedEncodingException{
		TaiKhoan tk = tkDao.lay(getTenTruyCap().trim());
		if(tk != null){
			String salt = tk.getSalt();
			String saltedPassword = salt + getMatKhau();
			String hashedPassword = HashUtil.generateHash(saltedPassword);
			
			String storedPassword = tk.getMatKhau();
		
			if(hashedPassword.equals(storedPassword)){
				session.put("tk", tk);
				session.put("context", new Date());
				return SUCCESS;
			}else{
				return INPUT;
			}
		}else{
			return ERROR;
		}
		
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
}
