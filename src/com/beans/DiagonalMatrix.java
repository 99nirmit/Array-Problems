package com.beans;

public class DiagonalMatrix {
	public static void main(String[] args) {
		int[][] mat = {{1,2,3},
				       {4,5,6},
				       {7,8,9},
				      };
		int ans = diagonalSum(mat);
		System.out.println(ans);
	}
	
	static int diagonalSum(int [][]mat) {
		int sum=0;
		int n = mat.length;
		System.out.println(n);
		for(int i = 0;i<n;i++) {
			sum +=(mat[i][i] + mat [i][n-i-1]);
		}
		if(n%2==0) {
			return sum;
		}else {
			return sum - mat[n/2][n/2];
		}
	}

}
