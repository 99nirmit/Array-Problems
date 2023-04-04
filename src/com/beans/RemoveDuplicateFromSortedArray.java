package com.beans;

import java.util.Arrays;

public class RemoveDuplicateFromSortedArray {
	public static void main(String[] args) {
		 int[]nums = {0,0,1,1,1,2,2,3,3,4};
		 int ans = duplicate(nums);
		 System.out.println(ans);
	}

	 static int duplicate(int[] nums) {
		 int j=0;
		 for(int i=0;i<nums.length;i++) {
			 if (nums[j]!=nums[i]) {
				 nums[++j]=nums[i];
			 }
		 }	
//		 System.out.println(Arrays.toString(nums));
		return j+1;
	}

}
