package com.core.string.code;

import java.util.ArrayList;

//Tried concatenation of string different Primitive and Non primitive data types
public class StringConcat {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//1. The + operator concatenates strings when both operands are strings
		//2. When one operand is a string and the other is a non-string type, the non-string operand is automatically converted to a string
		//3. If both Operands are non strings types, the '+' operator performs addition.
		String str1="Uma"+"devi";
		System.out.println(str1);
		String str2="Uma";
		System.out.println(str2+' '+'R');
		//Now lets try concat char
		System.out.println('a'+'b');
		//Null Handling
		//If one operand is 'null'. It is treated as the string 'null' during concatenation.
		System.out.println("Uma"+null+"devi");
		System.out.println("Uma"+'a');
		System.out.println("Uma" + new ArrayList<>());
		//Note : Operator + is defined for primitives or if any one of operands is primitive
		//Uncomment and check the error
		//System.out.println(new Integer(56)+ new ArrayList<>());
		System.out.println(new Integer(56)+" "+ new ArrayList<>());
		System.out.println((char)('c'+4));
		
	}

}
