package com.dao;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
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
			 bean.setEmpId(eb.getEmpId());//injecting the values entered by the user into the entity bean
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

	@Override
	public List<EmployeeBean> getAllRecs() {
		// TODO Auto-generated method stub
		List<EmployeeBean> ebean=new ArrayList<EmployeeBean>();
		try {
			Session s2=sf.getCurrentSession();
			Query<Employee_Entity_Bean> q=s2.createQuery("from Employee_Entity_Bean",Employee_Entity_Bean.class);
			
			//get all the records from the DB and inject into entity beans
			List<Employee_Entity_Bean> list=q.getResultList();
			
			//looping through collection of entity beans
			for(int i=0;i<list.size();i++) {
				Employee_Entity_Bean eb=list.get(i);//return the entity object
				EmployeeBean emp=new EmployeeBean();
				emp.setEmpId(eb.getEmpId());//inject the value from the entity to pojo
				emp.setEmpName(eb.getEmpName());
				emp.setEmpMobNo(eb.getEmpMobNo());
				
				//add the POJO to the collection
				ebean.add(emp);
				
			}
		}
		catch(Exception e) {
			e.printStackTrace();
		}
		return  ebean;
	}

	@Override
	public void deleteEmpId(int empId) {
		// TODO Auto-generated method stub
		Session s3=sf.getCurrentSession();
//		Query q1=s3.createQuery("delete from Employee_Entity_Bean where empId=?1");
//		q1.setParameter(1,empId);
//		q1.executeUpdate();
		Employee_Entity_Bean emp=s3.get(Employee_Entity_Bean.class, empId);
			s3.delete(emp);
			
		
	}

	@Override
	public boolean userLogin(int empId, String empName) {
		// TODO Auto-generated method stub
		try {
		Session s4=sf.getCurrentSession();
		Query<Employee_Entity_Bean> q2=s4.createQuery("from Employee_Entity_Bean where empId= ?1 and empName= ?2",Employee_Entity_Bean.class);
		
		 q2.setParameter(1,empId);
		 q2.setParameter(2,empName);
		Employee_Entity_Bean eb=q2.uniqueResult();
		if(eb!=null) {
		     return true;
		}
		
			return false;
		}catch (Exception e) {
			// TODO: handle exception
		      e.printStackTrace();
		      return false;
		}
	}

}
