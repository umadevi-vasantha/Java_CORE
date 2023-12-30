package com.ooo;

public class ObjectMethodToString {
	
	int empId;
	String empName;
	
	public ObjectMethodToString(int empId, String empName) {
		this.empId=empId;
		this.empName=empName;
		}
	
	@Override
	public String toString() {
		return "Person{ Id= "+ empId +" Name= "+ empName+"}";
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ObjectMethodToString obj =new ObjectMethodToString(101, "Uma");
		System.out.println(obj.toString());
	}

}
