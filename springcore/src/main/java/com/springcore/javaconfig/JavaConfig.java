package com.springcore.javaconfig;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackages="com.springcore.javaconfig")
public class JavaConfig {
	@Bean
	public Name n1() {
		return new Name();
	}
	@Bean(name= {"name"})
	public Student getStudent() {
		
		Student s1=new Student(n1());
		return s1;
	}
}
