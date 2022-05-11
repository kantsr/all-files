package com.distributedtracing.sleuthserver.resource;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;



@RestController
@RequestMapping("/rest/hello")
public class HelloResource {
	
	private static final Logger LOGGER = LoggerFactory.getLogger(HelloResource.class);

	@RequestMapping("/server")
	public String hello() {
		
		
		LOGGER.info("reached server");

		return "Hello World";
}
}
