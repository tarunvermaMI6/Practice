package com.from.kunal.kushwah.binarysearch;

public class SearchInRotatedArray {

	public static void main(String[] args) {

		int arr[] = { 7, 8, 9, 0, 1, 2, 3, 4, 5, 6 }; // their r three series, 7 to 9 asc, 0 to 7 asc , 9 to 0 is desc,
														// means
		// series changing from 9 and array is sorted that means 9 will be the max or
		// pivot, search from start to pivot if
		// element not found than, search in
		int result = search(arr);
		System.out.println("result = " + result);
	}

	public static int search(int[] arr) {

		int pivotPoint = FindPivotPoint.getPivotPoint(arr);
		System.out.println("pivot point = "+pivotPoint);
		
		int result = binarySearch(arr, 2, 0, pivotPoint);
		System.out.println("first result = "+result);
		if (result == -1) {
			result = binarySearch(arr, 2, pivotPoint, arr.length - 1);
			System.out.println("second result = "+result);
		}
		return result;
	}

	public static int binarySearch(int[] arr, int target, int start, int end) {

		int mid = 0;

		while (start <= end) {

			mid = start + (end - start) / 2;

			if (arr[mid] == arr[target]) {
				return mid;
			}

			if (arr[mid] > arr[target] && mid>start) {
				end = mid - 1;
			} else if(arr[mid] < arr[target] && end>mid){
				start = mid + 1;
			}

		}

		return -1;
	}
}
