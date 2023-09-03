package com.example.demo.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/sample")
public class RestTestContoller {
	

	private static Logger logger = LoggerFactory.getLogger(HelloController.class);
	
	@RequestMapping(value = "/test", method = RequestMethod.GET, produces = "text/plain; charset=UTF-8")
	public String testGet() {
    	
		logger.info("testGet..");
		
		return "테스트메시지";

	}	

}
