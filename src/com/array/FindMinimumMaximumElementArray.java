/*Input:
	N = 6
	A[] = {3, 2, 1, 56, 10000, 167}
	Output: 1 10000
	Explanation: minimum and maximum elements of array are 1 and 10000.
*/
package com.array;

import java.util.Scanner;

public class FindMinimumMaximumElementArray {
	
	public static int[] getMinMaxElement(int[] arr) {
		int[] ans=new int[2];
		int minElement=arr[0];
		int maxElement=arr[0];
		
		for(int i=1; i<arr.length; i++) {
			if(arr[i]<minElement) {
				minElement=arr[i];
			}
			else if(arr[i]>maxElement) {
				maxElement=arr[i];
			}
		}
		ans[0]=minElement;
		ans[1]=maxElement;
		return ans;
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
		
		int[] minMax = getMinMaxElement(arr);
        System.out.println("Minimum: " + minMax[0] + ", Maximum: " + minMax[1]);
		
		sc.close();
		
	}
}
