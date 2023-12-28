package com.ooo;
// Static example 
public class Voter {

    int voterId;
    String voterName;
    int age;
    String voterDob;
    char gender;
    boolean maritalStatus;
    static String state;
    static long noOfVoters;
    
    String message ="Hello..Static Method calling instance variable";
    
    Voter(int id,String name,int age,String dob,char gender, boolean maritalStatus){
    	this.voterId=id;
    	this.voterName=name;
    	this.age=age;
    	this.voterDob=dob;
    	this.gender=gender;
    	this.maritalStatus= maritalStatus;
    	Voter.noOfVoters+=1;
    	Voter.state= "Karnataka";
    }
    	
    public static void testMethod() {
    	System.out.print(Voter.noOfVoters);
    	System.out.println("This is a Static method");
    	//System.out.println(this.age);
    	//Note: Static cannot use this keyword because static members are not belongs any obj ref.. Instead its belongs to the whole class
    	
    }
    /*
     * A static method can access only static data. It cannot access non-static data (instance variables)
A non-static member belongs to an instance. It's meaningless without somehow resolving which instance of a class you
are talking about. In a static context, you don't have an instance, that's why you can't access a non-static member
without explicitly mentioning an object reference.
In fact, you can access a non-static member in a static context by specifying the object reference explicitly :
     */
    public static void testMethodInstancevariable(Voter voter) {
    	System.out.println(voter.message);
    	//Cannot make static reference to non static fields//Below line will give error
    	//System.out.print(Voter.message);
    }
    
   static {
	   System.out.println("Static block is executed");
   }
   
     
    
}
