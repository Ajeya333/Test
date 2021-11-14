package com.java.ds;
// Java program to implement the 
// toList() method 
import java.util.ArrayList; 
import java.util.List; 
import java.util.stream.Collectors; 

public class StreamFilter {
	    
	    public static void main(String[] args) 
	    { 
	    
	        // The following statement filters 
	        // cities having temp > 10 
	        // The map function transforms only 
	        // the names of the cities 
	        // The collect function collects the 
	        // output as a List 
	    	
	        List<String> list = prepareTemperature().stream()
	                 .filter(f -> f.getTemperature() > 10)
	                 .map(f -> f.getName())
	                 .collect(Collectors.toList()); 
	                 System.out.println(list);
	    } 
	    
	    private static List<City> prepareTemperature()
	    {
	    	StreamFilter StreamFilter = new StreamFilter();
	        List<City> cities = new ArrayList<>();
	        cities.add(StreamFilter.new City("New Delhi", 33));
	        cities.add(StreamFilter.new City("Mexico", 14));
	        cities.add(StreamFilter.new City("New York", 13));
	        cities.add(StreamFilter.new City("Dubai", 43));
	        cities.add(StreamFilter.new City("London", 15));
	        cities.add(StreamFilter.new City("Alaska", 1));
	        cities.add(StreamFilter.new City("Kolkata", 30));
	        cities.add(StreamFilter.new City("Sydney", 11));
	        cities.add(StreamFilter.new City("Mexico", 14));
	        cities.add(StreamFilter.new City("Dubai", 43));
	        return cities;
	    }
	    
	    class City {
	    	  
	        // Initializing the properties
	        // of the city class
	        private String name;
	        private double temperature;
	      
	        // Parameterized constructor to
	        // initialize the city class
	        public City(String name, double temperature)
	        {
	            this.name = name;
	            this.temperature = temperature;
	        }
	      
	        // Getters to get the name and
	        // temperature
	        public String getName()
	        {
	            return name;
	        }
	      
	        public Double getTemperature()
	        {
	            return temperature;
	        }
	      
	        // Overriding the toString method
	        // to return the name and temperature
	        @Override
	        public String toString()
	        {
	            return name + " --> " + temperature;
	        }
	    }
	} 