package com.springcore.ci;

public class Addition {
	private int a;
	private int b;
	public Addition(double a, double b) {
		super();
		this.a = (int)a;
		this.b = (int)b;
		System.out.println("Contructor : double, double ");
	}
	public Addition(int a, int b) {
		super();
		this.a = a;
		this.b = b;
		System.out.println("Contructor : int, int ");
	}
	public Addition(String a, int b) {
		super();
		this.a = Integer.parseInt(a);
		this.b = b;
		System.out.println("Contructor : string, string ");
	}
	
	public void doSum() {
		System.out.println(this.a + " : "+ this.b);
		System.out.println("sum = "+(this.a+this.b));
	}
	public Addition(double a, int b) {
		super();
		this.a = (int) a;
		this.b = b;
		System.out.println("Contructor : string, string ");
	}
}
