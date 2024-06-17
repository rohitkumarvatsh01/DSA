/*
 	Input: n = 6
	arr[] = {1,2,3,4,5,6}
	Output: 6 1 5 2 4 3
		Explanation: Max element = 6, min = 1, 
	second max = 5, second min = 2, and 
	so on... Modified array is : 6 1 5 2 4 3.
*/
package com.array;

import java.util.Scanner;

public class RearrangeArrayAlternately {
    
    public static void rearrange(int arr[]) {
        int n = arr.length;
        int max_element = arr[n - 1] + 1;
        int min_index = 0, max_index = n - 1;
        
        for (int i = 0; i < n; i++) {
            if (i % 2 == 0) {
                arr[i] += (arr[max_index] % max_element) * max_element;
                max_index--;
            } else {
                arr[i] += (arr[min_index] % max_element) * max_element;
                min_index++;
            }
        }
        
        for (int i = 0; i < n; i++) {
            arr[i] /= max_element;
        }
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
        
        rearrange(arr);
        
        System.out.println("Rearranged Array:");
        for (int num : arr) {
            System.out.print(num + " ");
        }

        sc.close();
    }
}