package com.dao;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class DaoMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ApplicationContext ctx=new ClassPathXmlApplicationContext("applicationContext.xml");
		JdbcPersonDao jd=ctx.getBean("pdao",JdbcPersonDao.class);
		PersonBean p=new PersonBean();
		p.setId(4);
		p.setName("java");
		
		jd.create(p);
		System.out.println(jd.retrieve(1));
		System.out.println();
		System.out.println(jd.fetchAll());
		

	}

}
