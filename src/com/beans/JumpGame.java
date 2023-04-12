package com.beans;

public class JumpGame {
	public static void main(String[] args) {
		
		int[] nums = {3,3,1,0,4};
		
		System.out.println(solution(nums));
	}

	 static boolean solution(int[] nums) {
		 int n = nums.length-1;
		 int lastpos = n;
		 for(int i=n-1;i>=0;i--) {
			 if(i+nums[i]>=lastpos) {
				 lastpos=i;
			 }
		 }
		return lastpos==0;
	}

}
