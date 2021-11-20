package com.biswa.inheritance;

interface Animal {
	void character(String character);
}
class Dog implements Animal {

	@Override
	public void character(String character) {
		System.out.println("Dog - " + character);

	}
}
class Cat implements Animal {
	@Override
	public void character(String character) {
		System.out.println("Cat - " + character);
	}
}
public class InterfaceDemo {

	public static void main(String[] args) {
		Dog dog = new Dog();
		dog.character("Barking");
		Cat cat = new Cat();
		cat.character("Mew....");
	}
}
