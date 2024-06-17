package com.interview;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class FrequencyOfCharacter {
	
	public static void frequencyCharacter(String str) {
		str=str.toUpperCase();
		Map<Character, Integer>map=new HashMap<>();
		
		for(int i=0; i<str.length(); i++) {
			char ch=str.charAt(i);
			if(map.containsKey(ch)) {
				map.put(ch, map.get(ch)+1);
			}else {
				map.put(ch, 1);
			}
		}
		
		
		for(Map.Entry<Character, Integer>print:map.entrySet()) {
			System.out.println("Key "+print.getKey()+" : Value "+print.getValue());
		}
		
	}
	
	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter the String: ");
		String str=sc.nextLine();
		
		frequencyCharacter(str);
	}
}
