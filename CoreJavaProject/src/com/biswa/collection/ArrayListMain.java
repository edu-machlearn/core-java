package com.biswa.collection;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ArrayListMain {

	public static void main(String[] args) {
		List li = new ArrayList();// We can create ArrayList
		System.out.println(li);
		li.add(10);
		li.add(10.5);
		li.add(null);
		li.add(true);
		li.add("String");
		li.add(new Integer(20));
		System.out.println(li);

		List<String> newList = new ArrayList<>();
		newList.add("Ankita");
		newList.add("Barshnya");
		newList.add("Kunal");
		newList.add("Madhu");
		newList.add("Shibashis");
		newList.add("Aditri");
		System.out.println(newList);

		// Q. Display student List that is start with A
		System.out.println("-------");
		Iterator<String> itr = newList.iterator();// 1
		while (itr.hasNext()) {
			String myName = itr.next();
			if (myName.equalsIgnoreCase("aditri")) {
				System.out.println(myName+" Length : "+myName.length()+" --"+myName.toUpperCase());
			}
		}

	}
}
