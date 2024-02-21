package com.core.arrays.sorting.code;

import java.util.Arrays;

public class InsertionSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] arr = {4,6,7,8,-2,-1,20,10,12};
		insertionSort(arr);
		System.out.println("Sorted Array using insertion sort"+ Arrays.toString(arr));

	}
	
	static void insertionSort(int[] arr) {
		for (int i= 0; i<arr.length-1;i++) {
			for (int j=i+1 ; j>0 ; j--) {
				if(arr[j]<arr[j-1]){
					swap(arr, j , j-1);
					
				}else {
					break;
				}
			}
		}
	}
	
	static void swap(int[] arr, int index1, int index2) {
		int temp= arr[index1];
		arr[index1]=arr[index2];
		arr[index2]=temp;
	}

}