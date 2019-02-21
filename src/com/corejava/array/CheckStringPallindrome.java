package com.corejava.array;

public class CheckStringPallindrome {
	public static void main(String[] args) {
		System.out.println("Is String Palindrome? "+ checkPalindrome("aabaa"));
	}

	static boolean checkPalindrome(String inputString) {
		int j = inputString.length() - 1;
		for(int i= 0; i < inputString.length(); i++) {
			if(inputString.charAt(i) != inputString.charAt(j))
				return false;
			j--;
		}
		return true;
	}

}
