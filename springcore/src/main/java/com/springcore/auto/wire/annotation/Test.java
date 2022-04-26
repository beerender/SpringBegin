package com.springcore.auto.wire.annotation;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ApplicationContext context=new ClassPathXmlApplicationContext("com/springcore/auto/wire/annotation/autoconfigj.xml");
		//Emp emp1=(Emp)context.getBean("emp1");
		Emp emp2=(Emp)context.getBean("emp2");
		//Address ad=(Address)context.getBean("address");
		//System.out.println(emp1);
		System.out.println(emp2);
		//System.out.println(ad);
		
	}

}
