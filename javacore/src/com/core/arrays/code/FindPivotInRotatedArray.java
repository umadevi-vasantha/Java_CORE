package com.core.arrays.code;

public class FindPivotInRotatedArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr= {5,6,7,8,9,10,0,1,2,3,4};
		System.out.println(findPivot(arr));

	}
	
	
	static int findPivot(int[] arr) {
		
		int start=0;
		int end=arr.length-1;
		while(start<=end) {
			int mid=start+(end-start)/2;
			if(mid<end && arr[mid]>arr[mid+1]) {
				return mid;
			}
			if(mid>start && arr[mid]<arr[mid-1]) {
				return mid-1;
			}
			if(arr[mid]<=arr[start]) {
				end= mid-1;			
			}else {
				start=mid+1;
			}
		}
		return -1;
		
	}
}
