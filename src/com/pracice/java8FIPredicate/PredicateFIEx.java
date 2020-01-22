package com.pracice.java8FIPredicate;
import java.util.function.Predicate;
public class PredicateFIEx {
	public static boolean CheckAge(int age)
	{
		if(age>17)
		
		return true;
	else
		return false;
	}
	
public static void main(String[] args) {
		Predicate<Integer> p = PredicateFIEx::CheckAge;
		boolean result = p.test(25);
		System.out.println(result);
		
	}
}

	/*
	 * public static void main(String[] args) {
	 * 
	 * Predicate<Integer> p = p1 -> (p1 > 20); System.out.println(p.test(10)); }
	 */


