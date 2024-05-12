package day3;

public class SwapTwoNumbers {

	public static void main(String[] args) {
		int a =10, b=20;
		/*
		int temp;
		System.out.println("Value of a and b before swapping a:"+a+" b:"+b);
		temp =a;
		a=b;
		b=temp;
		System.out.println("Value of a and b after swapping a:"+a+" b:"+b);
		*/
		// method 2
		/*
		a = a+b;
		b = a-b;
		a = a-b;
		System.out.println("Value of a and b after swapping a:"+a+" b:"+b);
		*/
		
		// method 3
		/*
		if (a==0) {
			a = b;
			b = 0;
		}else if(b==0) {
			b = a;
			a = 0;
		}else {
			a = a*b;
			b = a/b;
			a = a/b;
		}
		System.out.println("Value of a and b after swapping a:"+a+" b:"+b);
		*/
		
		// method 4
		a = a ^ b;
		b = a ^ b;
		a = a ^ b;
		System.out.println("Value of a and b after swapping a:"+a+" b:"+b);
	}

}
