package com.beans;

public class findNumWithEven {
	public static void main(String[] args) {
		int[] nums = {12,345,2,6,7896};
		int ans = findNum(nums);
		System.out.println(ans);
	}

	static int findNum(int[] nums) {
		int sum=0;
		for(int i=0;i<nums.length;i++) {
			int digit=0; 
			while(nums[i] > 0) {
				nums[i] /= 10;
				digit++;
			}
			if(digit%2==0) {
			    sum++;
			}
		}
		return sum;

	}

}
