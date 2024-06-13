/*
 	Input: n=6
	arr[]= {1,2,3,4,5,6}
	Output: 6,5,4,3,2,1
*/

package com.array;
import java.util.Scanner;

public class ReverseArray {
	
	public static void printArray(int[] arr) {
		for(int i=0; i<arr.length; i++) {
			System.out.print(arr[i]+" ");
		}
		System.out.println();
	}
	
	public static void reverseArrayExtraSpace(int[] arr) {
		int[] newArray=new int[arr.length];
		
		for(int i=0; i<arr.length; i++) {
			newArray[i]=arr[arr.length-1-i];
		}
		
		printArray(newArray);
	}
	
	public static void reverseArrayInPlace(int[] arr) {
		int start=0;
		int end=arr.length-1;
		
		while(start<=end) {
			int temp=arr[start];
			arr[start]=arr[end];
			arr[end]=temp;
			start++;
			end--;
		}
		printArray(arr);
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
		
		reverseArrayExtraSpace(arr);
		reverseArrayInPlace(arr);
		
		sc.close();
		
	}
}
