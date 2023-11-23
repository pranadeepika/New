package demo;

import java.util.Scanner;

public class demo1 {
	public static void main(String[] args) {
	        Scanner input = new Scanner(System.in);
	        System.out.print("Enter the number of elements in the array: ");
	        int n = input.nextInt();
	        int[] arr = new int[n];
	        System.out.print("Enter the elements of the array: ");
	        int sum=0;
	        for (int i = 0; i < n; i++) {
	            arr[i] = input.nextInt();
	        int firstElement = arr[i-1];
	        int secondElement = arr[i];
	 
	        for (int k= firstElement + 1; k < secondElement; k++) {
	            sum = sum+arr[i];
	        }
	        System.out.println("The sum of numbers between the first two elements is: " + sum);
	        }
	    }
	public static int digitsSum(int a,int b) {
		int sum=0;
		int start=Math.min(a, b)+1;
		int end=Math.max(a, b)-1;
		for(int j=start;j<=end;j++) {
			sum +=j;
		}
		return sum;
	}

}
