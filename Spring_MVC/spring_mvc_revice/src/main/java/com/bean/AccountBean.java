package com.bean;
public class AccountBean {
   private Integer accId;
   private String accName;
   
   //this is our plane POJO that hold value of property 
 public AccountBean() {
	super();
	// TODO Auto-generated constructor stub
}
public AccountBean(Integer accId, String accName) {
	super();
	this.accId = accId;
	this.accName = accName;
}
public Integer getAccId() {
	return accId;
}
public void setAccId(Integer accId) {
	this.accId = accId;
}
public String getAccName() {
	return accName;
}
public void setAccName(String accName) {
	this.accName = accName;
}

@Override
public String toString() {
	return "AccountBean [accId=" + accId + ", accName=" + accName + "]";
}
 

   
}
