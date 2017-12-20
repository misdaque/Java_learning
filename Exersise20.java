package com.misdaque.basic;

import java.util.Scanner;

//A Program to convert decimal number to Hexadecimal

public class Exersise20 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		int DecimalNum;
		System.out.print("Enter the Decimal Number :");
		DecimalNum = input.nextInt();

		String Hex[] = { "0", "1", "2", "3", "4", "5", "6", "7", "8", "9", "A", "B", "C", "D", "E", "F" };
		String Val[]=new String[16];
		int index, i=0;
		
		while(DecimalNum>=16) {
			index=DecimalNum%16;
			DecimalNum=DecimalNum/16;
			Val[i++]=Hex[index];
			
		}
		if(DecimalNum<16)
			Val[i]=Hex[DecimalNum];
		System.out.println("The Hexadecimal Value of the decimal number is: ");
		for(;i>=0;i--) {
			System.out.print(Val[i]);
		}

	}

}
