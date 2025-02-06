package com.java.programs;

import java.util.HashMap;

public class OrderByFrequencyDesc {

	public static void main(String[] args) {

		int[] arr = { 1, 3, 1, 5, 1, 5, 5, 6, 4, 5 };
		getFrequency(arr);
	}

	public static void getFrequency(int arr[]) {

		int length = arr.length;
		boolean visited[] = new boolean[length];
        HashMap<Integer, Integer> map = new HashMap<>();
		for (int i = 0; i < length; i++) {

			if (!visited[i]) {
				int count = 0;
				for (int j = i; j < length; j++) {
					if (arr[i] == arr[j]) {
						visited[j] = true;
						count++;
					}
				}
				System.out.println(arr[i] + " == " + count);
			}

		}
	}

	private void sort(int[] arrr) {
		
		 int[] arr = { 1, 3, 6, 5, 9, 2, 5, 4, 5 };
		
		for(int i=0; i<arr.length; i++) {
			
			for(int j=0; j<arr.length; j++) {
			
				
			}
		}

	}
}
