package com.interview;
import java.util.Scanner;

public class FindDuplicateElementArray {
	
	public static void duplicateArray(int[] arr) {
		for(int i=0; i<arr.length-1; i++) {
			for(int j=i+1; j<arr.length; j++) {
				if(arr[i]==arr[j]) {
					System.out.println(arr[i]);
				}
			}
		}
	}
	
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter the size of Array: ");
		int n=sc.nextInt();
		
		System.out.println("Enter the Element of Array: ");
		int[] arr=new int[n];
		for(int i=0; i<n; i++) {
			arr[i]=sc.nextInt();
		}
		
		duplicateArray(arr);
	}
}
