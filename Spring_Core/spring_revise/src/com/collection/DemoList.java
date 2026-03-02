package com.collection;

import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class DemoList {
	private List<String> st;

	public DemoList() {
		super();
		// TODO Auto-generated constructor stub
	}

	public DemoList(List<String> st) {
		super();
		this.st = st;
	}

	public List<String> getSt() {
		return st;
	}

	public void setSt(List<String> st) {
		this.st = st;
	}
	
	
	public void showData() {
		
		System.out.println("data is"+st);
	}
	
	public static void main(String[] args) {
		ApplicationContext ctx=new ClassPathXmlApplicationContext("applicationContext.xml");
		DemoList dl=ctx.getBean("l",DemoList.class);
		dl.showData();
	}

}
