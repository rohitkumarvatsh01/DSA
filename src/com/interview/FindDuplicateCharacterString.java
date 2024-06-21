package com.interview;
import java.util.Arrays;
import java.util.Scanner;

public class FindDuplicateCharacterString {
	
	public static void duplicateCharacter(String str) {
		char[] ch=str.toCharArray();
		Arrays.sort(ch);
		char check='#';
		for(int i=0; i<str.length()-1; i++) {
			if(ch[i]==ch[i+1] && ch[i]!=check) {
				System.out.println(ch[i]);
				check=ch[i];
			}
		}
	}
	
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter the String: ");
		String str=sc.nextLine();
		
		duplicateCharacter(str);
	}
}
