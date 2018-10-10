package com.deloitte;

import java.util.Random;

public class Assignment10 {

	public static void main(String[] args) {
		RandomStr();

	}

	private static void RandomStr() {
        int i = 0;
	String[]	article = {"the", "a",  "one", "some" };
	String[] 	noun = {"boy", "girl", "dog", "town", "car"};
	String[]	verb = {"drove", "jumped", "ran", "walked", "skipped"};
	String[]	preposition = {"to", "from", "over", "under", "on"};	
		
	while(i<20){
		
	int s1 = new Random().nextInt(4);
	int s2 = new Random().nextInt(5);
	int s3 = new Random().nextInt(5);
	int s4 = new Random().nextInt(5);
	int s5 = new Random().nextInt(4);
	int s6 = new Random().nextInt(5);
	String str = article[s1];
	String cap = str.substring(0, 1).toUpperCase() + str.substring(1);
	
	System.out.println(cap+ " "+noun[s2]+ " " +verb[s3]+ " " +preposition[s4]+ " "+ article[s5]+ " "+ noun[s6]+ "." );
        System.out.println();
	
	i++;
	}
	
	}

}
