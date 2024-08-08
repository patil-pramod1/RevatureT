package com.eligibility.exception;

public class Person1 {
	private int age;

	public Person1() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Person1(int age) {
		super();
		this.age = age;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}
	public String aged(int age) throws InvalidAgeException1{
		if(age<60) {
			throw new InvalidAgeException1();
		}else {
			return "Eligible";
		}
		
	}

}
