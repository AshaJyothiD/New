package sample;

import java.util.Arrays;
import java.util.Vector; 

public class Ftr {

	public static void main(String[] args) {
		Object[] arr = new Object[] {1,3,5,6};
		Vector v1 = new Vector(Arrays.asList(arr));
		
		System.out.println(v1.size());
		System.out.println(v1.capacity());
		
		

	}

}
