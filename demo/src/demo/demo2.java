package demo;

import java.util.Scanner;

public class demo2 {
	public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int number = input.nextInt();
        int temp = number;
        int numDigits = 0;
        int sum=0;
        // Count the number of digits in the number
        while (temp > 0) {
            numDigits++;
            temp /= 10;
        }
        // Create an array to store the digits
        int[] digits = new int[numDigits];
        // Extract the digits and store them in the array
        for (int i = numDigits - 1; i >= 0; i--) {
            digits[i] = number % 10;
            number /= 10;
            sum += digitsSum(digits[i],digits[i+1]);
        }
        // Print the digits
            System.out.print(sum);
	}
        public static int digitsSum(int a,int b) {
    		int sum=0;
    		int start=Math.min(a, b)+1;
    		int end=Math.max(a, b)-1;
    		for(int i=start;i<=end;i++) {
    			sum +=i;
    		}
    		return sum;
     
}
}
