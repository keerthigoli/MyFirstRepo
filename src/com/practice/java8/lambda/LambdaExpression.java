package com.practice.java8.lambda;

interface Calculate
{
	public void sum(int x,int y);
	
}

public class LambdaExpression {

	
	  public static void main(String[] args) {
	  
	  Calculate calc = (x,y)->System.out.println("sum of two numbers is:" +(x+y));
	  calc.sum(1, 4); }
	 
	
	

		/*
		 * Calculate c = new Calculate() {
		 * 
		 * @Override public void sum(int x, int y) {
		 * System.out.println("sum of two numbers is" + (x + y));
		 * 
		 * } }; c.sum(1, 4);
		 */
		 
		
   }
	


