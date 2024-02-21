package com.core.string.code;

public class StringThreadSafety {
	private static StringBuilder stringBuilder = new StringBuilder();
	private static StringBuffer stringBuffer = new StringBuffer();
	

	public static void main(String[] args) {
		
		// TODO Auto-generated method stub
		//The 2 threads that concurrently modify the StringBuilder
		Thread sbThread1= new Thread(()->appendString("A"));
		Thread sbThread2= new Thread(()->appendString("B"));
		
		//2 threads that concurrently modify the StringBuffer
		//You can use any of the methods to declare
		Thread sbfThread1 = new Thread(new Runnable() {
			@Override
			public void run() {
				appendStringBuffer("A");
				
			}
		});
		
		Thread sbfThread2 = new Thread(()-> appendStringBuffer("B"));
		sbThread1.start();
		sbThread2.start();
//		sbfThread1.start();
//		
//		sbfThread2.start();
		
		try {
			sbThread1.join();
			sbThread2.join();
//			sbfThread1.join();
//			sbfThread2.join();
		}catch(Exception e) {
			e.printStackTrace();
		}

	}
	
	static void appendString(String value) {
		for(int i=0 ; i<100; i++) {
			stringBuilder.append(value);
			try {
				Thread.sleep(100);
			}catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		System.out.println(stringBuilder.toString().length());//With StringBUilder it is not giving length as 200 ..it is giving differnt value..hence we can say StringBuilder is not thread safe and it may lead to data corruptions
	}
	
	static void appendStringBuffer(String value) {
		for(int i=0 ; i<100; i++) {
			stringBuffer.append(value);
			try {
				Thread.sleep(100);
			}catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		System.out.println(stringBuffer.toString().length()); //With StringBuffer it exactly print the length as 200
	}
	
	

}
