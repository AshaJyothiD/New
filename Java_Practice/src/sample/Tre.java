package sample;

import java.io.File;

import java.io.IOException;
import java.util.Scanner;

public class Tre {

	public static void main(String[] args) throws IOException {
		File file = new File("./product.txt");
		file.createNewFile();
		Scanner scanner = new Scanner(file);
		while(scanner.hasNextLine())
		{
			System.out.println(scanner.nextLine());
		}
		
		

}
}
