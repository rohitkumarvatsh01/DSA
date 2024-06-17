/*Input: arr[] = {1,2,3,-2,5}, n = 5
Output: 9
Explanation: Max subarray sum is 9 of elements (1, 2, 3, -2, 5) which is a contiguous subarray.
*/
package com.array;

import java.util.Scanner;

public class KadanesAlgorithm {
	
		public static long maxSubarraySum(int arr[]){
        
			long[] subArray=new long[arr.length];
			long maxSum=arr[0];
			subArray[0]=arr[0];
        
			for(int i=1; i<arr.length; i++){
				subArray[i]=Math.max(arr[i], subArray[i-1]+arr[i]);
				maxSum=Math.max(maxSum, subArray[i]);
			}
        
			return maxSum;
        
			/*long maxSum=Integer.MIN_VALUE;
       		long currSum=0;
       
       		for(int i=0; i<arr.length; i++){
           		currSum+=arr[i];
           
            	maxSum=Math.max(currSum, maxSum);
            
            	if(currSum<0){
                	currSum=0;
            	}
       		}
       
       		return maxSum;*/
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
        
        System.out.print(maxSubarraySum(arr));
        
        sc.close();
    }
}
