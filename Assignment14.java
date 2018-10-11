package com.deloitte;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Assignment14 {
	static Pattern patternID;
	static Pattern patternPASS;
	static Matcher matcherID;
	static Matcher matcherPASS;
	static String regex1 = "^(\\d{3}-?\\d{2}-?\\d{4})$";
	static String regex2 = "^(?=.*[0-9])(?=.*[a-z])(?=.*[A-Z])(?=.*[@#$%^&+=])(?=\\S+$).{8,}$";
		
	private static void IDvalidator() {
		patternID = Pattern.compile(regex1);
		System.out.println("Enter ID");
		Scanner scan= new Scanner(System.in);
		String inputID = scan.nextLine();
		boolean IDO = validateID(inputID);
		if(IDO) {
			System.out.println("ID is valid");
			System.out.println("Enter password");
			PASSvalidator();
		}
		else {
			System.out.println("Invalid ID, run again");
		}
		
		
	}


	private static void PASSvalidator() {
		patternPASS = Pattern.compile(regex2);
		Scanner scan= new Scanner(System.in);
		String inputPASS = scan.nextLine();
		boolean PASSO = validatePASS(inputPASS);
		if(PASSO) {
			System.out.println("ID and pass accepted");
		}
		else {
			System.out.println("Wrong pass, run again");
		}
		
		
	}


	private static boolean validatePASS(String inputPASS) {
		matcherPASS = patternPASS.matcher(inputPASS);
		return matcherID.matches();
	}


	private static boolean validateID(String inputID) {
		matcherID = patternID.matcher(inputID);
		return matcherID.matches();
	}
	
	public static void main(String[] args) {
		IDvalidator();
	
	}



}
