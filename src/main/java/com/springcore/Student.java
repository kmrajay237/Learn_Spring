package com.springcore;

public class Student {
	
	private int studentID;
	private String studentName;
	private String studentAddress;
	
	
	
	
	
	public int getStudentID() {
		return studentID;
	}
	public void setStudentID(int studentID) {
//		System.out.println("setStudentID");
		this.studentID = studentID;
	}
		
	public String getStudentName() {
		return studentName;
	}
	public void setStudentName(String studentName) {
//		System.out.println("setStudentName");
		this.studentName = studentName;
	}
	
	public String getStudentAddress() {
		return studentAddress;
	}
	public void setStudentAddress(String studentAddress) {
//		System.out.println("setStudentAddress");
		this.studentAddress = studentAddress;
	}
	
	
	
	
	@Override
	public String toString() {
		return "Student [studentID=" + studentID + ", studentName=" + studentName + ", studentAddress=" + studentAddress
				+ "]";
	}
	
	
	public Student() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Student(int studentID, String studentName, String studentAddress) {
		super();
		this.studentID = studentID;
		this.studentName = studentName;
		this.studentAddress = studentAddress;
	}
	

}
