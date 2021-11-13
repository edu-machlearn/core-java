package com.biswa.classAndObject;

class StudentCon {
	StudentCon() {// This is a constructor
		System.out.println("I am in Default Constructor..");
	}

	void studentCon() {
		System.out.println("I am in Method.");
	}
}

public class StudentConstructorTest {

	public static void main(String[] args) {
		//
		StudentCon stu = new StudentCon();
		stu.studentCon();
		
	}
}
