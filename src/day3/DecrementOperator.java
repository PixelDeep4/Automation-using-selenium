package day3;

public class DecrementOperator {

	public static void main(String[] args) {
		
		// case 1-
		
		/*
		int a = 10;
		a--; //a=a-1
		System.out.println(a); //9
		*/
		
		// case 2- post decrement operator
		/*
		int a = 100;
		int res=a--;
		System.out.println(res);
		System.out.println(a);
		*/
		
		// case 3- pre decrement operator
		int a = 100;
		int res= --a;
		System.out.println(res);
		System.out.println(a);
		
	}

}
