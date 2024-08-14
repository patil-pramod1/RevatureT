package com.revature.collection;

import java.util.*;

public class Hash {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashMap<String,Double> balance=new HashMap<String,Double>();
		balance.put("pramod", 5000.0);
		balance.put("pramod1", 3000.0);
		balance.put("pramod2", 2000.0);
		balance.put("pramod3", 6000.0);
		balance.put("pramod", 5030.0);
		
		Set<String> keys=balance.keySet();
		for(String key:keys) {
			System.out.println(key+" : "+balance.get(key));
		}
	}
}
