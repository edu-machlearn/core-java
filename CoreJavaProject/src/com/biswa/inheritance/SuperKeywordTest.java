package com.biswa.inheritance;

class SuperClass {
	int x = 10;
}

public class SuperKeywordTest extends SuperClass {
	int x = 20;
	int oldX = super.x;

	public static void main(String[] args) {
		SuperKeywordTest obj = new SuperKeywordTest();
		System.out.println(obj.x);
		System.out.println(obj.oldX);
	}

}
