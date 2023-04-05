package com.beans;

import java.util.Arrays;
import java.util.List;

public class SpiralMatrix2 {
	public static void main(String[] args) {
		int n = 3;
		int[][] ans = spiral(n);
		System.out.println(Arrays.deepToString(ans));
	}

	 static int[][] spiral(int n) {
		 int num=1;
		 int[][] matrix = new int[n][n];
		 int row = n-1;
		 int col = n-1;
		 int top = 0;
		 int left = 0;
		 int right = row;
		 int bottom = col;
		 
		 while(left<=right && top<=bottom) {
			 for(int j=left;j<=right;j++) {
				 matrix[top][j] = num;
				 num++;
			 }
			 top++;
			 
			 for(int i=top;i<=bottom;i++) {
				 matrix[i][right] = num;
				 num++;
			 }
			 right--;
			 
			 for(int j=right;j>=left;j--) {
				 matrix[bottom][j] = num;
				 num++;
			 }
			 bottom--;
			 for(int i=bottom;i>=top;i--) {
				 matrix[i][left]=num;
				 num++;
			 }
			 left++;
		 }
		return matrix;
	}

}
