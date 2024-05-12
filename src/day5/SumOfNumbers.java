package day5;

public class SumOfNumbers {

	public static void main(String[] args) {

		int number = 1234, sum = 0;
		while (number!=0) {
			int digit = number%10;
			sum = sum+digit;
			number = number/10;
		}
		System.out.println("The sum of digits in the given number is "+sum);
	}

}
