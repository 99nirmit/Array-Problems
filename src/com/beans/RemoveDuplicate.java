package com.beans;

public class RemoveDuplicate {
	public static void main(String[] args) {
		int[] nums= {1,1,2};
		int ans = duplicate(nums);
		System.out.println(ans);
	}

	 static int duplicate(int[] nums) {
		 int count=nums.length;;
		 for(int i=0;i<nums.length;i++) {
			 for(int j=i+1;j<nums.length;j++) {
				 if(nums[i]==nums[j]) {
					 count--;
					 break;
				 }
			 }
		 }
		return count;
	}

}
