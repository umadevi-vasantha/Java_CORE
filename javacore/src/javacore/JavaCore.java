/* Package::
 * In Java, a package is a mechanism for organizing classes and interfaces into a hierarchical structure.
 * A package is essentially a directory that contains a group of related Java classes.
 * 
 * At the beginning of a Java source file, you declare the package to which the classes in that file belong. This is done using the package statement.
 * 
 * The package name corresponds to a directory structure. For example, if the package is com.example.myproject, the classes within this package will be stored in a directory structure like com/example/myproject.
 */

package javacore;

//=================================Structure of Java Program=================================================

/*
 *A Class in Java is a blueprint or template for creating objects
 *It defines the properties(fields/variables) and behaviors(methods) that objects of the class will have
 *The 'main'(JavaCore) Class is the class that contains the 'main' method and servers as the entry point for the Java program 
 * 1 Line  
 - public class JavaCore
 	a. public (access modifier) declared as public in Main Class Should be accessible from any other package
 	b. class - We define any in java using the keyword "class"
 	c JavaCore - Here 'JavaCore'  is the main Class Name
 	
 * 2 Line
  - public static void main(String[] args)
  	a. public (access modifier) This Keyword indicates that the method is accessible from outside the class
  	b. static - This keyword allows the method to be called without creating an instance of the class
  	static is something which is independent of objects. To make sure that the Main Class is called without creating any instance of Main Class, we have declared this as 'static' method
  	c. void - This is the return type of the method, indicating that it does'nt return any value
  	since the main method return nothing the return type of this method is void
  	d. main - This is the name of the methods
  	method name 'main method' in java is in convention declared as main always
  	c. String[] args - This is the parameter of the method, allowing you to pass command-line arguments to the program
  	command line arguments 
 */

public class JavaCore {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * 'System' is a pre-defined class in Java that provides access to the system, including input and output streams.
		 * 'out' is a static member of the System class, which represents the standard output stream. This stream is connected to the console or terminal where your Java program is running.
		 * 'println' is a method of the PrintStream class (an output stream class) that is attached to the standard output (System.out).
		 */
		System.out.println("Java CORE revision");
		System.out.println("1st Commit");
	}

}
