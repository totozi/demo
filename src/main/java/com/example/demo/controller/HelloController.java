package com.example.demo.controller;

import java.util.Date;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@Controller
public class HelloController {

	private static Logger logger = LoggerFactory.getLogger(HelloController.class);
	

	@RequestMapping(value = "hello", method = RequestMethod.GET)
	public String hello(ModelMap mm) {
    	
        // logging 
		System.out.println("HelloController helloMethod() " + new Date());
		// logging 
		logger.info("HelloController helloMethod() " + new Date());
		
		mm.addAttribute("msg", "안녕");
        
		return "/hello";		// WEB-INF/views/hello.jsp
	}
	

	
}
