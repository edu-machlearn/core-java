package com.biswa.operator;

public class LogicalOperatorTest {

	public static void main(String[] args) {
		System.out.println((5 == 5) && (5 != 2));
		System.out.println((5 < 2) && (5 != 2));
		System.out.println((5 < 2) || (5 != 2));
		System.out.println((5 < 2));
		System.out.println(!(5 == 2));
	}

}
