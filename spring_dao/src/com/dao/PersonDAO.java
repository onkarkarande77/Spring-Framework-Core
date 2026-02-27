package com.dao;

public interface PersonDAO {
	boolean create(PersonBean p);
	 
	 PersonBean retrieve(int id);
	 
	 PersonBean fetchAll();

}
