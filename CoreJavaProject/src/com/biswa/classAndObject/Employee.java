package com.biswa.classAndObject;

import java.util.Scanner;

public class Employee {
	int eid;
	String ename;
	float salary;

	void takeData() {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter Id : ");
		eid = sc.nextInt();
		sc.nextLine();
		System.out.print("Enter NAme : ");
		ename = sc.nextLine();
		System.out.print("Enter Salary : ");
		salary = sc.nextFloat();
	}

	void displayData() {
		System.out.println(eid + " " + ename + " " + salary);
	}
}
