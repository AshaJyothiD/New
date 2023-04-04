package sample;

import java.util.ArrayList;
import java.util.Arrays;

public class Array {

	public static void main(String[] args) {
		 String array[] = {"dog","cat","aple"};
		 for(  String value:array){
			 
		 
		 System.out.println(value);
		 }
		 ArrayList al = new ArrayList(Arrays.asList(array));
		 System.out.println("Change to arraylist form" + al);

	}

}
