package com.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository("pdao")
public class JdbcPersonDao implements PersonDAO {
	@Autowired
	private DataSource ds;//this for the run time injection
                       //it taken care by the driver manger class
	@Override
	public boolean create(PersonBean p) {
		// TODO Auto-generated method stub
		try {
		Connection conn=ds.getConnection();
		PreparedStatement prp=conn.prepareStatement("insert into person values(?,?)");
		prp.setInt(1,p.getId());
	    prp.setString(2,p.getName());
	    
	    int row=prp.executeUpdate();
	    if(row>0) {
	    	System.out.println("Done");
	    }
		}
		catch(Exception e) {
			e.printStackTrace();
		}
		return true;
	}

	@Override
	public PersonBean retrieve(int id) {
		// TODO Auto-generated method stub
		PersonBean p=new PersonBean();
		try {
			Connection conn=ds.getConnection();
			PreparedStatement prp=conn.prepareStatement("select * from person where id=?");
			prp.setInt(1, id);
			ResultSet rs=prp.executeQuery();
			
			if(rs.next()) {
				p.setId(rs.getInt(1));
				p.setName(rs.getString(2));
			}
		}
		catch(Exception e) {
			e.printStackTrace();
		}
		
		return p;
	}

	@Override
	public PersonBean fetchAll() {
		// TODO Auto-generated method stub
		PersonBean p=new PersonBean();
		try {
		Connection conn=ds.getConnection();
		PreparedStatement prp=conn.prepareStatement("select * from person");
		ResultSet rs=prp.executeQuery();
		System.out.println("Id"+" "+"Name");
		while(rs.next()) {
			  
		   System.out.println(rs.getInt(1)+" "+rs.getString(2));
		  
		    
		}
		
	}
		catch(Exception e) {
			e.printStackTrace();
		}
		return p;
	}

}
