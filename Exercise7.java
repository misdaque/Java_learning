package com.misdaque.basic;

import java.util.Scanner;

public class Exercise7 {
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter a number : ");
		int number= input.nextInt();
		
		for (int i=1; i<=10; i++) {
			
			System.out.println(number +" X " +i +" = " +(i*number));;
		}
	}

}
