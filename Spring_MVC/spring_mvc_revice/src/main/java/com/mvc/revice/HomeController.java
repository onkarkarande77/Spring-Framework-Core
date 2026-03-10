package com.mvc.revice;

import java.net.http.HttpRequest;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.stereotype.Controller;
import org.springframework.stereotype.Repository;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.bean.AccountBean;
import com.dao.AccountDAO;

@Controller
public class HomeController {
	@Autowired
	@Qualifier("adao")
	private AccountDAO ad;
	
  //@RequestMapping(value ="/",method=RequestMethod.GET)
	@GetMapping("/")
  public String myHomePage() {
	  return "index";
  } 
  
  @GetMapping("newacct")
  public String newRegister() {
	  return "register";
  }
  
  @PostMapping("senddata")
//  public String getNewAccData(HttpServletRequest req,Model m) {
	  
	  //get the data from the form
	//  String id=req.getParameter("accId");
	// String name=req.getParameter("accName");
	  
  public String sendData(@RequestParam("accId")Integer accId,@RequestParam("accName")String accName,Model m){
	  //now we send  model to view layer
	  AccountBean ab=new AccountBean(accId, accName);
	  m.addAttribute("accId",ab.getAccId());
	  m.addAttribute("accName",accName);
	  
	  //ab.setAccId();
	   //ApplicationContext ctx=new ClassPathXmlApplicationContext("applicationContext.xml");
	  // AccountDAO ad=ctx.getBean("adao",AccountDAO.class);
	   ad.create(ab);
	   
	   m.addAttribute("ad",ad.fetchAll());
	   m.addAttribute("abs",ad.retrieve(accId));
	   
		   return "show";  
  }
  
 
  
  @GetMapping("/*")
  public String getFail(){
	  return "invalid";
  }
  
  
  
}
