package com.biswa.exception;

public class ExceptionTest {

	public static void main(String[] args) {
		System.out.println("Hello");

		int arr[] = new int[] { 1, 2, 3, 4, 5 };

		try {
			System.out.println(10 / 0);
		} catch (ArithmeticException ex) {
			System.out.println("Divide 10/0 Not Allowed.");
		}

		try {
			System.out.println(arr[10]);
		} catch (ArrayIndexOutOfBoundsException ex1) {
			System.out.println("Invalid ArrayIndex Found.");
		} finally {
			System.out.println("I am in finally..");
		}
		System.out.println("Bye");
	}
}
