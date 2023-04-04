package sample;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;

public class New {

	public static void main(String[] args) throws IOException {
		File file = new File("./resume.txt");
		file.createNewFile();
		
		FileOutputStream fis = new FileOutputStream(file);
		fis.write(72);
		fis.write(80);
		
		

	}

}
