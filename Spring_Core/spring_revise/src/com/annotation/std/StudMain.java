package com.annotation.std;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class StudMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ApplicationContext ctx=new ClassPathXmlApplicationContext("applicationContext.xml");
		StudProcess sp=ctx.getBean("sp",StudProcess.class);
		 System.out.println(sp);
         sp.showResult();
	}

}
