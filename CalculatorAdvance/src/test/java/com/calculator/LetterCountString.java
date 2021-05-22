package com.calculator;

import java.util.Scanner;

public class LetterCountString {

	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		System.out.println("Enter a Name : ");
		 String s=in.nextLine();
		 s = s.toLowerCase();
		 //each count each letter frequency
		 System.out.println("Character\tFrequency");
		 		 
		 for (char ch ='a'; ch<='z'; ch++)
		 {
			 int c=0; //counter variable
			 
			 for(int i=0; i<s.length(); i++)
			 {
				 if(ch == s.charAt(i))
					 c++;
					 
			 }
			 if(c!=0)
				System.out.println(ch+"\t\t"+c);
			 
		 }
		
	}

}
