package com.java.ds;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.TreeSet;

public class number1 {
	static int noOfWaysToDrawTheGame(int totalScore) {
		TreeSet a = new TreeSet();
		a.add(null);
		System.out.println(a);
		int[] possible_score = {2,4,6};
		int sum = 0;
		int count = 0;
		for(int i = 0; i < possible_score.length; i++){
			sum = possible_score[i];
			if(sum==totalScore){
				++count;
				break;
			}
			while(sum<totalScore){
				sum+= possible_score[i];
				if(sum == totalScore){
					++count;
					break;
				}
				else if(sum > totalScore){
					break;
				}
			}
			sum = possible_score[i];
			for(int j = 0; j< possible_score.length; j++){
				if(j!=i){
					sum += possible_score[j];
					if(sum == totalScore ){
						++count;
						break;
					}
					else if(sum > totalScore){
						break;
					}
				}
			}

		}
		return count;

	}

	public static void main(String[] args) throws IOException {
		//int res = noOfWaysToDrawTheGame(6);

		//System.out.println(res);

		List<List<Integer>> matrix = new ArrayList<>();

		for (int i = 0; i < 5; i++) {

			List<Integer> matrixRowItems = new ArrayList<>();

			for (int j = 0; j < 3; j++) {
				int matrixItem = j;
				matrixRowItems.add(matrixItem);
			}

			matrix.add(matrixRowItems);
		}
		System.out.println(matrix);
		System.out.println("Rows : "+matrix.size());
		System.out.println("Cols : "+matrix.get(0).size());
	}
}
