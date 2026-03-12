package com.bank.dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.bank.bean.BankBean;

@Repository("bdao")
public class BankDAO {
  @Autowired
  private JdbcTemplate jt;
  
  //this method to insert data into db
  public int create(BankBean bk) {
	  return jt.update("insert into bankdata (userName,userPwd,acctBl) values(?,?,?)",bk.getUserName(),bk.getUserPwd(),bk.getAcctBl());
  }
  
  //this method for the get data
  
  public boolean auth(int userId,String userPwd) {
	  try {
	  BankBean bb=null;
	  bb=jt.queryForObject("select * from bankdata where userId=? and userPwd=?",BeanPropertyRowMapper.newInstance(BankBean.class),userId,userPwd);
   
	   return true; 
	  }catch (Exception e) {
		// TODO: handle exception
		  System.out.println("wrong id and pass");
		  return false;
	}
  }
  
  //withdraw AMT logic
  public boolean withAmt(int amt,int userId) {
	 try {
	  int row= jt.update("update bankdata set acctBl=acctBl-? where userId=? and acctBl>=?",amt,userId,amt);
	  return row>0;
	 }
	 catch (Exception e) {
		// TODO: handle exception
		 return false;
	}
    
  }
  
  //for this method to the chk balance
  
}
