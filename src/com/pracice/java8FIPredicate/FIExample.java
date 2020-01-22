package com.pracice.java8FIPredicate;

interface FI {
public void Say(String message);

}

interface FI2 
{
	public void SaySomething(String msg);
}

public class FIExample implements FI,FI2 {

	@Override
	public void Say(String message) {
		System.out.println(message);

	}
	@Override
	public void SaySomething(String msg) {
		System.out.println(msg);
	}


	public static void main(String[] args) {

		FIExample fi = new FIExample();
		fi.Say("Hii");
		fi.SaySomething("love to do coding");
	}

	
}
