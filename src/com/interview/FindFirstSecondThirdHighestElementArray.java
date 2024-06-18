package com.interview;

import java.util.Scanner;

public class FindFirstSecondThirdHighestElementArray {
	
	public static void maxElement(int[] arr) {
		int first=Integer.MIN_VALUE;
		int second=Integer.MIN_VALUE;
	    int third=Integer.MIN_VALUE;
		
		for(int i=0; i<arr.length; i++){
		    if(arr[i]>first){
		        third=second;
		        second=first;
		        first=arr[i];
		    }
		    else if(arr[i]>second && arr[i]!=first){
		        second=first;
		        first=arr[i];
		    }
		    else if(arr[i]>third && arr[i]!=second && arr[i]!=first){
		        third=arr[i];
		    }
		}
		
		System.out.println("First Maximum: "+first);
		System.out.println("Second Maximum: "+second);
		System.out.println("Third Maximum: "+third);
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
		
		maxElement(arr);
		
		sc.close();
	}
}

