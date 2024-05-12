package day2;

public class VariablesDemo {

	public static void main(String[] args) {
//		int a;			// Declaration
//		a = 100;		// Assignment
		
		/*
		int a = 100; // declaration + assignment
		System.out.println(a);
		
		a = 200;
		System.out.println(a);
		*/
		
		// Approach 1 -- if all the variables belong to different data types
		/*int a = 100;
		int b = 200;
		int c = 300;
		*/
		
		// Approach 2 -- if all the variables belong to same data type
		/*int a,b,c;
		a = 100;
		b = 200;
		c = 300;
		*/
		
		// Approach 3 -- if all the variables belong to same data type
		int a=100,b=200,c=300;
		
		System.out.println("The value of a is "+ a);
		System.out.println("The value of b is "+ b);
		System.out.println("The value of c is "+ c);
		
		System.out.println(a+" "+b+" "+c); //100 200 300
		
	}

}
