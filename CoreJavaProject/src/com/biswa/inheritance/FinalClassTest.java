package com.biswa.inheritance;

final class FinalClass {

	void show() {
		System.out.println("Hi.");
	}
}

public class FinalClassTest {// extends FinalClass {

	public static void main(String[] args) {
		FinalClass obj = new FinalClass();
		obj.show();
	}
//The type FinalClassTest cannot subclass the final class FinalClass
}
//if a class is declared as final we can not sub class it.
//If a method is final we can not override it