package com.deloitte;

import java.util.Scanner;

public class DecToRom {

	
	public static void main(String[] args) {
		Converter();

	}

	private static void Converter() {
		System.out.println("Enter the number to convert");
		Scanner scan = new Scanner(System.in);
		int num = scan.nextInt();
		String[] s1 = {"I","II","III","IV"};
		String[] s2 = {"V","VI","VII","VIII","IX"};
		String[] s3 = {"X","XX","XXX","XXXX"};
		String[] s4 = {"L","LX","LXX","LXXX","XC"};
		String[] s5 = {"C","CC","CCC","CD"};
		String[] s6 = {"D","DC","DCC","DCCC","CM"};
		
		
		if(num/1000 == 0){
			
			if(num/500 == 0){
				
				if(num/100 == 0){
					
					if(num/50 == 0){
					
					  if(num/10 == 0){
						
						  if(num/5 == 0){
							
							int a = num;
							switch(a) {
							case 1:System.out.println(s1[0]);break;
							case 2:System.out.println(s1[1]);break;
							case 3:System.out.println(s1[2]);break;
							case 4:System.out.println(s1[3]);break;
							default:{}
							}	
						}//1-4
						else{
							int a = num%5;
							switch(a){
							case 0:System.out.println(s2[0]);break;
							case 1:System.out.println(s2[1]);break;
							case 2:System.out.println(s2[2]);break;
							case 3:System.out.println(s2[3]);break;
							case 4:System.out.println(s2[4]);break;
							}
						}//5-9				
					}
					else{
						int b = num/10;
						int a = num%10;
						switch(b){
						case 1:{
							if(a/5 == 0){
								switch(a) {
								case 0:System.out.println(s3[0]);break;
								case 1:System.out.println(s3[0]+s1[0]);break;
								case 2:System.out.println(s3[0]+s1[1]);break;
								case 3:System.out.println(s3[0]+s1[2]);break;
								case 4:System.out.println(s3[0]+s1[3]);break;
								default:{}
								}	
							}//11-14
							else{
								int c = a%5;
								switch(c){
								case 0:System.out.println(s3[0]+s2[0]);break;
								case 1:System.out.println(s3[0]+s2[1]);break;
								case 2:System.out.println(s3[0]+s2[2]);break;
								case 3:System.out.println(s3[0]+s2[3]);break;
								case 4:System.out.println(s3[0]+s2[4]);break;
								}
							}//15-19				
							
						}//11-19
						case 2:{
							if(a/5 == 0){
								switch(a) {
								case 0:System.out.println(s3[1]);break;
								case 1:System.out.println(s3[1]+s1[0]);break;
								case 2:System.out.println(s3[1]+s1[1]);break;
								case 3:System.out.println(s3[1]+s1[2]);break;
								case 4:System.out.println(s3[1]+s1[3]);break;
								default:{}
								}	
							}//21-24
							else{
								int c = a%5;
								switch(c){
								case 0:System.out.println(s3[1]+s2[0]);break;
								case 1:System.out.println(s3[1]+s2[1]);break;
								case 2:System.out.println(s3[1]+s2[2]);break;
								case 3:System.out.println(s3[1]+s2[3]);break;
								case 4:System.out.println(s3[1]+s2[4]);break;
								}
							}//25-29				
						}//21-29
						case 3:{
							if(a/5 == 0){
								switch(a) {
								case 0:System.out.println(s3[2]);break;
								case 1:System.out.println(s3[2]+s1[0]);break;
								case 2:System.out.println(s3[2]+s1[1]);break;
								case 3:System.out.println(s3[2]+s1[2]);break;
								case 4:System.out.println(s3[2]+s1[3]);break;
								default:{}
								}	
							}//31-34
							else{
								int c = a%5;
								switch(c){
								case 0:System.out.println(s3[2]+s2[0]);break;
								case 1:System.out.println(s3[2]+s2[1]);break;
								case 2:System.out.println(s3[2]+s2[2]);break;
								case 3:System.out.println(s3[2]+s2[3]);break;
								case 4:System.out.println(s3[2]+s2[4]);break;
								}
							}//35-39			
						}//31-39
						case 4:{
							if(a/5 == 0){
								switch(a) {
								case 0:System.out.println(s3[3]);break;
								case 1:System.out.println(s3[3]+s1[0]);break;
								case 2:System.out.println(s3[3]+s1[1]);break;
								case 3:System.out.println(s3[3]+s1[2]);break;
								case 4:System.out.println(s3[3]+s1[3]);break;
								default:{}
								}	
							}//41-44
							else{
								int c = a%5;
								switch(c){
								case 0:System.out.println(s3[3]+s2[0]);break;
								case 1:System.out.println(s3[3]+s2[1]);break;
								case 2:System.out.println(s3[3]+s2[2]);break;
								case 3:System.out.println(s3[3]+s2[3]);break;
								case 4:System.out.println(s3[3]+s2[4]);break;
								}
							}//45-49			
						}
						
					}
				}//11-49
					  		
			}
					else{
						int a = num%50;
						switch(a){
								case 0:System.out.println(s4[0]);break;
								case 1:System.out.println(s4[0]+s1[0]);break;
								case 2:System.out.println(s4[0]+s1[1]);break;
								case 3:System.out.println(s4[0]+s1[2]);break;
								case 4:System.out.println(s4[0]+s1[3]);break;
								case 5:System.out.println(s4[0]+s2[0]);break;
								case 6:System.out.println(s4[0]+s2[1]);break;
								case 7:System.out.println(s4[0]+s2[2]);break;
								case 8:System.out.println(s4[0]+s2[3]);break;
								case 9:System.out.println(s4[0]+s2[4]);break;
								case 10:System.out.println(s4[1]);break;
								case 11:System.out.println(s4[1]+s1[0]);break;
								case 12:System.out.println(s4[1]+s1[1]);break;
								case 13:System.out.println(s4[1]+s1[2]);break;
								case 14:System.out.println(s4[1]+s1[3]);break;
								case 15:System.out.println(s4[1]+s2[0]);break;
								case 16:System.out.println(s4[1]+s2[1]);break;
								case 17:System.out.println(s4[1]+s2[2]);break;
								case 18:System.out.println(s4[1]+s2[3]);break;
								case 19:System.out.println(s4[1]+s2[4]);break;
								case 20:System.out.println(s4[2]);break;
								case 21:System.out.println(s4[2]+s1[0]);break;
								case 22:System.out.println(s4[2]+s1[1]);break;
								case 23:System.out.println(s4[2]+s1[2]);break;
								case 24:System.out.println(s4[2]+s1[3]);break;
								case 25:System.out.println(s4[2]+s2[0]);break;
								case 26:System.out.println(s4[2]+s2[1]);break;
								case 27:System.out.println(s4[2]+s2[2]);break;
								case 28:System.out.println(s4[2]+s2[3]);break;
								case 29:System.out.println(s4[2]+s2[4]);break;
								case 30:System.out.println(s4[3]);break;
								case 31:System.out.println(s4[3]+s1[0]);break;
								case 32:System.out.println(s4[3]+s1[1]);break;
								case 33:System.out.println(s4[3]+s1[2]);break;
								case 34:System.out.println(s4[3]+s1[4]);break;
								case 35:System.out.println(s4[3]+s2[0]);break;
								case 36:System.out.println(s4[3]+s2[1]);break;
								case 37:System.out.println(s4[3]+s2[2]);break;
								case 38:System.out.println(s4[3]+s2[3]);break;
								case 39:System.out.println(s4[3]+s2[4]);break;
								case 40:System.out.println(s4[4]);break;
								case 41:System.out.println(s4[4]+s1[0]);break;
								case 42:System.out.println(s4[4]+s1[1]);break;
								case 43:System.out.println(s4[4]+s1[2]);break;
								case 44:System.out.println(s4[4]+s1[3]);break;
								case 45:System.out.println(s4[4]+s2[0]);break;
								case 46:System.out.println(s4[4]+s2[1]);break;
								case 47:System.out.println(s4[4]+s2[2]);break;
								case 48:System.out.println(s4[4]+s2[3]);break;
								case 49:System.out.println(s4[4]+s2[4]);break;
								}
							}//50-99			
						}
				else{//100-499
					int a = num/100;
					switch(a){
					case 1:{
						int x = num%100;
						if(x/50 == 0){
							
							  if(x/10 == 0){
								
								  if(x/5 == 0){
									
									int c = x;
									switch(c) {
									case 0:System.out.println(s5[0]);break;
									case 1:System.out.println(s5[0]+s1[0]);break;
									case 2:System.out.println(s5[0]+s1[1]);break;
									case 3:System.out.println(s5[0]+s1[2]);break;
									case 4:System.out.println(s5[0]+s1[3]);break;
									default:{}
									}	
								}//1-4
								else{
									
									int b = x%5;
									switch(b){
									case 0:System.out.println(s5[0]+s2[0]);break;
									case 1:System.out.println(s5[0]+s2[1]);break;
									case 2:System.out.println(s5[0]+s2[2]);break;
									case 3:System.out.println(s5[0]+s2[3]);break;
									case 4:System.out.println(s5[0]+s2[4]);break;
									}
								}//5-9				
							}
							else{
								
								int b = x/10;
								int d = x%10;
								switch(b){
								case 1:{
									if(d/5 == 0){
										switch(d) {
										case 0:System.out.println(s5[0]+s3[0]);break;
										case 1:System.out.println(s5[0]+s3[0]+s1[0]);break;
										case 2:System.out.println(s5[0]+s3[0]+s1[1]);break;
										case 3:System.out.println(s5[0]+s3[0]+s1[2]);break;
										case 4:System.out.println(s5[0]+s3[0]+s1[3]);break;
										default:{}
										}	
									}//11-14
									else{
										int z = d%5;
										switch(z){
										case 0:System.out.println(s5[0]+s3[0]+s2[0]);break;
										case 1:System.out.println(s5[0]+s3[0]+s2[1]);break;
										case 2:System.out.println(s5[0]+s3[0]+s2[2]);break;
										case 3:System.out.println(s5[0]+s3[0]+s2[3]);break;
										case 4:System.out.println(s5[0]+s3[0]+s2[4]);break;
										}
									}//15-19				
									
								}//11-19
								case 2:{
									if(d/5 == 0){
										switch(d) {
										case 0:System.out.println(s5[0]+s3[1]);break;
										case 1:System.out.println(s5[0]+s3[1]+s1[0]);break;
										case 2:System.out.println(s5[0]+s3[1]+s1[1]);break;
										case 3:System.out.println(s5[0]+s3[1]+s1[2]);break;
										case 4:System.out.println(s5[0]+s3[1]+s1[3]);break;
										default:{}
										}	
									}//21-24
									else{
										int z = d%5;
										switch(z){
										case 0:System.out.println(s5[0]+s3[1]+s2[0]);break;
										case 1:System.out.println(s5[0]+s3[1]+s2[1]);break;
										case 2:System.out.println(s5[0]+s3[1]+s2[2]);break;
										case 3:System.out.println(s5[0]+s3[1]+s2[3]);break;
										case 4:System.out.println(s5[0]+s3[1]+s2[4]);break;
										}
									}//25-29				
								}//21-29
								case 3:{
									if(d/5 == 0){
										switch(d) {
										case 0:System.out.println(s5[0]+s3[2]);break;
										case 1:System.out.println(s5[0]+s3[2]+s1[0]);break;
										case 2:System.out.println(s5[0]+s3[2]+s1[1]);break;
										case 3:System.out.println(s5[0]+s3[2]+s1[2]);break;
										case 4:System.out.println(s5[0]+s3[2]+s1[3]);break;
										default:{}
										}	
									}//31-34
									else{
										int z = d%5;
										switch(z){
										case 0:System.out.println(s5[0]+s3[2]+s2[0]);break;
										case 1:System.out.println(s5[0]+s3[2]+s2[1]);break;
										case 2:System.out.println(s5[0]+s3[2]+s2[2]);break;
										case 3:System.out.println(s5[0]+s3[2]+s2[3]);break;
										case 4:System.out.println(s5[0]+s3[2]+s2[4]);break;
										}
									}//35-39			
								}//31-39
								case 4:{
									if(d/5 == 0){
										switch(d) {
										case 0:System.out.println(s5[0]+s3[3]);break;
										case 1:System.out.println(s5[0]+s3[3]+s1[0]);break;
										case 2:System.out.println(s5[0]+s3[3]+s1[1]);break;
										case 3:System.out.println(s5[0]+s3[3]+s1[2]);break;
										case 4:System.out.println(s5[0]+s3[3]+s1[3]);break;
										default:{}
										}	
									}//41-44
									else{
										int z = d%5;
										switch(z){
										case 0:System.out.println(s5[0]+s3[3]+s2[0]);break;
										case 1:System.out.println(s5[0]+s3[3]+s2[1]);break;
										case 2:System.out.println(s5[0]+s3[3]+s2[2]);break;
										case 3:System.out.println(s5[0]+s3[3]+s2[3]);break;
										case 4:System.out.println(s5[0]+s3[3]+s2[4]);break;
										}
									}//45-49			
								}
								
							}
						}//11-49
							  		
					}
							else{
								
								int b = x%50;
								switch(b){
										case 0:System.out.println(s5[0]+s4[0]);break;
										case 1:System.out.println(s5[0]+s4[0]+s1[0]);break;
										case 2:System.out.println(s5[0]+s4[0]+s1[1]);break;
										case 3:System.out.println(s5[0]+s4[0]+s1[2]);break;
										case 4:System.out.println(s5[0]+s4[0]+s1[3]);break;
										case 5:System.out.println(s5[0]+s4[0]+s2[0]);break;
										case 6:System.out.println(s5[0]+s4[0]+s2[1]);break;
										case 7:System.out.println(s5[0]+s4[0]+s2[2]);break;
										case 8:System.out.println(s5[0]+s4[0]+s2[3]);break;
										case 9:System.out.println(s5[0]+s4[0]+s2[4]);break;
										case 10:System.out.println(s5[0]+s5[0]+s4[1]);break;
										case 11:System.out.println(s5[0]+s5[0]+s4[1]+s1[0]);break;
										case 12:System.out.println(s5[0]+s5[0]+s4[1]+s1[1]);break;
										case 13:System.out.println(s5[0]+s5[0]+s4[1]+s1[2]);break;
										case 14:System.out.println(s5[0]+s5[0]+s4[1]+s1[3]);break;
										case 15:System.out.println(s5[0]+s5[0]+s4[1]+s2[0]);break;
										case 16:System.out.println(s5[0]+s4[1]+s2[1]);break;
										case 17:System.out.println(s5[0]+s4[1]+s2[2]);break;
										case 18:System.out.println(s5[0]+s4[1]+s2[3]);break;
										case 19:System.out.println(s5[0]+s4[1]+s2[4]);break;
										case 20:System.out.println(s5[0]+s4[2]);break;
										case 21:System.out.println(s5[0]+s4[2]+s1[0]);break;
										case 22:System.out.println(s5[0]+s4[2]+s1[1]);break;
										case 23:System.out.println(s5[0]+s4[2]+s1[2]);break;
										case 24:System.out.println(s5[0]+s4[2]+s1[3]);break;
										case 25:System.out.println(s5[0]+s4[2]+s2[0]);break;
										case 26:System.out.println(s5[0]+s4[2]+s2[1]);break;
										case 27:System.out.println(s5[0]+s4[2]+s2[2]);break;
										case 28:System.out.println(s5[0]+s4[2]+s2[3]);break;
										case 29:System.out.println(s5[0]+s4[2]+s2[4]);break;
										case 30:System.out.println(s5[0]+s4[3]);break;
										case 31:System.out.println(s5[0]+s4[3]+s1[0]);break;
										case 32:System.out.println(s5[0]+s4[3]+s1[1]);break;
										case 33:System.out.println(s5[0]+s4[3]+s1[2]);break;
										case 34:System.out.println(s5[0]+s4[3]+s1[4]);break;
										case 35:System.out.println(s5[0]+s4[3]+s2[0]);break;
										case 36:System.out.println(s5[0]+s4[3]+s2[1]);break;
										case 37:System.out.println(s5[0]+s4[3]+s2[2]);break;
										case 38:System.out.println(s5[0]+s4[3]+s2[3]);break;
										case 39:System.out.println(s5[0]+s4[3]+s2[4]);break;
										case 40:System.out.println(s5[0]+s4[4]);break;
										case 41:System.out.println(s5[0]+s4[4]+s1[0]);break;
										case 42:System.out.println(s5[0]+s4[4]+s1[1]);break;
										case 43:System.out.println(s5[0]+s4[4]+s1[2]);break;
										case 44:System.out.println(s5[0]+s4[4]+s1[3]);break;
										case 45:System.out.println(s5[0]+s4[4]+s2[0]);break;
										case 46:System.out.println(s5[0]+s4[4]+s2[1]);break;
										case 47:System.out.println(s5[0]+s4[4]+s2[2]);break;
										case 48:System.out.println(s5[0]+s4[4]+s2[3]);break;
										case 49:System.out.println(s5[0]+s4[4]+s2[4]);break;
										}
								}//50-99			
							}
				   //100-199
					case 2:{
						int i = 1;
						int x = num%100;
						if(x/50 == 0){
							
							  if(x/10 == 0){
								
								  if(x/5 == 0){
									
									int c = x;
									switch(c) {
									case 0:System.out.println(s5[i]);break;
									case 1:System.out.println(s5[i]+s1[0]);break;
									case 2:System.out.println(s5[i]+s1[1]);break;
									case 3:System.out.println(s5[i]+s1[2]);break;
									case 4:System.out.println(s5[i]+s1[3]);break;
									default:{}
									}	
								}//1-4
								else{
									
									int b = x%5;
									switch(b){
									case 0:System.out.println(s5[i]+s2[0]);break;
									case 1:System.out.println(s5[i]+s2[1]);break;
									case 2:System.out.println(s5[i]+s2[2]);break;
									case 3:System.out.println(s5[i]+s2[3]);break;
									case 4:System.out.println(s5[i]+s2[4]);break;
									}
								}//5-9				
							}
							else{
								
								int b = x/10;
								int d = x%10;
								switch(b){
								case 1:{
									if(d/5 == 0){
										switch(d) {
										case 0:System.out.println(s5[i]+s3[0]);break;
										case 1:System.out.println(s5[i]+s3[0]+s1[0]);break;
										case 2:System.out.println(s5[i]+s3[0]+s1[1]);break;
										case 3:System.out.println(s5[i]+s3[0]+s1[2]);break;
										case 4:System.out.println(s5[i]+s3[0]+s1[3]);break;
										default:{}
										}	
									}//11-14
									else{
										int z = d%5;
										switch(z){
										case 0:System.out.println(s5[i]+s3[0]+s2[0]);break;
										case 1:System.out.println(s5[i]+s3[0]+s2[1]);break;
										case 2:System.out.println(s5[i]+s3[0]+s2[2]);break;
										case 3:System.out.println(s5[i]+s3[0]+s2[3]);break;
										case 4:System.out.println(s5[i]+s3[0]+s2[4]);break;
										}
									}//15-19				
									
								}//11-19
								case 2:{
									if(d/5 == 0){
										switch(d) {
										case 0:System.out.println(s5[i]+s3[1]);break;
										case 1:System.out.println(s5[i]+s3[1]+s1[0]);break;
										case 2:System.out.println(s5[i]+s3[1]+s1[1]);break;
										case 3:System.out.println(s5[i]+s3[1]+s1[2]);break;
										case 4:System.out.println(s5[i]+s3[1]+s1[3]);break;
										default:{}
										}	
									}//21-24
									else{
										int z = d%5;
										switch(z){
										case 0:System.out.println(s5[i]+s3[1]+s2[0]);break;
										case 1:System.out.println(s5[i]+s3[1]+s2[1]);break;
										case 2:System.out.println(s5[i]+s3[1]+s2[2]);break;
										case 3:System.out.println(s5[i]+s3[1]+s2[3]);break;
										case 4:System.out.println(s5[i]+s3[1]+s2[4]);break;
										}
									}//25-29				
								}//21-29
								case 3:{
									if(d/5 == 0){
										switch(d) {
										case 0:System.out.println(s5[i]+s3[2]);break;
										case 1:System.out.println(s5[i]+s3[2]+s1[0]);break;
										case 2:System.out.println(s5[i]+s3[2]+s1[1]);break;
										case 3:System.out.println(s5[i]+s3[2]+s1[2]);break;
										case 4:System.out.println(s5[i]+s3[2]+s1[3]);break;
										default:{}
										}	
									}//31-34
									else{
										int z = d%5;
										switch(z){
										case 0:System.out.println(s5[i]+s3[2]+s2[0]);break;
										case 1:System.out.println(s5[i]+s3[2]+s2[1]);break;
										case 2:System.out.println(s5[i]+s3[2]+s2[2]);break;
										case 3:System.out.println(s5[i]+s3[2]+s2[3]);break;
										case 4:System.out.println(s5[i]+s3[2]+s2[4]);break;
										}
									}//35-39			
								}//31-39
								case 4:{
									if(d/5 == 0){
										switch(d) {
										case 0:System.out.println(s5[i]+s3[3]);break;
										case 1:System.out.println(s5[i]+s3[3]+s1[0]);break;
										case 2:System.out.println(s5[i]+s3[3]+s1[1]);break;
										case 3:System.out.println(s5[i]+s3[3]+s1[2]);break;
										case 4:System.out.println(s5[i]+s3[3]+s1[3]);break;
										default:{}
										}	
									}//41-44
									else{
										int z = d%5;
										switch(z){
										case 0:System.out.println(s5[i]+s3[3]+s2[0]);break;
										case 1:System.out.println(s5[i]+s3[3]+s2[1]);break;
										case 2:System.out.println(s5[i]+s3[3]+s2[2]);break;
										case 3:System.out.println(s5[i]+s3[3]+s2[3]);break;
										case 4:System.out.println(s5[i]+s3[3]+s2[4]);break;
										}
									}//245-249			
								}
								
							}
						}//11-49
							  		
					}
							else{
								
								int b = x%50;
								switch(b){
										case 0:System.out.println(s5[i]+s4[0]);break;
										case 1:System.out.println(s5[i]+s4[0]+s1[0]);break;
										case 2:System.out.println(s5[i]+s4[0]+s1[1]);break;
										case 3:System.out.println(s5[i]+s4[0]+s1[2]);break;
										case 4:System.out.println(s5[i]+s4[0]+s1[3]);break;
										case 5:System.out.println(s5[i]+s4[0]+s2[0]);break;
										case 6:System.out.println(s5[i]+s4[0]+s2[1]);break;
										case 7:System.out.println(s5[i]+s4[0]+s2[2]);break;
										case 8:System.out.println(s5[i]+s4[0]+s2[3]);break;
										case 9:System.out.println(s5[i]+s4[0]+s2[4]);break;
										case 10:System.out.println(s5[i]+s5[0]+s4[1]);break;
										case 11:System.out.println(s5[i]+s5[0]+s4[1]+s1[0]);break;
										case 12:System.out.println(s5[i]+s5[0]+s4[1]+s1[1]);break;
										case 13:System.out.println(s5[i]+s5[0]+s4[1]+s1[2]);break;
										case 14:System.out.println(s5[i]+s5[0]+s4[1]+s1[3]);break;
										case 15:System.out.println(s5[i]+s5[0]+s4[1]+s2[0]);break;
										case 16:System.out.println(s5[i]+s4[1]+s2[1]);break;
										case 17:System.out.println(s5[i]+s4[1]+s2[2]);break;
										case 18:System.out.println(s5[i]+s4[1]+s2[3]);break;
										case 19:System.out.println(s5[i]+s4[1]+s2[4]);break;
										case 20:System.out.println(s5[i]+s4[2]);break;
										case 21:System.out.println(s5[i]+s4[2]+s1[0]);break;
										case 22:System.out.println(s5[i]+s4[2]+s1[1]);break;
										case 23:System.out.println(s5[i]+s4[2]+s1[2]);break;
										case 24:System.out.println(s5[i]+s4[2]+s1[3]);break;
										case 25:System.out.println(s5[i]+s4[2]+s2[0]);break;
										case 26:System.out.println(s5[i]+s4[2]+s2[1]);break;
										case 27:System.out.println(s5[i]+s4[2]+s2[2]);break;
										case 28:System.out.println(s5[i]+s4[2]+s2[3]);break;
										case 29:System.out.println(s5[i]+s4[2]+s2[4]);break;
										case 30:System.out.println(s5[i]+s4[3]);break;
										case 31:System.out.println(s5[i]+s4[3]+s1[0]);break;
										case 32:System.out.println(s5[i]+s4[3]+s1[1]);break;
										case 33:System.out.println(s5[i]+s4[3]+s1[2]);break;
										case 34:System.out.println(s5[i]+s4[3]+s1[4]);break;
										case 35:System.out.println(s5[i]+s4[3]+s2[0]);break;
										case 36:System.out.println(s5[i]+s4[3]+s2[1]);break;
										case 37:System.out.println(s5[i]+s4[3]+s2[2]);break;
										case 38:System.out.println(s5[i]+s4[3]+s2[3]);break;
										case 39:System.out.println(s5[i]+s4[3]+s2[4]);break;
										case 40:System.out.println(s5[i]+s4[4]);break;
										case 41:System.out.println(s5[i]+s4[4]+s1[0]);break;
										case 42:System.out.println(s5[i]+s4[4]+s1[1]);break;
										case 43:System.out.println(s5[i]+s4[4]+s1[2]);break;
										case 44:System.out.println(s5[i]+s4[4]+s1[3]);break;
										case 45:System.out.println(s5[i]+s4[4]+s2[0]);break;
										case 46:System.out.println(s5[i]+s4[4]+s2[1]);break;
										case 47:System.out.println(s5[i]+s4[4]+s2[2]);break;
										case 48:System.out.println(s5[i]+s4[4]+s2[3]);break;
										case 49:System.out.println(s5[i]+s4[4]+s2[4]);break;
										}
								}		
							}
					case 3:
					{
						int i = 2;
						int x = num%100;
						if(x/50 == 0){
							
							  if(x/10 == 0){
								
								  if(x/5 == 0){
									
									int c = x;
									switch(c) {
									case 0:System.out.println(s5[i]);break;
									case 1:System.out.println(s5[i]+s1[0]);break;
									case 2:System.out.println(s5[i]+s1[1]);break;
									case 3:System.out.println(s5[i]+s1[2]);break;
									case 4:System.out.println(s5[i]+s1[3]);break;
									default:{}
									}	
								}//1-4
								else{
									
									int b = x%5;
									switch(b){
									case 0:System.out.println(s5[i]+s2[0]);break;
									case 1:System.out.println(s5[i]+s2[1]);break;
									case 2:System.out.println(s5[i]+s2[2]);break;
									case 3:System.out.println(s5[i]+s2[3]);break;
									case 4:System.out.println(s5[i]+s2[4]);break;
									}
								}//5-9				
							}
							else{
								
								int b = x/10;
								int d = x%10;
								switch(b){
								case 1:{
									if(d/5 == 0){
										switch(d) {
										case 0:System.out.println(s5[i]+s3[0]);break;
										case 1:System.out.println(s5[i]+s3[0]+s1[0]);break;
										case 2:System.out.println(s5[i]+s3[0]+s1[1]);break;
										case 3:System.out.println(s5[i]+s3[0]+s1[2]);break;
										case 4:System.out.println(s5[i]+s3[0]+s1[3]);break;
										default:{}
										}	
									}//11-14
									else{
										int z = d%5;
										switch(z){
										case 0:System.out.println(s5[i]+s3[0]+s2[0]);break;
										case 1:System.out.println(s5[i]+s3[0]+s2[1]);break;
										case 2:System.out.println(s5[i]+s3[0]+s2[2]);break;
										case 3:System.out.println(s5[i]+s3[0]+s2[3]);break;
										case 4:System.out.println(s5[i]+s3[0]+s2[4]);break;
										}
									}//15-19				
									
								}//11-19
								case 2:{
									if(d/5 == 0){
										switch(d) {
										case 0:System.out.println(s5[i]+s3[1]);break;
										case 1:System.out.println(s5[i]+s3[1]+s1[0]);break;
										case 2:System.out.println(s5[i]+s3[1]+s1[1]);break;
										case 3:System.out.println(s5[i]+s3[1]+s1[2]);break;
										case 4:System.out.println(s5[i]+s3[1]+s1[3]);break;
										default:{}
										}	
									}//21-24
									else{
										int z = d%5;
										switch(z){
										case 0:System.out.println(s5[i]+s3[1]+s2[0]);break;
										case 1:System.out.println(s5[i]+s3[1]+s2[1]);break;
										case 2:System.out.println(s5[i]+s3[1]+s2[2]);break;
										case 3:System.out.println(s5[i]+s3[1]+s2[3]);break;
										case 4:System.out.println(s5[i]+s3[1]+s2[4]);break;
										}
									}//25-29				
								}//21-29
								case 3:{
									if(d/5 == 0){
										switch(d) {
										case 0:System.out.println(s5[i]+s3[2]);break;
										case 1:System.out.println(s5[i]+s3[2]+s1[0]);break;
										case 2:System.out.println(s5[i]+s3[2]+s1[1]);break;
										case 3:System.out.println(s5[i]+s3[2]+s1[2]);break;
										case 4:System.out.println(s5[i]+s3[2]+s1[3]);break;
										default:{}
										}	
									}//31-34
									else{
										int z = d%5;
										switch(z){
										case 0:System.out.println(s5[i]+s3[2]+s2[0]);break;
										case 1:System.out.println(s5[i]+s3[2]+s2[1]);break;
										case 2:System.out.println(s5[i]+s3[2]+s2[2]);break;
										case 3:System.out.println(s5[i]+s3[2]+s2[3]);break;
										case 4:System.out.println(s5[i]+s3[2]+s2[4]);break;
										}
									}//35-39			
								}//31-39
								case 4:{
									if(d/5 == 0){
										switch(d) {
										case 0:System.out.println(s5[i]+s3[3]);break;
										case 1:System.out.println(s5[i]+s3[3]+s1[0]);break;
										case 2:System.out.println(s5[i]+s3[3]+s1[1]);break;
										case 3:System.out.println(s5[i]+s3[3]+s1[2]);break;
										case 4:System.out.println(s5[i]+s3[3]+s1[3]);break;
										default:{}
										}	
									}//41-44
									else{
										int z = d%5;
										switch(z){
										case 0:System.out.println(s5[i]+s3[3]+s2[0]);break;
										case 1:System.out.println(s5[i]+s3[3]+s2[1]);break;
										case 2:System.out.println(s5[i]+s3[3]+s2[2]);break;
										case 3:System.out.println(s5[i]+s3[3]+s2[3]);break;
										case 4:System.out.println(s5[i]+s3[3]+s2[4]);break;
										}
									}//245-249			
								}
								
							}
						}//11-49
							  		
					}
							else{
								
								int b = x%50;
								switch(b){
										case 0:System.out.println(s5[i]+s4[0]);break;
										case 1:System.out.println(s5[i]+s4[0]+s1[0]);break;
										case 2:System.out.println(s5[i]+s4[0]+s1[1]);break;
										case 3:System.out.println(s5[i]+s4[0]+s1[2]);break;
										case 4:System.out.println(s5[i]+s4[0]+s1[3]);break;
										case 5:System.out.println(s5[i]+s4[0]+s2[0]);break;
										case 6:System.out.println(s5[i]+s4[0]+s2[1]);break;
										case 7:System.out.println(s5[i]+s4[0]+s2[2]);break;
										case 8:System.out.println(s5[i]+s4[0]+s2[3]);break;
										case 9:System.out.println(s5[i]+s4[0]+s2[4]);break;
										case 10:System.out.println(s5[i]+s5[0]+s4[1]);break;
										case 11:System.out.println(s5[i]+s5[0]+s4[1]+s1[0]);break;
										case 12:System.out.println(s5[i]+s5[0]+s4[1]+s1[1]);break;
										case 13:System.out.println(s5[i]+s5[0]+s4[1]+s1[2]);break;
										case 14:System.out.println(s5[i]+s5[0]+s4[1]+s1[3]);break;
										case 15:System.out.println(s5[i]+s5[0]+s4[1]+s2[0]);break;
										case 16:System.out.println(s5[i]+s4[1]+s2[1]);break;
										case 17:System.out.println(s5[i]+s4[1]+s2[2]);break;
										case 18:System.out.println(s5[i]+s4[1]+s2[3]);break;
										case 19:System.out.println(s5[i]+s4[1]+s2[4]);break;
										case 20:System.out.println(s5[i]+s4[2]);break;
										case 21:System.out.println(s5[i]+s4[2]+s1[0]);break;
										case 22:System.out.println(s5[i]+s4[2]+s1[1]);break;
										case 23:System.out.println(s5[i]+s4[2]+s1[2]);break;
										case 24:System.out.println(s5[i]+s4[2]+s1[3]);break;
										case 25:System.out.println(s5[i]+s4[2]+s2[0]);break;
										case 26:System.out.println(s5[i]+s4[2]+s2[1]);break;
										case 27:System.out.println(s5[i]+s4[2]+s2[2]);break;
										case 28:System.out.println(s5[i]+s4[2]+s2[3]);break;
										case 29:System.out.println(s5[i]+s4[2]+s2[4]);break;
										case 30:System.out.println(s5[i]+s4[3]);break;
										case 31:System.out.println(s5[i]+s4[3]+s1[0]);break;
										case 32:System.out.println(s5[i]+s4[3]+s1[1]);break;
										case 33:System.out.println(s5[i]+s4[3]+s1[2]);break;
										case 34:System.out.println(s5[i]+s4[3]+s1[4]);break;
										case 35:System.out.println(s5[i]+s4[3]+s2[0]);break;
										case 36:System.out.println(s5[i]+s4[3]+s2[1]);break;
										case 37:System.out.println(s5[i]+s4[3]+s2[2]);break;
										case 38:System.out.println(s5[i]+s4[3]+s2[3]);break;
										case 39:System.out.println(s5[i]+s4[3]+s2[4]);break;
										case 40:System.out.println(s5[i]+s4[4]);break;
										case 41:System.out.println(s5[i]+s4[4]+s1[0]);break;
										case 42:System.out.println(s5[i]+s4[4]+s1[1]);break;
										case 43:System.out.println(s5[i]+s4[4]+s1[2]);break;
										case 44:System.out.println(s5[i]+s4[4]+s1[3]);break;
										case 45:System.out.println(s5[i]+s4[4]+s2[0]);break;
										case 46:System.out.println(s5[i]+s4[4]+s2[1]);break;
										case 47:System.out.println(s5[i]+s4[4]+s2[2]);break;
										case 48:System.out.println(s5[i]+s4[4]+s2[3]);break;
										case 49:System.out.println(s5[i]+s4[4]+s2[4]);break;
										}
								}		
					}
					case 4:{
						int i = 3;
						int x = num%100;
						if(x/50 == 0){
							
							  if(x/10 == 0){
								
								  if(x/5 == 0){
									
									int c = x;
									switch(c) {
									case 0:System.out.println(s5[i]);break;
									case 1:System.out.println(s5[i]+s1[0]);break;
									case 2:System.out.println(s5[i]+s1[1]);break;
									case 3:System.out.println(s5[i]+s1[2]);break;
									case 4:System.out.println(s5[i]+s1[3]);break;
									default:{}
									}	
								}//1-4
								else{
									
									int b = x%5;
									switch(b){
									case 0:System.out.println(s5[i]+s2[0]);break;
									case 1:System.out.println(s5[i]+s2[1]);break;
									case 2:System.out.println(s5[i]+s2[2]);break;
									case 3:System.out.println(s5[i]+s2[3]);break;
									case 4:System.out.println(s5[i]+s2[4]);break;
									}
								}//5-9				
							}
							else{
								
								int b = x/10;
								int d = x%10;
								switch(b){
								case 1:{
									if(d/5 == 0){
										switch(d) {
										case 0:System.out.println(s5[i]+s3[0]);break;
										case 1:System.out.println(s5[i]+s3[0]+s1[0]);break;
										case 2:System.out.println(s5[i]+s3[0]+s1[1]);break;
										case 3:System.out.println(s5[i]+s3[0]+s1[2]);break;
										case 4:System.out.println(s5[i]+s3[0]+s1[3]);break;
										default:{}
										}	
									}//11-14
									else{
										int z = d%5;
										switch(z){
										case 0:System.out.println(s5[i]+s3[0]+s2[0]);break;
										case 1:System.out.println(s5[i]+s3[0]+s2[1]);break;
										case 2:System.out.println(s5[i]+s3[0]+s2[2]);break;
										case 3:System.out.println(s5[i]+s3[0]+s2[3]);break;
										case 4:System.out.println(s5[i]+s3[0]+s2[4]);break;
										}
									}//15-19				
									
								}//11-19
								case 2:{
									if(d/5 == 0){
										switch(d) {
										case 0:System.out.println(s5[i]+s3[1]);break;
										case 1:System.out.println(s5[i]+s3[1]+s1[0]);break;
										case 2:System.out.println(s5[i]+s3[1]+s1[1]);break;
										case 3:System.out.println(s5[i]+s3[1]+s1[2]);break;
										case 4:System.out.println(s5[i]+s3[1]+s1[3]);break;
										default:{}
										}	
									}//21-24
									else{
										int z = d%5;
										switch(z){
										case 0:System.out.println(s5[i]+s3[1]+s2[0]);break;
										case 1:System.out.println(s5[i]+s3[1]+s2[1]);break;
										case 2:System.out.println(s5[i]+s3[1]+s2[2]);break;
										case 3:System.out.println(s5[i]+s3[1]+s2[3]);break;
										case 4:System.out.println(s5[i]+s3[1]+s2[4]);break;
										}
									}//25-29				
								}//21-29
								case 3:{
									if(d/5 == 0){
										switch(d) {
										case 0:System.out.println(s5[i]+s3[2]);break;
										case 1:System.out.println(s5[i]+s3[2]+s1[0]);break;
										case 2:System.out.println(s5[i]+s3[2]+s1[1]);break;
										case 3:System.out.println(s5[i]+s3[2]+s1[2]);break;
										case 4:System.out.println(s5[i]+s3[2]+s1[3]);break;
										default:{}
										}	
									}//31-34
									else{
										int z = d%5;
										switch(z){
										case 0:System.out.println(s5[i]+s3[2]+s2[0]);break;
										case 1:System.out.println(s5[i]+s3[2]+s2[1]);break;
										case 2:System.out.println(s5[i]+s3[2]+s2[2]);break;
										case 3:System.out.println(s5[i]+s3[2]+s2[3]);break;
										case 4:System.out.println(s5[i]+s3[2]+s2[4]);break;
										}
									}//35-39			
								}//31-39
								case 4:{
									if(d/5 == 0){
										switch(d) {
										case 0:System.out.println(s5[i]+s3[3]);break;
										case 1:System.out.println(s5[i]+s3[3]+s1[0]);break;
										case 2:System.out.println(s5[i]+s3[3]+s1[1]);break;
										case 3:System.out.println(s5[i]+s3[3]+s1[2]);break;
										case 4:System.out.println(s5[i]+s3[3]+s1[3]);break;
										default:{}
										}	
									}//41-44
									else{
										int z = d%5;
										switch(z){
										case 0:System.out.println(s5[i]+s3[3]+s2[0]);break;
										case 1:System.out.println(s5[i]+s3[3]+s2[1]);break;
										case 2:System.out.println(s5[i]+s3[3]+s2[2]);break;
										case 3:System.out.println(s5[i]+s3[3]+s2[3]);break;
										case 4:System.out.println(s5[i]+s3[3]+s2[4]);break;
										}
									}//245-249			
								}
								
							}
						}//11-49
							  		
					}
							else{
								
								int b = x%50;
								switch(b){
										case 0:System.out.println(s5[i]+s4[0]);break;
										case 1:System.out.println(s5[i]+s4[0]+s1[0]);break;
										case 2:System.out.println(s5[i]+s4[0]+s1[1]);break;
										case 3:System.out.println(s5[i]+s4[0]+s1[2]);break;
										case 4:System.out.println(s5[i]+s4[0]+s1[3]);break;
										case 5:System.out.println(s5[i]+s4[0]+s2[0]);break;
										case 6:System.out.println(s5[i]+s4[0]+s2[1]);break;
										case 7:System.out.println(s5[i]+s4[0]+s2[2]);break;
										case 8:System.out.println(s5[i]+s4[0]+s2[3]);break;
										case 9:System.out.println(s5[i]+s4[0]+s2[4]);break;
										case 10:System.out.println(s5[i]+s5[0]+s4[1]);break;
										case 11:System.out.println(s5[i]+s5[0]+s4[1]+s1[0]);break;
										case 12:System.out.println(s5[i]+s5[0]+s4[1]+s1[1]);break;
										case 13:System.out.println(s5[i]+s5[0]+s4[1]+s1[2]);break;
										case 14:System.out.println(s5[i]+s5[0]+s4[1]+s1[3]);break;
										case 15:System.out.println(s5[i]+s5[0]+s4[1]+s2[0]);break;
										case 16:System.out.println(s5[i]+s4[1]+s2[1]);break;
										case 17:System.out.println(s5[i]+s4[1]+s2[2]);break;
										case 18:System.out.println(s5[i]+s4[1]+s2[3]);break;
										case 19:System.out.println(s5[i]+s4[1]+s2[4]);break;
										case 20:System.out.println(s5[i]+s4[2]);break;
										case 21:System.out.println(s5[i]+s4[2]+s1[0]);break;
										case 22:System.out.println(s5[i]+s4[2]+s1[1]);break;
										case 23:System.out.println(s5[i]+s4[2]+s1[2]);break;
										case 24:System.out.println(s5[i]+s4[2]+s1[3]);break;
										case 25:System.out.println(s5[i]+s4[2]+s2[0]);break;
										case 26:System.out.println(s5[i]+s4[2]+s2[1]);break;
										case 27:System.out.println(s5[i]+s4[2]+s2[2]);break;
										case 28:System.out.println(s5[i]+s4[2]+s2[3]);break;
										case 29:System.out.println(s5[i]+s4[2]+s2[4]);break;
										case 30:System.out.println(s5[i]+s4[3]);break;
										case 31:System.out.println(s5[i]+s4[3]+s1[0]);break;
										case 32:System.out.println(s5[i]+s4[3]+s1[1]);break;
										case 33:System.out.println(s5[i]+s4[3]+s1[2]);break;
										case 34:System.out.println(s5[i]+s4[3]+s1[4]);break;
										case 35:System.out.println(s5[i]+s4[3]+s2[0]);break;
										case 36:System.out.println(s5[i]+s4[3]+s2[1]);break;
										case 37:System.out.println(s5[i]+s4[3]+s2[2]);break;
										case 38:System.out.println(s5[i]+s4[3]+s2[3]);break;
										case 39:System.out.println(s5[i]+s4[3]+s2[4]);break;
										case 40:System.out.println(s5[i]+s4[4]);break;
										case 41:System.out.println(s5[i]+s4[4]+s1[0]);break;
										case 42:System.out.println(s5[i]+s4[4]+s1[1]);break;
										case 43:System.out.println(s5[i]+s4[4]+s1[2]);break;
										case 44:System.out.println(s5[i]+s4[4]+s1[3]);break;
										case 45:System.out.println(s5[i]+s4[4]+s2[0]);break;
										case 46:System.out.println(s5[i]+s4[4]+s2[1]);break;
										case 47:System.out.println(s5[i]+s4[4]+s2[2]);break;
										case 48:System.out.println(s5[i]+s4[4]+s2[3]);break;
										case 49:System.out.println(s5[i]+s4[4]+s2[4]);break;
										}
								}		
					}
				}
					
			 }
				
			
		   }//100-499
			else{
				int f = num%500;
				int a = f/100;
				switch(a){
				case 1:{
					int x = num%100;
					if(x/50 == 0){
						
						  if(x/10 == 0){
							
							  if(x/5 == 0){
								
								int c = x;
								switch(c) {
								case 0:System.out.println(s6[0]);break;
								case 1:System.out.println(s6[0]+s1[0]);break;
								case 2:System.out.println(s6[0]+s1[1]);break;
								case 3:System.out.println(s6[0]+s1[2]);break;
								case 4:System.out.println(s6[0]+s1[3]);break;
								default:{}
								}	
							}//1-4
							else{
								
								int b = x%5;
								switch(b){
								case 0:System.out.println(s6[0]+s2[0]);break;
								case 1:System.out.println(s6[0]+s2[1]);break;
								case 2:System.out.println(s6[0]+s2[2]);break;
								case 3:System.out.println(s6[0]+s2[3]);break;
								case 4:System.out.println(s6[0]+s2[4]);break;
								}
							}//5-9				
						}
						else{
							
							int b = x/10;
							int d = x%10;
							switch(b){
							case 1:{
								if(d/5 == 0){
									switch(d) {
									case 0:System.out.println(s6[0]+s3[0]);break;
									case 1:System.out.println(s6[0]+s3[0]+s1[0]);break;
									case 2:System.out.println(s6[0]+s3[0]+s1[1]);break;
									case 3:System.out.println(s6[0]+s3[0]+s1[2]);break;
									case 4:System.out.println(s6[0]+s3[0]+s1[3]);break;
									default:{}
									}	
								}//11-14
								else{
									int z = d%5;
									switch(z){
									case 0:System.out.println(s6[0]+s3[0]+s2[0]);break;
									case 1:System.out.println(s6[0]+s3[0]+s2[1]);break;
									case 2:System.out.println(s6[0]+s3[0]+s2[2]);break;
									case 3:System.out.println(s6[0]+s3[0]+s2[3]);break;
									case 4:System.out.println(s6[0]+s3[0]+s2[4]);break;
									}
								}//15-19				
								
							}//11-19
							case 2:{
								if(d/5 == 0){
									switch(d) {
									case 0:System.out.println(s6[0]+s3[1]);break;
									case 1:System.out.println(s6[0]+s3[1]+s1[0]);break;
									case 2:System.out.println(s6[0]+s3[1]+s1[1]);break;
									case 3:System.out.println(s6[0]+s3[1]+s1[2]);break;
									case 4:System.out.println(s6[0]+s3[1]+s1[3]);break;
									default:{}
									}	
								}//21-24
								else{
									int z = d%5;
									switch(z){
									case 0:System.out.println(s6[0]+s3[1]+s2[0]);break;
									case 1:System.out.println(s6[0]+s3[1]+s2[1]);break;
									case 2:System.out.println(s6[0]+s3[1]+s2[2]);break;
									case 3:System.out.println(s6[0]+s3[1]+s2[3]);break;
									case 4:System.out.println(s6[0]+s3[1]+s2[4]);break;
									}
								}//25-29				
							}//21-29
							case 3:{
								if(d/5 == 0){
									switch(d) {
									case 0:System.out.println(s6[0]+s3[2]);break;
									case 1:System.out.println(s6[0]+s3[2]+s1[0]);break;
									case 2:System.out.println(s6[0]+s3[2]+s1[1]);break;
									case 3:System.out.println(s6[0]+s3[2]+s1[2]);break;
									case 4:System.out.println(s6[0]+s3[2]+s1[3]);break;
									default:{}
									}	
								}//31-34
								else{
									int z = d%5;
									switch(z){
									case 0:System.out.println(s6[0]+s3[2]+s2[0]);break;
									case 1:System.out.println(s6[0]+s3[2]+s2[1]);break;
									case 2:System.out.println(s6[0]+s3[2]+s2[2]);break;
									case 3:System.out.println(s6[0]+s3[2]+s2[3]);break;
									case 4:System.out.println(s6[0]+s3[2]+s2[4]);break;
									}
								}//35-39			
							}//31-39
							case 4:{
								if(d/5 == 0){
									switch(d) {
									case 0:System.out.println(s6[0]+s3[3]);break;
									case 1:System.out.println(s6[0]+s3[3]+s1[0]);break;
									case 2:System.out.println(s6[0]+s3[3]+s1[1]);break;
									case 3:System.out.println(s6[0]+s3[3]+s1[2]);break;
									case 4:System.out.println(s6[0]+s3[3]+s1[3]);break;
									default:{}
									}	
								}//41-44
								else{
									int z = d%5;
									switch(z){
									case 0:System.out.println(s6[0]+s3[3]+s2[0]);break;
									case 1:System.out.println(s6[0]+s3[3]+s2[1]);break;
									case 2:System.out.println(s6[0]+s3[3]+s2[2]);break;
									case 3:System.out.println(s6[0]+s3[3]+s2[3]);break;
									case 4:System.out.println(s6[0]+s3[3]+s2[4]);break;
									}
								}//45-49			
							}
							
						}
					}//11-49
						  		
				}
						else{
							
							int b = x%50;
							switch(b){
									case 0:System.out.println(s6[0]+s4[0]);break;
									case 1:System.out.println(s6[0]+s4[0]+s1[0]);break;
									case 2:System.out.println(s6[0]+s4[0]+s1[1]);break;
									case 3:System.out.println(s6[0]+s4[0]+s1[2]);break;
									case 4:System.out.println(s6[0]+s4[0]+s1[3]);break;
									case 5:System.out.println(s6[0]+s4[0]+s2[0]);break;
									case 6:System.out.println(s6[0]+s4[0]+s2[1]);break;
									case 7:System.out.println(s6[0]+s4[0]+s2[2]);break;
									case 8:System.out.println(s6[0]+s4[0]+s2[3]);break;
									case 9:System.out.println(s6[0]+s4[0]+s2[4]);break;
									case 10:System.out.println(s6[0]+s5[0]+s4[1]);break;
									case 11:System.out.println(s6[0]+s5[0]+s4[1]+s1[0]);break;
									case 12:System.out.println(s6[0]+s5[0]+s4[1]+s1[1]);break;
									case 13:System.out.println(s6[0]+s5[0]+s4[1]+s1[2]);break;
									case 14:System.out.println(s6[0]+s5[0]+s4[1]+s1[3]);break;
									case 15:System.out.println(s6[0]+s5[0]+s4[1]+s2[0]);break;
									case 16:System.out.println(s6[0]+s4[1]+s2[1]);break;
									case 17:System.out.println(s6[0]+s4[1]+s2[2]);break;
									case 18:System.out.println(s6[0]+s4[1]+s2[3]);break;
									case 19:System.out.println(s6[0]+s4[1]+s2[4]);break;
									case 20:System.out.println(s6[0]+s4[2]);break;
									case 21:System.out.println(s6[0]+s4[2]+s1[0]);break;
									case 22:System.out.println(s6[0]+s4[2]+s1[1]);break;
									case 23:System.out.println(s6[0]+s4[2]+s1[2]);break;
									case 24:System.out.println(s6[0]+s4[2]+s1[3]);break;
									case 25:System.out.println(s6[0]+s4[2]+s2[0]);break;
									case 26:System.out.println(s6[0]+s4[2]+s2[1]);break;
									case 27:System.out.println(s6[0]+s4[2]+s2[2]);break;
									case 28:System.out.println(s6[0]+s4[2]+s2[3]);break;
									case 29:System.out.println(s6[0]+s4[2]+s2[4]);break;
									case 30:System.out.println(s6[0]+s4[3]);break;
									case 31:System.out.println(s6[0]+s4[3]+s1[0]);break;
									case 32:System.out.println(s6[0]+s4[3]+s1[1]);break;
									case 33:System.out.println(s6[0]+s4[3]+s1[2]);break;
									case 34:System.out.println(s6[0]+s4[3]+s1[4]);break;
									case 35:System.out.println(s6[0]+s4[3]+s2[0]);break;
									case 36:System.out.println(s6[0]+s4[3]+s2[1]);break;
									case 37:System.out.println(s6[0]+s4[3]+s2[2]);break;
									case 38:System.out.println(s6[0]+s4[3]+s2[3]);break;
									case 39:System.out.println(s6[0]+s4[3]+s2[4]);break;
									case 40:System.out.println(s6[0]+s4[4]);break;
									case 41:System.out.println(s6[0]+s4[4]+s1[0]);break;
									case 42:System.out.println(s6[0]+s4[4]+s1[1]);break;
									case 43:System.out.println(s6[0]+s4[4]+s1[2]);break;
									case 44:System.out.println(s6[0]+s4[4]+s1[3]);break;
									case 45:System.out.println(s6[0]+s4[4]+s2[0]);break;
									case 46:System.out.println(s6[0]+s4[4]+s2[1]);break;
									case 47:System.out.println(s6[0]+s4[4]+s2[2]);break;
									case 48:System.out.println(s6[0]+s4[4]+s2[3]);break;
									case 49:System.out.println(s6[0]+s4[4]+s2[4]);break;
									}
							}//50-99			
						}
			   //100-199
				case 2:{
					int i = 1;
					int x = num%100;
					if(x/50 == 0){
						
						  if(x/10 == 0){
							
							  if(x/5 == 0){
								
								int c = x;
								switch(c) {
								case 0:System.out.println(s6[i]);break;
								case 1:System.out.println(s6[i]+s1[0]);break;
								case 2:System.out.println(s6[i]+s1[1]);break;
								case 3:System.out.println(s6[i]+s1[2]);break;
								case 4:System.out.println(s6[i]+s1[3]);break;
								default:{}
								}	
							}//1-4
							else{
								
								int b = x%5;
								switch(b){
								case 0:System.out.println(s6[i]+s2[0]);break;
								case 1:System.out.println(s6[i]+s2[1]);break;
								case 2:System.out.println(s6[i]+s2[2]);break;
								case 3:System.out.println(s6[i]+s2[3]);break;
								case 4:System.out.println(s6[i]+s2[4]);break;
								}
							}//5-9				
						}
						else{
							
							int b = x/10;
							int d = x%10;
							switch(b){
							case 1:{
								if(d/5 == 0){
									switch(d) {
									case 0:System.out.println(s6[i]+s3[0]);break;
									case 1:System.out.println(s6[i]+s3[0]+s1[0]);break;
									case 2:System.out.println(s6[i]+s3[0]+s1[1]);break;
									case 3:System.out.println(s6[i]+s3[0]+s1[2]);break;
									case 4:System.out.println(s6[i]+s3[0]+s1[3]);break;
									default:{}
									}	
								}//11-14
								else{
									int z = d%5;
									switch(z){
									case 0:System.out.println(s6[i]+s3[0]+s2[0]);break;
									case 1:System.out.println(s6[i]+s3[0]+s2[1]);break;
									case 2:System.out.println(s5[i]+s3[0]+s2[2]);break;
									case 3:System.out.println(s5[i]+s3[0]+s2[3]);break;
									case 4:System.out.println(s5[i]+s3[0]+s2[4]);break;
									}
								}//15-19				
								
							}//11-19
							case 2:{
								if(d/5 == 0){
									switch(d) {
									case 0:System.out.println(s5[i]+s3[1]);break;
									case 1:System.out.println(s5[i]+s3[1]+s1[0]);break;
									case 2:System.out.println(s5[i]+s3[1]+s1[1]);break;
									case 3:System.out.println(s5[i]+s3[1]+s1[2]);break;
									case 4:System.out.println(s5[i]+s3[1]+s1[3]);break;
									default:{}
									}	
								}//21-24
								else{
									int z = d%5;
									switch(z){
									case 0:System.out.println(s5[i]+s3[1]+s2[0]);break;
									case 1:System.out.println(s5[i]+s3[1]+s2[1]);break;
									case 2:System.out.println(s5[i]+s3[1]+s2[2]);break;
									case 3:System.out.println(s5[i]+s3[1]+s2[3]);break;
									case 4:System.out.println(s5[i]+s3[1]+s2[4]);break;
									}
								}//25-29				
							}//21-29
							case 3:{
								if(d/5 == 0){
									switch(d) {
									case 0:System.out.println(s5[i]+s3[2]);break;
									case 1:System.out.println(s5[i]+s3[2]+s1[0]);break;
									case 2:System.out.println(s5[i]+s3[2]+s1[1]);break;
									case 3:System.out.println(s5[i]+s3[2]+s1[2]);break;
									case 4:System.out.println(s5[i]+s3[2]+s1[3]);break;
									default:{}
									}	
								}//31-34
								else{
									int z = d%5;
									switch(z){
									case 0:System.out.println(s5[i]+s3[2]+s2[0]);break;
									case 1:System.out.println(s5[i]+s3[2]+s2[1]);break;
									case 2:System.out.println(s5[i]+s3[2]+s2[2]);break;
									case 3:System.out.println(s5[i]+s3[2]+s2[3]);break;
									case 4:System.out.println(s5[i]+s3[2]+s2[4]);break;
									}
								}//35-39			
							}//31-39
							case 4:{
								if(d/5 == 0){
									switch(d) {
									case 0:System.out.println(s5[i]+s3[3]);break;
									case 1:System.out.println(s5[i]+s3[3]+s1[0]);break;
									case 2:System.out.println(s5[i]+s3[3]+s1[1]);break;
									case 3:System.out.println(s5[i]+s3[3]+s1[2]);break;
									case 4:System.out.println(s5[i]+s3[3]+s1[3]);break;
									default:{}
									}	
								}//41-44
								else{
									int z = d%5;
									switch(z){
									case 0:System.out.println(s5[i]+s3[3]+s2[0]);break;
									case 1:System.out.println(s5[i]+s3[3]+s2[1]);break;
									case 2:System.out.println(s5[i]+s3[3]+s2[2]);break;
									case 3:System.out.println(s5[i]+s3[3]+s2[3]);break;
									case 4:System.out.println(s5[i]+s3[3]+s2[4]);break;
									}
								}//245-249			
							}
							
						}
					}//11-49
						  		
				}
						else{
							
							int b = x%50;
							switch(b){
									case 0:System.out.println(s5[i]+s4[0]);break;
									case 1:System.out.println(s5[i]+s4[0]+s1[0]);break;
									case 2:System.out.println(s5[i]+s4[0]+s1[1]);break;
									case 3:System.out.println(s5[i]+s4[0]+s1[2]);break;
									case 4:System.out.println(s5[i]+s4[0]+s1[3]);break;
									case 5:System.out.println(s5[i]+s4[0]+s2[0]);break;
									case 6:System.out.println(s5[i]+s4[0]+s2[1]);break;
									case 7:System.out.println(s5[i]+s4[0]+s2[2]);break;
									case 8:System.out.println(s5[i]+s4[0]+s2[3]);break;
									case 9:System.out.println(s5[i]+s4[0]+s2[4]);break;
									case 10:System.out.println(s5[i]+s5[0]+s4[1]);break;
									case 11:System.out.println(s5[i]+s5[0]+s4[1]+s1[0]);break;
									case 12:System.out.println(s5[i]+s5[0]+s4[1]+s1[1]);break;
									case 13:System.out.println(s5[i]+s5[0]+s4[1]+s1[2]);break;
									case 14:System.out.println(s5[i]+s5[0]+s4[1]+s1[3]);break;
									case 15:System.out.println(s5[i]+s5[0]+s4[1]+s2[0]);break;
									case 16:System.out.println(s5[i]+s4[1]+s2[1]);break;
									case 17:System.out.println(s5[i]+s4[1]+s2[2]);break;
									case 18:System.out.println(s5[i]+s4[1]+s2[3]);break;
									case 19:System.out.println(s5[i]+s4[1]+s2[4]);break;
									case 20:System.out.println(s5[i]+s4[2]);break;
									case 21:System.out.println(s5[i]+s4[2]+s1[0]);break;
									case 22:System.out.println(s5[i]+s4[2]+s1[1]);break;
									case 23:System.out.println(s5[i]+s4[2]+s1[2]);break;
									case 24:System.out.println(s5[i]+s4[2]+s1[3]);break;
									case 25:System.out.println(s5[i]+s4[2]+s2[0]);break;
									case 26:System.out.println(s5[i]+s4[2]+s2[1]);break;
									case 27:System.out.println(s5[i]+s4[2]+s2[2]);break;
									case 28:System.out.println(s5[i]+s4[2]+s2[3]);break;
									case 29:System.out.println(s5[i]+s4[2]+s2[4]);break;
									case 30:System.out.println(s5[i]+s4[3]);break;
									case 31:System.out.println(s5[i]+s4[3]+s1[0]);break;
									case 32:System.out.println(s5[i]+s4[3]+s1[1]);break;
									case 33:System.out.println(s5[i]+s4[3]+s1[2]);break;
									case 34:System.out.println(s5[i]+s4[3]+s1[4]);break;
									case 35:System.out.println(s5[i]+s4[3]+s2[0]);break;
									case 36:System.out.println(s5[i]+s4[3]+s2[1]);break;
									case 37:System.out.println(s5[i]+s4[3]+s2[2]);break;
									case 38:System.out.println(s5[i]+s4[3]+s2[3]);break;
									case 39:System.out.println(s5[i]+s4[3]+s2[4]);break;
									case 40:System.out.println(s5[i]+s4[4]);break;
									case 41:System.out.println(s5[i]+s4[4]+s1[0]);break;
									case 42:System.out.println(s5[i]+s4[4]+s1[1]);break;
									case 43:System.out.println(s5[i]+s4[4]+s1[2]);break;
									case 44:System.out.println(s5[i]+s4[4]+s1[3]);break;
									case 45:System.out.println(s5[i]+s4[4]+s2[0]);break;
									case 46:System.out.println(s5[i]+s4[4]+s2[1]);break;
									case 47:System.out.println(s5[i]+s4[4]+s2[2]);break;
									case 48:System.out.println(s5[i]+s4[4]+s2[3]);break;
									case 49:System.out.println(s5[i]+s4[4]+s2[4]);break;
									}
							}		
						}
				case 3:
				{
					int i = 2;
					int x = num%100;
					if(x/50 == 0){
						
						  if(x/10 == 0){
							
							  if(x/5 == 0){
								
								int c = x;
								switch(c) {
								case 0:System.out.println(s5[i]);break;
								case 1:System.out.println(s5[i]+s1[0]);break;
								case 2:System.out.println(s5[i]+s1[1]);break;
								case 3:System.out.println(s5[i]+s1[2]);break;
								case 4:System.out.println(s5[i]+s1[3]);break;
								default:{}
								}	
							}//1-4
							else{
								
								int b = x%5;
								switch(b){
								case 0:System.out.println(s5[i]+s2[0]);break;
								case 1:System.out.println(s5[i]+s2[1]);break;
								case 2:System.out.println(s5[i]+s2[2]);break;
								case 3:System.out.println(s5[i]+s2[3]);break;
								case 4:System.out.println(s5[i]+s2[4]);break;
								}
							}//5-9				
						}
						else{
							
							int b = x/10;
							int d = x%10;
							switch(b){
							case 1:{
								if(d/5 == 0){
									switch(d) {
									case 0:System.out.println(s5[i]+s3[0]);break;
									case 1:System.out.println(s5[i]+s3[0]+s1[0]);break;
									case 2:System.out.println(s5[i]+s3[0]+s1[1]);break;
									case 3:System.out.println(s5[i]+s3[0]+s1[2]);break;
									case 4:System.out.println(s5[i]+s3[0]+s1[3]);break;
									default:{}
									}	
								}//11-14
								else{
									int z = d%5;
									switch(z){
									case 0:System.out.println(s5[i]+s3[0]+s2[0]);break;
									case 1:System.out.println(s5[i]+s3[0]+s2[1]);break;
									case 2:System.out.println(s5[i]+s3[0]+s2[2]);break;
									case 3:System.out.println(s5[i]+s3[0]+s2[3]);break;
									case 4:System.out.println(s5[i]+s3[0]+s2[4]);break;
									}
								}//15-19				
								
							}//11-19
							case 2:{
								if(d/5 == 0){
									switch(d) {
									case 0:System.out.println(s5[i]+s3[1]);break;
									case 1:System.out.println(s5[i]+s3[1]+s1[0]);break;
									case 2:System.out.println(s5[i]+s3[1]+s1[1]);break;
									case 3:System.out.println(s5[i]+s3[1]+s1[2]);break;
									case 4:System.out.println(s5[i]+s3[1]+s1[3]);break;
									default:{}
									}	
								}//21-24
								else{
									int z = d%5;
									switch(z){
									case 0:System.out.println(s5[i]+s3[1]+s2[0]);break;
									case 1:System.out.println(s5[i]+s3[1]+s2[1]);break;
									case 2:System.out.println(s5[i]+s3[1]+s2[2]);break;
									case 3:System.out.println(s5[i]+s3[1]+s2[3]);break;
									case 4:System.out.println(s5[i]+s3[1]+s2[4]);break;
									}
								}//25-29				
							}//21-29
							case 3:{
								if(d/5 == 0){
									switch(d) {
									case 0:System.out.println(s5[i]+s3[2]);break;
									case 1:System.out.println(s5[i]+s3[2]+s1[0]);break;
									case 2:System.out.println(s5[i]+s3[2]+s1[1]);break;
									case 3:System.out.println(s5[i]+s3[2]+s1[2]);break;
									case 4:System.out.println(s5[i]+s3[2]+s1[3]);break;
									default:{}
									}	
								}//31-34
								else{
									int z = d%5;
									switch(z){
									case 0:System.out.println(s5[i]+s3[2]+s2[0]);break;
									case 1:System.out.println(s5[i]+s3[2]+s2[1]);break;
									case 2:System.out.println(s5[i]+s3[2]+s2[2]);break;
									case 3:System.out.println(s5[i]+s3[2]+s2[3]);break;
									case 4:System.out.println(s5[i]+s3[2]+s2[4]);break;
									}
								}//35-39			
							}//31-39
							case 4:{
								if(d/5 == 0){
									switch(d) {
									case 0:System.out.println(s5[i]+s3[3]);break;
									case 1:System.out.println(s5[i]+s3[3]+s1[0]);break;
									case 2:System.out.println(s5[i]+s3[3]+s1[1]);break;
									case 3:System.out.println(s5[i]+s3[3]+s1[2]);break;
									case 4:System.out.println(s5[i]+s3[3]+s1[3]);break;
									default:{}
									}	
								}//41-44
								else{
									int z = d%5;
									switch(z){
									case 0:System.out.println(s5[i]+s3[3]+s2[0]);break;
									case 1:System.out.println(s5[i]+s3[3]+s2[1]);break;
									case 2:System.out.println(s5[i]+s3[3]+s2[2]);break;
									case 3:System.out.println(s5[i]+s3[3]+s2[3]);break;
									case 4:System.out.println(s5[i]+s3[3]+s2[4]);break;
									}
								}//245-249			
							}
							
						}
					}//11-49
						  		
				}
						else{
							
							int b = x%50;
							switch(b){
									case 0:System.out.println(s5[i]+s4[0]);break;
									case 1:System.out.println(s5[i]+s4[0]+s1[0]);break;
									case 2:System.out.println(s5[i]+s4[0]+s1[1]);break;
									case 3:System.out.println(s5[i]+s4[0]+s1[2]);break;
									case 4:System.out.println(s5[i]+s4[0]+s1[3]);break;
									case 5:System.out.println(s5[i]+s4[0]+s2[0]);break;
									case 6:System.out.println(s5[i]+s4[0]+s2[1]);break;
									case 7:System.out.println(s5[i]+s4[0]+s2[2]);break;
									case 8:System.out.println(s5[i]+s4[0]+s2[3]);break;
									case 9:System.out.println(s5[i]+s4[0]+s2[4]);break;
									case 10:System.out.println(s5[i]+s5[0]+s4[1]);break;
									case 11:System.out.println(s5[i]+s5[0]+s4[1]+s1[0]);break;
									case 12:System.out.println(s5[i]+s5[0]+s4[1]+s1[1]);break;
									case 13:System.out.println(s5[i]+s5[0]+s4[1]+s1[2]);break;
									case 14:System.out.println(s5[i]+s5[0]+s4[1]+s1[3]);break;
									case 15:System.out.println(s5[i]+s5[0]+s4[1]+s2[0]);break;
									case 16:System.out.println(s5[i]+s4[1]+s2[1]);break;
									case 17:System.out.println(s5[i]+s4[1]+s2[2]);break;
									case 18:System.out.println(s5[i]+s4[1]+s2[3]);break;
									case 19:System.out.println(s5[i]+s4[1]+s2[4]);break;
									case 20:System.out.println(s5[i]+s4[2]);break;
									case 21:System.out.println(s5[i]+s4[2]+s1[0]);break;
									case 22:System.out.println(s5[i]+s4[2]+s1[1]);break;
									case 23:System.out.println(s5[i]+s4[2]+s1[2]);break;
									case 24:System.out.println(s5[i]+s4[2]+s1[3]);break;
									case 25:System.out.println(s5[i]+s4[2]+s2[0]);break;
									case 26:System.out.println(s5[i]+s4[2]+s2[1]);break;
									case 27:System.out.println(s5[i]+s4[2]+s2[2]);break;
									case 28:System.out.println(s5[i]+s4[2]+s2[3]);break;
									case 29:System.out.println(s5[i]+s4[2]+s2[4]);break;
									case 30:System.out.println(s5[i]+s4[3]);break;
									case 31:System.out.println(s5[i]+s4[3]+s1[0]);break;
									case 32:System.out.println(s5[i]+s4[3]+s1[1]);break;
									case 33:System.out.println(s5[i]+s4[3]+s1[2]);break;
									case 34:System.out.println(s5[i]+s4[3]+s1[4]);break;
									case 35:System.out.println(s5[i]+s4[3]+s2[0]);break;
									case 36:System.out.println(s5[i]+s4[3]+s2[1]);break;
									case 37:System.out.println(s5[i]+s4[3]+s2[2]);break;
									case 38:System.out.println(s5[i]+s4[3]+s2[3]);break;
									case 39:System.out.println(s5[i]+s4[3]+s2[4]);break;
									case 40:System.out.println(s5[i]+s4[4]);break;
									case 41:System.out.println(s5[i]+s4[4]+s1[0]);break;
									case 42:System.out.println(s5[i]+s4[4]+s1[1]);break;
									case 43:System.out.println(s5[i]+s4[4]+s1[2]);break;
									case 44:System.out.println(s5[i]+s4[4]+s1[3]);break;
									case 45:System.out.println(s5[i]+s4[4]+s2[0]);break;
									case 46:System.out.println(s5[i]+s4[4]+s2[1]);break;
									case 47:System.out.println(s5[i]+s4[4]+s2[2]);break;
									case 48:System.out.println(s5[i]+s4[4]+s2[3]);break;
									case 49:System.out.println(s5[i]+s4[4]+s2[4]);break;
									}
							}		
				}
				case 4:{
					int i = 3;
					int x = num%100;
					if(x/50 == 0){
						
						  if(x/10 == 0){
							
							  if(x/5 == 0){
								
								int c = x;
								switch(c) {
								case 0:System.out.println(s5[i]);break;
								case 1:System.out.println(s5[i]+s1[0]);break;
								case 2:System.out.println(s5[i]+s1[1]);break;
								case 3:System.out.println(s5[i]+s1[2]);break;
								case 4:System.out.println(s5[i]+s1[3]);break;
								default:{}
								}	
							}//1-4
							else{
								
								int b = x%5;
								switch(b){
								case 0:System.out.println(s5[i]+s2[0]);break;
								case 1:System.out.println(s5[i]+s2[1]);break;
								case 2:System.out.println(s5[i]+s2[2]);break;
								case 3:System.out.println(s5[i]+s2[3]);break;
								case 4:System.out.println(s5[i]+s2[4]);break;
								}
							}//5-9				
						}
						else{
							
							int b = x/10;
							int d = x%10;
							switch(b){
							case 1:{
								if(d/5 == 0){
									switch(d) {
									case 0:System.out.println(s5[i]+s3[0]);break;
									case 1:System.out.println(s5[i]+s3[0]+s1[0]);break;
									case 2:System.out.println(s5[i]+s3[0]+s1[1]);break;
									case 3:System.out.println(s5[i]+s3[0]+s1[2]);break;
									case 4:System.out.println(s5[i]+s3[0]+s1[3]);break;
									default:{}
									}	
								}//11-14
								else{
									int z = d%5;
									switch(z){
									case 0:System.out.println(s5[i]+s3[0]+s2[0]);break;
									case 1:System.out.println(s5[i]+s3[0]+s2[1]);break;
									case 2:System.out.println(s5[i]+s3[0]+s2[2]);break;
									case 3:System.out.println(s5[i]+s3[0]+s2[3]);break;
									case 4:System.out.println(s5[i]+s3[0]+s2[4]);break;
									}
								}//15-19				
								
							}//11-19
							case 2:{
								if(d/5 == 0){
									switch(d) {
									case 0:System.out.println(s5[i]+s3[1]);break;
									case 1:System.out.println(s5[i]+s3[1]+s1[0]);break;
									case 2:System.out.println(s5[i]+s3[1]+s1[1]);break;
									case 3:System.out.println(s5[i]+s3[1]+s1[2]);break;
									case 4:System.out.println(s5[i]+s3[1]+s1[3]);break;
									default:{}
									}	
								}//21-24
								else{
									int z = d%5;
									switch(z){
									case 0:System.out.println(s5[i]+s3[1]+s2[0]);break;
									case 1:System.out.println(s5[i]+s3[1]+s2[1]);break;
									case 2:System.out.println(s5[i]+s3[1]+s2[2]);break;
									case 3:System.out.println(s5[i]+s3[1]+s2[3]);break;
									case 4:System.out.println(s5[i]+s3[1]+s2[4]);break;
									}
								}//25-29				
							}//21-29
							case 3:{
								if(d/5 == 0){
									switch(d) {
									case 0:System.out.println(s5[i]+s3[2]);break;
									case 1:System.out.println(s5[i]+s3[2]+s1[0]);break;
									case 2:System.out.println(s5[i]+s3[2]+s1[1]);break;
									case 3:System.out.println(s5[i]+s3[2]+s1[2]);break;
									case 4:System.out.println(s5[i]+s3[2]+s1[3]);break;
									default:{}
									}	
								}//31-34
								else{
									int z = d%5;
									switch(z){
									case 0:System.out.println(s5[i]+s3[2]+s2[0]);break;
									case 1:System.out.println(s5[i]+s3[2]+s2[1]);break;
									case 2:System.out.println(s5[i]+s3[2]+s2[2]);break;
									case 3:System.out.println(s5[i]+s3[2]+s2[3]);break;
									case 4:System.out.println(s5[i]+s3[2]+s2[4]);break;
									}
								}//35-39			
							}//31-39
							case 4:{
								if(d/5 == 0){
									switch(d) {
									case 0:System.out.println(s5[i]+s3[3]);break;
									case 1:System.out.println(s5[i]+s3[3]+s1[0]);break;
									case 2:System.out.println(s5[i]+s3[3]+s1[1]);break;
									case 3:System.out.println(s5[i]+s3[3]+s1[2]);break;
									case 4:System.out.println(s5[i]+s3[3]+s1[3]);break;
									default:{}
									}	
								}//41-44
								else{
									int z = d%5;
									switch(z){
									case 0:System.out.println(s5[i]+s3[3]+s2[0]);break;
									case 1:System.out.println(s5[i]+s3[3]+s2[1]);break;
									case 2:System.out.println(s5[i]+s3[3]+s2[2]);break;
									case 3:System.out.println(s5[i]+s3[3]+s2[3]);break;
									case 4:System.out.println(s5[i]+s3[3]+s2[4]);break;
									}
								}//245-249			
							}
							
						}
					}//11-49
						  		
				}
						else{
							
							int b = x%50;
							switch(b){
									case 0:System.out.println(s5[i]+s4[0]);break;
									case 1:System.out.println(s5[i]+s4[0]+s1[0]);break;
									case 2:System.out.println(s5[i]+s4[0]+s1[1]);break;
									case 3:System.out.println(s5[i]+s4[0]+s1[2]);break;
									case 4:System.out.println(s5[i]+s4[0]+s1[3]);break;
									case 5:System.out.println(s5[i]+s4[0]+s2[0]);break;
									case 6:System.out.println(s5[i]+s4[0]+s2[1]);break;
									case 7:System.out.println(s5[i]+s4[0]+s2[2]);break;
									case 8:System.out.println(s5[i]+s4[0]+s2[3]);break;
									case 9:System.out.println(s5[i]+s4[0]+s2[4]);break;
									case 10:System.out.println(s5[i]+s5[0]+s4[1]);break;
									case 11:System.out.println(s5[i]+s5[0]+s4[1]+s1[0]);break;
									case 12:System.out.println(s5[i]+s5[0]+s4[1]+s1[1]);break;
									case 13:System.out.println(s5[i]+s5[0]+s4[1]+s1[2]);break;
									case 14:System.out.println(s5[i]+s5[0]+s4[1]+s1[3]);break;
									case 15:System.out.println(s5[i]+s5[0]+s4[1]+s2[0]);break;
									case 16:System.out.println(s5[i]+s4[1]+s2[1]);break;
									case 17:System.out.println(s5[i]+s4[1]+s2[2]);break;
									case 18:System.out.println(s5[i]+s4[1]+s2[3]);break;
									case 19:System.out.println(s5[i]+s4[1]+s2[4]);break;
									case 20:System.out.println(s5[i]+s4[2]);break;
									case 21:System.out.println(s5[i]+s4[2]+s1[0]);break;
									case 22:System.out.println(s5[i]+s4[2]+s1[1]);break;
									case 23:System.out.println(s5[i]+s4[2]+s1[2]);break;
									case 24:System.out.println(s5[i]+s4[2]+s1[3]);break;
									case 25:System.out.println(s5[i]+s4[2]+s2[0]);break;
									case 26:System.out.println(s5[i]+s4[2]+s2[1]);break;
									case 27:System.out.println(s5[i]+s4[2]+s2[2]);break;
									case 28:System.out.println(s5[i]+s4[2]+s2[3]);break;
									case 29:System.out.println(s5[i]+s4[2]+s2[4]);break;
									case 30:System.out.println(s5[i]+s4[3]);break;
									case 31:System.out.println(s5[i]+s4[3]+s1[0]);break;
									case 32:System.out.println(s5[i]+s4[3]+s1[1]);break;
									case 33:System.out.println(s5[i]+s4[3]+s1[2]);break;
									case 34:System.out.println(s5[i]+s4[3]+s1[4]);break;
									case 35:System.out.println(s5[i]+s4[3]+s2[0]);break;
									case 36:System.out.println(s5[i]+s4[3]+s2[1]);break;
									case 37:System.out.println(s5[i]+s4[3]+s2[2]);break;
									case 38:System.out.println(s5[i]+s4[3]+s2[3]);break;
									case 39:System.out.println(s5[i]+s4[3]+s2[4]);break;
									case 40:System.out.println(s5[i]+s4[4]);break;
									case 41:System.out.println(s5[i]+s4[4]+s1[0]);break;
									case 42:System.out.println(s5[i]+s4[4]+s1[1]);break;
									case 43:System.out.println(s5[i]+s4[4]+s1[2]);break;
									case 44:System.out.println(s5[i]+s4[4]+s1[3]);break;
									case 45:System.out.println(s5[i]+s4[4]+s2[0]);break;
									case 46:System.out.println(s5[i]+s4[4]+s2[1]);break;
									case 47:System.out.println(s5[i]+s4[4]+s2[2]);break;
									case 48:System.out.println(s5[i]+s4[4]+s2[3]);break;
									case 49:System.out.println(s5[i]+s4[4]+s2[4]);break;
									}
							}		
				}
			}
				
			}
			
		}//100-999
	}//method
					
}//class
						
		
	
					

	
						

			

