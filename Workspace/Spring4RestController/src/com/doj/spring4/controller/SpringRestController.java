package com.doj.spring4.controller;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author Dinesh Rajput
 *
 */
@RestController
@RequestMapping("/service/greeting")
public class SpringRestController {
	@RequestMapping(value = "/{name}", method = RequestMethod.GET)
	public String sayHello(@PathVariable String name) {
		String result="Hello "+name+" to dineshonjava.com!!!";  
		return result;
	}
}
