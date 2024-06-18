/*
	Input: String: I am Rohit Kumar
	Output: a 2, r 2, t 1, u 1, h 1, i 2, k 1, m 2, o 1
 */
package com.string;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class FrequencyCharacter {

	public static void printFrequencyCharcter(String str) {
		
		Map<Character, Integer>map=new HashMap<>();
	
		for(int i=0; i<str.length(); i++) {
			char ch=Character.toLowerCase(str.charAt(i));
			if(ch!=' ') {
				if(map.containsKey(ch)) {
					map.put(ch, map.get(ch)+1);
				}
				else {
					map.put(ch, 1);
				}
			}
		}
	
		for(Map.Entry<Character, Integer>print:map.entrySet()) {
			System.out.println(print.getKey()+" "+print.getValue());
		}
	}	

	public static void main(String[] args) {
	
		Scanner sc=new Scanner(System.in);
	
		System.out.println("Enter the String: ");
		String str=sc.nextLine();
	
		printFrequencyCharcter(str);
	
		sc.close();
	}
}

