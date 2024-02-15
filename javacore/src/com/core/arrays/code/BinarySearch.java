package com.core.arrays.code;

public class BinarySearch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Considering it is array sorted in ascending order
		int[] arr = {89,89,90,100,200,878,9000,10002};
		int target = 878;
		int result = binarySearch(arr,target);
		
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
			
			if(arr[mid]>target) {
				end= mid-1;
			}
			else if(arr[mid]<target) {
				start = mid+1;
			}
			else {
				return mid;
			}
		}
		return -1;
		
	}

}
