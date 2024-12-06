package ds.arrays.section3;

public class LargestElement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] myArray= {1,2,58,90,101,78,67};
		System.out.println(findLargestElement(myArray));

	}
	public static int findLargestElement(int[] nums) {
		int max=nums[0];
		for(int i=1;i<nums.length;i++) {
			if(nums[i]>max) {
				max=nums[i];
			}
		}
		return max;
		
	}

}
