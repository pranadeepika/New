package demo;

import java.util.Scanner;

public class Demo10 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println(" ");
		String input=sc.nextLine();
		input=input.toLowerCase();
		String output=" ";
		char[] vowels = {'a', 'e', 'i', 'o', 'u'};
	    char[] consonants = {'b', 'c', 'd', 'f', 'g', 'h', 'j', 'k', 'l', 'm', 'n', 'p', 'q', 'r', 's', 't', 'v', 'w', 'x', 'y', 'z'};
	    for (int i = 0; i < input.length(); i++) {
	        char ch = input.charAt(i);
	        if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
	            int randomIndex = (int) (Math.random() * consonants.length);
	            ch = consonants[randomIndex];
	        } else {
	            int randomIndex = (int) (Math.random() * vowels.length);
	            ch = vowels[randomIndex];
	        }
	        
	        output += ch;
	    }
	    System.out.println(output);
	    
	}
}
