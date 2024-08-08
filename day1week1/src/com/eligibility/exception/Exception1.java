package com.eligibility.exception;

public class Exception1 {

	public static void main(String[] args) throws InvalidAgeException1 {
		// TODO Auto-generated method stub
		Person1 P1 =new Person1();
		P1.setAge(20);
		System.out.println(P1.aged(P1.getAge()));

	}

}
