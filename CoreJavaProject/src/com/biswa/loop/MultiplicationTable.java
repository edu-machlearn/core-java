package com.biswa.loop;

public class MultiplicationTable {

	public static void main(String[] args) {
		/*
		int n = 19;
		for (int i = 1; i <= 10; i++) {
			System.out.println(n + " X " + i + " =" + (n * i));
		}
		*/
		
		/*
		int n = 19;
		int i = 1;
		while(i <= 10) {
			System.out.println(n + " X " + i + " =" + (n * i));
			i++;
		}
		*/
		
		int n = 19;
		int i = 1;
		do {
			System.out.println(n + " X " + i + " =" + (n * i));
			i++;
		}
		while(i <= 10);
		
	}

}
