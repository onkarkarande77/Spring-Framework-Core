package com.dao;

import java.util.List;

import com.bean.EmployeeBean;

public interface EmployeeEntity_I {
	boolean create(EmployeeBean eb);
	List<EmployeeBean> getAllRecs();
	boolean deleteRecs(int empId);
	boolean userAuth(int empId,String empName);
}
