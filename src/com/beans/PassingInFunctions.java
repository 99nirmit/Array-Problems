package com.beans;

import java.util.Arrays;
import java.util.Scanner;

public class PassingInFunctions {
	public static void main(String[] args) {
		   
	int[] nums = {2,34,1,23};
	System.out.println(Arrays.toString(nums));
	change(nums);
	System.out.println(Arrays.toString(nums   ));
	}
	
	static void change(int[] arr) {
		arr[0] = 99;
	}

}
