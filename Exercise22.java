package com.misdaque.basic;

import java.util.Scanner;

//Conversion: Binary to Decimal

public class Exercise22 {
	public static void main(String[] args) {
		long Binary;

		Scanner input = new Scanner(System.in);
		System.out.print("Enter the Binary Number: ");
		Binary = input.nextLong();
		int remainder, Decimal = 0, j = 0;

		while (Binary != 0) {
			remainder = (int) (Binary % 10);
			Decimal = Decimal + (int) (remainder * (Math.pow(2, j++)));
			Binary = Binary / 10;
		}

		System.out.println("Decimal Value is: " + Decimal);

	}

}
