package com.java.dsa;

public class MissingElement {

	public static void main(String[] args) {
		int []array2={1,2,3,4,5,6,7};
		int []array= {1,2,3,4,5,7};
		for(int i=0;i<array2.length-1;i++) {
			if(array2[i]!=array[i]) {
				System.out.println("The missing number is " +array2[i]);
				break;
			}
			
		}
		
	}

}
