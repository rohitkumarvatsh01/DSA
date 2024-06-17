/*
 Input: arr[] = {0,3,1,2}, n = 4
Output: -1
Explanation: There is no repeating element in the array. Therefore output is -1.
Input: arr[] = {2,3,1,2,3}, n = 5
Output: 2 3 
Explanation: 2 and 3 occur more than once in the given array.
 */
package com.array;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class FindDuplicatesArray {
	
	public static ArrayList<Integer> duplicates(int arr[]) {
        
        Arrays.sort(arr);
        
        ArrayList<Integer>ans=new ArrayList<>();
        int n1=Integer.MIN_VALUE;
        
        for(int i=0; i<arr.length-1; i++){
            if(arr[i]==arr[i+1] && arr[i]!=n1){
                ans.add(arr[i]);
                n1=arr[i];
            }
        }
       if(ans.isEmpty()){
           ans.add(-1);
       }
       
       return ans;
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
        
        System.out.println(duplicates(arr));
        
        sc.close();
    }
}
