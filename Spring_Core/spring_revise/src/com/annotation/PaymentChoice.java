package com.annotation;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.stereotype.Component;

@Component
public class PaymentChoice {
	 @Autowired
	private ApplicationContext ctx;
	

	public PaymentChoice() {
		super();
		// TODO Auto-generated constructor stub
	}

	public PaymentChoice(ApplicationContext ctx) {
		super();
		this.ctx = ctx;
	}
	
	public void payChoice(int ch,String cardNo,int amt) {
		  
		   Card card=null;
		  // MasterCard mc=null;
		  // VisaCard vc=null;
		
		switch(ch) { case 1:card=ctx.getBean("mc",Card.class);
		                    System.out.println("Payment by Master Card");
		                    break;
	                 case 2:card=ctx.getBean("vc",Card.class);
	                        System.out.println("Payment by Visa Card");
	                        break;
	                 default:System.out.println("enter the valid choice");
	                         break;
		}	
		AppCard app = ctx.getBean(AppCard.class);
        app.setCard(card);
        app.pay(cardNo, amt);
	}

}
