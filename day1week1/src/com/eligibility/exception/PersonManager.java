package com.eligibility.exception;

public class PersonManager {
	public static void main(String[] args) {
		Person person = new Person();
		Person person1 = new Person();
		person.setName("Pramod");
		try {
		person.setAge(20);
		person1.setAge(10);
		}
		catch(Exception e) {
			e.getMessage();
		}
		String eligiblity="Not Eligible";
		eligiblity = person.eligibilityToVote(person.getAge());
		System.out.println("Eligibility to Vote : "+eligiblity);
		eligiblity = person1.eligibilityToVote(person1.getAge());
		System.out.println("Eligibility to Vote : "+eligiblity);
	}

}

