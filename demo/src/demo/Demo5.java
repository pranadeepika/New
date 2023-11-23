package demo;

import java.util.Scanner;

public class Demo5 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.print("enter a term");
		int num=sc.nextInt();
		int rem=0;
		int count1=0;
		int count2=0;
		while(num>0){
			rem=num%10;
			num=num/10;
		if(rem%2==0) {
			count1++;
			
		}
		else {
			count2++;
		}
		}
		System.out.println(count1);
		System.out.println(count2);
	}
	}

