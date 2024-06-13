/*
	Input : n = 8
	arr[] = {1, -1, 3, 2, -7, -5, 11, 6 }
	Output : 1  3  2  11  6  -1  -7  -5
*/

package com.array;

import java.util.ArrayList;
import java.util.Scanner;

public class MoveAllNegativeElementsToEnd {
	
	public static void moveAllNegativeElementsToEnd(int[] arr) {
		ArrayList<Integer>list=new ArrayList<>();
		
		for(int i=0; i<arr.length; i++) {
			if(arr[i]>=0) {
				list.add(arr[i]);
			}
		}
		
		for(int j=0; j<arr.length; j++) {
			if(arr[j]<0) {
				list.add(arr[j]);
			}
		}
		
		for(int k=0; k<list.size(); k++) {
			arr[k]=list.get(k);
		}
		
		for(int l=0; l<arr.length; l++) {
			System.out.print(arr[l]+" ");
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
        
        moveAllNegativeElementsToEnd(arr);

        sc.close();
    }
}
