package com.beans;

import java.util.Arrays;

public class TwoSum {
	public static void main(String[] args) {
		int[]nums = {2,7,11,15}; 
		int target = 26;
		
		int [] sol = checkSum(nums,target);
		System.out.println(Arrays.toString(sol));
	}

	 static int[] checkSum(int[] nums, int target) {
		 int[] ans= new int[2];
		 for(int i=0;i<nums.length;i++) {
			 for(int j=i+1;j<nums.length;j++) {
				 if(nums[i]+nums[j]==target && i!=j) {
					 ans[0]=i;
					 ans[1]=j;
					  
				 }
			 }
		 }
		return ans;
	}

}
