package com.springboot.zuulapi.filter;

import javax.servlet.http.HttpServletResponse;

import org.slf4j.LoggerFactory;

import com.netflix.zuul.ZuulFilter;
import com.netflix.zuul.context.RequestContext;

public class ErrorFilter extends ZuulFilter{
private static org.slf4j.Logger log= LoggerFactory.getLogger(PostFilter.class);
	
	@Override
	public String filterType() {
		return "error";
	
	}
	
	@Override
	public int filterOrder() {
		return 1;
	}
	

	public boolean shouldFilter() {
		return true;
	}
	
	public Object run() {
		HttpServletResponse response = RequestContext.getCurrentContext().getResponse();
		log.info("ErrorFilter:"+String.format("response status is %s ",response.getStatus()));
		return null;
		}
}


