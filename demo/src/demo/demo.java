package demo;
import java.util.Scanner;
public class demo
{    
	public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("enter a num");
	
	int num=sc.nextInt();
	int sum1=0;
	int sum2=0;
	while(num>9){
	int n1=num%10;
	num/=10;
	int n2=num%10;
	num/=10;
	int n3=num%10;
	sum1 += digitsSum(n2,n3);
	sum2 += digitsSum(n1,n2);
	}
	System.out.println(sum1);
	System.out.println(sum2);
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