/*
 	Input: N = 4
		arr[] = {7,4,0,9}
	Output: 10
	Explanation: Water trapped by above block of height 4 is 3 units and above 
	block of height 0 is 7 units. So, the total unit of water trapped is 10 units.
 */
package com.array;

import java.util.Scanner;

public class TrappingRainWater {
	
	public static int trappingRainWater(int[] arr, int n) {
		int leftMax = 0, rightMax = 0;
        int left = 0, right = n - 1;
        int waterTrapped = 0;

        while (left <= right) {
            if (arr[left] < arr[right]) {
                if (arr[left] > leftMax) {
                    leftMax = arr[left];
                } else {
                    waterTrapped += leftMax - arr[left];
                }
                left++;
            } else {
                if (arr[right] > rightMax) {
                    rightMax = arr[right];
                } else {
                    waterTrapped += rightMax - arr[right];
                }
                right--;
            }
        }

        return waterTrapped;
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
        
        System.out.println(trappingRainWater(arr, n));
        
        sc.close();
    }
}
