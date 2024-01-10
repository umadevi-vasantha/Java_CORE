package com.ooo.properties.abstarction;

public class Car {

	private Engine engine;
	private MeidaPlayer media;
	
	public Car() {
		engine =new PetrolEngine();
		media =new Media();
	}
	
	public void start() {
		engine.start();
		
	}
	public void stop() {
		engine.stop();
	}
	
	public void musicStrat() {
		media.start();
		
	}
	public void musicStop() {
		media.stop();
	}
	
	public void upgrade() {
		this.engine= new ElectricEngine();
		
	}

	
	
	
	
}
