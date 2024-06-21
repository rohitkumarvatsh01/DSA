package com.interview;

class Multithreadings implements Runnable{

	@Override
	public void run() {
		for(int i=1; i<10; i++) {
			System.out.print(i+" ");
		}
	}
	
}
public class RunnableInterface {
	public static void main(String[] args) {
		Thread obj=new Thread(new Multithreadings());
		
		obj.start();
		
	}
}
