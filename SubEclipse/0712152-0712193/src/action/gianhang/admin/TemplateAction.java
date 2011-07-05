package action.gianhang.admin;

import java.util.Map;

import org.apache.struts2.interceptor.SessionAware;

import com.opensymphony.xwork2.ActionSupport;

public class TemplateAction extends ActionSupport implements SessionAware {

	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	Map<String, Object> session;
	
	
	public String execute() {

		return SUCCESS;
	}

	
	public String layDanhSachTemplate()
	{
		return SUCCESS;
	}
	
	
	public void setSession(Map<String, Object> session) {
		// TODO Auto-generated method stub
		this.session = session;
		
	}

}
