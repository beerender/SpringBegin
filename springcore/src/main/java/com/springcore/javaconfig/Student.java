package com.springcore.javaconfig;

import org.springframework.stereotype.Component;

@Component
public class Student {
	private Name name;
	
	/**
	 * @param name
	 */
	public Student(Name name) {
		super();
		this.name = name;
	}

	public Name getName() {
		return name;
	}

	public void setName(Name name) {
		this.name = name;
	}

	public void study() {
		this.name.display();
		System.out.println("Study");
	}

}
