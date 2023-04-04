package com.beans;

import java.util.Arrays;

public class Transpose {
	public static void main(String[] args) {
	int[][]	matrix = {{1,2,3},{4,5,6},{7,8,9}};
//	int[][] answer = checkTranspose(matrix);
//	System.out.println(Arrays.deepToString(answer));

//	}

//	 static int[][] checkTranspose(int[][] matrix) {
		int m = matrix.length;
		int n = matrix[0].length;
		int[][] ans = new int[n][m];
		for(int i=0;i<n;i++) {
			for(int j=0;j<m;j++) {
				ans[i][j]=matrix[j][i];
			}
		}
//		return ans;
		System.out.println(Arrays.deepToString(ans));
	}

}
