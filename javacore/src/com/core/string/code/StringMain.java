package com.core.string.code;

public class StringMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String a ="Uma";
		String b ="Uma";
		//both a and b will be saved pointing to same object as it is stored in String Pool/ String interning
		//And the string object stored String is Immutable
		// == and .equals comparators
		System.out.println(a==b); // return true 
		//== operator on string will check if both string ref and pointing to same object
		
		//In Case we need to want a string not be created in String Pool we have to use new keyword
		String str1= new String();
		String str2= new String();
		/*
		 * As we used new keyword the string is not created in string pool and interning doesn't takes plac.Hence both ref variables str1 and str2 will be 
		 * pointing to 2 differnt objects. we can check that using == operator
		 *  
		 */
		System.out.println(str1==str2);// return false
		
		/*
		 * What if we need to compare the content not if ref variable is pointing same object
		 * then we can use .equals
		 */
		System.out.println(str1.equals(str2)); //true
		System.out.println(a.equals(b));//true
		
		//Now to explicity move string created in heap we can use intern() method
		String str3= new String("Uma");
		//Before interning
		System.out.println(str3==a);//false
		//After interning
		str3=str3.intern();
		System.out.println(str3==a);//true
		

	}

}
