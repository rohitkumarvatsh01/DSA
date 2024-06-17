/*
 	Input: N = 5, arr[] = {2, 4, 1, 3, 5}
	Output: 3
	Explanation: The sequence 2, 4, 1, 3, 5 
	has three inversions (2, 1), (4, 1), (4, 3).
*/
package com.array;

import java.util.Scanner;

public class CountInversions {
	
	public static int countInversion(int[] arr) {
		int count=0;
        
        for(int i=0; i<arr.length-1; i++){
            for(int j=i+1; j<arr.length; j++){
                if(arr[i]>arr[j]){
                    count++;
                }
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
        
        System.out.println(countInversion(arr));
        
        sc.close();
    }

}
