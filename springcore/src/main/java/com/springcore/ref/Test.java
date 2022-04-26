package com.springcore.ref;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ApplicationContext context =new ClassPathXmlApplicationContext("com/springcore/ref/refconfig.xml");
		B objB=(B) context.getBean("refB");
		A objA=(A) context.getBean("refA");
		System.out.println(objB);
		System.out.println(objA);

	}

}
