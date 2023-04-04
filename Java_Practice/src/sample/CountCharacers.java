package sample;

import java.util.Scanner;

public class CountCharacers {
	
    public static void main(String[] args) {
    	Scanner scanner = new Scanner(System.in);
    	System.out.println("enter the string");
    	String str = scanner.nextLine();
        
        int count = 0;
        
        // Loop through each character in the string
        for (int i = 0; i < str.length(); i++) {
            // Check if the current character is not a space
           if (str.charAt(i) != ' ') {
                // If not a space, increment the count
               count++;
            }
        }
        
        // Print the result
        System.out.println("Number of characters: " + count);
    }
}




