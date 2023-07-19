package com.java.dsa.array;

import java.util.Arrays;

public class ReverseArray {

	public static void main(String[] args) {
		int arr[]= {1,2,3,4};
		System.out.println("Array before: " +Arrays.toString(arr));
		reverseArray(arr);
	}

	private static void printArray(int[] arr) {
		
		System.out.print(Arrays.toString(arr));
		
		
		
	}

	private static void reverseArray(int[] arr) {
		
		System.out.print("Array after:  ");
		int start = 0;
		int end = arr.length - 1;
		while (start < end) {
			int temp = arr[start];
			arr[start] = arr[end];
			arr[end] = temp;
			start++;
			end--;

		}
		printArray(arr);

	}

}
