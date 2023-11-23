package demo;

import java.util.Scanner;

public class Demo11 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number of numbers to check: ");
        int n = scanner.nextInt();
        System.out.print("Enter the numbers to check: ");
        for (int i = 0; i < n; i++) {
            int number = scanner.nextInt();
            int sum = 0;
            int temp = number;
            while (temp != 0) {
                int digit = temp % 10;
                sum += Math.pow(digit, 3);
                temp /= 10;
            }
            if (sum == number) {
                System.out.println(number + " is an Armstrong number");
            }
//            else {
//            	System.out.println(number + " is not Armstrong number");
//            }
        }
	}
}
