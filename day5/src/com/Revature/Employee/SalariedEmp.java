package com.Revature.Employee;

public class SalariedEmp  {
	private int empId;
	private String empName;
	private int dayPresent;
	public SalariedEmp() {
		super();
		// TODO Auto-generated constructor stub
	}
	public SalariedEmp(int empId, String empName, int dayPresent) {
		super();
		this.empId = empId;
		this.empName = empName;
		this.dayPresent = dayPresent;
	}
	public int getEmpId() {
		return empId;
	}
	public void setEmpId(int empId) {
		this.empId = empId;
	}
	public String getEmpName() {
		return empName;
	}
	public void setEmpName(String empName) {
		this.empName = empName;
	}
	public int getDayPresent() {
		return dayPresent;
	}
	public void setDayPresent(int dayPresent) {
		this.dayPresent = dayPresent;
	}
	
	public int Salary(int dayPresent) {
		return 2000*dayPresent;
	}
	
	

}
