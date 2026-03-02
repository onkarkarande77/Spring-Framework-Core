package com.std;

public class StdData {
	private Integer  stdId;
	private String stdName;
	private float stdHt;
	
	public StdData() {
		super();
	}
	
	
   public StdData(Integer stdId, String stdName, float stdHt) {
		super();
		this.stdId = stdId;
		this.stdName = stdName;
		this.stdHt = stdHt;
	}


//setter getter method
	public Integer getStdId() {
		return stdId;
	}
	public void setStdId(Integer stdId) {
		this.stdId=stdId;
	}
	 
	public String getStdName() {
		return stdName;
	}
	public void setStdName(String stdName) {
		this.stdName=stdName;
	}
	
	public float getStdHt() {
		return stdHt;
	}
	public void setStdHt(float stdHt) {
		this.stdHt=stdHt;
	}
	
	public void dispData() {
		System.out.println("Stud ID is "+stdId+"\n"+"Stud Name is "+stdName+"\n"+"Stud Height is "+stdHt);
		
	}
	@Override
	public String toString() {
		return "StdData [stdId=" + stdId + ", stdName=" + stdName + ", stdHt=" + stdHt + "]";
	}
}
