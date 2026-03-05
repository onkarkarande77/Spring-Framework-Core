package com.bank;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.bank.bean.BankBean;
import com.bank.dao.BankDAO;

@Controller
public class BankController {
	@Autowired
	@Qualifier("bdao")
	private BankDAO bd;
	//@RequestMapping(value = "/" ,method=RequestMethod.GET)
	@GetMapping("/")
	public String myHomePage() {
		return "index";
	}
     //this is the login page
	 @GetMapping("userlogin")
	 public String userLogin(){
		 return "login";
	 }
	 
	 //this is the  sigupPage(here one error when we call this from there folder name they can't invoke)
	 @GetMapping("userSignup")
	 public String userSignUp() {
		 return "signup";
	 }
	 //now we create the pages for the choice
	 @GetMapping("withdraw")
	 public  String blWith() {
		 return "withdrawamt";
	 }
	 
	 //here we check the user auth
	 @PostMapping("loginData")
	 public String userLogin(HttpServletRequest req){
		 
		 //get the data from the form
		 String id=req.getParameter("userId");
		 String pass=req.getParameter("userPwd");
		  
		//this is for the check AUTH   
		if(bd.auth(Integer.parseInt(id),pass)) {
			HttpSession session=req.getSession(true);
			session.setAttribute("userId",Integer.parseInt(id));
		    return "choice";
		 }
		
		 else
		 return "faillogin";
	 }
	 
	 //this mapping to get and set data to db
	 @PostMapping("sendsignup")
	 public String userSignUp(HttpServletRequest req,Model m){
		  //get the SIGNUP detail and push into the DB
		 String userName=req.getParameter("userName");
		 String userPwd=req.getParameter("userPwd");
		 String acctBl=req.getParameter("acctBl");
	
         BankBean bk=new BankBean();
		
		 bk.setUserName(userName);
		 bk.setUserPwd(userPwd);
		 bk.setAcctBl(Integer.parseInt(acctBl));
		 
		 m.addAttribute("id",bk.getUserId());
		 bd.create(bk);
		 m.addAttribute("acct",bk);
         return "signupdone";
	 }
	 
	 //now we can perform the operation
	@PostMapping("withamt")
	 public String withDone(HttpServletRequest req,Model m) {
		HttpSession session=req.getSession(false);
		
		if(session==null){
			return "login";
		}
		//now get id from session and amt from the form
		String amt=req.getParameter("amt");
		int userId=(int)session.getAttribute("userId");
		
		boolean success=bd.withAmt(Integer.parseInt(amt), userId);
		if(success) {
		return "withdone";
		}
		else {
			req.setAttribute("msg", "Insufficient balance");
	        return "withdrawamt";
		}
	}
	 
}
