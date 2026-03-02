package com.annotation;

import org.springframework.stereotype.Component;


@Component("mc")
public class MasterCard implements Card {

	@Override
	public boolean verify(String cardNo) {
		// TODO Auto-generated method stub
		System.out.println("verify by the master card");
		return true;
	}

}
