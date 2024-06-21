package com.interview;

class Multithreading extends Thread{
	
	public void run() {
		for(int i=1; i<=10; i++) {
			System.out.print(i+" ");
		}
	}
}

public class ThreadClass {
	public static void main(String[] args) {
		Multithreading obj=new Multithreading();
		obj.start();
	}
}
