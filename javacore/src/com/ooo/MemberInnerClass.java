package com.ooo;

// Member Inner Class (Non-static Inner Class)
// Static Nested Class
// Local Inner Class
// Anonymous Inner Class

// Outer Classes cannot be static
// Inner Classes can be static
//
class Outer {
    int a;
    static int b=10;

    public void show() {
        System.out.println("Outer Class Method");
    }
    public static void showDetails() {
    	System.out.println("Outer Class Static Method");
    }
    // Inner class should be defined here, outside the method
    class Inner {
        public void display() {
            System.out.println("Inner Class method");
            System.out.println("Accessing the non static varible"+a);
            show();
            showDetails();
            System.out.println("Accessing the static varible"+b);
            
        }
    }
}

public class MemberInnerClass {

    public static void main(String[] args) {

        Outer outer = new Outer();
        outer.show();
        // We cannot access the Inner class directly; we need an outer class instance
        Outer.Inner obj1 = outer.new Inner();
        obj1.display();
        
        
    }
}
