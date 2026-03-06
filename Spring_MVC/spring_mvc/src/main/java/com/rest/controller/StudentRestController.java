package com.rest.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.bean.StudentBean;
import com.srevices.StudentServices;

@RestController
@RequestMapping("student")
public class StudentRestController {
	@Autowired
	StudentServices serv;
	
	
	@PostMapping("senddata")
	public String sendDataIntoDB(@ModelAttribute("student") StudentBean sb) {
		  
		serv.create(sb);
		return "Done";
	}
	
	@GetMapping("fetch")
	public List<StudentBean> showAll(){
		//List<StudentBean> l=new ArrayList<StudentBean>();
		
		return serv.getAllRecs();
		
	}

}
