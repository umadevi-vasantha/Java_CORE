package com.core.arrays.code;

public class Findmin {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] arr = {18,98,9,8,9,76,8798,909};
		System.out.println("Minimum number in the array is "+min(arr));
		System.out.println("Maximum number in the array is "+max(arr));
		
		int[][] arr2d ={
				{1,2,3},
				{98,98,100},
				{67,78,90}
		};
		
		System.out.println("Minimum in 2d array is "+ min2d(arr2d));
		System.out.println("Maximum in 2d array is "+max2d(arr2d));
		

	}

	
	static int min(int[] arr){
		int min=arr[0];
		for(int value:arr) {
			if(value<min) {
				min=value;
			}
		}
		return min;
		
	}
	
	static int max(int[] arr) {
		int max=arr[0];
		for(int value:arr) {
			if(value>max) {
				max=value;
			}
		}
		return max;
	}
	
	static int min2d(int[][] arr) {
		int min=arr[0][0];
		for(int row=0; row <arr.length;row++) {
			for(int col=0 ; col<arr[row].length;col++) {
				if(arr[row][col]<min) {
					min=arr[row][col];
				}
			}
		}
		return min;
	}
	
	static int max2d(int[][] arr) {
		int max=arr[0][0];
		for(int row=0; row <arr.length;row++) {
			for(int col=0 ; col<arr[row].length;col++) {
				if(arr[row][col]>max) {
					max=arr[row][col];
				}
			}
		}
		return max;
	}
}


