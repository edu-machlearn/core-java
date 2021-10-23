package com.biswa.controllstatement;

public class SwitchTest {
	public static void main(String[] args) {
		switch ("ssss") {
		case "Abc": {
			System.out.println("1");
			break;
		}

		case "Xyz": {
			System.out.println("2");
			break;
		}

		case "Pqr": {
			System.out.println("3");
			break;
		}
		default: {
			System.out.println("0");
		}
		}
	}
}
