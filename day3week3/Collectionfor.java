package com.revature.collection;

import java.util.*;

public class Collectionfor {
	public static void main(String[] args) {
		List<String> TeamC=new ArrayList<>();
		TeamC.add("Pramod");
		TeamC.add("vardan");
		TeamC.add("Madhav");
		TeamC.add("Jayesh");
		
		System.out.println(TeamC);
		
		
		  for(int i=0;i<TeamC.size();i++) { // 
			  System.out.println(TeamC.get(i)); //
		  }
	
		for(String i:TeamC) {
			System.out.println(i);
		}
		
		Iterator<String> myite = TeamC.iterator();
		while(myite.hasNext()) {
			String element = myite.next();
            System.out.println(element);
		}
		
	}

}
