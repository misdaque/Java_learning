package com.misdaque.basic;

import java.util.Scanner;

public class Exercise6 {
	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);

		System.out.print("Enter the first number 'a' : ");
		int a = input.nextInt();
		System.out.print("Enter the second number 'b' :");
		int b = input.nextInt();

		System.out.println("Addition of the two number 'a' and 'b' is " + (a + b));
		System.out.println("Subtraction of the two number 'a' and 'b' is " + (a - b));
		System.out.println("Multiplication of the two number 'a' and 'b' is " + (a * b));
		System.out.println("Quotient when 'a' is divided by 'b' is " + (a / b));
		System.out.println("Remainder when a divided by b is " + (a % b));

	}
}
