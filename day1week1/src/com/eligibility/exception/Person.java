package com.eligibility.exception;

public class Person {
	private int age;
	private String name;
	public Person() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Person(int age, String name) {
		super();
		this.age = age;
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String eligibilityToVote(int age) throws InvalidAgeException {
	    if (age < 18) {
	        throw new InvalidAgeException();
	    } else  {
	        return "Eligible to vote";
	    } 	
	}

}
