/*
	Input: S = "abba"
	Output: 1
	Explanation: S is a palindrome
 */
package com.string;

import java.util.Scanner;

public class PalindromeString {
	
	public static int palindromeString(String S) {
        // code here
        
        int start=0;
        int end=S.length()-1;
        
        while(start<end){
            if(S.charAt(start)!=S.charAt(end)){
                return 0;
            }
            start++;
            end--;
        }
        return 1;
        
        /*
        int start=0;
        int end=S.length()-1;
        char[] ch=S.toCharArray();
        
        while(start<end){
            if(ch[start]!=ch[end]){
                return 0;
            }
            start++;
            end--;
        }
        return 1;*/
        
       /* String reverse="";
        for(int i=S.length()-1; i>=0; i--){
            reverse+=S.charAt(i);
        }
        if(S.equals(reverse)){
            return 1;
        }
        else{
            return 0;
        }*/
    }
	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter the String: ");
		String str=sc.nextLine();
		
		System.out.println(palindromeString(str));
		
		sc.close();
	}
}
