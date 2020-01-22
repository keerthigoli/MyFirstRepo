package com.practice.java8.lambda;

public class LambdaExpressionEx2 {
	public static void main(String[] args) {
		/*
		 * Runnable r = () ->{ System.out.println("Runnbale interface using lambda"); };
		 * Thread t = new Thread(r); t.start(); }
		 */

		Runnable r = new Runnable() {

			@Override
			public void run() {

				System.out.println("using annonymous class");
			}

		};
		Thread t = new Thread(r);
		t.start();

	}
}
