package com.java.test;

import java.util.LinkedList;

public class CustomHashMap<K, V> {

	private int capacity = 16;

    private Entry<K, V>[] bucket; 

    public CustomHashMap(){
		bucket = new Entry[capacity];
	}
	
	public CustomHashMap(int capacity){
        this.capacity = capacity;
        bucket = new Entry[capacity];
    }
	
	
	public void put(K key, V value){
        int index = index(key);
        Entry newEntry = new Entry(key, value, null);
        if(bucket[index] == null){
        	bucket[index] = newEntry;
        }else {
            Entry<K, V> previousNode = null;
            Entry<K, V> currentNode = bucket[index];
            while(currentNode != null){
                if(currentNode.getKey().equals(key)){
                    currentNode.setValue(value);
                    break;
                }
                previousNode = currentNode;
                currentNode = currentNode.getNext();
            }
            if(previousNode != null)
                previousNode.setNext(newEntry);
            }
    }
	
	public V get(K key){
        V value = null;
        int index = index(key);
        Entry<K, V> entry = bucket[index];
        while (entry != null){
            if(entry.getKey().equals(key)) {
                value = entry.getValue();
                break;
            }
            entry = entry.getNext();
        }
        return value;
    }
	
	public void remove(K key){
        int index = index(key);
        Entry previous = null;
        Entry entry = bucket[index];
        while (entry != null){
            if(entry.getKey().equals(key)){
                if(previous == null){
                    entry = entry.getNext();
                    bucket[index] = entry;
                    return;
                }else {
                    previous.setNext(entry.getNext());
                    return;
                }
            }
            previous = entry;
            entry = entry.getNext();
        }
    }
	
	private int index(K key){
        if(key == null){
            return 0;
        }
        return Math.abs(key.hashCode() % capacity);
    }
	
	public void display(){
        for(int i = 0; i < capacity; i++){
            if(bucket[i] != null){
                Entry<K, V> currentNode = bucket[i];
                while (currentNode != null){
                    System.out.println(String.format("Key is %s and value is %s", currentNode.getKey(), currentNode.getValue()));
                    currentNode = currentNode.getNext();
                }
            }
        }
    }

}
