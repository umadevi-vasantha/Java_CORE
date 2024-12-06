package ds.arrays.section3;

import java.util.Arrays;

public class MaxAndMin {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] myarray= {1,2,5,89,0,100,99};
		System.out.println(Arrays.toString(maxAndmin(myarray)));

	}
	
	public static int[] maxAndmin(int[] nums) {
		int max=nums[0];
		int min=nums[0];
		for(int i=1; i< nums.length;i++) {
			if(nums[i]>max) {
				max=nums[i];
			}else if(nums[i]<min) {
				min=nums[i];
			}
		}
		return new int[] {max, min};
	}

}
