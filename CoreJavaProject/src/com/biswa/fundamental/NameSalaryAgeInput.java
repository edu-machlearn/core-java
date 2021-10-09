package com.biswa.fundamental;

import java.util.Scanner;

public class NameSalaryAgeInput {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter Name :");
		String name = sc.next();
		System.out.print("Enter Age : ");
		int age = sc.nextInt();
		System.out.print("Enter Salary : ");
		double salary = sc.nextDouble();
		System.out.println("NAME \t AGE \t Salary");
		System.out.println("-----------------------");
		System.out.println(name + "\t" + age + "\t" + salary);
		System.out.println("Name - "+name+"  Age - "+age+"   Salary -"+salary);
		

	}

}
