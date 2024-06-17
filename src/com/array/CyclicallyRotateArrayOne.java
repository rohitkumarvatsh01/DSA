/*
 	Input:N = 5
	A[] = {1, 2, 3, 4, 5}
	Output:5 1 2 3 4
*/

package com.array;

import java.util.Scanner;

public class CyclicallyRotateArrayOne {
	
	public static void printArray(int[] arr) {
		for(int i=0; i<arr.length; i++) {
			System.out.print(arr[i]+" ");
		}
	}
	
	public static void rotate(int arr[], int n)
    {
        int lastIndex=arr[n-1];
        
        for(int i=n-1; i>0; i--){
            arr[i]=arr[i-1];
        }
        
        arr[0]=lastIndex;
        
        printArray(arr);
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
        
        rotate(arr, n);
        
        sc.close();
    }
}
