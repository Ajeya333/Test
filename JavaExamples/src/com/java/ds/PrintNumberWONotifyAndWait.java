package com.java.ds;

class PrintNumberWONotifyAndWait extends Thread{
	int name ;
	static Integer num = 1;
	public void run(){
		while(num <= 100){

			synchronized(num){

				System.out.println("Thread " + name + " printing " +num);
				num++;

			}

			try{
				Thread.sleep(100);
			}catch(InterruptedException e){}


		}
	}
	public static void main(String args[]){
		/*PrintNumberWONotifyAndWait t1 = new PrintNumberWONotifyAndWait();
		t1.name = "Thread one";
		PrintNumberWONotifyAndWait t2 = new PrintNumberWONotifyAndWait();
		t2.name = "Thread two";
		PrintNumberWONotifyAndWait t3 = new PrintNumberWONotifyAndWait();
		t3.name = "Thread three";
		t1.start();
		t2.start();
		t3.start();*/
		
		for(int i=0;i<2;i++){
			PrintNumberWONotifyAndWait t1 = new PrintNumberWONotifyAndWait();
			t1.name = i;
			t1.start();
		}
	}
}