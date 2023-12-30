package com.ooo;

public class SingletonMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		SingletonClass single = SingletonClass.getInsatnce();
		single.name= "Umadevi";
		SingletonClass s1 = SingletonClass.getInsatnce();
		System.out.println(s1.name);
		
	}

}
