package com.core.arrays.code;

public class OrderAugnosticBinarySerach {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        /*
         * An order-agnostic binary search is a variation of the traditional binary search algorithm that works on both ascending and descending order sorted arrays. 
         */
		int[] asc_arr= {-3,-1,2,5,6,7,8,10,900, 90000};
		int[] des_arr= {90000, 8999, 878, 8,0, -1, -2, -4};
		int target1=900;
		int target2=8;
	
		boolean result1 = asc_arr[0]<asc_arr.length-1;
		boolean result2 = des_arr[0]<des_arr.length-1;
		System.out.println("Element found at "+binarySearch(asc_arr,target1,result1));
		System.out.println("Element found at "+binarySearch(des_arr,target2,result2));
	}

	
	static int binarySearch(int[] arr, int target,boolean result) {
		
		int start = 0;
		int end =arr.length-1;
		while(start<=end) {
			int mid = start + (end-start)/2;
			
			
			if (arr[mid]==target) {
				return mid;
			}
			if(result) {
			if(arr[mid]>target) {
				end= mid-1;
			}
			else if(arr[mid]<target) {
				start = mid+1;
			}
			}
			else {
				if(arr[mid]<target) {
					end= mid-1;
				}
				else if(arr[mid]>target) {
					start = mid+1;
				}
			}
			
		}
		return -1;
		
	}

}
