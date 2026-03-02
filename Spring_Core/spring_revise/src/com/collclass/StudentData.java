package com.collclass;

public class StudentData {
	private Integer stdId;
	private String stdName;
	private Integer mks_cs;
	private Integer mks_mm;
	
	public StudentData() {
		super();
	}

	public StudentData(Integer stdId, String stdName, Integer mks_cs, Integer mks_mm) {
		super();
		this.stdId = stdId;
		this.stdName = stdName;
		this.mks_cs = mks_cs;
		this.mks_mm = mks_mm;
	}

	public Integer getStdId() {
		return stdId;
	}

	public void setStdId(Integer stdId) {
		this.stdId = stdId;
	}

	public String getStdName() {
		return stdName;
	}

	public void setStdName(String stdName) {
		this.stdName = stdName;
	}

	public Integer getMks_cs() {
		return mks_cs;
	}

	public void setMks_cs(Integer mks_cs) {
		this.mks_cs = mks_cs;
	}

	public Integer getMks_mm() {
		return mks_mm;
	}

	public void setMks_mm(Integer mks_mm) {
		this.mks_mm = mks_mm;
	}

	@Override
	public String toString() {
		return "StudentData [stdId=" + stdId + ", stdName=" + stdName + ", mks_cs=" + mks_cs + ", mks_mm=" + mks_mm
				+ "]";
	}
	//user define methods
	public void showData() {
		System.out.println("ID:"+stdId+" "+"Name:"+stdName);
	}
	
	public Integer getTot() {
		return (mks_cs+mks_mm);
	}
	

}
