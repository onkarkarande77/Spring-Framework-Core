package com.annotation;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.stereotype.Component;

@Component("pd")
public class PerData {
	@Value("1")
	private Integer perId;
	@Value("spring")
   private String perName;
	@Autowired
	private PerAddr pa;
	
	public PerData() {
		super();
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "PerData [perId=" + perId + ", perName=" + perName + ", pa=" + pa + "]";
	}
	 
	 public static void main(String[] args) {
		ApplicationContext ctx=new ClassPathXmlApplicationContext("applicationContext.xml");
		PerData pd=ctx.getBean("pd",PerData.class);
		System.out.println(pd);
	}
	
	
	
}
