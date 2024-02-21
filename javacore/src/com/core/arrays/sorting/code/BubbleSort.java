package com.core.arrays.sorting.code;

import java.util.Arrays;

public class BubbleSort {
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//int[] arr = {3,4,5,67,90,90,89,100,-1,-2};
		int[] arr = {1,2,3,4,5,6,7};
		bubbleSort(arr);
		
		System.out.println(Arrays.toString(arr));

	}
	
	static void bubbleSort(int[] arr) {
		for (int i =0 ; i < arr.length-1 ; i++) {
			boolean swapped= false;
			for(int j=1; j < arr.length-1-i ; j++) {
				if(arr[j]< arr[j-1]) {
					int temp = arr[j];
					arr[j] = arr[j-1];
					arr[j-1]= temp;
					swapped = true;
				}
				
			}
			if (!swapped==true) {
				System.out.println("Sorted Array");
				break;
			}
			
			
		}
	}

}
