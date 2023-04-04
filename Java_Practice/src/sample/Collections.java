package sample;

import java.util.ArrayList;
import java.util.Iterator;


public class Collections {

	public static void main(String[] args) {
		//ArrayList al = new ArrayList();//hetrogenous data=different types of elements or datatypes
		//ArrayList <Integer> al = new ArrayList <Integer>();
		//ArrayList<String> al = new ArrayList<String>();
		ArrayList al = new ArrayList();
		al.add(10);
		al.add("asha");
		al.add( 'c');
		al.add(true);
		System.out.println(al);
		System.out.println("The elements of ArrayList: "  + al.size());
		
		al.remove(3);
		System.out.println("after removing:"  + al);
		
		al.add(1, "jyothi");
		System.out.println("after insertion:" + al);//10, jyothi, asha, c
		System.out.println("using get:" + al.get(2));
		
		al.set(2, "diviti");
		System.out.println("after set method:" + al);
		
		System.out.println(al.contains("jyothi"));
		System.out.println(al.isEmpty());
		/*
		for(int i=0;i<al.size();i++) {
			System.out.println("result is : " + al.get(i));
			
			System.out.println("using for each loop:");
			
			for(Object e:al) {
				System.out.println(e);
			}
		}*/

	     System.out.println("using iterator method:");
	     Iterator it =  al.iterator();
	     while(it.hasNext()) {
	    	 System.out.println(it.next());
	     }
	}
}


