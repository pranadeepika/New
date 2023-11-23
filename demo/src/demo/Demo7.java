package demo;

import java.util.Scanner;

public class Demo7 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.print("enter a num");
		int num=sc.nextInt();
		if(num%2==0) {
			if(num>2&&num<5){
				System.out.println("not wierd");
			}
			else if(num>6&&num<20){
				System.out.println("wierd");
			}
			else {
				System.out.println("not wierd");
			}
		}
		else {
			System.out.println("wierd");
		}
	}

}
