package com.beans;

import java.util.ArrayList;
import java.util.Arrays;

public class NumberLesserThan {
	public static void main(String[] args) {
		int[] arr = {8,1,2,2,3};
		int[] ans=new int[arr.length];
		for(int i =0;i<arr.length;i++) {
			int count =0;
			for(int j=0;j<arr.length;j++) {
				if(arr[j]<arr[i] && j != i) {
					count++;
				}
			}
			ans[i]=count;
		}
		System.out.println(Arrays.toString(ans));
	}

}
