package sample;

import java.util.Vector;

public class Collec {

	public static void main(String[] args) {
		Vector v1 =  new Vector();
		
		
		v1.add("asha");
		v1.add("jyothi");
		v1.add(0,"diviti");
		v1.add("asha");
		
		v1.add(0,"diviti");
		Vector v2 = new Vector();
		v2.add("shri");
		v2.add("sara");
		v2.add(0,"viaan");
		v2.add("geethu");
		v1.addAll(v2);
		//System.out.println(v1);
		System.out.println(v1.get(6));
		
		
		//System.out.println(v1.size());
		//System.out.println(v1.capacity());

	}

}
