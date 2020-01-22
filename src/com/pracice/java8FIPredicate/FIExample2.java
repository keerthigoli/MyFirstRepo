package com.pracice.java8FIPredicate;

interface InterTest1
{
	public void say(String message);
	default void Hello()
	{
		System.out.println("default methood");
	}
	static void Hii()
	{
		System.out.println("default methood");
	}
	
	
}
public class FIExample2 implements InterTest1 
{
	@Override
	public void say(String message) {
		// TODO Auto-generated method stub
		
	}
	

	
	public static void main(String[] args) {
		FIExample2 fi2 = new FIExample2();
	
	fi2.Hello();
		
		
		
	}

		
	
	
	
}

	


			
			