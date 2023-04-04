package com.beans;

public class RichestCustomerWealth {
	public static void main(String[] args) {
		
		int[][] arr = {{1,2,4},{3,2,1}};
	
		int maxSum =0; 
		for(int i=0;i<arr.length;i++) {
			int sum=0;
			for(int j=0;j<arr[i].length;j++) {
				sum += arr[i][j];
			}
			if(sum>maxSum) {
				maxSum=sum;
		
			}
		}
		System.out.println(maxSum);
	}

}
