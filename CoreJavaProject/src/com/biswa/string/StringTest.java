package com.biswa.string;

public class StringTest {

	public static void main(String[] args) {
		String name = "Biswaranjan";// String literal
		String myName = new String("Kunal");// Using New Keyword

		System.out.println(name);
		System.out.println(myName);
		// 1. Length Of String
		int length = myName.length();
		System.out.println("Length = " + length);//5

		// 2. charAt(int index)- It returns the character presenyt in the specified
		// index
		System.out.println("charAt - " + name.charAt(2));//s

		// 3. equals() - Compare 2 strings and returns true if equal and false
		// if not equal (Note - It is Case sensitive)

		System.out.println(name.equals(myName));//false
		System.out.println(name.equals("Biswaranjan"));//true
		System.out.println(name.equals("biswaranjan"));//false
		
		// 3. equalsIgnoreCase() - Compare 2 strings and returns true if equal and false
		// if not equal (Note - It is not Case sensitive)
		System.out.println(name.equalsIgnoreCase("BISWARANJAN"));//true
		
		//4. compareTo(s) - It compare two String and return 0 if true 
		// other wise return number (Note - It is Case sensitive)
		System.out.println(name.compareTo("biswaranjaN"));//-32
		System.out.println(name.compareTo("Biswaranjan"));//0
		System.out.println(name.compareToIgnoreCase("biswaranjan"));//0
		
		//5. toUpperCase
		System.out.println("MaDhusMita".toUpperCase());
		
		//6. toLowercase
		System.out.println("MaDhusMita".toLowerCase());
		
		//7. trim() - remove the spaces from beginning and end
		System.out.println("          Barshnya Kumar               ");
		System.out.println("          Barshnya Kumar               ".trim());
		
		//8. split()
		String str="biswa,kunal&madhu,barshnya,&Aditri";
		String[] splitName = str.split("&");
		for(int i=0;i<splitName.length;i++) {
			System.out.println("splitName["+i+"] - "+splitName[i]);
		}
		
		
		
	}

}
