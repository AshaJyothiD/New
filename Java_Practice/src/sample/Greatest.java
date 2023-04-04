package sample;

import java.util.Scanner;

public class Greatest {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Enter the first number");
		double num1 = scanner.nextDouble();
		
		System.out.println("Enter the second number");
		double num2 = scanner.nextDouble();
		
		double result = num1>num2 ? num1 :num2;
		System.out.println("The result is :" +result);

	}

}
