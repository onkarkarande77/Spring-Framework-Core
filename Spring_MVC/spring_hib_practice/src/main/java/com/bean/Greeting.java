package com.bean;

public class Greeting {
	private Integer id;
	private String name;
	
	public Greeting() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Greeting(Integer id, String name) {
		super();
		this.id = id;
		this.name = name;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return "Greeting [id=" + id + ", name=" + name + "]";
	}
	
	

}
