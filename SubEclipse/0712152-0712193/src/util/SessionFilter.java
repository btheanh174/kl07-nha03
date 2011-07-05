package util;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

public class SessionFilter implements Filter{

	private List<String> urlList;
	
	@Override
	public void destroy() {
		
	}

	@Override
	public void doFilter(ServletRequest request, ServletResponse response,
			FilterChain chain) throws IOException, ServletException {
		HttpServletRequest req = (HttpServletRequest)request;
		HttpServletResponse res = (HttpServletResponse)response;
		
		String url = req.getServletPath();
		
		boolean allowedRequest = false;
		
		for (String str : urlList) {
			if(url.contains(str)){
				allowedRequest = true;
				break;
			}
		}
		
		if(!allowedRequest){
			HttpSession session = req.getSession(false);
			if(session == null){
				res.sendRedirect("login");
			}
		}
	}

	@Override
	public void init(FilterConfig config) throws ServletException {
		String urls = config.getInitParameter("avoid-urls");
		StringTokenizer token = new StringTokenizer(urls, ",");
		
		urlList = new ArrayList<String>();
		while(token.hasMoreTokens()){
			urlList.add(token.nextToken());
		}
	}

}
