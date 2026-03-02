package com.annotation;

import org.springframework.stereotype.Component;

@Component("vc")
public class VisaCard implements Card {

	@Override
	public boolean verify(String cardNo) {
		// TODO Auto-generated method stub
		System.out.println("verfy by the visa card ");
		return true;
	}

}
