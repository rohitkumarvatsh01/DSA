/*
   N = 7 A[] = {100,180,260,310,40,535,695}
   Output:1
		Explanation: One possible solution is (0 3) (4 6) We can buy stock on day 0, and sell it on 3rd day, which will 
		give us maximum profit. Now, we buy stock on day 4 and sell it on day 6.
	100,180,260,310,40,535,695
	0   1   2   3   4   5   6
	(0->100, 3->310), (4->40, 6->695)
*/

package com.array;

import java.util.ArrayList;
import java.util.Scanner;

public class StockBuyAndSell {
	
	public static ArrayList<ArrayList<Integer>> stockBuySell(int A[] ) {
		ArrayList<ArrayList<Integer>>list1=new ArrayList<>();
			int n=A.length;
	       
	       for(int i=0; i<n-1; i++){
	           ArrayList<Integer>list2=new ArrayList<>();
	           
	           if(A[i+1]>A[i]){
	               list2.add(i);
	               list2.add(i+1);
	               list1.add(list2);
	           }
	       }
	       return list1;
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
        
        ArrayList<ArrayList<Integer>> buySellDays = stockBuySell(arr);
        System.out.println("Buy and sell days: " + buySellDays);
        
        sc.close();
    }
}
