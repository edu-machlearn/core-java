package com.biswa.array;

public class ArrayTest {

	public static void main(String[] args) {
		String[] name = { "Ankita", "Ayan", "Barshnya", "Kunal", "Shibasis" };
		//System.out.println(name[4]);
		for (int i = 0; i < name.length; i++) {
			if(name[i].charAt(0)=='A') {
				System.out.print(name[i]+" ");
			}
		}
	}
}
