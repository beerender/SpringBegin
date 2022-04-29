package com.spring.jdbc.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
//import org.springframework.jdbc.core.RowMapper;
//simport org.springframework.jdbc.core.RowMapper;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Component;

import com.spring.jdbc.entites.Student;
@Component("studentDao")
public class StudentDaoImpl implements StudentDao{
	
	
	private JdbcTemplate jdbcTemplate;
	public int insert(Student student) {
		// TODO Auto-generated method stub
		 String query="insert into student (id,name,city) values (?,?,?)";
		 int r=this.jdbcTemplate.update(query,student.getId(),student.getName(),student.getCity());
		return r;
	}
	public JdbcTemplate getJdbcTemplate() {
		return jdbcTemplate;
	}
	@Autowired
	public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
		this.jdbcTemplate = jdbcTemplate;
	}
	public int change(Student student) {
		String query="update student set name=? , city=? where id=?";
		int r=this.jdbcTemplate.update(query,student.getName(),student.getCity(),student.getId());
		return r;
	}
	public int delete(Student student) {
		String query="delete from student where id=?";
		int r=this.jdbcTemplate.update(query,student.getId());
				
		return r;
	}
	public Student getStudent(int studentId) {
		String query="select * from student where id=?";
		RowMapper<Student> rowMapper=new RowMapperImpl();
		
		Student st1 = this.jdbcTemplate.queryForObject(query, rowMapper , studentId);
		
		return st1;
	}
	public List<Student> getAllStudents() {
		// Tmultiple
		String query="select * from student";
		List<Student> query2 = this.jdbcTemplate.query(query,new RowMapperImpl());
		return query2;
	}
	
	
}
