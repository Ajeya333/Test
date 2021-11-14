package com.java.ds;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class SortUsingComparable {

	public static void main(String args[])
	{
		ArrayList<Student> arraylist
		= new ArrayList<Student>();
		arraylist.add(new Student(12, "Riya", 15));
		arraylist.add(new Student(14, "Mahima", 16));
		arraylist.add(new Student(13, "Shubhi", 15));

		Collections.sort(arraylist);

		for (Student str : arraylist) {
			System.out.println(str);
		}
	}
}

 class Student implements Comparable<Student> {
	private String studentname;
	private int rollno;
	private int studentage;

	public Student(int rollno, String studentname,
			int studentage)
	{
		this.rollno = rollno;
		this.studentname = studentname;
		this.studentage = studentage;
	}


	// getter and setter functions

	

	public int getRollno() { return rollno; }

	public void setRollno(int rollno)
	{
		this.rollno = rollno;
	}

	public int getStudentage() { return studentage; }

	public void setStudentage(int studentage)
	{
		this.studentage = studentage;
	}


	// overriding the compareTo method of Comparable class
	@Override public int compareTo(Student comparestu)
	{
		int compareage
		= ((Student)comparestu).getStudentage();

		//  For Ascending order
		return this.studentage - compareage;

		// For Descending order do like this
		// return compareage-this.studentage;
	}

	@Override public String toString()
	{
		return "[ rollno=" + rollno + ", name="
				+ studentname + ", age=" + studentage + "]";
	}
}
