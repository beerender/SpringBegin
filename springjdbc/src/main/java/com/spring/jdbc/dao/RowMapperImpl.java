package com.spring.jdbc.dao;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.spring.jdbc.entites.Student;

public class RowMapperImpl implements RowMapper<Student> {

	public Student mapRow(ResultSet rs, int rowNum) throws SQLException {
		Student st1=new Student();
		st1.setId(rs.getInt(1));
		st1.setName(rs.getString(2));
		st1.setCity(rs.getString(3));
		
		return st1;
	}

}
