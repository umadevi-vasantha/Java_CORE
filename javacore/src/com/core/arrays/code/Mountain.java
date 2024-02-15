package com.core.arrays.code;
//Find the peak index , which is the index where moutain starts descending
//Input : arr = [0,1,3,5,4,-1,-2]
//Output : 3
public class Mountain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = {0,1,3,5,6,4,-1,-2};
		System.out.println(findPeakIndex(arr));

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
