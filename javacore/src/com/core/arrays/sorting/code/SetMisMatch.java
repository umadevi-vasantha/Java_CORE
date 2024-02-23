package com.core.arrays.sorting.code;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class SetMisMatch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] arr = {1,2,2,4};
		cyclicSort(arr);
		System.out.println(Arrays.toString(arr));
		System.out.println(findDuplicate(arr));

	}
	
	static void cyclicSort(int[] arr) {
		int i=0;
		while(i<arr.length) {
		
			int correct = arr[i]-1;
			if(arr[i]<arr.length && arr[i]!=arr[correct]) {
				swap(arr,i,correct);
			}
			else {
				i++;
			}
		}
		
	}
	
	static List<Integer> findDuplicate(int[] arr) {
		ArrayList<Integer> ans= new ArrayList<Integer>();
 		for(int i=0; i<arr.length;i++) {
		if (arr[i]!=i+1) {
			ans.add(arr[i]);
			ans.add(i+1);
		}
		}
		return ans;
	}
	
	static void swap(int[] arr, int first, int second) {
        int temp = arr[first];
        arr[first] = arr[second];
        arr[second] = temp;
    }

}
