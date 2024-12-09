package com.core.string.code;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Scanner;

// 1. Reverse the string "hello" to "olleh"
// 2. Palindrone or not 
// 3. Frequency of character in string
// 4. Remove vowles from String
// 5. Given two strings, check if one is a rotation of the other (e.g., "abcd" and "cdab" are rotations of each other).
// 6. Write a function to find the first non-repeating character in a string.
// 7. Compare two strings lexicographically (without using compareTo()).
// 8. Write a function to convert a string to title case (capitalize the first letter of each word).
// 9. Find the longest common prefix of an array of strings.(LCP)
//10. Implement a function to check if two strings are anagrams of each oth


public class ReverseString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc= new Scanner(System.in);
		System.out.println("Enter the String");
		String inputString=sc.next();
		reverseString(inputString);
		System.out.println(palindromCheck(inputString));
		frequencycheck(inputString);
		System.out.println(vowelRemovel(inputString));
		System.out.println(rotationOrNot("abcd","cdab"));
		System.out.println(rotationOrNot("uma","aum"));
		System.out.println(rotationOrNot("umadevi","uimadev"));
		System.out.println(firstNonRepetitive("malayalam"));
		System.out.println(firstNonRepetitive("maam"));
		System.out.println(convertToTitleCase("java learninG for - beginner course"));
		System.out.println(lexicographicCheck("ammu","ammu"));
		System.out.println(lcp(new String[]{"flower", "flow", "flight"}));
		System.out.println(anagram("silent","listen"));
		System.out.println(anagram("uma","ammu"));
		System.out.println(anagrambf("silent","listen"));
		System.out.println(anagrambf("uma","ammu"));
		sc.close();
		
		
		
	}
	
	//Brute Force code
	static String reverseString(String inputString) {
		char[] charcterArray= inputString.toCharArray();
		System.out.println("The character Array" + Arrays.toString(charcterArray));
		int left=0;
		int right= charcterArray.length-1;
		while(right>left) {
			char temp = charcterArray[right];
			charcterArray[right]=charcterArray[left];
			charcterArray[left]= temp;
			left++;
			right--;
		}
		
		String outputString = new String(charcterArray);
		System.out.println(outputString);
		return outputString;
	}
	
	static boolean palindromCheck(String inputString) {
		char[] characterArray = inputString.toCharArray();
		System.out.println("The character Array"+ Arrays.toString(characterArray));
		int left= 0;
		int right = characterArray.length-1;
		boolean check=false;
		while(right>left) {
			if(characterArray[right] == characterArray[left]) {
				left++;
				right--;
			}else {
				return check;
			}
		}
		return true;
		
	}
	
	static void frequencycheck(String inputString) {
		char[] characterArray = inputString.toCharArray();
		HashMap<Character, Integer> frequencyMap = new HashMap<>();
		System.out.println("The character Array"+ Arrays.toString(characterArray));
		for(char c:characterArray) {
			frequencyMap.put(c,frequencyMap.getOrDefault(c, 0)+1);
		}
		for(char key: frequencyMap.keySet()) {
			System.out.println(key + " : "+frequencyMap.get(key));
		}
		
	}
	
	static String vowelRemovel(String inputString) {
		char[] characterArray = inputString.toCharArray();
		char[] vowelArray= {'a','e','i','o','u','A','E','I','O','U'};
		String outputString="";
		System.out.println("The characterArray"+ Arrays.toString(characterArray));
		for(int i=0;i<characterArray.length;i++) {
			boolean isVowel= false;
			for(int j=0;j<vowelArray.length;j++) {
				if(characterArray[i]==vowelArray[j]) {
					isVowel=true;
					break;
				}
			}
			if(!isVowel) {
				outputString+=characterArray[i];
			}
		}
		return outputString;
		
	}

	static boolean rotationOrNot(String inputString1, String inputString2) {
		String str1= inputString1+inputString1;
		if(str1.contains(inputString2)) {
			return true;
		}
		return false;
		
	}
	
	
	static Character firstNonRepetitive(String inputString) {
		char[] characterArray = inputString.toCharArray();
		HashMap<Character, Integer> frequencyMap = new HashMap<>();
		System.out.println("The character Array"+ Arrays.toString(characterArray));
		for(char c:characterArray) {
			frequencyMap.put(c,frequencyMap.getOrDefault(c, 0)+1);
		}
		for(char key: frequencyMap.keySet()) {
			if(frequencyMap.get(key)==1) {
				return key;
			}
			
		}
		
		return null;
		}
	
	static String convertToTitleCase(String inputString) {
		String outputString= new String();
		String[] splitString = inputString.split(" ");
		for(String s: splitString) {
			if(!s.isEmpty()) {
			String captilaized=s.substring(0,1).toUpperCase() + s.substring(1).toLowerCase();
			outputString=outputString+captilaized+" ";
			}
		}
		
		System.out.println(outputString);
		return outputString;
		
	}
	
		//	Lexicographical comparison of two strings:
		// - Strings are compared character by character based on their Unicode (or ASCII) values.
		// - The comparison stops as soon as a difference is found between corresponding characters.
		// - If the characters are the same, the comparison moves to the next character.
		// - If one string is a prefix of the other, the shorter string is considered lexicographically smaller.
		// - If one string is smaller at any character position, it is considered lexicographically smaller.
	static int lexicographicCheck(String inputString1, String inputString2) {
		int length1= inputString1.length();
		int length2= inputString2.length();
		
		
		for(int i=0; i< Math.min(length1, length2);i++) {
			char ch1=inputString1.charAt(i);
			char ch2= inputString2.charAt(i);
			
			if(ch1>ch2) {
				return 1;// str1 is lexicographically longer
			}else if(ch1<ch2) {
				return -1; // str1 is lexicographically smaller
			}
		}
		
		
		if(length1<length2) {
			return -1; // str1 is lexicographically smaller
		}else if(length1>length2) {
			return 1; // // str1 is lexicographically longer
		}
		
		
		return 0; // Strings are equal
	}
	
	
	//Longest Common Prefix
	
	static String lcp(String[] stringArray) {
		String lcp=stringArray[0];
		for(int i=1; i<stringArray.length;i++) {
			while(stringArray[i].indexOf(lcp)!=0) {
				//System.out.print(stringArray[i].indexOf(lcp)); 
				lcp = lcp.substring(0,lcp.length()-1);
				if(lcp.isEmpty()) {
					return "";
				}
			}
			//System.out.print(stringArray[i].indexOf(lcp));
		}
		return lcp;
		
	}
	
	
	static boolean anagram(String inputString1, String inputString2) {
		if(inputString1.length()!=inputString2.length()) {
			return false;
		}
		inputString1= inputString1.toLowerCase();
		inputString2= inputString2.toLowerCase();
		char[] str1= inputString1.toCharArray();
		char[] str2= inputString2.toCharArray();
		Arrays.sort(str1);
		Arrays.sort(str2);
		return Arrays.equals(str1, str2);
	}
	
	
	static boolean anagrambf(String inputString1, String inputString2) {
		if(inputString1.length()!=inputString2.length()) {
			return false;
		}
		int[] charCount= new int[26];
		inputString1= inputString1.toLowerCase();
		inputString2= inputString2.toLowerCase();
		
		for(int i=0; i< inputString1.length();i++) {
			charCount[inputString1.charAt(i)-'a']++;
			charCount[inputString2.charAt(i)-'a']--;
			
		}
		
		for(int count:charCount) {
			if(count!=0) {
				return false;
			}
		}
		
		return true;
		
		}
	
}
