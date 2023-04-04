package sample;

public class Great {

	public static void main(String[] args) {
		
			   int num1 = 10;
			   int num2 = 20;
			   
			   int result = num1 - num2;
			   int sign = (result >> 31) & 0x1; // get the sign of result
			   
			   int max = num1 - sign * result; // if sign = 0, max = num2. If sign = 1, max = num1.
			   
			   System.out.println("The greatest of two numbers is: " + max);
			}


	}


