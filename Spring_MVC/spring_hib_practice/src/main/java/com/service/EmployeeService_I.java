package com.service;

import java.util.List;

import com.bean.EmployeeBean;

public interface EmployeeService_I {
	  boolean create(EmployeeBean eb);
	  List<EmployeeBean> getAllRecs();
	  boolean deleteRecs(int empId);
	  boolean userAuth(int empId,String empName);
}
