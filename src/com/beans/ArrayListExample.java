package com.beans;

import java.util.ArrayList;
import java.util.Scanner;

public class ArrayListExample {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		ArrayList<Integer> list = new ArrayList<>(5);
		
//		list.add(81329);
//		list.add(82139);
//		list.add(8944);
//		list.add(8943);
//		list.add(81239);
//		list.add(88789);
//		list.add(8239);
//		list.add(12389);
//		list.add(1289);
//		list.add(891);
		
//		list.set(0, 1);
//		list.remove(9);
//		System.out.println(list);
//		System.out.println(list.contains(89112));
		
//		input
		for(int i = 0;i<5;i++) {
			list.add(input.nextInt());
		}
		
//		get item at any index
		for(int i=0;i<5;i++) {
			System.out.print(list.get(i)); //pass index here,list[index] syntax will not work here
		}
		
	}

}
