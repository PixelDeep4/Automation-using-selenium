package day6Arrays;

import java.util.Scanner;

public class TakingInputFromKeyboard {
    public static void main(String[] args) {
       // int num = 20;  // hardcoded value

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a number:");
        int num = scanner.nextInt();
        System.out.println(num);
    }
}
