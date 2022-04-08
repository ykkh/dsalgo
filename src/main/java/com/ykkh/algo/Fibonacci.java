package com.ykkh.algo;

public class Fibonacci {

	public static void main(String[] args) {
		int[] arr = getSequence(5);
		for(int j: arr) {
			System.out.print(j);
		}
		System.out.println("");
		System.out.println(fib(5));
	}

	static int[] getSequence(int num) {
		int[] arr = new int[num];
		arr[0] = 0;
		arr[1] = 1;
		for (int i = 2; i < num; i++) {
			arr[i] = arr[i - 1] + arr[i - 2];
		}

		return arr;
	}

	static int fib(int n) {
		if (n <= 1)
			return n;
		return fib(n - 1) + fib(n - 2);
	}
}
