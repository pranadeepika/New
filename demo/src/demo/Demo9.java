package demo;

import java.util.Scanner;

public class Demo9 {
	public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter an integer: ");
        int num = scanner.nextInt();
        
        int firstDigit = num;
        while (firstDigit >= 10) {
            firstDigit /= 10;
        }
        int lastDigit = num % 10;
        int sum = 0;
        int rem=0;
        int sum1=0;
        while(num>0) {
        	rem=num%10;
        	num=num/10;
        	sum1+=rem;
        }
        sum=sum1-firstDigit-lastDigit;
		System.out.println(sum);
	}
}
