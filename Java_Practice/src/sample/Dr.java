package sample;

import java.util.Scanner;

public class Dr {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter your string:");
		String s = scanner.nextLine();
		
		boolean drome = true;
		int left = 0;
		 int right = s.length() - 1;
	
		 
		 while(left<right && drome) {
			 drome = s.charAt(left ++) == s.charAt(right--);
		 }
		 System.out.println( drome ?"is a palindrome" : "its not a palindrome");
		
	
	}	
	

}
