package sample;

import java.util.*;

public class Maprac {

	public static void main(String[] args) {
		//creation of map
	
		Map<Integer,String> map = new Hashtable<>();
		
		//addition of elements in map
		
		map.put(001, "shriyans");
		map.put(002, "sarayu");
		map.put(003, "asha");
		
		//retrieval of keys from map
		/*
		 Set <Integer> keys = map.keySet();
		 for(Integer key:keys) {
			 System.out.println(key);
		 }
		 System.out.println();
		 
		 //retrieval of values from map
		 Collection<String> values = map.values();
		 for(String value:values) {
			System.out.println(value); 
		 }
		 System.out.println();
		 System.out.println(map.get(003));
		 
		Set<Integer> keys = map.keySet();
		for(Integer key:keys) {
			System.out.println(key +  ">>>>>" +  map.get(key));
		
		}*/ 
		map.remove(001);
		System.out.println(map);
		
		System.out.println(map.containsKey(002));
		System.out.println(map.containsKey(001));;
		System.out.println(map.containsValue("sarayu"));
		
		map.put(002, "diviti");
		System.out.println(map);

	}
}
		
		
		
		
		 
		 
		
	
		


