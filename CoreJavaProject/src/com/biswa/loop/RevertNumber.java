package com.biswa.loop;

public class RevertNumber {

	public static void main(String[] args) {
		int n = 123;
		int sum = 0;
		int rem;
		while (n != 0) {
			rem = n % 10;
			sum = (sum *10) + rem;
			n = n / 10;
		}
		System.out.println(sum);
	}
}
