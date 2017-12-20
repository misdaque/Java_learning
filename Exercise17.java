package com.misdaque.basic;

import java.util.Scanner;

//A Program to add two binary numbers.

public class Exercise17 {

	public static void main(String[] args) {
		/*
		 * int a=10; String b= Integer.toString(a); //To convert integer value to string
		 * System.out.println(b);
		 */

		int FirstBinary; // To take two inputs from user for addition
		int SecondBinary;

		Scanner input = new Scanner(System.in);

		System.out.print("Please input First Binary Number for addition : ");
		FirstBinary = input.nextInt();
		System.out.print("Please input Second Binary Number for addition : ");
		SecondBinary = input.nextInt();

		int add[] = new int[30];
		int i = 0, remainder = 0, j = 0, ThirdBinary = 1;
		int sum[] = new int[30];

		while (FirstBinary != 0 || SecondBinary != 0) {
			add[i++] = ((FirstBinary % 10) + (SecondBinary % 10) + remainder) % 2;
			remainder = ((FirstBinary % 10) + (SecondBinary % 10) + remainder) / 2;
			FirstBinary = FirstBinary / 10;
			SecondBinary = SecondBinary / 10;

		}

		if (remainder != 0) {
			add[i] = remainder;
		}
		remainder=0;		//for using while shifting the values from array  to an integer
		System.out.println("The addition of the two Binary are:");
		int r = i;
		for (; i >= 0; i--) {
			System.out.print(add[i]);

			sum[j++] = add[i];

		}
		System.out.println();
		for (int a = 0; a <= r; a++) {
			System.out.print(sum[a]);
		ThirdBinary = ThirdBinary*10+sum[remainder++];
		}
		System.out.println();
		i=1;
		for(int a=0; a<j; a++)
			i=i*10;
		ThirdBinary=ThirdBinary-i;
		System.out.println(ThirdBinary);
		
		
	}
	

}
