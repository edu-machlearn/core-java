package com.biswa.inheritance;

public class FinalVarTest {

	public static void main(String[] args) {
		//final int a = 10;
		int a = 10;
		a = a + 1;//The final local variable a cannot be assigned.
		System.out.println(a);
	}
}
//If a Variable is declared as final it will never changed.