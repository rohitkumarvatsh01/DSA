/*
    Input: N=6
    arr[]={1,2,0,2,1,0}

    Output: {0,0,1,1,2,2}
*/
package com.array;

import java.util.Scanner;

public class SortArray012s {

    // Function to print the array
    public static void printArray(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    // Function to swap elements in the array
    public static void swapArray(int[] arr, int left, int right) {
        int temp = arr[left];
        arr[left] = arr[right];
        arr[right] = temp;
    }

    // Function to sort the array of 0s, 1s, and 2s
    public static void sortArray012(int[] arr) {
        int left = 0;    // O(1) space
        int mid = 0;     // O(1) space
        int right = arr.length - 1;  // O(1) space

        while (mid <= right) {  // O(n) time complexity
            if (arr[mid] == 0) {
                swapArray(arr, mid, left);
                left++;
                mid++;
            } else if (arr[mid] == 1) {
                mid++;
            } else if (arr[mid] == 2) {
                swapArray(arr, mid, right);
                right--;
            }
        }

        printArray(arr);  // O(n) time complexity
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

        sortArray012(arr);  // O(n) time complexity

        sc.close();
    }
}
