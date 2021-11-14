package com.java.test;

class A{
	int a=10;
	A(int a){
		a=a;
	}
}

public class DI {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		A obj = new A(100);
		System.out.println(obj.a);
	}

}
