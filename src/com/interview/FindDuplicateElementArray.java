package com.interview;
import java.util.Arrays;
import java.util.Scanner; 

public class FindDuplicateElementArray {
	
	public static void duplicateElement(int[] arr) {
		
		Arrays.sort(arr);
		int check=Integer.MIN_VALUE;
		for(int i=0; i<arr.length-1; i++) {
			if(arr[i]==arr[i+1] && arr[i]!=check) {
				check=arr[i];
				System.out.println(arr[i]);
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
		
		duplicateElement(arr);
	}
}
