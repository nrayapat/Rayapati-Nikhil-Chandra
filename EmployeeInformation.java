package com.capgemini.empoyee.day5;

public class EmployeeInformation {
	private int employeeId;
	private String employeeName;
	private String employeeAddress;
	private int employeePhone;
	private double basicSalary;
	public final double specialAllowance = 250.80;
	public final double HRA = 1000.50;
	
 EmployeeInformation()
{
}
public EmployeeInformation (int employeeID, String employeeName, String employeeAddress, int employeePhone)
{
	this.employeeId = employeeID;
	this.employeeName = employeeName;
	this.employeeAddress = employeeAddress;
	this.employeePhone = employeePhone;
}
public double Salary;
{
	double Salary = basicSalary+(basicSalary*specialAllowance/100) + (basicSalary*HRA/100);
}
}


	
	
