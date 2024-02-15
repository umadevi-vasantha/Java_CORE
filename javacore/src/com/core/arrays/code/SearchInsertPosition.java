package com.core.arrays.code;
//Check if the element is there in Array if present return the index position .. if not found return the index position where it will be added in the sorted array
//Leetcode Problem : Easy
public class SearchInsertPosition {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] arr= {0,1,3};
		int search= 1;
		int insert=4;
		int insert2= 2;
		System.out.println(searchInsertPosition(arr,search));
		System.out.println(searchInsertPosition(arr,insert));
		System.out.println(searchInsertPosition(arr,insert2));
	}

	static int searchInsertPosition(int[] arr, int target) {
		int start=0;
		int end= arr.length-1;
		while(start<=end) {
			int mid=start+(end-start)/2;
			if(arr[mid]==target) {
				return target;
			}else if(arr[mid]>target) {
				end= mid-1;
			}else {
				start=mid+1;
			}
		}
		return end+1;
	}
}
