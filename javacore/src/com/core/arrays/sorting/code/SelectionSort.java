package com.core.arrays.sorting.code;

import java.util.Arrays;

public class SelectionSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr= {4,5,6,7,8,1,3,2,2};
		System.out.println("Maximum element found at " +findMaxElement(arr,0,8));
		selectionSort(arr);
		System.out.println("Sorted elemets using selection sort"+Arrays.toString(arr));
		

	}
	
	
	static void selectionSort(int[] arr) {
		for(int i=0; i<arr.length; i++) {
			int last= arr.length-i-1;
			int maxIndex = findMaxElement(arr,0,last);
			System.out.println("The Element at " + last + "and "+ maxIndex + "is swapped");
			swap(arr,maxIndex,last);
		}
	}
	
	static int findMaxElement(int[] arr , int start , int end){
		int max=start;
		for(int i=start;i<=end;i++) {
			if (arr[max]<=arr[i]) {
				max= i;
				
			}
		}
		return max;
		
	}
	
	static void swap(int[] arr, int index1, int index2) {
		int temp= arr[index1];
		arr[index1]=arr[index2];
		arr[index2]=temp;
		
	}

}
