package com.beans;

import java.util.ArrayList;
import java.util.List;

public class SpiralMatrixMethod {
	public static void main(String[] args) {
		int[][] matrix = {{1,2,3,4},
		                  {5,6,7,8},
		                  {9,10,11,12}
		                 };
		int row=matrix.length;
		int col=matrix[0].length;
		
	List<Integer> arr =	spiral(matrix,row,col);
		System.out.println(arr);
	}

	static List<Integer> spiral(int[][] matrix	, int row, int col) {
		List<Integer>ans=new ArrayList<>();
		int leftcol=0;
		int toprow=0;
		int rightcol=col-1	;
		int bottomrow=row-1;
		
		while(ans.size()<row*col) {
			for(int j=leftcol;j<=rightcol && ans.size()<row*col;j++) {
				ans.add(matrix[toprow][j]);
			}
			toprow++;
			
			for(int i=toprow;i<=bottomrow && ans.size()<row*col;i++) {
				ans.add(matrix[i][rightcol]);
			}
			rightcol--;
			for(int j=rightcol;j>=leftcol && ans.size()<row*col;j--) {
				ans.add(matrix[bottomrow][j]);
			}
			bottomrow--;
			for(int i=bottomrow;i>=toprow && ans.size()<row*col;i--){
				ans.add(matrix[i][leftcol]);
			}
			leftcol++;
		}
		return ans;
	}

}
