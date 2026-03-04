package com.service;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bean.EmployeeBean;
import com.dao.EmployeeEntity_I;

@Service("serv")
public class EmployeeService_impl  implements EmployeeService_I{
@Autowired
EmployeeEntity_I emp_dao;
	
    @Override
	@Transactional
	public boolean create(EmployeeBean eb) {
		// TODO Auto-generated method stub
		 
		
		
		return emp_dao.create(eb);
	}

	@Override
	@Transactional   //it avoid repetitive code in hibernate  i.e transaction.commit (this only used in the service layer)
	public List<EmployeeBean> getAllRecs() {
		// TODO Auto-generated method stub
		
		return emp_dao.getAllRecs();
	}

	@Override
	@Transactional
	public void deleteEmpId(int empId) {
		// TODO Auto-generated method stub
		emp_dao.deleteEmpId(empId);
	}

	@Override
	@Transactional
	public boolean userLogin(int empId, String empName) {
		// TODO Auto-generated method stub
		return emp_dao.userLogin(empId, empName);
	}

}
