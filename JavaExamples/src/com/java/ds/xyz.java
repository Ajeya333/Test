package com.java.ds;

public class xyz {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		decodeString(3,"mnes__ya_____mi");
		//decodeString(2,"hlowrd_el_ol");
	}
	
	public static void decodeString(int numberOfRows, String encodedString) {
        String vDecodedString = "";
        char[][] vMatrixOfEncodedString = new char[numberOfRows][(encodedString.length()/numberOfRows)]; 
        int vColIndex = 0;
        int vRowIndex=0;
        for(int index=0; index<encodedString.length(); index++){
            vMatrixOfEncodedString[vRowIndex][vColIndex] = encodedString.charAt(index);
            if(vColIndex<(encodedString.length()/numberOfRows)-1){
                vColIndex++;
            }
            else{
                vColIndex=0;
                vRowIndex++;
            }
        }
        int vInitColIndex = 0;
        vColIndex = 0;
        vRowIndex=0;
        while(vColIndex<(encodedString.length()/numberOfRows)){
               vDecodedString += vMatrixOfEncodedString[vRowIndex][vColIndex];
               if(vRowIndex<numberOfRows-1){
                   vRowIndex++;
                   vColIndex++;
               }
               else{
            	   vColIndex = ++vInitColIndex;
                   vRowIndex=0;
               }
        }
        System.out.println(vDecodedString);
    }
}

