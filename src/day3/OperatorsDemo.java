package day3;


public class OperatorsDemo {

	public static void main(String[] args) {
		// 1) Arithmetic operators + - * / %	
		
		int a=10, b=20;
		int result = a+b;
		System.out.println("The sum of a and b is "+result);
		System.out.println("sum of a and b is "+(a+b));
		System.out.println("Diff of a and b is "+(a-b));
		System.out.println("Multiplication of a and b is "+(a*b));
		System.out.println("Division of a and b is "+(a/b));
		System.out.println("Modulo division of a and b is "+(a%b));

		// 2) Relational/Comparison operators >  >=  <  <=  !=  ==
		// always return a boolean value
		
		System.out.println(a>b); //false
		System.out.println(a<b); //true
		System.out.println(a<=b); // true
		System.out.println(a>=b); // false
		System.out.println(a!=b); // true
		System.out.println(a==b); // false
		
		// 3) Logical opearators && || !
		// always return a boolean value
		// works between two boolean values
		
		boolean x=true;
		boolean y=false;
		System.out.println(x && y);
		System.out.println(x || y);
		System.out.println(!x);
		System.out.println(!y);
		
		boolean b1 = 10 > 20;
		System.out.println(b1); // false
		
		boolean b2 = 10 < 20;
		System.out.println(b2); // true
		
		System.out.println(b1 && b2);
		System.out.println(b1 || b2);
		
	}

}
