package com.beans;

import java.util.Arrays;

public class FlipImage {
	public static void main(String[] args) {
		 int[][] image = {{1,0,0},{0,1,0},{1,1,1}};
		 int[][] ans = flip(image);
		 System.out.println(Arrays.deepToString(ans));
	}

	 static int[][] flip(int[][] image) {
		 int m = image.length;
		 int n = image[0].length;
		 for(int i =0;i<m;i++) {
		for(int j=0;j<(n+1)/2;j++) {
			int temp = image[i][j]^1;
			image[i][j]=image[i][n-j-1]^1;
			image[i][n-j-1]=temp;
		}
		 }
		return image;
	}
}
