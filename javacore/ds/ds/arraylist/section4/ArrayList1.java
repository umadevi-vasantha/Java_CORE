package ds.arraylist.section4;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ArrayList1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<String> mylist =new ArrayList<>();
		mylist.add("Umadevi");
		mylist.add("Sunil");
		mylist.add("Vasantha");
		mylist.add("Ravi");
		System.out.println(mylist);
		int initialCapacity=20;
		ArrayList<String> mylist1= new ArrayList<>(initialCapacity);
		System.out.println(mylist1);
		//Time complexity: O(1)
		//Space complexity: O(1)
		mylist1.add("Uma");
		mylist1.add("Ammu");
		System.out.println(mylist1);
		//Time complexity : O(N)
		//Space complecity : O(1)
		mylist1.add(1,"Pilla");
		//This will raise a Array Index out of bound exception.
		//mylist1.add(4,"Devi");
		System.out.println(mylist1);
		ArrayList<Integer> mylist2 = new ArrayList<>(List.of(1,2,3,4,5,6));
		System.out.println(mylist2);
		//Time complexity: O(1)
		//Space complexity: O(1)
		System.out.println(mylist2.get(5));
		System.out.println(mylist2.get(0));
		//Travesing elements in Arraylist
		//Time complexity : O(N)
		//Space complecity: O(1)
		for (int i=0; i<mylist2.size();i++) {
			System.out.println(mylist2.get(i));
		}
		
		for(int arr: mylist2) {
			System.out.println(arr);
		}
		
		Iterator<Integer> itr= mylist2.iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
		
		//Searching element in ArrayList
		//Time complexity: O(N)
		//Space complexity: O(1)
		for(int arr: mylist2) {
			if(arr==3) {
				System.out.println("Element found");
				break;
			}
			else {
				System.out.println("element not found");
			}
		}
		//indexof
		int index= mylist2.indexOf(9);
		System.out.println("Element found at "+ index);
		boolean index1= mylist2.contains(6);
		System.out.println(index1);
		//Time complexity : O(n)
		//space complexity : o(1)
		mylist2.remove(5);
		//time complexity : o(n)
		// space complexity : o(1)
		mylist2.remove(Integer.valueOf(1));
		System.out.println(mylist2);
	}

}
