package com.misdaque.basic;

import java.util.Scanner;

//A program to Convert Decimal Number to Binary Number

public class Exercise19 {
	
	public static void main(String[] args) {
		
		Scanner input= new Scanner(System.in);
		
		int DecimalNum;
		int Num[]= new int[20];
		int i=0;
		
		System.out.print("Enter the Decimal number: ");
		DecimalNum = input.nextInt();
		
		while (DecimalNum!=1) {
			Num[i++] = DecimalNum%2;
			DecimalNum=DecimalNum/2;
		}
		if (DecimalNum==1) {
			Num[i]=1;
		}
		System.out.println("The Binary of the given Decimal Number is ");
		for(;i>=0 ;i--) {
			System.out.print(Num[i]);
			
		}
	}

}
