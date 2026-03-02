package com.annotation.std;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component("sp")
public class StudProcess {
    @Autowired
    private StudData sd;
    
     public StudProcess() {
		super();
		// TODO Auto-generated constructor stub
	}
     
     

	@Override
	public String toString() {
		return "StudProcess [sd=" + sd + "]";
	}



	//method for the result 
	int getTot(StudData sd) {
	   return sd.getMks_cc()+sd.getMks_cs();
   }
	
	int getAvg(StudData sd) {
		return this.getTot(sd)/2;
	}
   
	String getStatus(StudData sd) {
		int mark=this.getTot(sd);
		if(mark>35) {
			return "Pass";
		}
		else {
			return "Fail";
		}
	}
	
	char getGrade(StudData sd) {
		int avg=this.getAvg(sd);
		if(avg>80) {
			return 'A';
		}
		else if(avg>70) {
			return 'B';
		}
		else {
			return 'C';
		}
	}
	
	void showResult() {
		System.out.println("Total mark is:"+this.getTot(sd)+"\t"+"Avg is:"+this.getAvg(sd));
		System.out.println();
		System.out.println("Grade point is:"+this.getGrade(sd)+"\t"+"Result Status:"+this.getStatus(sd));
	}

}

