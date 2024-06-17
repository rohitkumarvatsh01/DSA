/*
	Input:N = 5
	Arr[] = {6, -3, -10, 0, 2}
	Output: 180
	Explanation: Subarray with maximum product is [6, -3, -10] which gives product as 180.
 */

package com.array;

import java.util.Scanner;

public class MaximumProductSubarray {
	
	public static int maximumProduct(int[] arr) {
		int mul=1;
		int max=Integer.MIN_VALUE;
		
		for(int i=0; i<arr.length; i++) {
			mul*=arr[i];
			max=Math.max(max, mul);
		}
		
		return mul;
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
        
        System.out.println(maximumProduct(arr));
        
        sc.close();
    }
}
