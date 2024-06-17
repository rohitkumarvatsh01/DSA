/*
 	Input: n = 5
	arr = {4,2,-3,1,6}
	Output: Yes
	Explanation: 2, -3, 1 is the subarray with sum 0.
 */
package com.array;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class SubarrayWith0sum {
	
	public static boolean subarraySumZero(int[] arr) {
		
		Set<Integer>set=new HashSet<>();
		
		int sum=0;
		
		for(int i=0; i<arr.length; i++) {
			sum+=arr[i];
			
			if(sum==0 || set.contains(sum)) {
				return true;
			}
			
			set.add(sum);
		}
		
		return false;
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
        
        System.out.println(subarraySumZero(arr));
        
        sc.close();
    }
}
