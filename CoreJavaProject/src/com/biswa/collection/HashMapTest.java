package com.biswa.collection;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class HashMapTest {

	public static void main(String[] args) {
		Map<String, String> map = new HashMap<>();
		map.put("name", "Biswaranjan");
		map.put("mail", "biswa@gmail.com");
		map.put("mobile", "9437636605");
		map.put("address", "Bhubaneswar");
		
		System.out.println(map);
		System.out.println(map.get("name"));
		
		for(Map.Entry<String,String> entry:map.entrySet()) {
			System.out.println(entry.getKey()+"  "+entry.getValue());
		}
	}

}
