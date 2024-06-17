/*
 	Input:
		n1 = 6; A = {1, 5, 10, 20, 40, 80}
		n2 = 5; B = {6, 7, 20, 80, 100}
		n3 = 8; C = {3, 4, 15, 20, 30, 70, 80, 120}
	Output: 20 80
		Explanation: 20 and 80 are the only common elements in A, B and C.
 */

package com.array;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class CommonElementsThreeArray {
	
	public static List<Integer> commonElement(int[] A, int[] B, int[] C){
		List<Integer>list=new ArrayList<>();
		
		for(int i=0; i<A.length; i++){
            for(int j=0; j<B.length; j++){
                for(int k=0; k<C.length; k++){
                    if(A[i]==B[j]){
                        if(B[j]==C[k]){
                            
                            if(!list.contains(C[k])){
                            	list.add(C[k]);
                            }
                        }
                    }
                }
            }
        }
        return list;
		
        /*
        ArrayList<Integer>ans=new ArrayList<>();
        
        int i = 0, j = 0, k = 0;
        int n1=A.length;
        int n2=B.length;
        int n3=C.length;
        
        while (i < n1 && j < n2 && k < n3) {
            if (A[i] == B[j] && B[j] == C[k]) {
                if (ans.isEmpty() || ans.get(ans.size() - 1) != A[i]) {
                    ans.add(A[i]);
                }
                i++;
                j++;
                k++;
            } else if (A[i] <= B[j] && A[i] <= C[k]) {
                i++;
            } else if (B[j] <= A[i] && B[j] <= C[k]) {
                j++;
            } else {
                k++;
            }
        }
        
        return ans;
        
        */
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
        
        System.out.println("Enter the Size of Array3: ");
        int n3 = sc.nextInt();

        System.out.println("Enter the Elements in Array3: ");
        int[] arr3 = new int[n3];
        for (int i = 0; i < n3; i++) {
            arr3[i] = sc.nextInt();
        }
        
        System.out.println(commonElement(arr1, arr2, arr3));
        sc.close();
    }
}
