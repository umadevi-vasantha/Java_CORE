package ds.arrays.section3;

import java.util.Scanner;

public class CalculateAverageTemperature {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner console = new Scanner(System.in);
		System.out.println("Enter the total number of days");
		int noOfDays = console.nextInt();
		int sum=0;
		int[] arr = new int[noOfDays];
		for(int i=0; i<noOfDays ;i++) {
			System.out.println("Enter the "+ (i+1) +"Days Temperature");
			arr[i]=console.nextInt();
			
		}
		for(int i=0;i<noOfDays;i++) {
			sum+= arr[i];
		}
		float average= (sum/noOfDays);
		System.out.println("Average Temperature is "+ average);
		
		for(int i=0 ; i<noOfDays ;i++) {
			if(arr[i]> average) {
				System.out.println(" Day "+ (i+1) +" is having Temperature more than or equal to Average Temperature");
			}
		}
		
	}
	
	

}
