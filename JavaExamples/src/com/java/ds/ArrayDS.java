package com.java.ds;

import java.util.ArrayList;

//Java program to rotate an array by
//d elements

class ArrayDS {
	int i = 100/0;
	ArrayDS(){
		System.out.println("Constrtor called");
	}
 // Driver program to test above functions
	public static void main(String[] args)
 {
 	ArrayDS rotate = new ArrayDS();
     int arr[] = { 1, 2, 3, 4, 5, 6 };
     rotate.leftRotate(arr);
     rotate.printArray(arr);
     ArrayDS();
     final ArrayList a= new ArrayList(3);
     for(int i = 0 ; i<100;i++){
         a.add(1);
     }
     a.add(1);
     a.add(1);
     a.add(1);
     a.add(1);
     a.add(1, 2);
     System.out.println(a);
 }
	

public static void ArrayDS() {
	// TODO Auto-generated method stub
	System.out.println("Method called");
}
void leftRotate(int arr[])
 {
     int  temp;
     for (int i = 0; i <= (arr.length-1)/2 ; i++){
         temp = arr[i];
         arr[i] = arr[(arr.length-1) - i];
         arr[(arr.length-1)-i] = temp;
     }
 }

 /* utility function to print an array */
 void printArray(int arr[])
 {
     for (int i = 0; i < arr.length; i++)
         System.out.print(arr[i] + " ");
 }

}