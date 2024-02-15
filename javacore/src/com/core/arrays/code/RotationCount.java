package com.core.arrays.code;

public class RotationCount {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = {5,6,7,8,10,12,14,0,1,2,3,4};
		//System.out.println(findPivot(arr));
		System.out.println("Rotation Count = "+(findPivot(arr)+1));

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
			if(arr[mid]>=arr[start]) {
				start= mid+1;
				
			}else {
				end= mid-1;
			}
		}
		return -1;
		
	}

}
