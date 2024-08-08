package com.Revature.Employee;

public class EmployeeSlaray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SalariedEmp se = new SalariedEmp(101,"pramod",22);
		System.out.println("Salary :"+se.Salary(se.getDayPresent()));
		ContractualEmp ce = new ContractualEmp(102,"prashant",200);
		System.out.println("Salary :"+ce.Salary(ce.getDayPresent()));

	}

}
