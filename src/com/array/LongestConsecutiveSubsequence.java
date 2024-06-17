/*
	Input:  N = 7
			a[] = {2,6,1,9,4,5,3}
			Output:6
	Explanation: The consecutive numbers here are 1, 2, 3, 4, 5, 6. 
	These 6 numbers form the longest consecutivesubsquence.
 */
package com.array;

import java.util.Arrays;
import java.util.Scanner;

public class LongestConsecutiveSubsequence {
	
	public static int longestSum(int[] arr) {
		Arrays.sort(arr);
		
		for(int i=0; i<arr.length; i++) {
			if(arr[i]!=i+1) {
				return i;
			}
		}
		
		return -1;
		
		
//		Arrays.sort(arr);
//	      int max=1;
//	      int prevVal=arr[0];
//	      int count=1;
//	      for(int i=1;i<arr.length;i++){
//	          if(arr[i]-prevVal==1){
//	              count++;
//	              prevVal=arr[i];
//	          }
//	          else if(arr[i]-prevVal>1){
//	              max=Math.max(count,max);
//	              count=1;
//	              prevVal=arr[i];
//	          }
//	      }
//	      
//	      return Math.max(count,max);
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
        
        System.out.println(longestSum(arr));
        
        sc.close();
    }
}
