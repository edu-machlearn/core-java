package com.biswa.inheritance;

abstract class Super {
	void showSuper() {
		System.out.println("Hi!");
	}

	abstract void show();
}

public class AbstractClassTest extends Super {
	void show() {
		System.out.println("In show.");
	}

	public static void main(String[] args) {
		AbstractClassTest obj = new AbstractClassTest();
		obj.showSuper();
		obj.show();
	}
}
/*
 * - it is declared by using abstract keyword - If a class is abstract then we
 * can not create the object of that class. - if any body wants to use the
 * property of that class in another class then we need to subclass it. -
 * Abstract class contain either complete method or abstract method or
 * combination of both.
 * 
 * - Abstract Method is a method declared using abstract keyword and does not
 * contain any body.
 * 
 * Example: - void show(){//Complete method //Body } - abstract void show();//
 * This is abstract method
 * If an abstract class contains any abstract method then we need to 
 * override it in its sub class
 */