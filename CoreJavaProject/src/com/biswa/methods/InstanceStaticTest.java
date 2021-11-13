package com.biswa.methods;

class InstanceStatic {
	int a = 10;// instance variable
	static int b = 20;// static variable

	void showA() {// Instance Method
		System.out.println("I am in showA()" + (a + b));
	}

	static void showB() {// Static Method
		// System.out.println("I am in showB()" + (a + b)); -->Give Error
		System.out.println("I am in showB()" + (b + b));
	}
}

public class InstanceStaticTest {

	public static void main(String[] args) {
		InstanceStatic obj = new InstanceStatic();
		obj.showA();

		InstanceStatic.showB();
	}
}
//1. Instance method call through object but static method call through class
//2. Instance method can access both instance variable and static variable
//   But static method can call only static variable.