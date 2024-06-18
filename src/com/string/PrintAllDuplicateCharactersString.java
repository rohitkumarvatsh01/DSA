/*
	Input: S = “geeksforgeeks”
	Output:
			e, count = 4
			g, count = 2
			k, count = 2
			s, count = 2
 */
package com.string;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class PrintAllDuplicateCharactersString {
	
	public static void duplicateCharacter(String str) {
		Map<Character, Integer>map=new HashMap<>();
		
		for(int i=0; i<str.length(); i++) {
			if(map.containsKey(str.charAt(i))) {
				map.put(str.charAt(i), map.get(str.charAt(i))+1);
			}
			else {
				map.put(str.charAt(i), 1);
			}
		}
		
		for(Map.Entry<Character, Integer>print:map.entrySet()) {
			if(print.getValue()>1) {
				System.out.println(print.getKey()+" "+print.getValue());
			}
		}
	}
	
	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter the String: ");
		String str=sc.nextLine();
		
		duplicateCharacter(str);
		
		sc.close();
	}
}
