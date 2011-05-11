package action;

import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.apache.struts2.interceptor.ServletRequestAware;
import org.apache.struts2.interceptor.SessionAware;

import model.pojo.GioHang;

import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.ModelDriven;

public class GioHangAction extends ActionSupport implements ModelDriven<GioHang>, ServletRequestAware, SessionAware{
	
	private GioHang gioHang;
	private HttpServletRequest servletRequest;
	private Map<String, Object> session;
	@Override
	public String execute() throws Exception {
		
		return SUCCESS;
	}

	public void capNhat(){
		
	}
	
	public void xoaTatca(){
		
	}
	
	public void xoa(int id){
		
	}
	
	public void thanhToan(){
		
	}
	
	
	public GioHang getGioHang() {
		return gioHang;
	}
	
	public void setGioHang(GioHang gioHang) {
		this.gioHang = gioHang;
	}

	@Override
	public GioHang getModel() {
		return gioHang;
	}

	@Override
	public void setServletRequest(HttpServletRequest servletRequest) {
		this.servletRequest = servletRequest;
	}

	@Override
	public void setSession(Map<String, Object> session) {
		this.session = session;
	}
}
