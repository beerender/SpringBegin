package com.springcore.ci;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ApplicationContext context=new ClassPathXmlApplicationContext("com/springcore/ci/ciconfigj.xml");
		Person ps1=(Person) context.getBean("person");
		Person ps2=(Person) context.getBean("person2");
		Addition ps3=(Addition) context.getBean("add");
		System.out.println(ps1);
		ps3.doSum();
	}

}
