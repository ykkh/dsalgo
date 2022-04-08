package com.ykkh.algo.binarysearch;

public class Solution {
	public static void main(String[] args) {

	//	int[] first = { 1, 2, 3, 4, 5, 6, 7 };
		
		int[] first = { 4, 6, 7, 10, 15, 26, 37, 88, 89, 105,106, 111,145 };

		/*
		 * System.out.println("expected -1: " + binarySearch(first, 3));
		 * System.out.println("expected 1: " + binarySearch(first, 6));
		 * System.out.println("expected 1: " + recursiveBinarySearchWrapper(first, 6));
		 * 
		 * System.out.println("expected 1: " + binarySearch(first, 6));
		 * 
		 * System.out.println("expected 0: " + binarySearch(first, 4));
		 */
		System.out.println("expected 1: " + binarySearch(first, 6));
		System.out.println("expected 9: " + binarySearch(first, 105));
	}
	
	
	private static int binarySearch(int[] array, int num) {
		int head = 0;
		int tail = array.length;
		
		
		while(head<=tail) {
			
			
			int mid = (head + tail) /2;
			System.out.println("head "+head+" tail: "+tail+" mid "+ mid);
			if(array[mid]<num) { //1 2 3 4 5 6
				head = mid +1;
				
			} else if(array[mid]>num) {
				tail = mid-1;
			} else {
				return mid;
			}
		}
		return -1;
	}

	private static int binarySerach(int[] array, int num) {
		int head = 0; // index
		int tail = array.length - 1;
		// find 5, index 1 2 3 4 5 6 7
		while (head <= tail) {
			int mid = (head + tail) / 2;

			if (num > array[mid]) {
				head = mid + 1;
			} else if (num < array[mid]) {
				tail = mid - 1;
			} else
				return mid;
		}

		return -1;
	}
	
	private static int recursiveBinarySearchWrapper(int[] array, int num) {
		int head = 0;
		int tail = array.length-1;
		return binarySearch(array, head, tail, num);
	}

	private static int binarySearch(int[] array, int head, int tail, int num) {

		if (tail >= head) {
			int mid = (head + tail) / 2;
			
			if (array[mid] == num) 
				return mid;
			
			if(num>=mid) {
				int h = mid +1;
			
				return binarySearch(array, h, tail, num);
			} else if(num<=mid) {
				int t = mid -1;
				return binarySearch(array, head, t, num);
			}
			
		}

		return -1;
	}

}