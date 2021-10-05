package com.biswa.datatype;

import java.util.Random;

public class FieldsVsVariables {

	public static void main(String[] args) {
		boolean flag = (new Random()).nextBoolean();
		System.out.println(flag);
		long variable_x;
		if (flag) {
			variable_x = 100L;
		} else {
			variable_x = 200L;
		}
		System.out.println(variable_x);
	}

}
