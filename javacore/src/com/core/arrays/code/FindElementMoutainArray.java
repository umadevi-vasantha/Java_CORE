package com.core.arrays.code;

public class FindElementMoutainArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] arr = {10,20,35,56,90,101,50,34,22,1,0, -3,-10};
		int target =20;
		
		int result= findPeakIndex(arr);
		int indexOftarget= binarySearch(arr,target,0,result,true);
		if(indexOftarget!=-1) {
			
			indexOftarget=indexOftarget;
		}
		else {
		indexOftarget=binarySearch(arr,target,result,arr.length-1,false);
		}
		System.out.println("Element found at index"+ indexOftarget);

	}
	
	static int binarySearch(int[] arr, int target , int start, int end, boolean isStart) {
		while(start<=end) {
			int mid= start +(end-start)/2;
			if(arr[mid]==target) {
				return mid;
			}
			if(isStart) {
				if(arr[mid]>target) {
					end= mid-1;
					
				}else if(arr[mid]<target){
					start= start+1;
				}
				
			}else {
				if(arr[mid]<target) {
					end= mid-1;
					
				}else if(arr[mid]>target){
					start= start+1;
				}
			}
			
			
		}
		return -1;
	}
	
	static int findPeakIndex(int[] arr) {
		int start = 0;
		int end = arr.length-1;
		
		while(start<end) {
			int mid = start+(end-start)/2;
			if(arr[mid]<arr[mid+1]) {
				start=mid+1;
			}else {
				end=mid;
			}
		}
		return start;
	}

}
