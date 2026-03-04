package com.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="employee")
public class Employee_Entity_Bean {
	@Id
	@Column
	private Integer empId;
	@Column(name="empname")
	private String empName;
	@Column(name="mobile") 
	private Long empMobNo;
	
	public Employee_Entity_Bean() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Employee_Entity_Bean(Integer empId, String empName, Long empMobNo) {
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

	public Long getEmpMobNo() {
		return empMobNo;
	}

	public void setEmpMobNo(Long empMobNo) {
		this.empMobNo = empMobNo;
	}

	@Override
	public String toString() {
		return "Employee_Entity_Bean [empId=" + empId + ", empName=" + empName + ", empMobNo=" + empMobNo + "]";
	}
	
	
	
	

}
