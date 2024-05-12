package day5;

public class PalindromeNumber {

	public static void main(String[] args) {
		
		int number=1221, reverse = 0;
		int num = number;
		while(num!=0) {
			int rem = num%10;
			reverse = reverse*10+rem;
			num = num/10;
		}
		if(number==reverse) {
			System.out.println("The given number is palindrome number");
		}
	}

}
