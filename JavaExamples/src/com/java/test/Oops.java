package com.java.test;

public class Oops{
	public Oops(){
		super();
	}
public static void main(String args[]) throws Exception{
	Oops o = new Oops();
A2 a = new B();
System.out.println(a.run());
}
}

class A2{
public int run() throws Exception{
	return 0;


}


}

class B extends A2{
public int run() {
	return 1;


}



}
