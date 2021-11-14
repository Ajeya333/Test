package com.java.ds;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

public class HashMapSynchronization {
	    public static void main(String[] args) {
	        // create map
	        Map<String,String> map = new HashMap<String,String>();
	        Map hm = new HashMap ();
	        hm.put(1, "A");
	        hm.put("B", "B");
	        hm.put(true, "C");
	        
	        
	        // populate the map
	        map.put("1","ALIVE ");
	        map.put("2","IS");
	        map.put("3","AWESOME");
	        System.out.println(map.get("1"));
	        System.out.println(map.get(4));
	        // create a synchronized map
	        Map<String,String> syncMap = Collections.synchronizedMap(map);
	        System.out.println("Map :"+map);
	        System.out.println("Synchronized map :"+syncMap);
	        System.out.println("Generic Map :"+hm);
	    }
}
