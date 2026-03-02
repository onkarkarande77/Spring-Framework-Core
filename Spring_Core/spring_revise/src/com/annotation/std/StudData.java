package com.annotation.std;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component("sd")
public class StudData {
   @Value("1")
   private Integer id;
   @Value("java")
   private String name;
   @Value("88")
   private Integer mks_cs;
   @Value("89")
   private Integer mks_cc;
    
   public StudData() {
	super();
	// TODO Auto-generated constructor stub
   }

public Integer getId() {
	return id;
}

public String getName() {
	return name;
}

public Integer getMks_cs() {
	return mks_cs;
}

public Integer getMks_cc() {
	return mks_cc;
}

@Override
public String toString() {
	return "StudData [id=" + id + ", name=" + name + ", mks_cs=" + mks_cs + ", mks_cc=" + mks_cc + "]";
}
    
   
   
	
}
