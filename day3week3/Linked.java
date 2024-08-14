package com.revature.collection;

import java.util.*;

public class Linked {
	public static void main(String[] args) {
		List<String> Team = new LinkedList<>();
		Team.add("pramod");
		Team.add("narayan");
		Team.add("pranav");
		Team.add(2,"raghav");
		Team.addLast("harshith");
		System.out.println(Team);
		for(int i=0;i<Team.size();i++) { // 
			  System.out.println(Team.get(i)); //
		  }
	
		for(String i:Team) {
			System.out.println(i);
		}
		
		Iterator<String> myite = Team.iterator();
		while(myite.hasNext()) {
			String element = myite.next();
          System.out.println(element);
		}
	}

}
