package com.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.bean.EmployeeBean;
import com.service.EmployeeService_I;
//this is the controller class that handling the AIWR
@Controller
public class EmployeeController {
@Autowired
 EmployeeService_I serv;
	
	@GetMapping("/")
	public String myHome() {
		return "index";
	}
	
	@GetMapping("register")
	public String getEmpRegPage() {//this is the controller method
		return "register";
	}
	
	//form for the delete record from the DB
	@GetMapping("delete")
	public String deleteRecs() {
		return "delete";
	}
	
	//page for the login
	@GetMapping("login")
	public String userLoginPage() {
		return "login";
	}
	
	
	
	
	
	@GetMapping("submitform")
	public String registerProcess(@RequestParam("empId") Integer empId,@RequestParam("empName") String empName,@RequestParam("empMobNo") long empMobNo,Model m) {
		
		EmployeeBean eb=new EmployeeBean(empId, empName, empMobNo);
	    
		if(serv.create(eb)) {
			return "redirect:list";
			//return "success";
		}  
		else
		  return "failure";
	}
	
	@GetMapping("list")
	public String showAllRecs(Model m) {
		List<EmployeeBean> l=serv.getAllRecs();
		//System.out.println(l);
		m.addAttribute("li",l);
		return "list";
	}
	
	@GetMapping("deleteEmp")
	public String deleteEmp(@RequestParam("empId") Integer empId) {
		
		serv.deleteEmpId(empId);
		return "redirect:list";
	}
	
	//this method is check the login auth
	@GetMapping("empLogin")
	public String userLoginAuth(@RequestParam("empId") Integer empId,@RequestParam("empName") String empName) {
		  boolean auth=serv.userLogin(empId, empName);
		if(auth) {
			
		return "success";
		}
		else {
			return "failure";
		}
	}
	
	@GetMapping("/*")
	public String failto() {
		return "failure";
	} 

}
