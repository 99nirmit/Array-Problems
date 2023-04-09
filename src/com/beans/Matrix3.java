package com.beans;

import java.util.Arrays;

public class Matrix3 {
	
	public static void main(String[] args) {
	
		int row = 5;
		int col = 6;
		int[][] matrix = new int[5][6];
		int rstart=1;
		int cstart=4;
		int left=0;
		int top=1;
		int num=1;
		
		if(matrix[rstart][cstart] == 0) {
			for(int i=left;i<rstart;i++) {
				matrix[top][i]=num;
				System.out.println(Arrays.deepToString(matrix));
			}
			
		}
		
		for(int i=0;i<row;i++) {
			for(int j=0;j<col;j++) {
				if(matrix[i][j] == 1) {
					System.out.println(i+" "+j);
				}
			}
		}
		
		}
//		System.out.println(Arrays.deepToString(matrix));
	}


