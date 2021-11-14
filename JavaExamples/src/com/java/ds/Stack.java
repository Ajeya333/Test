package com.java.ds;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class Stack {
	static final int MAX = 100;
	int[] stack = new int[MAX];
	static int top ;
	static Stack st = new Stack();
	Stack(){
		top = -1;
	}

	private void push(int x){
		if(top >= MAX -1 )
			System.out.println("Stack is overflow");
		else{
			stack[++top] = x;
			System.out.println("Element pushed is : " +x +" top index is " +top);
		}
	}

	private void pop(){
		if(st.isEmpty())
			System.out.println("Stack is underflow");
		else
			System.out.println("Poped element is : "+stack[top--]);
	}

	private void top(){
		if(st.isEmpty())
			System.out.println("Stack is underflow");
		else
			System.out.println("Top element is : "+stack[top]);
	}

	private boolean isEmpty(){
		return (top<0);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int option = 0;
		int numToPush = 0;
		while(true){

			System.out.println("Enter your option : \n1 - Push \n2 - Pop \n3 - Top \n4 - Terminate");
			Scanner scan = new Scanner(System.in);
			option = scan.nextInt();

			switch(option){
			case 1 : 
				System.out.println("Eneter the number to push : ");
				numToPush = scan.nextInt();
				st.push(numToPush);
				break;
			case 2 :
				st.pop();
				break;
			case 3 :
				st.top();
				break;
			case 4 : System.exit(0);
			break;
			default : System.out.println("Invalid option");
			break;
			}
		}
	}

}
