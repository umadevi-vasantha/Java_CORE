package com.core.arrays.code;

import java.util.ArrayList;
import java.util.Scanner;

public class Print2dArrayList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc= new Scanner(System.in);
		ArrayList<ArrayList<Integer>> arrlist = new ArrayList<>();
		System.out.println(arrlist);
		System.out.println("Enter the Elements that needs to added to the ArrayList");
		for (int i = 0; i<3 ;i++) {
			arrlist.add(new ArrayList<Integer>());
		}
		System.out.println(arrlist);
		
		for (int i=0 ; i<3 ;i++) {
			for (int j=0 ;j<3 ;j++) {
				arrlist.get(i).add(sc.nextInt());
			}
		}
	  
		System.out.println(arrlist);
	}

}
