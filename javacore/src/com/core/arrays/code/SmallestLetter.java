package com.core.arrays.code;


///finding the smallest letter greater than target
//Input ={"c","f","j"}, target ="a"
//Output= "c"
//given the characters are sorted in ascending order
public class SmallestLetter {
	
	public static void main(String[] args) {
		char[] arr= {'c','f','j'};
		//uncomment and check 
		//char target = 'c';
		//char target ='f'
		//char target = 'j';
		char target ='m';
		System.out.println("Character greater than target is found at index "+searchLetter(arr,target)+ "And the charcter is "+
		arr[searchLetter(arr,target)]);
	}
	
	static int searchLetter(char[] arr, char target) {
		
		int start=0;
		int end = arr.length-1;
		while(start<= end) {
			int mid = start + (end-start)/2;
			
			if(arr[mid]>target) {
				end=mid-1;
			}
			else {
				start=mid+1;
			}
			
			
		}
		//words wrap if the elemesnt is not found return the first element
		return start%arr.length;
		
	}

}
