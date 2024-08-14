package com.revature.collection;

import java.util.*;

public class Setexamples {
	public static void main(String[] args) {
		Set<String> employeeset=new HashSet<>();
		Set<String> employeeset1=new TreeSet<>();
		Set<String> employeeset2=new LinkedHashSet<>();
		employeeset2.add("pramod");
		employeeset2.add("pramod");
		employeeset2.add("pramod1");
		employeeset2.add("pramod1");
		
		System.out.println(employeeset2);
		
		
	}

}
