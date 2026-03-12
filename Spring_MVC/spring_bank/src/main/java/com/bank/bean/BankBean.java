package com.bank.bean;

public class BankBean {
   private Integer userId;
   private String userName;
   private String userPwd;
   private Integer acctBl;
   	public BankBean() {
	super();
	// TODO Auto-generated constructor stub
   	}
	public BankBean(Integer userId, String userName, String userPwd, Integer acctBl) {
		super();
		this.userId = userId;
		this.userName = userName;
		this.userPwd = userPwd;
		this.acctBl = acctBl;
	}
	public Integer getUserId() {
		return userId;
	}
	public void setUserId(Integer userId) {
		this.userId = userId;
	}
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public String getUserPwd() {
		return userPwd;
	}
	public void setUserPwd(String userPwd) {
		this.userPwd = userPwd;
	}
	public Integer getAcctBl() {
		return acctBl;
	}
	public void setAcctBl(Integer acctBl) {
		this.acctBl = acctBl;
	}
	@Override
	public String toString() {
		return "BankBean [userId=" + userId + ", userName=" + userName + ", userPwd=" + userPwd + ", acctBl=" + acctBl
				+ "]";
	}
}
