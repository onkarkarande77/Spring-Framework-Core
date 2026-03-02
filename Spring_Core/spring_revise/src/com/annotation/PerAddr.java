package com.annotation;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component("add")
public class PerAddr {
   @Value("Pune")
   private String city;
   @Value("MH")
   private String state;
     public PerAddr() {
	super();
	// TODO Auto-generated constructor stub
   }
	@Override
	public String toString() {
		return "PerAddr [city=" + city + ", state=" + state + "]";
	}
   
     
	
   

}
