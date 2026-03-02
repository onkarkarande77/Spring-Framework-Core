package com.internal;

public class PersonData {
	private Integer perId;
	private String perName;
	private Address addr;
	
	public PersonData() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Integer getPerId() {
		return perId;
	}

	public void setPerId(Integer perId) {
		this.perId = perId;
	}

	public String getPerName() {
		return perName;
	}

	public void setPerName(String perName) {
		this.perName = perName;
	}

	public Address getAddr() {
		return addr;
	}

	public void setAddr(Address addr) {
		this.addr = addr;
	}

	@Override
	public String toString() {
		return "PersonData [perId=" + perId + ", perName=" + perName + ", addr=" + addr + "]";
	}
	
	
	
	

}
