package com.java.ds;

public class PrintNumberUsingThreads extends Thread{
	
	static volatile int counter = 1;
	int threadNum;
	public final static Object obj = new Object();
	
	PrintNumberUsingThreads(int threadNum){
		this.threadNum = threadNum;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
			int numOfThreads = 10;
			
			for (int index = 1; index <=numOfThreads; index++){
				PrintNumberUsingThreads th = new PrintNumberUsingThreads(index);
				th.start();
			}
	}
	
	public void run(){
		synchronized(obj){
			while (counter<=100){
				System.out.println(this.threadNum + " priniting " + counter++);
				
				obj.notifyAll();
				try {
					obj.wait();
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		}
	}
	 
}
