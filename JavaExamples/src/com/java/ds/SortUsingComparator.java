package com.java.ds;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.stream.Collectors;

public class SortUsingComparator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Integer> al = new ArrayList<>();
		al.add(1);
		al.add(2);
		al.add(3);
		al.add(4);
		al.add(5);
		System.out.println(al);
		Comparator<Integer> c = (Integer o1,Integer o2) -> o2-o1;
		Collections.sort(al,c);
		//Collections.sort(al,new sortComparator());
		System.out.println(al);
	}

}

class sortComparator implements Comparator<Integer>{

	@Override
	public int compare(Integer o1, Integer o2) {
		// TODO Auto-generated method stub
		return o1-o2;
	}
	
}
