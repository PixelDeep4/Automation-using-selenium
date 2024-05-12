package day5;

public class CountNumberOfDigits {

	public static void main(String[] args) {

		int number = 1234;
		int i = 0;
		while(number!=0) {
			number = number/10;
			i++;
		}
		System.out.println("The number of digits in the given number are "+i);
	}

}
