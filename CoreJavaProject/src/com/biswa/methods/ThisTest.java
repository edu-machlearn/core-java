package com.biswa.methods;

class Addition {
	float a;// this.a = 10
	float b;// this.b = 20

	Addition(float a, float b) {// Constructor- Parameterized
		System.out.println(a + b);
		this.a = a;// Right Hand is Constructor Value and left is Instance Variable
		this.b = b;
	}

	void sub() {
		System.out.println(a - b);
	}
}

public class ThisTest {

	public static void main(String[] args) {
		Addition add = new Addition(10.2F, 20.5F);
		add.sub();
	}
}
// this - represents to current class object reference