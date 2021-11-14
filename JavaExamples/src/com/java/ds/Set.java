package com.java.ds;

import java.util.*;

public class Set {
	public static void main(String[] args)
	{
		TreeSet<String> ts = new TreeSet<String>();
		ArrayList<String> as = new ArrayList(Arrays.asList("India",
                "Australia",
                "South Africa"));
		
		
		
		// Adding elements into the TreeSet
		// using add()
		ts.add("India");
		ts.add("Australia");
		ts.add("South Africa");

		// Adding the duplicate
		// element
		ts.add("India");
		
		HashMap<String,String> hs = new HashMap<String,String>();
		hs.put("1", "India");
		hs.put("2", "Australia");
		hs.put("3", "South Africa");
		// Displaying the TreeSet
		System.out.println(ts);
		System.out.println(as);
		System.out.println("ts contains as : " +ts.containsAll(as));
		//below line throws compilation error
		//System.out.println("ts contains hs : " +ts.containsAll(hs));
		// Removing items from TreeSet
		// using remove()
		ts.remove("Australia");
		System.out.println("Set after removing "
				+ "Australia:" + ts);

		// Iterating over Tree set items
		System.out.println("Iterating over set:");
		Iterator<String> i = ts.iterator();
		while (i.hasNext())
			System.out.println(i.next());
	}
}

