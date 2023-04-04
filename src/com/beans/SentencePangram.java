package com.beans;
 
public class SentencePangram {
	public static void main(String[] args) {
		String sentence = "thequickbrownfoxjumpsoverthelazydog";
		boolean ans = check(sentence);
		System.out.println(ans);
	}
	
	static boolean check(String sentence) {
		boolean[] arr = new boolean[26];
		for(int i =0;i<sentence.length();i++) {
			arr[sentence.charAt(i)-97] = true;
		}
		for(int j =0;j<26;j++) {
			if(arr[j]==false) {
				return false;
			}
		}
		return true;
	}
	}


