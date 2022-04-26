package com.springcore.sterotype;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ApplicationContext context=new ClassPathXmlApplicationContext("com/springcore/sterotype/stereoconfigj.xml");
		Student s1=context.getBean("student",Student.class);
		System.out.println(s1);
		System.out.println(s1.getAddress());
		System.out.println(s1.hashCode());
		Student s2=context.getBean("student",Student.class);
		System.out.println(s2.hashCode());
		//using bean in xml
		Teacher t1=context.getBean("Teacher",Teacher.class);
		Teacher t2=context.getBean("Teacher",Teacher.class);
		System.out.println(t1.hashCode());
		System.out.println(t2.hashCode());
	}

}
