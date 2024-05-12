package day5;

public class WhileLoopDemo {

	public static void main(String[] args) {

		// Example 1: print 1 to 10 numbers
		/*
		int i=1;		// initialization
		while(i<=10)	// condition
		{
			System.out.println(i);
			i++;		// increment
		}
		*/
		
		// Example 2: Print hello message 10 times
		
		/*
		int i = 1;
		while(i<=10)
		{
			System.out.println("Hello");
			i++;
		}
		*/
		
		// Example 3: Print even numbers from 1 to 10
		// Approach 1
		/*
		int i = 1;
		while (i<=10) {
			if(i%2==0) {
				System.out.println(i);
			}
			i++;
		}
		*/
		// Approach 2
		/*
		int i = 2;
		while(i<=10) {
			System.out.println(i);
			i+=2;	
		}
		*/
		
		
		//Example 3: print 1 to 10 numbers specifying whether the number is even or odd
		/*
		int i = 1;
		while(i<=10) {
			if(i%2==0) {
				System.out.println(i+" is an even number");
			}else {
				System.out.println(i+" is odd number");
			}
			i++;
		}
		*/
		
		// Example 4: Print 10 to 1 in descending order
		int i = 10;
		while(i>=1) {
			System.out.println(i);
			i--;
		}
	}

}
