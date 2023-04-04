package com.beans;

import java.util.Arrays;

public class PlusOne {
	public static void main(String[] args) {
		int[] digit = {9};
		int[] ans = plus(digit);
		System.out.println(Arrays.toString(ans));
	}

	 static int[] plus(int[] digit) {
		 int n=digit.length;
//		 This is for {1,2,3} 
		 for(int i=n-1;i>=0;i--) {    //loop starting from backside 
			 if(digit[i]<9) {
				 digit[i]++;
				 return digit;
			 }
//			 This is for {1,9}
			 digit[i]=0;
		 }
//		 This is for {9}
		 int[] newArr=new int[n+1];
		 newArr[0]=1;
		 return newArr;
	
//		 int last=0;
//		 for(int i=0;i<digit.length;i++) {
//			 if(i==digit.length-1) {
//				 last = digit[i];
//				
//			 }
//			 
//		 }
//		 last+=1;
//		 digit[digit.length-1]=last;
//		return digit;
	}

}
