/*
  Input: 5 3
		1 2 3 4 5
		1 2 3
   Output: 
	5
Explanation: 
1, 2, 3, 4 and 5 are the
elements which comes in the union set
of both arrays. So count is 5.
package com.array;
*/
package com.array;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class UnionTwoArrays {
	
	public static int doUnion(int a[], int n, int b[], int m) 
    {
        Set<Integer> set = new HashSet<>();
		
		for (int i = 0; i < n; i++) {
			set.add(a[i]);
		}
		
		for (int j = 0; j < m; j++) {
			set.add(b[j]);
		}
		
		return set.size();
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
       
        System.out.println(doUnion(arr1, n1, arr2, n2));

        sc.close();
    }

}
