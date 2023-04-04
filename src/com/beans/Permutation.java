package com.beans;

import java.util.Arrays;

public class Permutation {
	public static void main(String[] args) {
		int[] arr = {0,2,1,5,3,4};
		int[] result = permutate(arr); 
		System.out.println(Arrays.toString(result));
	}

	static int[] permutate(int arr[]) {
		int[]result = new int[arr.length];
		for(int i =0;i<arr.length;i++) {
			result[i]= arr[arr[i]];
		}
		return result;
	}
	

}
