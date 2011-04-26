package action.user;

import java.util.Map;

import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;

public class LogoutAction extends ActionSupport{

	@Override
	public String execute() throws Exception {
		Map session = ActionContext.getContext().getSession();
		session.remove("tk");
		session.remove("prevAction");
		return SUCCESS;
	}
	
}