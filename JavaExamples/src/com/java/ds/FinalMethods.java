package com.java.ds;

import java.util.concurrent.ConcurrentHashMap;

interface a {

	int b = 2;
	int add(int a, int b);
	public static void asc(){

	}
}

class IntegralOperations implements a{

	 // Java Program to demonstrate result of overriding a final
	// method
	// add declared as final
	public static void asc(){
		ConcurrentHashMap<Integer, String> cHMap = new ConcurrentHashMap<>();
	}
	public int add(int a, int b) { return a + b; }

	// subtract declared as final
	int subtract(int a, int b) { return a - b; }
}

class child extends IntegralOperations {

	// try to override add
	public final int add(int a, int b) { return a - b; }

	// try to override subtract
	final int subtract(int a, int b) { return a * b; }
}

public class FinalMethods {
	public static void main(String[] args)
	{
		child c1 = new child();
		System.out.println(c1.add(1, 4));
	}

}
