package com.core.arrays.code;

import java.util.Arrays;

public class SumPair {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = {1,4,3,5,8,6};
		int target = 8;
		
//		//time complexity is more
//		for(int i=0;i<arr.length;i++) {
//			for(int j=i+1 ; j<arr.length ;j++) {
//				if(arr[i]+arr[j]==target) {
//					System.out.println("i "+i+"j "+j);
//				}
//				continue;
//			}
//		}
		
		for(int i=0;i<arr.length;i++) {
			int result= target-arr[i];
			if(Arrays.asList(arr).contains(result)) {
				System.out.println("Pair found at i"+i+" "+arr[i]);
			}
			
		}

	}

}
