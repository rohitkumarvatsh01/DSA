package com.interview;

import java.util.Scanner;

public class SecondHighestElementArray {
	
	public static int secondElement(int[] arr) {
		int firstMax=Integer.MIN_VALUE;
		int secondMax=Integer.MIN_VALUE;
		
		for(int i=0; i<arr.length; i++) {
			if(arr[i]>firstMax) {
				secondMax=firstMax;
				firstMax=arr[i];
			}
			else if(arr[i]>secondMax && arr[i]!=firstMax) {
				secondMax=arr[i];
			}
		}
		
		return secondMax;
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
		
		System.out.println(secondElement(arr));
		
		sc.close();
	}
}
