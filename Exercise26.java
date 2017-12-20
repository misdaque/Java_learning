package com.misdaque.basic;

import java.util.Scanner;

//Conversion: Octal to Binary

public class Exercise26 {
	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);

		int OctalNum, DecimalNum = 0, remainder, j = 0;
		System.out.print("Enter the Octal Number: ");
		OctalNum = input.nextInt();

		while (OctalNum != 0) {

			remainder = OctalNum % 10;
			DecimalNum = DecimalNum + (int) (remainder * Math.pow(8, j++));
			OctalNum /= 10;

		}

		int BinaryNum[] = new int[30];
		remainder = 0;
		j = 0;

		while (DecimalNum != 1) {
			BinaryNum[j++] = DecimalNum % 2;
			DecimalNum /= 2;
		}
		if (DecimalNum == 1) {
			BinaryNum[j] = DecimalNum;
		}
		System.out.print("Binary Number is ");
		for (; j >= 0; j--) {
			System.out.print(BinaryNum[j]);
		}
	}

}
