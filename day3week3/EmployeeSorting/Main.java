package com.employeeSorting;

import java.util.*;

public class Main  {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Employee> employees = new ArrayList<>();
		employees.add(new Employee(1,"Pramod",7500));
		employees.add(new Employee(2,"narayan",8500));
		employees.add(new Employee(3,"Pramod1",7500));
		employees.add(new Employee(4,"narayan1",8500));
		
		 System.out.println("Original employees:");
	        for (Employee emp : employees) {
	            System.out.println(emp);
	        }

	        // Sorting by empId
	        Collections.sort(employees, new SortByEmpId());
	        System.out.println("\nSorted by empId:");
	        for (Employee emp : employees) {
	            System.out.println(emp);
	        }

	        // Sorting by empName
	        Collections.sort(employees, new SortByEmpName());
	        System.out.println("\nSorted by empName:");
	        for (Employee emp : employees) {
	            System.out.println(emp);
	        }

	        // Sorting by empSalary
	        Collections.sort(employees, new SortByEmpSalary());
	        System.out.println("\nSorted by empSalary:");
	        for (Employee emp : employees) {
	            System.out.println(emp);

	}
	}

}
