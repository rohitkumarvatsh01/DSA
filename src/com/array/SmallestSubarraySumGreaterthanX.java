/*
	Input: A[] = {1, 4, 45, 6, 0, 19}
			x  =  51
	Output: 3
	Explanation: Minimum length subarray is {4, 45, 6}
 */
package com.array;

import java.util.Scanner;

public class SmallestSubarraySumGreaterthanX {
	
	public static int smallestSubarraySumGreaterthanX(int[] a, int n, int x) {
		int start=0;
        int sum=0;
        int count=Integer.MAX_VALUE;
        for(int i=0; i<n; i++){
            sum+=a[i];
            while(sum>x &&start<=i){
                count=Math.min(count,i-start+1);
                sum-=a[start++];
            }
        }
        if(count==Integer.MAX_VALUE) count=0;
        return count;
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
        
        System.out.println("Enter the Sum: ");
        int x = sc.nextInt();
        
        System.out.println(smallestSubarraySumGreaterthanX(arr, n, x));
        
        sc.close();
    }
}
