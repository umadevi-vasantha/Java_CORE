package com.ooo;

public class VoterMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Voter voter= new Voter(123, "Umadevi", 24, "09-02-1999", 'F',false);
		Voter voter1 = new Voter(124 ,"Ravi", 55,"18-09-1968" ,'M', true);
		System.out.println(voter.voterName);
		System.out.println(Voter.state);
		System.out.println(Voter.noOfVoters);
		
		//Calling Static method
		//Here we called the static method with object reference.This will give the result.But this is not considered as Best Parctice
		voter.testMethod();
		// Calling Static method with Class name
		Voter.testMethod();
		/*A static method can access only static data. It cannot access non-static data (instance variables)
		A non-static member belongs to an instance. It's meaningless without somehow resolving which instance of a class you
		are talking about. In a static context, you don't have an instance, that's why you can't access a non-static member
		without explicitly mentioning an object reference.
		In fact, you can access a non-static member in a static context by specifying the object reference explicitly :*/
		
		Voter.testMethodInstancevariable(voter);
		VoterMain.fun();
		
	}
	// We cannot call non static member from static member
	static void fun() {
		System.out.println("Inside Fun");
		//greeting()
		//But with we can access it with object reference. Uncomment the above line and check the error
		VoterMain vote2= new VoterMain();
		vote2.greetings();
		
	}
    // We can call static memeber from non static member
	void greetings() {
		learn();
		
	}
	
	static void learn() {
		System.out.println("Inside Learn");
	}
}