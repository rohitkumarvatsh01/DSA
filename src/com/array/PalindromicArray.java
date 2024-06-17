/*
 	Input: 5
	arr[]= 111 222 333 444 555
	Output: 1

	Explanation:
				A[0] = 111 //which is a palindrome number.
				A[1] = 222 //which is a palindrome number.
				A[2] = 333 //which is a palindrome number.
				A[3] = 444 //which is a palindrome number.
				A[4] = 555 //which is a palindrome number.
				As all numbers are palindrome so This will return 1.
 */
package com.array;

import java.util.Scanner;

public class PalindromicArray {
	
	public static String palindromicArray(int[] arr) {
		
		for(int i=0; i<arr.length; i++) {
			int num=arr[i];
			int rem;
			int reverse=0;
			
			while(num>0) {
				rem=num%10;
				reverse=(reverse*10)+rem;
				num/=10;
			}
			
			if(arr[i]!=reverse) {
				return "Not Palindrom Array";
			}
		}
		
		return "Palindrom Array";
	}
	
	public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the Size of Array: ");
        int n = sc.nextInt();

        System.out.println("Enter the Elements in Array: ");
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        
        System.out.println(palindromicArray(arr));
        
        sc.close();
    }
}
