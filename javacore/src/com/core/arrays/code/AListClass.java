package com.core.arrays.code;

import java.util.ArrayList;
import java.util.List;

public class AListClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Decalaration and instantiation with Default constructor
				ArrayList<String> myList = new ArrayList<>();
				System.out.println(myList);//empty ArrayList
				myList.add("Umadevi");//adding elements into arraylist
				myList.add("sunil");new ArrayList<>();
				System.out.println(myList);
				myList.add(2, "Sunil");
				System.out.println(myList.contains("Umadevi"));
				System.out.println(myList.get(0));
				System.out.println(myList.lastIndexOf(myList));
				myList.remove(0);
				System.out.println(myList);
				ArrayList<String> myList2= (ArrayList<String>) myList.clone();
				System.out.println(myList2);
				myList.clear();
				System.out.println(myList);
				
				//Declaration with initial capacity
				int initialCapacity =20 ;
				ArrayList<String> list1= new ArrayList<>(initialCapacity);
				//Declaration with initialization 
				ArrayList<String> list2 = new ArrayList<>(List.of("Java","SpringBoot","Microservice"));
				System.out.println(list2);
			    		

	}

}
