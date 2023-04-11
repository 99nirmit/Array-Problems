package com.beans;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class FindPostion {
	
	public static void main(String[] args) {
		int [] nums = {5,7,7,10};
		int target = 8;
		System.out.println(Arrays.toString(solution(nums,target)));
		 
	}

	 static int[] solution(int[] nums, int target) {
		 
		int[]pos= {-1,-1};
		
		 for(int i=0;i<nums.length;i++) {
			 if(nums[i]==target) {
				 pos[0]=i;
				 break;
			 }
		 }
		 for(int i=nums.length-1;i>=0;i--) {
			 if(nums[i]==target) {
				 pos[1]=i;
				 break;
			 }
		 }
		return pos;
	}

}
