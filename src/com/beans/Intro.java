package com.beans;

import java.util.Arrays;
import java.util.Scanner;

public class Intro {
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		int arr[] = new int[5];
		
		arr[0]=981;
		arr[1]=1231;
		arr[2]=1311;
		arr[3]=123;
		arr[4]=11;
//		System.out.println(arr[3]);
		
//		for(int i=0;i<arr.length;i++) {
//			arr[i] = input.nextInt();
//		}
//		
//		for(int i=0;i<arr.length;i++) {
//			System.out.println(arr[i] + " ");
//		}
		
		String[] str = new String[4];
		for(int i=0;i<str.length;i++) {
			str[i] = input.next();
		}
		
			System.out.println(Arrays.toString(str)); //convert array into string
		
	}

}
