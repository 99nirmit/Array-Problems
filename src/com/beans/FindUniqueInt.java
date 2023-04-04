package com.beans;

import java.util.Arrays;

public class FindUniqueInt {
	public static void main(String[] args) {
		int n = 4;
		
		int[] sol = findunique(n);
		System.out.println(Arrays.toString(sol));
	}

	 static int[] findunique(int n) {
		 int[] ans = new int[n];
		 if(n%2==0) {
			 for(int i=0;i<n;i=i+2) {
				 ans[i]=i+1;
				 ans[i+1]=-(i+1);
			 }
		 }else {
			 for(int j=0;j<n-1;j=j+2) {
				 ans[j]=j+1;
				 ans[j+1]=-(j+1);
			 }
			 ans[n-1]=0;
		 }
		return ans;
	}

}
