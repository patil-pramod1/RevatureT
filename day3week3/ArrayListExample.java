package com.revature.collection;

import java.util.*;

public class ArrayListExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<String> Movies=new ArrayList<>();
		Movies.add("Avengers:endgame");
		Movies.add("Ironman");
		Movies.add("SpiderMan");
		Movies.add("John Wick");
		Movies.add("Fast And Furious");
		Collections.sort(Movies);
		
		for(String movie:Movies) {
			System.out.println(movie);
		}
		

	}

}
