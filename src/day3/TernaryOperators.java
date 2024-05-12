package day3;

public class TernaryOperators {

	public static void main(String[] args) {
		
		//var=exp ? result 1: result 2;
		
		
		// example 1
		/*
		int a=200, b=100;
		int x = (a>b?a:b);
		System.out.println(x);
		*/
		
		// Example 2
//		int x=(1==1)?100:200;
//		System.out.println(x);
		
//		int x=(1==2)?200:100;
//		System.out.println(x);

		// Example 3
		int person_age = 15;
		String result = (person_age>18)?"Eligible":"Not eligible";
		System.out.println(result);
	}

}
