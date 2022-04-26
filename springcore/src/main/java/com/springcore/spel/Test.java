package com.springcore.spel;



import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.expression.Expression;
import org.springframework.expression.spel.standard.SpelExpressionParser;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ApplicationContext context=new ClassPathXmlApplicationContext("com/springcore/spel/aloneconfigj.xml");
		Demo d1=context.getBean("demo",Demo.class);
		System.out.println(d1);
		SpelExpressionParser ob=new SpelExpressionParser();
		Expression exp= ob.parseExpression("10+2");
		System.out.println(exp.getValue());
		System.out.println(d1.getZ());
		System.out.println(d1.getE());
		System.out.println(d1.getName());
		
	}

}
