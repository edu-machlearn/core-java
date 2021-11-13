package com.biswa.methods;

class Area {
	void area(int r) {
		System.out.println("Area of Circle is " + (2 * 3.14 * r));
	}

	void area(float r) {
		System.out.println("Area of Circle is " + (2 * 3.14 * r));
	}

	void area(int a, int b) {
		System.out.println("Area of Rectange is " + (a * b));
	}
}

public class AreaOverload {

	public static void main(String[] args) {
		Area a = new Area();
		a.area(10);// area(int r)
		a.area(2.5F);// area(float r)
		a.area(2, 4);// area(int a, int b)
	}
}
