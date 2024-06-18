/*
	Input: geeksforgeeks
		   forgeeksgeeks
	Output: 	1
	Explanation: s1 is geeksforgeeks, s2 is
				forgeeksgeeks. Clearly, s2 is a rotated
				version of s1 as s2 can be obtained by
				left-rotating s1 by 5 units.
 */
package com.string;

import java.util.Scanner;

public class CheckStringsRotations {
	
	public static boolean areRotations(String s1, String s2 )
    {
        String str=s1+s1;
        int i=0;
        int j=0;
        while(i<str.length() && j <s2.length()){
            if(str.charAt(i)==s2.charAt(j)){
                i++;j++;
            }
            else{
                i++;
            }
        }
        
        return j==s2.length();
        
       /*if(s1.length()!=s2.length()){
           return false;
       }
       
       
       String s1s1=s1+s1;
       
       if(s1s1.contains(s2)){
           return true;
       }
       
       return false;*/
    }
	
	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter the String1: ");
		String str1=sc.nextLine();
		
		System.out.println("Enter the String2: ");
		String str2=sc.nextLine();
		
		boolean check=areRotations(str1, str2);
		System.out.println(check);
		
		sc.close();
	}
}
