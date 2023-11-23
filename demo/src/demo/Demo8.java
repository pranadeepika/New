package demo;

import java.util.Scanner;

public class Demo8 {
	public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int num = scan.nextInt();
        int sum=0;
        int f=0;
        int l=0;
        while(num>0) {
        	l=num%10;
        	num=num/10;
        }
        while(num!=0) {
        	f=num%10;
        	num=num/10;
        }
        sum=l+f;
        System.out.println(l);
        System.out.println(f);
    }

}
