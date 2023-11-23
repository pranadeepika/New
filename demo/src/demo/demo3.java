package demo;

import java.util.Scanner;

public class demo3 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = input.nextInt();
        int sum1 = 0;
        int sum2=0;
        // Count the number of digits in the number
        while (num > 9) {
            int n1=num%10;
            num/=10;
            int n2=num%10;
            num/=10;
            int n3=num%10;
            for (int j = Math.min(n1,n2) + 1; j < Math.max(n1,n2); j++) {
                sum1 += j;
            }
            for (int j = Math.min(n2,n3) + 1; j < Math.max(n2,n3); j++) {
                sum2 += j;
            }
            System.out.println(sum1);
            System.out.println(sum2);
        }
	}
}
