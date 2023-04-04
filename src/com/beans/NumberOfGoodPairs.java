package com.beans;

public class NumberOfGoodPairs {
	public static void main(String[] args) {
		int[] arr = {1,2,3,1,1,3};
		int ans=0;
		for(int i=0;i<arr.length;i++) {
			for(int j=i+1;j<arr.length;j++) {
				if(arr[i]==arr[j]) {
					ans++;
				}
			}
		}
		System.out.println(ans);
	}

}
