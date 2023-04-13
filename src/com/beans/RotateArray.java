package com.beans;

import java.sql.Array;
import java.util.Arrays;

public class RotateArray {
	public static void main(String[] args) {
		
	int[] nums = {1,2,3,4,5,6,7};
	int k = 3;
	
	solution(nums,k);
//	System.out.println(Arrays.toString(nums));
	
	}

	 static void solution(int[] nums, int k) {
		   int[] temp = new int[nums.length];
	        
	        for (int i = 0; i < nums.length; i++) {
	            temp[(i + k) % nums.length] = nums[i];
	        }
	       nums=temp;
	       System.out.println(Arrays.toString(nums));
//	        System.arraycopy(temp, 0, nums, 0, nums.length);
		 
		
// Brute Force Approach
		 
//		 int[] ans = new int[n];
//		 k=k%n;
//		 for(int i=n-k;i<n;i++) {
//			 ans[i-(n-k)]=nums[i];
//		 }
//		 
//		 for(int j=k;j<n;j++) {
//			 ans[j]=nums[j-k];
//		 }
//		for(int i=0;i<n;i++) {
//			nums[i]=ans[i];
//		}
	}

}
