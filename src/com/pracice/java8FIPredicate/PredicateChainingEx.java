package com.pracice.java8FIPredicate;

import java.util.function.Predicate;

public class PredicateChainingEx {
	public static void main(String[] args) {

		Predicate<Integer> predicate1 = (p) -> p > 20;
		Predicate<Integer> predicate2 = (p1) -> p1 < 10;
		boolean result = predicate1.and(predicate2).test(30);
		System.out.println(result);
        
	}
}

