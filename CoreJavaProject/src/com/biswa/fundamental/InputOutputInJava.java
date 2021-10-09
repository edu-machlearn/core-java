package com.biswa.fundamental;

import java.util.Scanner;

public class InputOutputInJava {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		// String name = "Raghu.";
		System.out.println("Enter Name - ");
		String name = sc.next();
		System.out.println(name);
		System.out.println("Good Evening-" + name);

		System.out.println("Enter Age : ");
		int age = sc.nextInt();
		System.out.println("Age - "+age);
		
		System.out.println("Enter Salary : ");
		float salary = sc.nextFloat();
		System.out.println("Salary - "+salary);
		
		
	}

}

//Good Evening - Biswaranjan Mohapatra