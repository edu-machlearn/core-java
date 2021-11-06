package com.biswa.classAndObject;

public class Student {
	int roll;
	String name;
	float mark;

	void takeAdmission() {
		System.out.println(roll + " " + name + " " + mark);
	}

	public static void main(String[] args) {
		Student ankita = new Student();
		ankita.roll = 1;
		ankita.name = "Ankita";
		ankita.mark = 90;
		ankita.takeAdmission();
		
		Student ayan = new Student();
		ayan.roll = 2;
		ayan.name = "Ayan";
		ayan.mark = 89;
		ayan.takeAdmission();
	}
}
