package com.interview;

class Singleton{
	
	private static Singleton instance;

	private Singleton() {
	}
	
	public static Singleton getInstance() {
		if(instance==null) {
			instance=new Singleton();
		}
		return instance;
	}
	
	
}
public class SingletonClass {
	public static void main(String[] args) {
		Singleton obj1=Singleton.getInstance();
		Singleton obj2=Singleton.getInstance();
		
		if (obj1 == obj2) {
			System.out.println("Both obj1 and obj2 are the same instance");
		} else {
	        System.out.println("obj1 and obj2 are different instances");
		}
	}
}
