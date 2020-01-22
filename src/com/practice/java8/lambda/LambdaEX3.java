package com.practice.java8.lambda;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class LambdaEX3 {

	public static void main(String[] args) {
		List<Product> list1 = new ArrayList<Product>();
		list1.add(new Product(1,"Hp",30000));
		list1.add(new Product(2,"Lenovo",26000));
		list1.add(new Product(1,"Dell",40000));
		list1.add(new Product(1,"Apple",60000));
		list1.add(new Product(3,"DDD",700000));
	
	List<Product> names=list1.stream().filter(p->p.getPname().startsWith("D")).collect(Collectors.toList())
		;
	System.out.println(names);
	System.out.println("first commit");
	System.out.println("second commit");
		
	}
}
