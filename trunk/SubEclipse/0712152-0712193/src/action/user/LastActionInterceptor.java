package action.user;


import java.util.Map;

import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionInvocation;
import com.opensymphony.xwork2.interceptor.Interceptor;

public class LastActionInterceptor implements Interceptor {

	@Override
	public void destroy() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void init() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public String intercept(ActionInvocation actionInvocation) throws Exception {
		Map<String, Object> session = actionInvocation.getInvocationContext().getSession();
		String actionName = actionInvocation.getInvocationContext().getName();
		
		if(!("show_user_login".equalsIgnoreCase(actionName)) && !"User_login".equalsIgnoreCase(actionName)){
			session.put("prevAction", actionName);
		}
		System.out.println(actionName);
		return actionInvocation.invoke();
	}
}