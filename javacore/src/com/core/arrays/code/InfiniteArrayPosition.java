package com.core.arrays.code;
/*
 * Finding the index of the target element in infinte sorted array
 */
public class InfiniteArrayPosition {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr= createInfiniteSortedArray();
		int target =42;
		int position =range(arr, target);
		System.out.println("Element is found at position" + position);
	}
	
	static int range(int[] arr, int target) {
		int start =0;
		int end = 1;
		
		while(target>arr[end]) {
			int temp=end+1;
			//end=end+(end-start+1)*2;
			end=end*2;
			start =temp;
			
		}
		return binarySearch(arr,target, start, end);
	}
	
	static int binarySearch(int[] arr, int target, int start , int end) {
		while(start<=end) {
			int  mid = start +(end-start)/2;
			if(arr[mid]>target) {
				end=mid-1;
			}else if(arr[mid]<target) {
				start=mid+1;
			}else {
				return mid;
			}
		}
		return -1;
	}
	//Just creating a InfiniteSortedArray;
	static int[] createInfiniteSortedArray() {
		int[] arr =new int[1000];
		for(int i=0; i<1000;i++) {
			arr[i] = i*2;
		}
		return arr;
	}

}
