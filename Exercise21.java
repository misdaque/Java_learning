package com.misdaque.basic;

import java.util.Scanner;

//A Program to convert Decimal to Octal

public class Exercise21 {
	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);

		int DecimalNum, i = 0;
		int Num[] = new int[30];
		System.out.print("Enter the Decimal Number: ");
		DecimalNum = input.nextInt();

		while (DecimalNum >= 8) {
			Num[i++] = DecimalNum % 8;
			DecimalNum = DecimalNum / 8;

		}
		if (DecimalNum < 8) {
			Num[i] = DecimalNum;
		}
		System.out.print("The Octal Number is: ");
		for(;i>=0;i--) {
			System.out.print(Num[i]);
		}

	}

}
