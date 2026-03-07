package com.controllers;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.bean.EmployeeBean;
import com.service.EmployeeService_I;

@Controller
public class EmployeeController {
	@Autowired
	EmployeeService_I serv;
   
	@GetMapping("/")
	public String myHomePage(){
		return "index";
	}
	
	@GetMapping("register")
	public String empRegForm() {
		return "register";
	}
	
	@GetMapping("delete")
	public String deleteData() {
		return "delete";
	}
	
	@GetMapping("login")
	public String userLogin(){
		return "emplogin";
	}
	
	@GetMapping("paymentPage")
	public String payId() {
		return "paypage";
	}
	
	@GetMapping("submitdata")
	public String sendData(@RequestParam("empId") Integer empId,@RequestParam("empName") String empName,@RequestParam("empMobNo") long empMobNo,Model m) {
		EmployeeBean eb=new EmployeeBean(empId, empName, empMobNo);
		
		if(serv.create(eb)) {
			return "redirect:list";
		}
		else
		return "Failure";
	}
	
	//this method to get all the record from the DB
	@GetMapping("list")
	public String getEmpRecs(Model m) {
		List<EmployeeBean> l=serv.getAllRecs();
		//System.out.println(l);
		m.addAttribute("li",l);
		return "list";
	}
	
	@GetMapping("deleteRecs")
	public String deleteDBRecs(@RequestParam("empId") Integer empId) {
		serv.deleteRecs(empId);
	    return "redirect:list";	
	}
	
	@GetMapping("userlogin")
	public String userLoginAuth(@RequestParam("empId") Integer empId,@RequestParam("empName") String empName,HttpServletRequest req) {
		boolean isValid = serv.userAuth(empId, empName);

	    if (isValid){
	    	HttpSession session=req.getSession();
	    	session.setAttribute("empId",empId);
	        return "success";
	    } else {
	        return "Failure";
	    }
	}
	
	
}
