/*
	Input: s = Rohit
	Output: tihoR
*/
package com.string;

import java.util.Scanner;

public class ReverseString {
	
	public static String reverseString(String str)
    {
        int start=0;
        int end=str.length()-1; 
        char[] ch=str.toCharArray();
        while(start<end){
            char temp=ch[start];
            ch[start]=ch[end];
            ch[end]=temp;
            start++;
            end--;
        }
        
        return new String(ch);
        
        /*String reverse="";
        for(int i=str.length()-1; i>=0; i--){
            reverse+=str.charAt(i);
        }
        
        return reverse;*/
        
        /*StringBuilder sb=new StringBuilder(str);
        sb.reverse();
        return sb.toString();*/
        
        /*StringBuffer sb=new StringBuffer(str);
        sb.reverse();
        return sb.toString();*/
    }
	
	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter the String: ");
		String str=sc.nextLine();
		
		System.out.println(reverseString(str));
		
		sc.close();
	}
}
