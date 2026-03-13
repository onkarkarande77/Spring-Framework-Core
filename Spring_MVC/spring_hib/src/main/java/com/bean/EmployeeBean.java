package com.bean;


public class EmployeeBean {
   private Integer empId;
   private String empName;
   private long empMobNo;
    
   //this is plan POJO that hold the 
    public EmployeeBean() {
	super();
	// TODO Auto-generated constructor stub
  }

	public EmployeeBean(Integer empId, String empName, long empMobNo) {
		super();
		this.empId = empId;
		this.empName = empName;
		this.empMobNo = empMobNo;
	}

	public Integer getEmpId() {
		return empId;
	}

	public void setEmpId(Integer empId) {
		this.empId = empId;
	}

	public String getEmpName() {
		return empName;
	}

	public void setEmpName(String empName) {
		this.empName = empName;
	}

	public long getEmpMobNo() {
		return empMobNo;
	}

	public void setEmpMobNo(long empMobNo) {
		this.empMobNo = empMobNo;
	}

	@Override
	public String toString() {
		return "EmployeeBean [empId=" + empId + ", empName=" + empName + ", empMobNo=" + empMobNo + "]";
	}
    
	
    
   
   
}
