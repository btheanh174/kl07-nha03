package action.user;

import java.util.Collection;
import java.util.List;
import java.util.Map;

import org.apache.struts2.dispatcher.ServletActionRedirectResult;
import org.apache.struts2.dispatcher.ServletRedirectResult;

import com.opensymphony.xwork2.ActionInvocation;
import com.opensymphony.xwork2.Result;
import com.opensymphony.xwork2.ValidationAware;
import com.opensymphony.xwork2.interceptor.MethodFilterInterceptor;

public class RedirectMessageInterceptor extends MethodFilterInterceptor {

	public static final String FIELD_ERRORS_KEY    = "RedirectMessageInterceptor_FieldErrors";
    public static final String ACTION_ERRORS_KEY   = "RedirectMessageInterceptor_ActionErrors";
    public static final String ACTION_MESSAGES_KEY = "RedirectMessageInterceptor_ActionMessages";

	public RedirectMessageInterceptor(){
		
	}
	
	@Override
	protected String doIntercept(ActionInvocation invocation) throws Exception {
		Object action = invocation.getAction();
        if (action instanceof ValidationAware)
        {
            before(invocation, (ValidationAware) action);
        }

        String result = invocation.invoke();

        if (action instanceof ValidationAware)
        {
            after(invocation, (ValidationAware) action);
        }
        return result;
	}

	protected void after(ActionInvocation invocation, ValidationAware validationAware) throws Exception {
		
		Result result = invocation.getResult();
        if (result != null
            && (result instanceof ServletRedirectResult ||
                result instanceof ServletActionRedirectResult))
        {
            Map<String, Object> session = invocation.getInvocationContext().getSession();

            Collection<String> actionErrors = validationAware.getActionErrors();
            if (actionErrors != null && actionErrors.size() > 0)
            {
                session.put(ACTION_ERRORS_KEY, actionErrors);
            }

            Collection<String> actionMessages = validationAware.getActionMessages();
            if (actionMessages != null && actionMessages.size() > 0)
            {
                session.put(ACTION_MESSAGES_KEY, actionMessages);
            }

            Map<String, List<String>> fieldErrors = validationAware.getFieldErrors();
            if (fieldErrors != null && fieldErrors.size() > 0)
            {
                session.put(FIELD_ERRORS_KEY, fieldErrors);
            }
        }
	}

	protected void before(ActionInvocation invocation, ValidationAware validationAware) {
		@SuppressWarnings("unchecked")
        Map<String, ?> session = invocation.getInvocationContext().getSession();

        @SuppressWarnings("unchecked")
        Collection<String> actionErrors =
            (Collection) session.remove(ACTION_ERRORS_KEY);
        if (actionErrors != null && actionErrors.size() > 0)
        {
            for (String error : actionErrors)
            {
                validationAware.addActionError(error);
            }
        }

        @SuppressWarnings("unchecked")
        Collection<String> actionMessages =
            (Collection) session.remove(ACTION_MESSAGES_KEY);
        if (actionMessages != null && actionMessages.size() > 0)
        {
            for (String message : actionMessages)
            {
                validationAware.addActionMessage(message);
            }
        }

        @SuppressWarnings("unchecked")
        Map<String, List<String>> fieldErrors =
            (Map) session.remove(FIELD_ERRORS_KEY);
        if (fieldErrors != null && fieldErrors.size() > 0)
        {
            for (Map.Entry<String, List<String>> fieldError : fieldErrors.entrySet())
            {
                for (String message : fieldError.getValue())
                {
                    validationAware.addFieldError(fieldError.getKey(), message);
                }
            }
        }
	}

	@Override
	public String intercept(ActionInvocation invocation) throws Exception {
		return super.intercept(invocation);
	}
}
