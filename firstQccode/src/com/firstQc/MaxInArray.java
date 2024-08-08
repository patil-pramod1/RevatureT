package com.firstQc;
import java.util.*;

public class MaxInArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int[] arr= new int[3];
		for(int i=0;i<3;i++) {
			arr[i]=sc.nextInt();
		}
		int max=0;
		for(int i=0;i<3;i++) {
			if(arr[i]>max) {
				max=arr[i];
			}
		}
		System.out.println(max);
		sc.close();

	}

}
