package com.java.dsa;

public class StringCharManipulation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s="rAM is a big fan to Wan Where xExX";
		int count=0;
		for(int i=0;i<s.length();i++) {
			char c=s.charAt(i);
			if(Character.isUpperCase(c)) {
			System.out.print(s.charAt(i));
			count++;
			
			}
			
		}
		System.out.println("");
		System.out.println(count++);
	}

}
