package ds.arrays.section3;

/*
 * Remove Duplicates from Sorted Array - LeetCode 26
Given a sorted array nums, remove the duplicates in-place such that each element appears only once and returns the new length. Do not allocate extra space for another array; you must do this by modifying the input array in-place with O(1) extra memory.

Example:

Input: nums = [1, 1, 2] 
Output: 2
 */
import java.util.Arrays;

public class RemoveDuplicatesSortedArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] myarray = {1,1,2};
		int[] myarray1= {1,1,2,3,4,4,5,5,6,7,8,8};
		System.out.println(removeDuplicates(myarray));
		System.out.println(removeDuplicates(myarray1));
		

	}

	public static int removeDuplicates(int[] nums) {
        //TODO
		int i=0;
		for(int j=1;j<nums.length;j++) {
			if(nums[i]!=nums[j]) {
				i++;
				nums[i]=nums[j];
			}
		}
		System.out.println(Arrays.toString(nums));
		System.out.println(Arrays.toString(Arrays.copyOf(nums, i+1)));
		return i+1;
    }
}
