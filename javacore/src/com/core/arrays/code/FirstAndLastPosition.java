package com.core.arrays.code;

import java.util.Arrays;

//Find the First and Last Position of element in sorted Array
//Input : [5,7,7,8,8,10],,target =8
//Output : [3,4]

public class FirstAndLastPosition {
	
	public static void main(String[] args) {
		int[] arr = {5,7,7,8,8,10};
		int target = 8;
		int[] ans= {-1,-1};
		long startTime = System.currentTimeMillis();
		int start=findFirstandLastPosition(arr,target,true);
		int end= findFirstandLastPosition(arr,target, false);
		long endTime = System.currentTimeMillis();
		long binarySearchTime = endTime-startTime;
		ans[0]=start;
		ans[1]=end;
		System.out.println("Result="+Arrays.toString(ans));
		System.out.println("BinarysearchTime "+binarySearchTime);
		
		
		long startTime1= System.currentTimeMillis();
		int start1 = searchFirstPosition(arr,target);
		int end1= searchLastPosition(arr, target);
		long endTime1= System.currentTimeMillis();
		long bruteforceTime= endTime1=startTime1;
		
		System.out.println("Result of Bruteforce technique "+ start1 + end1);
		System.out.println("BruteForce Time "+bruteforceTime);
	}
	
	//Lets try it with bruteforce method
	//Finding the first position of target element traversing from front
	//Finding the last position of target element traversing from end
	
	static int searchFirstPosition(int[] arr, int target) {
		for(int i=0;i<arr.length;i++) {
			if (arr[i]== target) {
				return i;
			}
		}
		return -1;
	}
	
	static int searchLastPosition(int[] arr, int target) {
		for(int i=arr.length-1;i>=0; i--) {
			if(target == arr[i]) {
				return i;
			}
		}
		return -1;
	}
	
	
	
	
	
	
	//With time complexity using binary search log(n) : log(n)+log(n)= 2log(n) which is equal log(n)
	static int findFirstandLastPosition(int[] arr, int target,boolean isStart) {
		int ans=-1;
		int start=0;
		int end=arr.length-1;
		
		while(start<=end) {
			int mid= start + (end-start)/2;
			if(arr[mid]==target) {
				ans= mid;
				if(isStart) {
					end= mid-1;
				}else {
					start=mid+1;
				}
				
			}else if(arr[mid]>target) {
				end= mid-1;
			}else {
				start=mid+1;
			}
		}
		return ans;
		
	}

}
