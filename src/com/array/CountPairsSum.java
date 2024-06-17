/*
 	Input: N = 4, K = 6
	arr[] = {1, 5, 7, 1}
	Output: 2
	Explanation: 
	arr[0] + arr[1] = 1 + 5 = 6 
	and arr[1] + arr[3] = 5 + 1 = 6.
 */
package com.array;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class CountPairsSum {
	
	public static int countPair1(int[] arr, int sum) {
		int count=0;
		
		for(int i=0; i<arr.length-1; i++) {
			for(int j=i+1; j<arr.length; j++) {
				if(arr[i]+arr[j]==sum) {
					count++;
				}
			}
		}
		
		return count;
	}
	
    public static int countPair2(int[] arr, int k) {
    	int count=0;
    	
    	Map<Integer, Integer>map=new HashMap<>();
    	
    	for(int i=0; i<arr.length; i++) {
    		int sum=k-arr[i];
    		
    		if(map.containsKey(sum)) {
    			count+=map.get(sum);
    		}
    		
    		map.put(arr[i], map.getOrDefault(arr[i], 0)+1);
    	}
    	
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
        int sum = sc.nextInt();
        
        System.out.println(countPair1(arr, sum));
        System.out.println(countPair2(arr, sum));
        
        sc.close();
    }
}
