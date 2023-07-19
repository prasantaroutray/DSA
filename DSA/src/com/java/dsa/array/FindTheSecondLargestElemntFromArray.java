package com.java.dsa.array;

import java.util.Arrays;

public class FindTheSecondLargestElemntFromArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		findTheSecondLargestElemntFromArray(new int[] {21,23,42,78,88,89,10,76,87,90,98,76});

	}

	private static void findTheSecondLargestElemntFromArray(int[] arr) {
		int temp;
		for(int i=0;i<arr.length;i++) {
			
			for(int j=i+1;j<arr.length;j++) {
				if(arr[i]>arr[j]) {
				temp=arr[i];
				arr[i]=arr[j];
				arr[j]=temp;
				}
				
				
			}
			
		}
	 
		  
	  System.out.println(arr[1]);
		
	}

}
