package com.service;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bean.EmployeeBean;
import com.dao.EmployeeEntity_I;
@Service("serv")
public class EmployeeService_impI implements EmployeeService_I {
@Autowired
 EmployeeEntity_I emp_dao;
	@Override
	@Transactional
	public boolean create(EmployeeBean eb) {
		// TODO Auto-generated method stub
		return emp_dao.create(eb);
	}
	@Override
	@Transactional
	public List<EmployeeBean> getAllRecs() {
		// TODO Auto-generated method stub
		return emp_dao.getAllRecs();
	}
	
	
	@Override
	@Transactional
	public boolean deleteRecs(int empId) {
		// TODO Auto-generated method stub
		return emp_dao.deleteRecs(empId);
	}
	@Override
	@Transactional
	public boolean userAuth(int empId, String empName) {
		// TODO Auto-generated method stub
		return emp_dao.userAuth(empId, empName);
	}

}
