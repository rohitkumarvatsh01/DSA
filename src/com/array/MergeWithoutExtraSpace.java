/*
 	n = 4, arr1[] = [1 3 5 7] 
	m = 5, arr2[] = [0 2 6 8 9]
	Output: 
			arr1[] = [0 1 2 3]
			arr2[] = [5 6 7 8 9]
	Explanation:
	After merging the two 
	non-decreasing arrays, we get, 
	0 1 2 3 
	5 6 7 8 9.
*/

package com.array;

import java.util.Arrays;
import java.util.Scanner;

public class MergeWithoutExtraSpace {
	
	public static void printArray(int[] arr) {
		for(int i=0; i<arr.length; i++) {
			System.out.print(arr[i]+" ");
		}
		System.out.println();
	}
	
	public static void merge(int arr1[], int n, int arr2[], int m) 
    {
        
        int left=n-1;
        int right=0;
        while(left>=0 && right<m){
            if(arr1[left]>arr2[right]){
                int temp=arr1[left];
                arr1[left]=arr2[right];
                arr2[right]=temp;
                left--;
                right++;
            }
            else{
                break;
            }
            
        }
        Arrays.sort(arr1);
        Arrays.sort(arr2);
        
        printArray(arr1);
        printArray(arr2);
        
        
        /*long[] ans=new long[n+m];
        
        for(int i=0; i<n; i++){
            ans[i]=arr1[i];
        }
        
        for(int j=0; j<m; j++){
            ans[n+j]=arr2[j];
        }
        
        Arrays.sort(ans);
        
        for(int i=0; i<n; i++){
            arr1[i]=ans[i];
        }
        
        for(int j=0; j<m; j++){
            arr2[j]=ans[n+j];
        }*/
    }
	
	public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the Size of Array`: ");
        int n1 = sc.nextInt();

        System.out.println("Enter the Elements in Array`: ");
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
        
        merge(arr1, n1, arr2, n2);
        
        sc.close();
    }

}
