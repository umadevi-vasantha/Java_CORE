package com.core.pattern.code;

/*PATTERN1
 *     *
 *     * *
 *     * * * 
 *     * * * *
 *     * * * * *
 *     * * * * * *  
 * 
 * 
 * Step1: Find the number of rows
 * Step2: Find the number of col in each row
 * Step3: What needs to be printed
 * 
 * 
 * PATTERN2
 *      * * * * *
 *      * * * * *
 *      * * * * *
 *      * * * * *
 *      * * * * *
 * 
 * 
 * 
 */

public class Pattern1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("==========PATTERN 1=============");
		pattern1(5);
		System.out.println("==========PATTERN 2=============");
		pattern2(6);// pass any value as n
		

	}
	
	static void pattern1(int n) {
		for(int row =1; row<=n ;row++) {
			for(int col=1; col<=row; col++) {
				System.out.print("* ");
			}
			System.out.println("\n");
		}
	}
	
	static void pattern2(int n) {
		for (int row= 1; row<=n; row++) {
			for (int col=1; col<=n; col++) {
				System.out.print("* ");
			}
			System.out.println("\n");
		}
	}

}
