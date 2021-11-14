package com.java.ds;

public class Example {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String word = "Ajeyaaaaaa";
		String resultString = "";
		char[] wordArr = word.toCharArray();
		for(char i : wordArr){
			if(resultString != null && resultString.indexOf(i)<0){
				resultString = resultString + i;
			}
		}
		
		String one = "ONE";
		String two = "TWO";
		String three = "THREE";
		three = one.concat("");
		System.out.println(one +" " + two );
		
		three = one + two;
		System.out.println(one +" " + two + " " +three);
		System.out.println(resultString);
	}

}
