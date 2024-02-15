package com.core.arrays.code;

public class BinarySearchDescending {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Considering the array is sorted in descending order
		int[] arr = {908823, 8900, 7879, 900, 89, 0,-1, -2, -10};
		int target = 0;
		int result=binarySearch(arr, target);
		
		if (result == -1) {
			System.out.println("Element not found");
		}
		else {
			System.out.println("Element found at index "+ result);
		}
		
	}

	
	static int binarySearch(int[] arr, int target) {
		
		int start = 0;
		int end =arr.length-1;
		while(start<=end) {
			int mid = start + (end-start)/2;
			
			if(arr[mid]<target) {
				end= mid-1;
			}
			else if(arr[mid]>target) {
				start = mid+1;
			}
			else {
				return mid;
			}
		}
		return -1;
		
	}

	

}
