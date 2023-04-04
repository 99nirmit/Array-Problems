package com.beans;

import java.util.Arrays;
import java.util.Scanner;

public class Array2D {
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		int[][]arr = new int [3][3];
		System.out.println(arr.length);
		
//		For Simple 2D Array
//		input
//		for(int row = 0;row<arr.length;row++) {
//			for(int col = 0;col<arr[row].length;col++) {
//				arr[row][col] = input.nextInt();
//			}
//		}
////		output
//		for(int row = 0;row<arr.length;row++) {
//			for(int col = 0;col<arr.length;col++) {
//				System.out.print(arr[row][col] + " ");
//			}
//			System.out.println();
//		}
		
//		Using Arrays.toString  2D Array
//		input
//		for(int row = 0;row<arr.length;row++) {
//			for(int col = 0;col<arr[row].length;col++) {
//				arr[row][col] = input.nextInt();
//			}
//		}
		
//		output
//		for(int row=0;row<arr.length;row++) {
//			System.out.println(Arrays.toString(arr[row]));
//		}
		
//		Using ForEach to print 2D Array
		for(int row = 0;row<arr.length;row++) {
			for(int col = 0;col<arr[row].length;col++) {
				arr[row][col] = input.nextInt();
			}
		}
		
		for(int[] a : arr) {
			System.out.println(Arrays.toString(a));
		}
	}
}
