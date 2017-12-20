package com.misdaque.basic;

import java.util.Scanner;

//To reverse the String 

public class Exercise37 {
	public static void main(String[] args) {
		
		Scanner input= new Scanner(System.in);
		System.out.print("Enter the String: ");
		String getstring = input.nextLine();
		
		for(int i = getstring.length()-1; i>=0;i--) {
			System.out.print(getstring.charAt(i));
		}
	}

}
