package com.practice.java8.lambda;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class UsingCollections {
	public static void main(String[] args) {

		
		  List<String> list1 = new ArrayList<>(); 
		  list1.add("cricket");
		  list1.add("hockey");
		  list1.add("kabbadi ");
		  list1.add("ccc");
		  
		 list1.forEach((names) -> System.out.println(names));
		 
		/*
		 * Map<String,Integer> map1 = new HashMap<String, Integer>();
		 * map1.put("keerthi", 16553); map1.put("ramya", 16555); map1.put("naz", 16546);
		 * 
		 * 
		 * map1.forEach((k,v)->System.out.println("names :" +k+ "values:" +v));
		 */
		  
		  
		
	}
}
