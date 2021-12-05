package com.biswa.collection;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

import com.biswa.classAndObject.Employee;

public class SetTest {

	public static void main(String[] args) {
		/*
		Set<String> hs = new HashSet<>();
		System.out.println(hs);

		hs.add("Biswaranjan");
		hs.add("Barshnya");
		hs.add("Shibashis");
		hs.add("Ankita");
		hs.add("Madhusmita");
		hs.add("Aditri");
		System.out.println(hs);

		int count = 0;
		Iterator<String> itr = hs.iterator();
		while (itr.hasNext()) {
			String name = itr.next();
			if (name.contains("A")) {
				count++;
				System.out.println(count + ". " + name);
			}

		}*/
		
		Set<Product> productSet=new HashSet<Product>();
		productSet.add(new Product("1111","TV",20000));
		productSet.add(new Product("2222","AC",50000));
		productSet.add(new Product("1111","Mobile",10000));
		productSet.add(new Product("1111","Smart Watch",15000));
		
		System.out.println(productSet);
		
		Iterator<Product> itr=productSet.iterator();
		while(itr.hasNext()) {
			Product product= itr.next();
			if(product.getPrice()<=15000) {
			System.out.println(product.getPid()+"  "+product.getPname()+"  "+product.getPrice());
			}
		}
	}

}
