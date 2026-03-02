package com.collclass;

import java.util.ArrayList;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class StdColl {
	private ArrayList<StudentData> std1;

	public StdColl() {
		super();
		// TODO Auto-generated constructor stub
	}

	public StdColl(ArrayList<StudentData> std1) {
		super();
		this.std1 = std1;
	}

	public ArrayList<StudentData> getStd1() {
		return std1;
	}

	public void setStd1(ArrayList<StudentData> std1) {
		this.std1 = std1;
	}

	@Override
	public String toString() {
		return "StdColl [std=" + std1 + "]";
	}
	
	public void getData() {
		for(StudentData st:std1)
		System.out.println(st);
	}
	
	public static void main(String[] args) {
		ApplicationContext ctx=new ClassPathXmlApplicationContext("applicationContext.xml");
		StdColl st=ctx.getBean("sc",StdColl.class);
		st.getData();
	
	}

}
