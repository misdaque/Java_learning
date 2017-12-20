package com.misdaque.basic;

import java.util.Scanner;

//Conversion: Decimal to Octal

public class Exercise24 {
	public static void main(String[] args) {

		long Binary;

		Scanner input = new Scanner(System.in);
		System.out.print("Enter the Binary Number: ");
		Binary = input.nextLong();
		int remainder, DecimalNum = 0, j = 0, i = 0;
		int Num[] = new int[30];

		while (Binary != 0) {
			remainder = (int) (Binary % 10);
			DecimalNum = DecimalNum + (int) (remainder * (Math.pow(2, j++)));
			Binary = Binary / 10;
		}
		while (DecimalNum >= 8) {
			Num[i++] = DecimalNum % 8;
			DecimalNum = DecimalNum / 8;

		}
		if (DecimalNum < 8) {
			Num[i] = DecimalNum;
		}
		System.out.print("The Octal Number is: ");
		for (; i >= 0; i--) {
			System.out.print(Num[i]);
		}

	}
}
