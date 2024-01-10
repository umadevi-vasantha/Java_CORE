package com.ooo.properties.abstarction;


interface Displayable{
	void displayContent();
}

interface InternetConnection{
	void connectToInternet();
}


interface Powered{
	void powerOn();
	void powerOff();
}

class SmartPhone implements InternetConnection , Displayable , Powered{

	@Override
	public void powerOn() {
		// TODO Auto-generated method stub
		System.out.println("SmartPhone Power On");
		
	}

	@Override
	public void powerOff() {
		// TODO Auto-generated method stub
		System.out.println("SmartPhone Power Off");
		
	}

	@Override
	public void displayContent() {
		// TODO Auto-generated method stub
		System.out.println("SmartPhone Display Content");
		
	}

	@Override
	public void connectToInternet() {
		// TODO Auto-generated method stub
		System.out.println("SmartPhone Connect to Internet");
		
	}
	
}
public class DeviceManagementSystem {
	
	public static void main(String[] args) {
		SmartPhone phone = new SmartPhone();
		phone.powerOn();
		phone.displayContent();
		phone.connectToInternet();
		phone.powerOff();
	}
	

}

