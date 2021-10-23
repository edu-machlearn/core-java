package com.biswa.controllstatement;

public class NestedIfTest {
	public static void main(String[] args) {
		int a = 10;
		int b = 20;
		if (a == 20) {
			if (b == 20) {
				System.out.println("Valid");
			} else {//Inner If
				System.out.println("b Not Matched.");
			}
		} else {//Outer If
			System.out.println("a Not Matched.");
		}
	}
}
