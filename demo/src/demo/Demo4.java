package demo;

import java.util.Scanner;

public class Demo4 {
//	public static void main(String[] args) {
//        Scanner input = new Scanner(System.in);
//        System.out.print("Enter a number: ");
//        int num = input.nextInt();
//        String str = Integer.toString(num);
//        for (int i = 0; i < str.length()-1 ; i++) {
//            int digit1 = Character.getNumericValue(str.charAt(i));
//            int digit2 = Character.getNumericValue(str.charAt(i + 1));
//            int sum = 0;
//            for (int j = Math.min(digit1,digit2) + 1; j < Math.max(digit1,digit2); j++) {
//                sum += j;
//            }
//        System.out.println(sum);
//        }
//            
//    }
	public static void main(String[] args) {

	    Scanner  in    = new Scanner(System.in);      
	    int i=1;
	    String[] input = new String[i];

	    in.nextLine(); //consuming the <enter> from input above

	    for (i= 1; i < input.length; i++) {

	        input[i] = in.nextLine();
	        System.out.println(input[i]);
	    }

	}

}
