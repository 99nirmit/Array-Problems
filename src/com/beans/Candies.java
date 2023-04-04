package com.beans;

import java.util.ArrayList;

public class Candies {
	public static void main(String[] args) {
		
		int[] candies = {2,3,5,1,3};
		int extraCandies = 3;
		ArrayList<Boolean> ans = new ArrayList<>();
		for(int i=0;i<candies.length;i++) {
			boolean test = false;
			for(int j=0;j<candies.length;j++) {				
				if(candies[i] + extraCandies < candies[j]) {					
					test = true;
					break;
				}
			}
			if(test) {
				ans.add(false);
			}else {
				ans.add(true);
			}
		}
		System.out.println(ans);
	}

}
