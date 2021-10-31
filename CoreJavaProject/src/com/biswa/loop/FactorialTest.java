/*
	Q. WAP to find out the factorial of number taking from key board.
	n = 5;
		1 X 2 X 3 X 4 X 5 = 120
		factorail of 0 and 1 is  = 1
*/
package com.biswa.loop;

import java.util.Scanner;

public class FactorialTest {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a Number : ");
		int n = sc.nextInt();
		int fact = 1;
		for (int i = 1; i <= n; i++) {
			fact = fact * i;
		}
		System.out.println("Factorail of " + n + " = " + fact);
	}

}
