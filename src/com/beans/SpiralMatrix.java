package com.beans;

import java.util.ArrayList;
import java.util.List;

public class SpiralMatrix {
	public static void main(String[] args) {
		int[][] matrix = {{1,2,3,4},
				          {4,5,6,7},
				          {7,8,9,10}
				          };
		List<Integer> ans= new ArrayList<>();
		int row=matrix.length;
		int col=matrix[0].length;
		int left=0;
		int top=0;
		int right=col-1	;
		int bottom=row-1;
		
		while(ans.size()<row*col) {
			for(int j=left;j<=right && ans.size()<row*col;j++) {
				ans.add(matrix[top][j]);
				
			}
			top++;
			
			for(int i=top;i<=bottom && ans.size()<row*col;i++) {
				ans.add(matrix[i][right]);
			}
			right--;
			
			for(int j=right;j>=left && ans.size()<row*col;j--) {
				ans.add(matrix[bottom][j]);
			}
			bottom--;
			
			for(int i=bottom;i>=top && ans.size()<row*col;i--) {
				ans.add(matrix[i][left]);
			}
			left++;
		}
		System.out.println(ans);
}
}
