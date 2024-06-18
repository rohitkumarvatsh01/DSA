package com.string;

public class StringImmutable {
	public static void main (String[] args) {
	    String str1="Rohit";
	    String str2=str1;
	    str1=str1.concat(" Kumar");
	    System.out.println(str1);
	    System.out.println(str2);
	}
}
