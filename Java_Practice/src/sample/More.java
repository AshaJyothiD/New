package sample;



	import java.util.Scanner;

	public class More{
	   public static void main(String[] args) {
	      Scanner scanner = new Scanner(System.in);
	      
	      System.out.print("Enter the first number: ");
	      int num1 = scanner.nextInt();
	      
	      System.out.print("Enter the second number: ");
	      int num2 = scanner.nextInt();
	      
	      int max = num1 > num2 ? num1 : num2; // use ternary operator to find the maximum
	      
	      System.out.println("The greatest of the two numbers is: " + max);
	      
	      scanner.close();
	   }
	}	

	/*
	 * Explanation:

We first import the Scanner class from the java.util package to take input from the user.
We create a new Scanner object to take input from the user.
We prompt the user to enter the first number and store it in num1.
We prompt the user to enter the second number and store it in num2.
We use the ternary operator (? :) to find the maximum of num1 and num2. If num1 is greater than num2, then max is assigned the value of num1, otherwise, max is assigned the value of num2.
We output the value of max.
We close the Scanner object to prevent resource leaks.	
	 */

	


