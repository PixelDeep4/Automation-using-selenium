package day5;

public class NumberOfOddAndEvenDigitsInANumber {

	public static void main(String[] args) {

		int number = 23456, even = 0, odd = 0;
		while (number!=0) {
			int digit = number % 10;
			if(digit%2==0) {
				even++;
			}else {
				odd++;
			}
			number = number/10;
		}
		System.out.println("There are "+even+" even digits and "+odd+" odd digits in the given number");
	}

}
