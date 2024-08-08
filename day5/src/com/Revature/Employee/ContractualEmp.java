package com.Revature.Employee;

public class ContractualEmp {
	private int empId;
	private String empName;
	private int hoursPresent;
	public ContractualEmp() {
		super();
		// TODO Auto-generated constructor stub
	}
	public ContractualEmp(int empId, String empName, int dayPresent) {
		super();
		this.empId = empId;
		this.empName = empName;
		this.hoursPresent = dayPresent;
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
		return hoursPresent;
	}
	public void setDayPresent(int dayPresent) {
		this.hoursPresent = dayPresent;
	}
	public int Salary(int dayPresent) {
		return 200*dayPresent;
	}
	
	

}
