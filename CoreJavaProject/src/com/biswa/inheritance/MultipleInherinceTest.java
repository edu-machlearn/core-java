package com.biswa.inheritance;

class Class1{
	int a = 10;
	void showA() {
		System.out.println(a);
	}
}

interface Interface1{
	void show();
}

interface Interface2{
	void disp();
}

public class MultipleInherinceTest extends Class1 implements Interface1,Interface2{

	

	@Override
	public void disp() {
		System.out.println("Disp");
		
	}

	@Override
	public void show() {
		System.out.println("Show");
		
	}
	public static void main(String[] args) {
		MultipleInherinceTest m= new MultipleInherinceTest();
		m.disp();
		m.show();
		m.showA();
	}
}
