package com.ooo;

public class StaticBlock {

	static int a=20;
	static int b;
	//Will Run only once when the first object is created. i.e When Class is Loaded for first time
	static {
		System.out.println("I am inside static Block. Static Block will only run once when the first object is created");
		b=9;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StaticBlock obj = new StaticBlock();
		System.out.println(StaticBlock.a +" "+StaticBlock.b);
		
		StaticBlock.b+=5;
		System.out.println(StaticBlock.a +" "+StaticBlock.b);
		
		
		StaticBlock obj2 =new StaticBlock();
		System.out.println(StaticBlock.a +" "+StaticBlock.b);
		
		
		
		
	}

}
