package com.core.string.code;

import java.util.HashMap;
import java.util.HashSet;

// 1. Reverse a string using StringBuilder and explain the difference in performance compared to using String.
// 2. Use StringBuilder to efficiently concatenate 1 to 100 numbers into a single string.
// 3. Implement a program to delete all spaces from a string using StringBuilder.
// 4. Remove extra Spaces
// 5. Write a function that takes a string and inserts a given character after every 'n' characters using StringBuilder
// 6. Replace all occurrences of a substring in a string with another substring using StringBuilder.
// 7. Write a program to capitalize the first letter of every word in a string using StringBuilder.
// 8. Using StringBuider, write a function to count and remove all duplicate characters in a string.
// 9. Create a program that repeatedly appends a substring to a string and compares the efficiency with using a plain string.
//10. Use StringBuilder to construct a string where each word in a sentence is reversed, but the word order remains the same.

public class StringBuilderCode {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		reverseString("Umadevi Sunil");
		System.out.println(concateString());
		System.out.println(removeAllSpace("String is a sequences of character used to     represent the textual data"));
		System.out.println("String Pool     :  String Interning  - String is Immutable");
		System.out.println(removeExtraSpace("String Pool     :  String Interning  - String is Immutable"));
		System.out.println(addCharacterAtNthPosition("abdcdefgh",'-',2));
//		System.out.println(replaceSubstring("umadevi","uma","UMA"));
		System.out.println(CamelCase("hello world! welcome to java programming."));
		System.out.println(CountAndRemoveDuplicate("hello world! welcome to java programming."));
		System.out.println(CountAndRemoveDuplicates("hello world! welcome to java programming."));
		compareStringAndStringBuilder("abc",100000);
		System.out.println(reverseword("hello world! welcome to java programming."));
		

	}
	
	static String reverseString(String inputString) {
		StringBuilder str1= new StringBuilder(inputString);
		str1= str1.reverse();
		System.out.println(str1);
		return str1.toString();	
	}
	
	static String concateString() {
		StringBuilder sb = new StringBuilder();
		for(int i=1;i<=100;i++) {
			sb.append(i);
			if(i<100) {
				sb.append(", ");
			}
		}
		
		return sb.toString();
	
	}
	
	static String removeAllSpace(String inputString) {
		StringBuilder sb= new StringBuilder();
		for(int i=0;i< inputString.length();i++) {
			if(inputString.charAt(i)!=' ') {
				sb=sb.append(inputString.charAt(i));
			}
		}
		return sb.toString();
	}
	
	static String removeExtraSpace(String inputString) {
		StringBuilder sb= new StringBuilder();
		inputString= inputString.trim();
		boolean isPrev=false;
		for(int i=0;i<inputString.length();i++) {
			char ch= inputString.charAt(i);
			if(ch!=' ') {
				sb.append(ch);
				isPrev = false;
			}else if(!isPrev) {
				sb.append(ch);
				isPrev = true;
			}
		}
		
		return sb.toString();
	}
	
	static String addCharacterAtNthPosition(String inputString, char c, int n) {
		StringBuilder sb= new StringBuilder(inputString);
		for(int i=n; i<sb.length();i=i+n+1) {
			sb.insert(i, c);
		}

		return sb.toString();
	}
	
	//Replace the occurence of substring with another string
	static String replaceSubstring(String inputString, String target,String replacement) {
		StringBuilder sb =new StringBuilder();
		int i=0;
		while(i<inputString.length()) {
			if(i+target.length()<=inputString.length() && inputString.regionMatches(i, target, 0, target.length())) {
				sb.append(replacement);
				i=i+target.length();
			}else {
				sb.append(inputString.charAt(i));
			}
		
		}
		
	 return sb.toString();
	}
	
	
	static String CamelCase(String inputString) {
		StringBuilder sb =new StringBuilder();
		boolean capitalizeNext=true;
		for(char c: inputString.toCharArray()) {
			if(Character.isWhitespace(c)) {
				sb.append(c);
				capitalizeNext=true;
				
			}else if(capitalizeNext) {
				sb.append(Character.toUpperCase(c));
				capitalizeNext = false;
			}else {
				sb.append(Character.toLowerCase(c));
			}
		}
		
		return sb.toString();
		
	}
	
	static String CountAndRemoveDuplicate(String inputString) {
		char[] characterArray = inputString.toCharArray();
		HashMap<Character,Integer> frequencyCheck = new HashMap<>();
		for(char c: characterArray) {
			 frequencyCheck.put(c,frequencyCheck.getOrDefault(c, 0)+1);
		}
		StringBuilder sb = new StringBuilder();
		for(char key : frequencyCheck.keySet()) {
			if(frequencyCheck.get(key)==1) {
				sb.append(key);
			}
		}
		for(char key : frequencyCheck.keySet()) {
			System.out.println(key + " -  "+ frequencyCheck.get(key));
		}
		return sb.toString();
	}
	
	
	static String CountAndRemoveDuplicates(String inputString) {
		HashSet<Character> seenCharacter = new HashSet<>();
		HashSet<Character> duplicateCharacter = new HashSet<>();
		
		StringBuilder sb= new StringBuilder();
		int duplicateCount = 0;
		for(char c : inputString.toCharArray()) {
			if(seenCharacter.contains(c)) {
				duplicateCharacter.add(c);
				duplicateCount++;
			}else {
				seenCharacter.add(c);
				sb.append(c);
			}
		}
		System.out.println("No of duplicates removed "+ duplicateCount);
		
		return sb.toString();
		
	}
	
	static void compareStringAndStringBuilder(String substring, int count) {
		String plainString =" ";
		long startTime1 = System.currentTimeMillis();
		for(int i=0;i< count ;i++) {
			plainString= plainString+" "+ substring;
		}
		long endTime1 = System.currentTimeMillis();
		System.out.println("Time taken by String"+ (endTime1-startTime1));
		
		StringBuilder plainString1 =new StringBuilder();
		startTime1 = System.currentTimeMillis();
		for(int i=0;i< count ;i++) {
			plainString1.append(substring);
		}
		endTime1 = System.currentTimeMillis();
		System.out.println("Time taken by StringBuilder"+ (endTime1-startTime1));
	}
	
	static String reverseword(String inputString) {
		String[] words = inputString.split(" ");
		StringBuilder sb = new StringBuilder();
		
		for(String word: words) {
			StringBuilder reverseWord = new StringBuilder(word);
			sb.append(reverseWord.reverse().toString()).append(" ");
		}
		
		return sb.toString().trim();
	}
}
