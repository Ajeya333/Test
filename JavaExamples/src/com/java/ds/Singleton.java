package com.java.ds;

public class Singleton {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Abc o1 = Abc.getInstace();
		Abc o2 = Abc.getInstace();
	}



	
}

class Abc{
	static Abc obj = new Abc();
	private Abc(){};
	public static Abc getInstace(){
		return obj;
	}
}
