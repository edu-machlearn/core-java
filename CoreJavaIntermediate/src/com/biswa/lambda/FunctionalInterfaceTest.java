package com.biswa.lambda;

import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;

public class FunctionalInterfaceTest {
	public static void main(String[] args) {
		// Supplier
		Supplier<String> supplier = () -> {
			return "Biswaranjan";
		};
		System.out.println(supplier.get());

		// Consumer
		Consumer<String> consumer = (name) -> {
			System.out.println("Name : " + name);
		};
		consumer.accept("Biswaranjan Mohapatra");

		// Perdicate
		Predicate<String> predicate = (name) -> {
			if (name.equalsIgnoreCase("biswa"))
				return true;
			return false;
		};
		System.out.println(predicate.test("Biswaranjan"));

		// Function
		Function<String, String> function = (name) -> {
			if (name.equals("Aditri")) {
				return "Aditri Mohapatra";
			} else
				return "Invalid Name!";
		};
		System.out.println(function.apply("Biswa"));
	}
}
