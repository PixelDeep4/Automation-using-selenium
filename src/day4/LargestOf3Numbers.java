package day4;

public class LargestOf3Numbers {

	public static void main(String[] args) {

		int a=10, b=20, c=30;
		/*
		if (a>b) {
			if (a>c) {
				System.out.println("a is the largest number among a,b and c");
			}else {
				System.out.println("c is the largest number among a,b and c");
			}
		}else if (a<b) {
			if (b>c) {
				System.out.println("b is the largest number among a,b and c");
			}
			else {
				System.out.println("c is the largest number among a,b and c");
			}
		}*/
		
		if (a>b && a>c) {
			System.out.println(a+" is the largest number");
		}else if(b>a && b>c) {
			System.out.println(b+" is the largest number");
		}else {
			System.out.println(c+" is the largest number");
		}
	}

}
