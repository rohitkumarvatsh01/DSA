package com.array;

import java.util.ArrayList;
import java.util.Scanner;

public class FactorialsLargeNumbers {
	
	public static ArrayList<Integer> factorial(int n) {
		ArrayList<Integer>list=new ArrayList<>();
		
		int fact=1;
		
		for(int i=1; i<=n; i++) {
			fact=fact*i;
		}
		
		list.add(fact);
		return list;
	}
	
	public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the Number: ");
        int n = sc.nextInt();
        
        System.out.println(factorial(n));
        
        sc.close();
    }
}
