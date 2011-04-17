package action.user;

import javax.servlet.http.HttpServletRequest;

import model.dao.TaiKhoanDAO;

import org.apache.struts2.interceptor.ServletRequestAware;

import com.opensymphony.xwork2.ActionSupport;

public class UserAction  extends ActionSupport implements ServletRequestAware{
	private String userName;
	private String password;
	private HttpServletRequest servletRequest;
	private TaiKhoanDAO tkDao = new TaiKhoanDAO();
	
	@Override
	public void setServletRequest(HttpServletRequest servletRequest) {
		this.servletRequest = servletRequest;
	}
	@Override
	public String execute() throws Exception {
		
		return super.execute();
	}
	@Override
	public void validate() {
		super.validate();
	}
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
}
