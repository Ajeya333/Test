package com.java.ds;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class Queue {
	static final int MAX = 100;
	int[] stack = new int[MAX];
	static int head ;
	static int tail ;
	static Queue st = new Queue();
	Queue(){
		head = -1;
		tail =-1;
	}

	private void add(int x){
		if(head >= MAX -1 )
			System.out.println("Queue is full");
		else{
			stack[++head] = x;
			System.out.println("Element added is : " +x +" top index is " +head);
		}
	}

	private void poll(){
		if(st.isEmpty())
			System.out.println("Queue is empty");
		else
			System.out.println("Polled element is : "+stack[++tail]);
	}

	private void peek(){
		if(st.isEmpty())
			System.out.println("Queue is empty");
		else
			System.out.println("Peek element is : "+stack[head]);
	}

	private boolean isEmpty(){
		return (head==tail);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int option = 0;
		int numToPush = 0;
		while(true){

			System.out.println("Enter your option : \n1 - Add \n2 - Poll \n3 - Peek \n4 - Terminate");
			Scanner scan = new Scanner(System.in);
			option = scan.nextInt();

			switch(option){
			case 1 : 
				System.out.println("Eneter the number to add : ");
				numToPush = scan.nextInt();
				st.add(numToPush);
				break;
			case 2 :
				st.poll();
				break;
			case 3 :
				st.peek();
				break;
			case 4 : System.exit(0);
			break;
			default : System.out.println("Invalid option");
			break;
			}
		}
	}

}
