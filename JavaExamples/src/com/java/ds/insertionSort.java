package com.java.ds;

import java.util.Arrays;

public class insertionSort {
	public static void main(String[] args)  {
        int arr[] = { 12, 11, 13, 5, 6 };
        int len = arr.length, j;
        for(int i=1; i<len; i++) {
            int key = arr[i];
            for (j=i-1; (j >= 0 && arr[j] > key); j--) { 
                arr[j + 1] = arr[j];  
            } 
            arr[j + 1] = key;
            System.out.println(Arrays.toString(arr));
        }
    }
}
