package com.springboot.zuulapi.filter;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.slf4j.LoggerFactory;

import com.netflix.zuul.ZuulFilter;
import com.netflix.zuul.context.RequestContext;

public class PreFilter extends ZuulFilter{
private static org.slf4j.Logger log= LoggerFactory.getLogger(PostFilter.class);
	
	@Override
	public String filterType() {
		return "pre";
	
	}
	
	@Override
	public int filterOrder() {
		return 1;
	}
	

	public boolean shouldFilter() {
		return true;
	}
	
	public Object run() {
		RequestContext ctx=RequestContext.getCurrentContext();
		HttpServletRequest request = ctx.getRequest();
		log.info("PreFilter:"+String.format("%s request to %s ",request.getMethod(),request.getRequestURL(),toString()));
		return null;
		}
}


