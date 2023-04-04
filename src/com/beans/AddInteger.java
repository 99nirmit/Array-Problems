package com.beans;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class AddInteger {
	public static void main(String[] args) {
		int[] num = {2,1,5};
		int k = 806;
		List<Integer> ans = solution(num,k);
		System.out.println(ans);
	}

	 static List<Integer> solution(int[] num,int k) {
		int n = num.length;
		int i = n-1;
		List<Integer> sol=new ArrayList<>();
		while(i>=0 || k>0) {
			if(i>=0) {
				sol.add((num[i]+k)%10);
				k = (num[i]+k)/10;
			}else {
				sol.add(k%10);
				k /=10;
			}
			i--;
		}
		Collections.reverse(sol);
		return sol;
	}

}
