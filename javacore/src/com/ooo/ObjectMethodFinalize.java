package com.ooo;

public class ObjectMethodFinalize {
	
	private int resourceId;
	
	public ObjectMethodFinalize(int resourceId) {
		this.resourceId = resourceId;
	}
	
	@Override
	public void finalize() throws Throwable {
		System.out.println("ResourceId is be finalized"+ resourceId);
		//finalize method is deprecated from java version 9
		super.finalize();
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ObjectMethodFinalize obj= new ObjectMethodFinalize(1000);
		obj=null;
		//Garbage collection is not guaranteed
		System.gc();
		try {
			
			Thread.sleep(60000);
			
			
		}catch(Exception exception) {
			exception.printStackTrace();
			
		}

	}

}
