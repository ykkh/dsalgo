package com.ykkh.algo.twonumbers;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import java.util.Stack;

public class AddTwoNumberArray {
	public static void main(String[] args) {
System.out.println(reverse(123));
	}

	public static int reverse(int x) {
		String s = String.valueOf(x);
		StringBuilder b = new StringBuilder(s);
		b.reverse();
		return Integer.parseInt(b.toString());
	}

	// Input: nums = [2,7,11,15], target = 9 ... Output: [0,1]
	public int[] twoSum(int[] nums, int target) {

		int[] array = new int[2];
		Set<Integer> set = new HashSet<>();

		Map<Integer, Integer> map = new HashMap<>(); // 7, 0

		for (int j = 0; j < nums.length; j++) {
			if (map.containsKey(nums[j])) {
				int index = map.get(nums[j]);
				array[0] = index;
				array[1] = j;
			} else {
				map.put(target - nums[j], j);
			}
		}

		return array;

	}
}
