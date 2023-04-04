package sample;

import java.util.ArrayList;
import java.util.Collections;

public class Addition {

	public static void main(String[] args) {
		ArrayList al = new ArrayList();
		al.add("a");
		al.add("z");
		al.add("d");
		
		System.out.println("arraylist numbers" + al);
		ArrayList al_dup = new ArrayList();
		al_dup.addAll(al);
		System.out.println("duplicates" + al_dup);
		
		al_dup.removeAll(al);
		System.out.println("removed elements" + al_dup);
		
		System.out.println("array list:"  +al);
		Collections.sort(al);
		System.out.println("after sorting:"  + al);
		
		Collections.sort(al, Collections.reverseOrder());
		System.out.println("reverse order"  + al);
		
		Collections.shuffle(al);
		System.out.println("after shuffling:" +al);

	}

}
