package com.biswa.inheritance;

class Parent {
	void show() {
		System.out.println("Parent show().");
	}

}

class Child extends Parent {
	void show() {
		System.out.println("Child show().");
	}

	void show(int a) {
		System.out.println("Child show()." + a);
		System.out.println();
	}
}

public class MethodOverridingTest {

	public static void main(String[] args) {
		Child c = new Child();
		c.show();// Child
		c.show(10);// Child
	}

}

