package com.beans;

import java.util.ArrayList;

public class LuckyNo {
	public static void main(String[] args) {
		int[][] matrix = {{3,7,8},{9,11,13},{15,16,17}};
		ArrayList<Integer> ans = solution(matrix);
		System.out.println(ans);
	}

	 static ArrayList<Integer> solution(int[][] matrix) {
		 ArrayList<Integer> arr = new ArrayList<>();
		 int minIdx = 0;
		 int min=999999999;
		 for(int i=0;i<matrix.length;i++) {
			 for(int j=0;j<matrix[i].length;j++) {
				 if(matrix[i][j]<min) {
					 min = matrix[i][j];
					 minIdx = j;	 
				 }
			 }
		 
		 boolean isTrue = true;
		 for(int k=0;k<matrix.length;k++) {
			 if(matrix[i][minIdx] < matrix[k][minIdx]) {
				 isTrue = false;
				 break;
			 }
		 }
		 if(isTrue) {
			 arr.add(matrix[i][minIdx]);
		 }
		 }
		return arr;
	}

}
