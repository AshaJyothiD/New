package sample;

import java.util.Scanner;

public class Pali {
	

	
	    public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);
	        System.out.print("Enter a string: ");
	        String str = scanner.nextLine();
	        boolean isPalindrome = true;
	        int left = 0;
	        int right = str.length() - 1;
	        while (left < right && isPalindrome) {
	            isPalindrome = str.charAt(left++) == str.charAt(right--);
	        }
	        System.out.println(str + (isPalindrome ? " is a palindrome." : " is not a palindrome."));
	        scanner.close();
	    }
	}



