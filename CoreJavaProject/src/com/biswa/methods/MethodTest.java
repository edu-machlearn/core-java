package com.biswa.methods;

import java.util.Scanner;

class Method {
	int a = 10;
	int b = 20;

	// This is a Mehod that have no parameter and No return Type
	void add() {
		System.out.println("Addition = " + (a + b));
	}

	// This is a Mehod that have no parameter but return Type
	int addition() {
		System.out.println("Calling from int addition() ");
		return a + b;
	}

	float addition(float x, float y) {
		return x + y;
	}

	String getMyName(String name) {
		return name;
	}
}

public class MethodTest {

	public static void main(String[] args) {
		Method m1 = new Method();
		m1.add();

		int result = m1.addition();
		System.out.println(result);

		float add = m1.addition(100.2F, 200.5F);
		System.out.println(add);

		Scanner sc = new Scanner(System.in);
		System.out.print("Enter Name : ");
		String inputName = sc.nextLine();
		String myName = m1.getMyName(inputName);
		System.out.println("Hello - " + myName);

	}
}
