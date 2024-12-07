package javacore;

public class GC {

	
	static  class Process{
		int id;
		String name;
		
		Process(int id, String name){
			this.id=id;
			this.name =name;
		}
		
		@Override
		protected void finalize() {
			System.out.println("Garbage collection initilatiated for the process ID: "+id + "name"+ name);
			
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Runtime runtime= Runtime.getRuntime();
		System.out.println("Initial total memeory "+ runtime.totalMemory());
		System.out.println("Initial total heap memory"+ runtime.freeMemory());
		
		System.out.println("Creating the Instance of Process");
		Process process1 = new Process(1,"Process1");
		Process process2 =new Process(2,"Process2");
		System.out.println("Initial total memeory "+ runtime.totalMemory());
		System.out.println("Initial total heap memory"+ runtime.freeMemory());
		
		process1=null;
		process2=null;
		
		System.out.println("Requesting garbage collection");
		System.gc();
		
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		System.out.println("Memory after garbage collection");
		System.out.println("Initial total memeory "+ runtime.totalMemory());
		System.out.println("Initial total heap memory"+ runtime.freeMemory());
		
		
		

	}

}
