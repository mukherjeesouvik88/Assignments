package com.deloitte;

import java.util.InputMismatchException;
import java.util.Scanner;

public class NumberUtil {

	public static void main(String[] args) {
		mul();
		root();

	}

	private static void root() {
		try{
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the number to find the root of");
		int a = scan.nextInt();
		System.out.println("The square root is " + Math.sqrt(a));
		}catch(InputMismatchException e){
			System.out.println("Enter numbers only");
		}
	}

	private static void mul() {
		try {
			Scanner scan = new Scanner(System.in);
			System.out.println("Enter First number to be multiplied");
			int a = scan.nextInt();
			System.out.println("Enter to 2nd number to be multiplied");
			int b = scan.nextInt();
			System.out
					.println("The Resuslt of " + a + "*" + b + " is " + a * b);
		} catch (InputMismatchException e) {
			System.out.println("Enter numbers only");
		}

	}

}
