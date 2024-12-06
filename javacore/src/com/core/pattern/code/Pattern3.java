package com.core.pattern.code;

public class Pattern3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("=======PATTERN 5========");
		pattern5(5);
		System.out.println("=======PATTERN 6========");
		pattern6(6);
		System.out.println("=======PATTERN 7========");
		pattern7(5);
		System.out.println("=======PATTERN 8========");
		pattern8(7);
		
		//pattern9(4);

	}

	
	static void pattern5(int n) {
		for(int row=1; row<=(2*n)-1; row++) {
			int colfin = row > n ? 2*n-row-1 : row ;
			for(int col=1; col <= colfin; col++) {
				System.out.print("# ");
			}
			System.out.println("\n");
		}
	}
	
	
	static void pattern6(int n) {
		for(int row=1; row<=(2*n)-1; row++) {
			int colfin = row > n ? 2*n-row-1 : row ;
			int spaces = n-colfin;
			for(int s=1; s<=spaces ; s++) {
				System.out.print(" ");
			}
			for(int col=1; col <= colfin; col++) {
				System.out.print("# ");
			}
			System.out.println("\n");
		}
	}
	
	static void pattern7(int n) {
		for(int row =1 ; row<=n; row++){
			int spaces = n-row;
	
			for(int s=1;s<=spaces;s++) {
				System.out.print("  ");
			}
			
			for(int col=row; col>=1;col--) {
				
				System.out.print(col+" ");
			}
			for(int col=2; col<=row; col++) {
				System.out.print(col+" ");
			}
			System.out.println("\n");
			
		}
	}
	
	static void pattern8(int n) {
		for(int row =1 ; row<=(2*n)-1; row++){
			
			int colfin = row > n ? 2*n-row-1 : row ; 
			int spaces = n-colfin;
			for(int s=1;s<=spaces;s++) {
				System.out.print("  ");
			}
			
			for(int col=colfin; col>=1;col--) {
				
				System.out.print(col+" ");
			}
			for(int col=2; col<=colfin; col++) {
				System.out.print(col+" ");
			}
			System.out.println("\n");
			
		}
	}
	
//	static void pattern9(int n) {
//		for(int row =1 ; row<=(2*n)-1; row++){
//			
//			//int colfin = row > n ? 2*n-row-1 : row ; 
//			
//			
//			for(int col=1; col>=(2*n)-1;col++) {
//				
//				System.out.print(col+" ");
//			}
//			
//			System.out.println("\n");
//			
//		}
//	}
// Brute force	
//	static void pattern8(int n) {
//		for(int row =1 ; row<=n; row++){
//			int spaces = n-row;
//			for(int s=1;s<=spaces;s++) {
//				System.out.print("  ");
//			}
//			
//			for(int col=row; col>=1;col--) {
//				
//				System.out.print(col+" ");
//			}
//			for(int col=2; col<=row; col++) {
//				System.out.print(col+" ");
//			}
//			System.out.println("\n");
//			
//		}
//		for( int row=n; row>=1 ; row--) {
//			int spaces = n-row;
//			for(int s=1;s<=spaces;s++) {
//				System.out.print("  ");
//			}
//			
//			for(int col=row; col>=1;col--) {
//				
//				System.out.print(col+" ");
//			}
//			for(int col=2; col<=row; col++) {
//				System.out.print(col+" ");
//			}
//			System.out.println("\n");
//			
//		}
//			
//		
//	}
}
