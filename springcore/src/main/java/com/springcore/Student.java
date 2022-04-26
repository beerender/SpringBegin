package com.springcore;

public class Student {
	private int StudentId;
	private String StudentName;
	private String Studentaddress;
	
	@Override
	public String toString() {
		return "Student1 [StudentId=" + StudentId + ", StudentName=" + StudentName + ", Studentaddress=" + Studentaddress
				+ "]";
	}
	
	public Student() {
		super();
		
		System.out.println("cons");
		// TODO Auto-generated constructor stub
	}
	public Student(int studentId, String studentName, String studentaddress) {
		super();
		System.out.println(" para cons");
		StudentId = studentId;
		StudentName = studentName;
		Studentaddress = studentaddress;
	}
	public int getStudentId() {
		return StudentId;
	}
	public void setStudentId(int studentId) {
		
		System.out.println("aya"+StudentId);
		StudentId = studentId;
	}
	public String getStudentName() {
		return StudentName;
	}
	public void setStudentName(String studentName) {
		StudentName = studentName;
	}
	public String getStudentaddress() {
		return Studentaddress;
	}
	public void setStudentaddress(String studentaddress) {
		Studentaddress = studentaddress;
	}
	

}
