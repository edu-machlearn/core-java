package com.biswa.inheritance;

class A {// Parent
	int a = 10;
	
	void showA() {
		System.out.println("I am in Parent.");
	}
}

class B extends A {// Child
	float b = 20;

	void showB() {
		System.out.println("I am in child.");
	}

	void add() {
		System.out.println(a + b);
	}
}

public class InheritanceTest {

	public static void main(String[] args) {
		A obj = new A();// Obj contain Propery of A
		obj.showA();
		// obj.showB();
		B obj1 = new B();// obj1 contains property of A and B
		obj1.showA();
		obj1.showB();
		obj1.add();
	}

}
