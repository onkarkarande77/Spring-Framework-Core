package com.collection;

import java.util.Map;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class DemoMap {
	private Map<Integer,String> ma;

	public DemoMap() {
		super();
		// TODO Auto-generated constructor stub
	}

	public DemoMap(Map<Integer, String> ma) {
		super();
		this.ma = ma;
	}

	public Map<Integer, String> getMa() {
		return ma;
	}

	public void setMa(Map<Integer, String> ma) {
		this.ma = ma;
	}

	@Override
	public String toString() {
		return "DemoMap [ma=" + ma + "]";
	}
	 
	public void showData() {
		System.out.println(ma);
	}
	public static void main(String[] args) {
		ApplicationContext ctx=new ClassPathXmlApplicationContext("applicationContext.xml");
		DemoMap dm=ctx.getBean("m",DemoMap.class);
		System.out.println(dm.toString());
		dm.showData();
	}

}
