package com.java.ds;

public class BalancePran {

	public static void main(String[] args) {
		/*// TODO Auto-generated method stub
		//Question: Balanced Parantheses 
		//E.g.(())) -> Unbalanced
		//	(())()(())-> Balanced
		int count = 0;
		String s = "())()(())";
		for(int i=0;i<s.length();i++){
			if(s.charAt(i) == '('){
				count++;
			}
			if(s.charAt(i) == ')'){
				count--;
			}
			if(count<0){
				break;
			}
		}
		if(count!=0){
			System.out.println("Unbalanced");
		}
		else{
			System.out.println("Balanced");
		}*/
		
		//Question: You have given a sorted array and then it was rotated clockwise. 
		//You have to find the starting point of original array.
		//E.g.
		//11,18,19,1,6,8,10
		
		
		int array[] = {19,1,6,8,10,11,18};
		System.out.println(findStartPoint(array,0,array.length-1));
	}

	private static int findStartPoint(int[] array, int low, int high) {
		// TODO Auto-generated method stub
		if(high<low){
			return 0;
		}
		if(high==low){
			return low;
		}
		int mid = (high+low)/2;
		if(mid>low && array[mid] < array[mid-1]){
			return mid;
		}
		if(mid<high && array[mid+1] < array[mid]){
			return mid+1;
		}
		if(array[high]>array[mid]){
			return findStartPoint(array, low, mid-1);
		}
		return findStartPoint(array, mid+1, high);
	}

}
