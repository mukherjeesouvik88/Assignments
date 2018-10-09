package com.deloitte;

public class Assignment2 {

	public static void main(String[] args) {
		String s1 = "abc";
	    String s2 = "xyz";
	    
	    
	   for(int i=1;i <= 50 ; i++) {
		   if(i%3 == 0) {
			   
			   if (i%3 == 0 && i%5 == 0) {
				 System.out.println(s1 + s2);
			   }
			   else {
				   System.out.println(s1);
			   }
		   }
		   else if (i%5==0) {
			   System.out.println(s2);
			   }
		   else {
			   System.out.println(i);
		   }
	   }

	}

}
