package com.springboot.zuulapi.filter;




import javax.servlet.http.HttpServletResponse;

import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

import com.netflix.zuul.ZuulFilter;
import com.netflix.zuul.context.RequestContext;

import ch.qos.logback.classic.Logger;

@Component
public class PostFilter extends ZuulFilter {
	private static org.slf4j.Logger log= LoggerFactory.getLogger(PostFilter.class);
	
	@Override
	public String filterType() {
		return "post";
	
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
		log.info("PostFilter:"+String.format("response content type is %s ",response.getStatus()));
		return null;
		}
}
