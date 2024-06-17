package com.interview;
import java.util.Scanner;

public class InsertElementFindIndexSortedArray {
	
	public static int findIndex(int[] arr, int target) {
		
		int start=0;
		int end=arr.length-1;
		int mid=(start+end)/2;
		
		while(start<=end) {
			if(arr[mid]==target) {
				return mid;
			}
			else if(arr[mid]<target) {
				start=mid+1;
			}
			else if(arr[mid]>target) {
				end=mid-1;
			}
			mid=(start+end)/2;
		}
		
		return start;
	}
	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter the Size of Array: ");
		int n=sc.nextInt();
		
		System.out.println("Enter the Element in Sorted Array");
		int[] arr=new int[n];
		for(int i=0; i<n; i++) {
			arr[i]=sc.nextInt();
		}
		
		System.out.println("Enter the Target Element: ");
		int target=sc.nextInt();
		
		System.out.println(findIndex(arr, target));
	}
}
