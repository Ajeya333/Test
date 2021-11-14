package com.java.ds;


public class BinarySearch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BinarySearch bSeach = new BinarySearch();
		int size_of_arr = 9;
		int[] arr = {1,2,3,4,5,6,7,8,9};
		int searchKey = 6;
		int searchKeyIndex = bSeach.binarySearch(arr, 0, size_of_arr-1,searchKey);
		if(searchKeyIndex>-1){
			System.out.println("SearchKey Found At Index : " +searchKeyIndex);
		}else{
			System.out.println("SearchKey Not Found");
		}
	}
	
	private int binarySearch(int[] arr, int low, int high,int searchKey){
		BinarySearch bSeach = new BinarySearch();
		int i = -1;
		if(low<=high){
			int midIndex = bSeach.findMidIndex(low,high);
			if(searchKey == arr[midIndex]){
				return midIndex;
			}
			else if(searchKey > arr[midIndex]){
				i = binarySearch(arr, midIndex+1, high,searchKey);
			}
			else{
				i = binarySearch(arr, 0, midIndex-1,searchKey);
			}
		}
		return i;
	}

	private int findMidIndex(int low, int high) {
		// TODO Auto-generated method stub
		return((low+high)/2);
	}

}
