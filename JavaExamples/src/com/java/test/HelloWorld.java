package com.java.test;

public class HelloWorld {
	
	public static void main(String[] args){

		
		/*int index=5;
		int[] arr = new int[]{1,2,3,4,5,6,7,8,9,0};
		int[] s1 = new int[index];
		int[] s2 = new int[arr.length-index];
		for(int i=0;i<index;i++){
			s1[i]= arr[i];
		}
		
		for(int j=index;j<arr.length-1;j++){
			s2[j-index]= arr[j];
		}
		System.out.println(s1);
		System.out.println(s2);*/
		
		String s = "    I  have too many files to compile ";
		String sArr[] = s.split("\\s+");
		StringBuilder result = new StringBuilder();
		int strLength = s.length();
		for(int i=sArr.length-1; i>=0; i--){
				while(strLength >0 && s.charAt(strLength-1) == ' '){
					result.append(" ");
					strLength--;
				}
				result.append(sArr[i]);
				strLength = strLength-sArr[i].length();
		}
		while(strLength >0 && s.charAt(strLength-1) == ' '){
			result.append(" ");
			strLength--;
		}
		System.out.println(result);
		System.out.println("origiinal length : "+s.length());
		System.out.println("result length : "+result.length());
	}
	
}

