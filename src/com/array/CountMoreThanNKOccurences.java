/*
 	Input:N = 8
	arr = [3,1,2,2,1,2,3,3]
	k = 4
	Output: 2
	Explanation: In the given array, 3 and 2 are the only elements that appears more than n/k times.
 */
package com.array;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class CountMoreThanNKOccurences {
	
	public static int countMoreThanNKOccurences(int[] arr, int k) {
		
		int n=arr.length;
		Map<Integer, Integer>map=new HashMap<>();
        int check=n/k;
        int count=0;
        
        for(int i=0; i<n; i++){
            map.put(arr[i], map.getOrDefault(arr[i], 0)+1);
        }
        
        for(int counts:map.values()){
            if(counts>check){
                count++;
            }
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
        
        System.out.println("Enter the K: ");
        int k = sc.nextInt();
        
        System.out.println(countMoreThanNKOccurences(arr, k));
        
        sc.close();
    }
}
