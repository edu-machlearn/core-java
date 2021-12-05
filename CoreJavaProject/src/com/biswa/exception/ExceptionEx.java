package com.biswa.exception;

public class ExceptionEx {

	public static void main(String[] args) {
		System.out.println("Hello..");
		try {
			int a = 20;
			int b = 0;
			int div = a / b;
			System.out.println(div);// Exception
		} catch (ArithmeticException e) {
			System.out.println("Exception - Div with 0 Not Possible..");
		} finally {
			System.out.println("I am in finally..");
		}
		System.out.println("Bye..");
	}

}
