 package com.beans;

import java.util.Arrays;

public class productofArrayExceptSelf {
	
	public static void main(String[] args) {
		
		int[] nums = {1,0,3,4};
		System.out.println(Arrays.toString(solution(nums)));
		
	}

	 static int[] solution(int[] nums) {
		int n=nums.length;
		int [] ans = new int [n];	
		
//		This is Optimize Appoarch
		
	    int leftProduct = 1;
	    for (int i = 0; i < n; i++) {
	        ans[i] = leftProduct;
	        leftProduct *= nums[i];
	    }
	   
	    int rightProduct = 1;
	    for (int i = n - 1; i >= 0; i--) {
	        ans[i] *= rightProduct;
 	        rightProduct *= nums[i];
	    } 
	     return ans;
	}
	 
//	 This is Brute Force Appoarch
	 
//		for(int i=0;i<n;i++) {
//			int temp=1;
//			for(int j=0;j<n;j++) {
//				if(i==j) {
//					continue;
//				}
//				temp *= nums[j];
//			}
//			ans[i]=temp;
//		}
//		return ans;
//	}

}
 