package com.core.arrays.code;

public class ElementInRotatedArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub



		int[] arr= {5,6,7,8,9,10,0,1,2,3,4};
		int target =0;
	
		//System.out.println(findPivot(arr));
		System.out.println(findElement(arr,target,findPivot(arr)));

	}


	static int findElement(int[] arr, int target, int pivot) {
		if(arr[pivot]==target) {
			return pivot;
		}
		else if(target>arr[0]) {
			return binarySearch(arr,target,0, pivot-1);
		}else {
			return binarySearch(arr, target, pivot+1, arr.length-1);
		}
	}

	private static int binarySearch(int[] arr, int target, int start, int end) {
		// TODO Auto-generated method stub
		while(start<=end) {
			int mid=start+(end-start)/2;
			if(arr[mid]==target) {
				return mid;
			}else if(arr[mid]>target) {
				end=mid-1;
			}else {
				start=mid+1;
			}
		}
		return -1;
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
