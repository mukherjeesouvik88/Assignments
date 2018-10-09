package com.deloitte;

import java.util.InputMismatchException;
import java.util.Scanner;

public class FactorialNum {

	public static void main(String[] args) {
		facto();
	}

	private static void facto() {
		try{
		System.out.println("Enter the number");
		Scanner scan = new Scanner(System.in);
		int num = scan.nextInt();
		int z = 1;
		while (num > 0) {
			z = z * num;
			num--;
		}

		System.out.println("The factorial of the number is: " + z);
	}catch(InputMismatchException e){
		System.out.println("Enter numbers only");
	}
	}

}
