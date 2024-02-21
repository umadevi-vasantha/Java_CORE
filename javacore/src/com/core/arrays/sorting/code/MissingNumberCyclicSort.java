package com.core.arrays.sorting.code;
//Range is 0-N for cyclic sort
import java.util.Arrays;

public class MissingNumberCyclicSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr= {3,1,0};
		cyclicsort(arr);
		System.out.println(Arrays.toString(arr));
		System.out.println(missingNumber(arr));
	}
	
	static void cyclicsort(int[] arr) {
		int i=0;
		while(i<arr.length) {
			int correct= arr[i];
			if(arr[i]<arr.length && arr[i]!=arr[correct]) {
				swap(arr,i, correct);
			}else {
				i++;
			}
		}
	}
	
	static void swap(int[] arr, int index0,int  index1) {
		int temp= arr[index0];
		arr[index0]= arr[index1];
		arr[index1]=temp;
	}

	static int missingNumber(int[] arr) {
		int ans=-1;
		for (int i=0; i<arr.length;i++) {
			if(i!=arr[i]) {
				ans=i;
			}
		}
		return ans;
	}
	
}
