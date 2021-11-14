package com.java.ds;

import java.util.AbstractSequentialList;
import java.util.ArrayList;
import java.util.List;

public class Immutable {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		final ArrayList<Integer> list = new ArrayList<Integer>(5);

		System.out.println(list.size());
		list.add(1);
		list.add(2);
		list.add(3);
		list.add(4);
		list.add(5);
		System.out.println(list.size());
		list.add(6);
		list.add(7);

		System.out.println(list.size());
		list.add(8);
		list.add(9);
		list.add(10);
		list.add(11);
		System.out.println(list);
	}

}
