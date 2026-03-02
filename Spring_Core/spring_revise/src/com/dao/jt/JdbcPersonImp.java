package com.dao.jt;

import java.beans.BeanProperty;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

@Repository("pdao")
public class JdbcPersonImp implements PersonDAO {
 @Autowired
 private JdbcTemplate jt;
	@Override
	public int create(Person p) {
		// TODO Auto-generated method stub
		int r=jt.update("insert into person values(?,?)",p.getId(),p.getName());
		return r;
	}

	@Override
	public Person retreive(int id) {
		// TODO Auto-generated method stub
	return	jt.queryForObject("select * from person where id=?",BeanPropertyRowMapper.newInstance(Person.class),id);		 
	}

}
