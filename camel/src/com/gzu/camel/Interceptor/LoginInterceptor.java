package com.gzu.camel.Interceptor;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.apache.logging.log4j.core.appender.rewrite.RewritePolicy;
import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.ModelAndView;

public class LoginInterceptor implements HandlerInterceptor{

	@Override
	public void afterCompletion(HttpServletRequest request,
			HttpServletResponse response, Object handler, Exception arg3)
			throws Exception {
		
	}

	@Override
	public void postHandle(HttpServletRequest arg0, HttpServletResponse arg1,
			Object arg2, ModelAndView arg3) throws Exception {
		// TODO Auto-generated method stub
		
	}

	@Override
	public boolean preHandle(HttpServletRequest request, HttpServletResponse response,
			Object handler) throws Exception {
		//是登陆界面放行
		String url = request.getRequestURI();
		if(url.indexOf("login.action")>=0){
			return true;
		}
		
		HttpSession session = request.getSession();
		String username = (String) session.getAttribute("uname");
		if(username!=null){
			return true;
		}
		request.getRequestDispatcher("jsp/login_reg/login.jsp").forward(request, response);
		return false;
	}

}
