package com.misdaque.basic;

import java.util.Scanner;

//Conversion: Binary to Hexadecimal

public class Exercise23 {
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

		String Hex[] = { "0", "1", "2", "3", "4", "5", "6", "7", "8", "9", "A", "B", "C", "D", "E", "F" };
		String Val[] = new String[16];
		int index, i = 0;

		while (Decimal >= 16) {
			index = Decimal % 16;
			Decimal = Decimal / 16;
			Val[i++] = Hex[index];

		}
		if (Decimal < 16)
			Val[i] = Hex[Decimal];
		System.out.print("The Hexadecimal Value of the decimal number is: ");
		for (; i >= 0; i--) {
			System.out.print(Val[i]);
		}
	}

}
