package com.core.arrays.sorting.code;

import java.util.Arrays;

public class CyclicSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = {10,1,4,5,3,2,6,7,8,9};
		
		cyclicSort(arr);

		System.out.println("Sorted Array"+ Arrays.toString(arr));
	}
	
	static void cyclicSort(int[] arr) {
		int i=0;
		while(i<arr.length) {
			int correct = arr[i]-1;
			if(arr[i]!=arr[correct]) {
				swap(arr,i, correct);
			}
			else {
				i++;
			}
		}
	}
	
	static void swap(int[] arr, int index1, int index2) {
		int temp= arr[index1];
		arr[index1]= arr[index2];
		arr[index2]=temp;
		
	}

}
