package com.Souvik;

import java.util.Scanner;

public class Asignment1 {

	private static void printTriangle(int num) {
		int k = 2 * num - 2;
		int L=1;

		// outer loop to handle number of rows
		// n in this case
		for (int i = 0; i < num; i++) {

			// inner loop to handle number spaces
			// values changing acc. to requirement
			for (int j = 0; j < k; j++) {
				// printing spaces
				System.out.print(" ");
			}

			if(i<num/2+1){// decrementing k after each loop
			k = k - 1;
			}
			else{
				k=k-2;
			}

			// inner loop to handle number of columns
			// values changing acc. to outer loop
			if(i<num/2){
			for (int j = 0; j <= i; j++) {
				// printing stars
				System.out.print("* ");
			}
			}
			else{
				for (int j = 0; j <=i+L; j++) {
					// printing stars
					System.out.print("* ");
				}
			L++;	
			}
            
			// ending line after each row
			System.out.println();
		}

	}

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int num = scan.nextInt();
		printTriangle(num);

	}

}
