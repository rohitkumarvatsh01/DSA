/*
	Input: n = 6
	arr[] = 7 10 4 3 20 15
	k = 3 l=0 r=5
 	Output: 7
 */

package com.array;

import java.util.Arrays;
import java.util.Scanner;

public class KthSmallestElement {
	
	public static int kthElement(int[] arr, int l, int r, int k) {
		
		int[] newArray=new int[r+1];
		for(int i=l; i<r+1; i++) {
			newArray[i]=arr[i];
		}
		
		Arrays.sort(newArray);
		
		return newArray[k-1];
	}
	
	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter the Size of Array: ");
		int n=sc.nextInt();
		
		System.out.println("Enter the Element in Array: ");
		int[] arr=new int[n];
		for(int i=0; i<n; i++) {
			arr[i]=sc.nextInt();
		}
		
		System.out.println("Enter the Start Index: ");
		int start=sc.nextInt();
		
		System.out.println("Enter the End Index: ");
		int end=sc.nextInt();
		
		System.out.println("Enter the Kth Smallest Element: ");
		int k=sc.nextInt();
		
		System.out.println(kthElement(arr, start, end, k));
		
		sc.close();
		
	}
}
