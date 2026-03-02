package com.collection;

import java.util.Set;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class DemoSet {
	private Set<String> s;
	
	public DemoSet() {
		super();
	}
	
	public DemoSet(Set<String> s) {
		super();
		this.s=s;
	}
	
	public void setS(Set<String> s) {
		this.s=s;
	}
	
	public Set<String> getS(){
		return s;
	}
	@Override
	public String toString() {
		return "setData "+s;
	}
	
	public void showData() {
		System.out.println(s);
	}

	public static void main(String[] args) {
		ApplicationContext ctx=new ClassPathXmlApplicationContext("applicationContext.xml");
		DemoSet ds=ctx.getBean("s",DemoSet.class);
		ds.showData();
	}
}
