package com.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.bean.AccountBean;

@Repository("adao")
public class AccountDAO {
	@Autowired
	private JdbcTemplate jt;
	//this method for the insert the data
	public int create(AccountBean ab) {
		return jt.update("insert into acctdetail values(?,?)",ab.getAccId(),ab.getAccName());
	} 

	//this is for the fetch the specific data
	public AccountBean retrieve(int accId) {
		AccountBean ab=null;
		
		ab=jt.queryForObject("select * from acctdetail where accId=?",BeanPropertyRowMapper.newInstance(AccountBean.class),accId);
		return ab;
	}
	
	//this can fetch all the record from the db 
	public List<AccountBean> fetchAll(){
		List<AccountBean> ab=null;
	    
	    ab=jt.query("select * from acctdetail",BeanPropertyRowMapper.newInstance(AccountBean.class));
	    
	    return ab;
	}
	
	
}
