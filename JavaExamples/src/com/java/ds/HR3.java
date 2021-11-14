package com.java.ds;

import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.function.*;
import java.util.regex.*;
import java.util.stream.*;
import static java.util.stream.Collectors.joining;
import static java.util.stream.Collectors.toList;

class Solution {

    /*
     * Complete the 'repeatedString' function below.
     *
     * The function is expected to return a LONG_INTEGER.
     * The function accepts following parameters:
     *  1. STRING s
     *  2. LONG_INTEGER n
     */

    public static long repeatedString(String s, long n) {
        // Write your code here
       /* char[] sArr = s.toCharArray();
        int count = 0,charCount=0,i=0;
        while( i<sArr.length && count<n){
            ++count;
            if(sArr[i]=='a'){
                ++charCount;
            }
            if(i==sArr.length-1){
                i=0;
            }
            else{
            	++i;
            }
        }
        return charCount;*/
    	long size = s.length(), noOfRepeatation = n/size;
        long left = n - (size * noOfRepeatation);
        int extra = 0;

        int count = 0;
        for(int i = 0; i < size; i++){
            if(s.charAt(i) == 'a'){
                ++count;
            }
        }

        for(int i = 0; i < left; i++){
            if(s.charAt(i) == 'a'){
                ++extra;
            }
        }

        noOfRepeatation = (noOfRepeatation * count) + extra;

        return noOfRepeatation;
    }

}

public class HR3 {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter("D:\\Ajeya\\socksMerchant.txt"));
        String s = bufferedReader.readLine();

        long n = Long.parseLong(bufferedReader.readLine().trim());

        long result = Solution.repeatedString(s, n);

        bufferedWriter.write(String.valueOf(result));
        bufferedWriter.newLine();

        bufferedReader.close();
        bufferedWriter.close();
    }
}
