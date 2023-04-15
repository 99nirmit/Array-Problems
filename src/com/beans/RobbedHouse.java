package com.beans;

public class RobbedHouse {
	public static void main(String[] args) {
	int[] nums = {2,7,9,3,1};
	int ans = rob(nums);
	System.out.println(ans);
	}

	 static int rob(int[] nums) {
		
		int n = nums.length;
		if(n==0) {
			return 0;
		}else if(n==1) {
			return nums[0];
		}else if(n==2){
			return Math.max(nums[0], nums[1]);
		}
		
		int[]rob = new int[n];
		rob[0]= nums[0];
		rob[1]=Math.max(nums[1], nums[0]);
		for(int i=2;i<n;i++) {
			rob[i]=Math.max(nums[i]+rob[i-2],rob[i-1]);
		}
		return rob[n-1];
	}

}
