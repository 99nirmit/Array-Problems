package com.beans;

public class HighestAltitude {
	public static void main(String[] args) {
		int[] arr= {-5,1,5,0,-7};
		
		int ans = checkHeight(arr);
		System.out.println(ans);
	}

	 static int checkHeight(int[] arr) {
	int max=0;
	int current=0;
	for(int i=0;i<arr.length;i++) {
		current += arr[i];
		max=Math.max(max, current);
	}
	return max;
		
	}
	
	

}
