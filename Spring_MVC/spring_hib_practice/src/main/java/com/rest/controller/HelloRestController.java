package com.rest.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.bean.Greeting;

@RestController
@RequestMapping("/test")
public class HelloRestController {
	
	@GetMapping("/hello")
	 public String getHello() {
		    
		return "welcome to rest API";
		}

	@GetMapping("/greet")
	public Greeting send() {
		Greeting g=new Greeting();
		g.setId(1);
		g.setName("Java");
		
		return g;
	}
	
	@GetMapping("/pay/{id}")
	public String auth(@PathVariable String id) {
		String acctId="123";
		
		if(id==acctId)
		    return "payment done";
		else
			return "auth fail";
		
	}
}
