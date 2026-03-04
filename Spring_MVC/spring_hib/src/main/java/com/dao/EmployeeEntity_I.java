package com.dao;

import java.util.List;

import com.bean.EmployeeBean;

public interface EmployeeEntity_I {
    boolean create(EmployeeBean eb);
    List<EmployeeBean> getAllRecs();
    void deleteEmpId(int empId);
    boolean userLogin(int empId,String empName);
}
