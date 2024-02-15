package com.core.arrays.code;
/*
 * Ceiling: The ceiling of a target value in a sorted array is the smallest element in the array that is greater than or equal to the target value.
 * If the target value is present in the array, the ceiling is the target value itself.
 * 
 * Floor: The floor of a target value in a sorted array is the largest element in the array that is less than or equal to the target value.
 * If the target value is present in the array, the floor is the target value itself.
 */
public class CeilingFloorSearch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] asc_arr= {-3,-1,2,5,6,7,8,10,900, 90000};
		int[] des_arr= {90000, 8999, 878, 8,0, -1, -2, -4};
		int target1=909;
		int target2=876;
	
		boolean result1 = asc_arr[0]<asc_arr.length-1;
		boolean result2 = des_arr[0]<des_arr.length-1;
		System.out.println("Celing Element found at "+asc_arr[findCeiling(asc_arr,target1,result1)]);
		System.out.println("Celing Element found at "+des_arr[findCeiling(des_arr,target2,result2)]);
		System.out.println("Floor Element found at "+asc_arr[findFloor(asc_arr,target1,result1)]);
		System.out.println("Florr Element found at "+des_arr[findFloor(des_arr,target2,result2)]);
	}

	
	static int findCeiling(int[] arr, int target,boolean result) {
		
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
		if(result) {
		return start;}
		else {
			return end;
		}
		
	}
	
static int findFloor(int[] arr, int target,boolean result) {
		
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
		if(result) {
		return end;}
		else {
			return start;
		}
		
	}

}
