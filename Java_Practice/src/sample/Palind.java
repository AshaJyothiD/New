package sample;

import java.util.Scanner;

public class Palind {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("enter your number");
		 int number = input.nextInt();

		 int orginalnumber = number;
		 int reversenumber = 0;
		 
		 while(number!=0) {
			reversenumber = reversenumber*10 + number % 10;
			number= number/10;
			
		 }
		 if(orginalnumber==reversenumber) {
			 System.out.println("number is palindrome");
		 }
		 else {
			 System.out.println("number is not palindrome");
			 
		 }
	}
}






   
