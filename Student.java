package com.capgemini.day6;

public class Student {
	private String name;
	private int rollno;
	private String branch;
	public Student() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Student(String name, int rollno, String branch) {
		super();
		this.name = name;
		this.rollno = rollno;
		this.branch = branch;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getRollno() {
		return rollno;
	}
	public void setRollno(int rollno) {
		this.rollno = rollno;
	}
	public String getBranch() {
		return branch;
	}
	public void setBranch(String branch) {
		this.branch = branch;
	}
	

}
