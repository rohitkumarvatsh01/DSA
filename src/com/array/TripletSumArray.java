/*
 	Input: n = 6, X = 13
	arr[] = [1 4 45 6 10 8]
	Output: 1
	Explanation: The triplet {1, 4, 8} in  the array sums up to 13.
 */
package com.array;

import java.util.Arrays;
import java.util.Scanner;

public class TripletSumArray {
	
	public static boolean tripletSumArray(int[] A, int n, int X) {
		
		Arrays.sort(A);
        
        for(int i=0; i<n-2; i++){
            int left=i+1;
            int right=n-1;
            
            while(left<right){
                int sum=A[i]+A[left]+A[right];
                
                if(sum==X){
                    return true;
                }
                else if(sum<X){
                    left++;
                }
                else{
                    right--;
                }
            }
        }
        
        return false;
        
        /*for(int j=0; j<n-1; j++){
            HashSet<Integer>set=new HashSet<>();
            int t=X-A[j];
            
            for(int i=j+1; i<n; i++){
                if(set.contains(t-A[i])){
                    return true;
                }
                set.add(A[i]);
            }
        }
        
        return false;*/
        
        
       /*for(int i=0; i<n-2; i++){
           for(int j=i+1; j<n-1; j++){
               for(int k=j+1; k<n; k++){
                   if(A[i]+A[j]+A[k]==X){
                       return true;
                   }
               }
           }
       }
       return false;*/
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
        
        System.out.println("Enter the Sum Value: ");
        int x = sc.nextInt();
        
        System.out.println(tripletSumArray(arr, n, x));
        
        sc.close();
    }
}
