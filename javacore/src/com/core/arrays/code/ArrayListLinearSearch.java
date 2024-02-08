package com.core.arrays.code;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ArrayListLinearSearch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ArrayList<Integer> intlist =new ArrayList<>(List.of(3,5,90,90,87));
		
		//int target =200;
		System.out.println("Enter the Element to search");
		Scanner sc =new Scanner(System.in);
		int target = sc.nextInt();
		
		int index=linearSearch(intlist ,target);
		
		if(index == -1) {
			System.out.println("Element not found");
		}
		else {
			System.out.println("Element found at index "+ index);
		}
		
		
		/*
		 * Best Case (O(1)): Linear search is most efficient when the target element is found at the beginning of the collection, requiring only one comparison.

		   Worst Case (O(n)): In the worst case, linear search may need to traverse the entire collection, making comparisons for each element, resulting in linear time complexity proportional to the number of elements
		 */

	}
	
	public static int linearSearch(ArrayList<Integer> intlist, int target) {
		
		for(int i=0;i<intlist.size();i++) {
			if(intlist.get(i).equals(target)) {
				return i;
			}
			
		}
		return -1;
		
	}

}
