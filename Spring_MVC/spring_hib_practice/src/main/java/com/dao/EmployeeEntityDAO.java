package com.dao;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.stereotype.Repository;

import com.bean.EmployeeBean;
import com.entity.Employee_Entity_Bean;

@Repository("emp_dao")
public class EmployeeEntityDAO implements EmployeeEntity_I {
 @Autowired
  SessionFactory sf;
	@Override
	public boolean create(EmployeeBean eb) {
		// TODO Auto-generated method stub
		try {
			  Session s=sf.getCurrentSession();
			 Employee_Entity_Bean bean=new Employee_Entity_Bean();
			 
			 bean.setEmpId(eb.getEmpId());
			 bean.setEmpName(eb.getEmpName());
			 bean.setEmpMobNo(eb.getEmpMobNo());
			 
			 s.persist(bean);
			 
			 return true;
		}
		catch(Exception e) {
			e.printStackTrace();
		}
		return false;
	}
	
	//this method to get all the record from the db we display it into the console and also on the JSP page
	@Override
	public List<EmployeeBean> getAllRecs() {
		// TODO Auto-generated method stub
		List<EmployeeBean> ebean=new ArrayList<>();
		
		try {
		    Session s2=sf.getCurrentSession();
		    Query<Employee_Entity_Bean> q=s2.createQuery("from Employee_Entity_Bean",Employee_Entity_Bean.class);
		   
		    //get all the record from the DB record and inject 
		    List<Employee_Entity_Bean> list=q.getResultList();
		    
		    for(int i=0;i<list.size();i++) {
		    	Employee_Entity_Bean eb=list.get(i);
		    	
		    	EmployeeBean emp=new EmployeeBean();
		    	emp.setEmpId(eb.getEmpId());
		    	emp.setEmpName(eb.getEmpName());
		    	emp.setEmpMobNo(eb.getEmpMobNo());
		    	
		    	ebean.add(emp);
		    	
		    	
		    }
		}
		catch(Exception e) {
			e.printStackTrace();
		}
		
		return ebean;
	}

	 //this method delete record from the DB
	@Override
	public boolean deleteRecs(int empId) {
		// TODO Auto-generated method stub
		try {
			 Session s3=sf.getCurrentSession();
			 
			 Employee_Entity_Bean eb=s3.get(Employee_Entity_Bean.class,empId);
			 s3.delete(eb);
		
			return true;
		}
		catch(Exception e) {
			e.printStackTrace();
			return false;
		}
	}

	 //this method to authentication of the user
	@Override
	public boolean userAuth(int empId, String empName) {
		// TODO Auto-generated method stub
		try {
			Session s4 = sf.getCurrentSession();
			Query<Employee_Entity_Bean> q1 =s4.createQuery ("from Employee_Entity_Bean where empId = :id and empName = :name", Employee_Entity_Bean.class);

				q1.setParameter("id", empId);
				q1.setParameter("name", empName);

				Employee_Entity_Bean emp = q1.uniqueResult();
				if(emp !=null) {
					return true;
				}
				
				return false;
			 
			
		}
		catch(Exception e) {
			e.printStackTrace();
			return false;
		}
		
	}
	
	
	

}
