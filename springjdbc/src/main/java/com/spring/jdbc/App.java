package com.spring.jdbc;

import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.jdbc.core.JdbcTemplate;

import com.spring.jdbc.dao.StudentDao;
import com.spring.jdbc.dao.StudentDaoImpl;
import com.spring.jdbc.entites.Student;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        //ApplicationContext context=new ClassPathXmlApplicationContext("com/spring/jdbc/config.xml");
    	ApplicationContext context=new AnnotationConfigApplicationContext(JdbcConfig.class);
        StudentDao t1=context.getBean("studentDao",StudentDao.class);
        Student st1=new Student();
        
		/* insert
		 * st1.setId(21); st1.setName("Vishali"); st1.setCity("Haryana"); 
		 * int result=t1.insert(st1); System.out.println("inserted "+result);
		 * 
		 */
        
        //update query
		/*
		 * st1.setId(21); st1.setName("Vishali"); st1.setCity("Haryana"); int
		 * 
		 * int result=t1.change(st1); System.out.println("changed row "+result);
		 */
        //delete
		/*
		 * st1.setId(1); int result=t1.delete(st1); System.out.println("delete rows "+
		 * result);
		 */
        
    // st1.setId(22); st1.setName("Vishalri"); st1.setCity("Haryana");
//        	st1 = t1.getStudent(2);
//        	System.out.println(st1);
        
        List<Student> st12=t1.getAllStudents();
        for(Student student:st12) {
        	System.out.println(student);
        }
    }
}
