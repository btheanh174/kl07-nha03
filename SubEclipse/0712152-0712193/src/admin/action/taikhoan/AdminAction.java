package admin.action.taikhoan;

import java.util.Map;

import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;

public class AdminAction extends ActionSupport {

	@Override
	public String execute() throws Exception {
		// Kiem tra session va chuyen huong tuong ung
		Map session = ActionContext.getContext().getSession();
		
		if(session.get("admin")!= null){
			return "yes";
		}else{
			return "no";
		}
	}
	
}
