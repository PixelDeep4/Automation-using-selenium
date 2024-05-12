package day2;

public class DataTypesDemo {

	public static void main(String[] args) {
		
		// Numeric data type
		int a = 100, b = 200;
		System.out.println("The value of a is: "+a);
		System.out.println("The value of b is: "+b);
		System.out.println(a+b);
		System.out.println("The sum of a and b is: "+ (a+b));

		
		byte by = 125;
		System.out.println(by);
		
		short sh = 3535;
		System.out.println(sh);
		
		long l = 123456789l;
		System.out.println(l);
		
		// Decimal numbers -- float, double
		float item_price = 15.5f;
		System.out.println(item_price);
		
		double dbl = 1234.234234234;
		System.out.println(dbl);
		
		char ch = 'A';
		System.out.println(ch);
		
		String name = "John";
		System.out.println(name);
		
//		char ch = 'ABC';  //Invalid
//		String ch = 'ABC'; //Invalid
//		String ch = 'A';  // Invalid
//		String ch = "A";  //valid
		
//		boolean bl = false; // allows only true or false
//		System.out.println(bl);
		
//		boolean bl = "true"; //invalid
//		boolean bl = "false"; //invalid
		
	}

}
