package com.interview;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

class Task implements Runnable{
	
	private String name;
	
	Task(String str){
		this.name=name;
	}
	
	@Override
	public void run() {
		for(int i=1; i<=10; i++) {
			System.out.println("Thread Start: "+i);
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			System.out.println("Thread End: "+i);
		}
	}
	
}
public class ThreadPool {
	public static void main(String[] args) {
		ExecutorService executorService=Executors.newFixedThreadPool(10);
		
		for(int i=1; i<=10; i++) {
			Runnable task=new Task("My Thread: "+i);
			executorService.submit(task);
		}
	}
}
