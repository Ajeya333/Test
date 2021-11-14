package com.java.ds;

class Test{
	public static void main(String[] arg){
		int i = call();
		System.out.println(i);
	}
	public static int call(){
		try{
			int i = 100/0;
		}catch(Exception e){
			return 20;
		}
		finally{
			//return 30;
		}
		return 40;
	}
}
