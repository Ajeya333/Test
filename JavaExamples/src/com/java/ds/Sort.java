package com.java.ds;

import java.util.Arrays;

public class Sort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = {5,4,3,2,1};
		selectionSort(arr);
		bubbleSort(arr);
		insertionSort(arr);
		mergeSort(arr);
		quickSort(arr);
	}

	private static void quickSort(int[] arr) {
		// TODO Auto-generated method stub

        System.out.println("quickSort :"+ Arrays.toString(arr));
	}

	private static void mergeSort(int[] arr) {
		// TODO Auto-generated method stub

        System.out.println("mergeSort :"+ Arrays.toString(arr));
	}

	private static void insertionSort(int[] arr) {
		// TODO Auto-generated method stub
		int temp = 0;
		int key,j;
		for (int i=1;i<arr.length;i++){
			key  = arr[i];
			for(j=i-1;j>=0 && arr[j]>key;j--){
				arr[j+1] = arr[j];
			}
			arr[j+1] = key;
		}
        System.out.println("insertionSort :"+ Arrays.toString(arr));
	}

	private static void bubbleSort(int[] arr) {
		// TODO Auto-generated method stub
		int temp;
		boolean swap = false;
		for(int i = 0; i < arr.length-1; i++){
			for(int j = 0; j < arr.length-i-1; i++){
				if(arr[j]>arr[j+1]){
					temp = arr[j];
					arr[j+1] = arr[j];
					arr[j] = temp;
					swap = true;
				}
				if(swap){
					swap = false;
				}
				else{
					break;
				}
			}
		}
        System.out.println("bubbleSort :"+ Arrays.toString(arr));
	}

	private static void selectionSort(int[] arr) {
		// TODO Auto-generated method stub
		int min_value_index = 0;
		int temp;
		for(int i=0;i<arr.length-1;i++){
			min_value_index = i;
			for(int j=i;j<arr.length;j++){
				if(arr[j]<arr[min_value_index]){
					min_value_index = j;
				}
				temp = arr[min_value_index];
				arr[min_value_index] = arr[i];
				arr[i] = temp;
			}
		}
        System.out.println("selectionSort :"+ Arrays.toString(arr));
	}

}
