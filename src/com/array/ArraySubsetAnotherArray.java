package com.array;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class ArraySubsetAnotherArray { 
    
    //Approach 1 - Corrected Approach - Time Complexity: O(n+m) 
    public static String arraySubsetAnotherArray1(int[] arr1, int[] arr2) {
        for (int j : arr2) {
            boolean found = false;
            for (int i : arr1) {
                if (i == j) {
                    found = true;
                    break;
                }
            }
            if (!found) {
                return "No";
            }
        }
        return "Yes";
    }
    
    //Approach 2 - Time Complexity: O(n+m)
    public static String arraySubsetAnotherArray2(int[] arr1, int[] arr2) {
        Set<Integer> set = new HashSet<>();
        
        for (int i : arr1) {
            set.add(i);
        }
        
        for (int j : arr2) {
            if (!set.contains(j)) {
                return "No";
            }
        }
        
        return "Yes";
    }
    
    //Approach 3 - Corrected Approach - Time Complexity: O(nlogn + mlogm)
    public static String arraySubsetAnotherArray3(int[] arr1, int[] arr2) {
        Arrays.sort(arr1);
        Arrays.sort(arr2);
        
        int i = 0;
        int j = 0;
        
        int n = arr1.length;
        int m = arr2.length;
        
        while (i < n && j < m) {
            if (arr1[i] < arr2[j]) {
                i++;
            } else if (arr1[i] == arr2[j]) {
                i++;
                j++;
            } else {
                return "No";
            }
        }
        
        return j == m ? "Yes" : "No";
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the Size of Array1: ");
        int n1 = sc.nextInt();

        System.out.println("Enter the Elements in Array1: ");
        int[] arr1 = new int[n1];
        for (int i = 0; i < n1; i++) {
            arr1[i] = sc.nextInt();
        }
        
        System.out.println("Enter the Size of Array2: ");
        int n2 = sc.nextInt();

        System.out.println("Enter the Elements in Array2: ");
        int[] arr2 = new int[n2];
        for (int i = 0; i < n2; i++) {
            arr2[i] = sc.nextInt();
        }
        
        System.out.println(arraySubsetAnotherArray1(arr1, arr2));
        System.out.println(arraySubsetAnotherArray2(arr1, arr2));
        System.out.println(arraySubsetAnotherArray3(arr1, arr2));

        sc.close();
    }
}
