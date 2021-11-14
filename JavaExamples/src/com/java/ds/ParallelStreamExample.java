package com.java.ds;

import java.util.ArrayList;

public class ParallelStreamExample {
	public static void main(String args[])
    {
  
        // create a ArrayList String type
        // and Initialize an ArrayList with add()
        ArrayList<String> gfg = new ArrayList<String>() {
            {
                add("Geeks");
                add("for");
                add("Geeks");
            }
        };
  
        // print ArrayList
        System.out.println("ArrayList : " + gfg);
    }
}
