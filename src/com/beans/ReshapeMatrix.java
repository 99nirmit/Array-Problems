package com.beans;

import java.util.Arrays;

public class ReshapeMatrix {
	public static void main(String[] args) {
		 int[][] original = {{1,2},{3,4}};
		 int r = 2;
		 int c = 2;
		
		 int[][] ans = reshape(original,r,c);
		 System.out.println(Arrays.deepToString(ans));
	}

	 static int[][] reshape(int[][] original, int r, int c) {
		 int rows=original.length;
		 int cols =original[0].length;
		 if(rows*cols!=r*c) {
			 return original;
		 } 
		 int[][] newArr = new int[r][c];
		 for(int i=0;i<r*c;i++) {
			 newArr[i/c][i%c]=original[i/rows][i%cols];
			
				 }
		return newArr;
	}

}
