package com.dao.jt;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class DaoMain {
	public static void main(String[] args) {
		ApplicationContext ctx=new ClassPathXmlApplicationContext("applicationContext.xml");
		JdbcPersonImp jd=ctx.getBean("pdao",JdbcPersonImp.class);
		
		jd.create(new Person(1,"java"));
		System.out.println(jd.retreive(1));
	}

}
