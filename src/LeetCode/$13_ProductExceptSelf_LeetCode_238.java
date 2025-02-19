package LeetCode;

import java.util.Arrays;

public class $13_ProductExceptSelf_LeetCode_238 {

	public static void main(String[] args) {
		System.out.println(Arrays.toString(twoSum(new int[] { 2, 7, 11, 15 }, 9)));
		System.out.println(Arrays.toString(twoSum(new int[] { 2, 7, 11, 15 }, 18)));
	}

	public static int[] twoSum(int[] nums, int target) {
		int[] sortedArr = new int[nums.length];
		int start = 0, end = nums.length - 1;

		for (int i = nums.length - 1; i >= 0; i--) {
			int ss = nums[start] * nums[start];
			int es = nums[end] * nums[end];
			
			if (ss > es) {
				sortedArr[i] = ss;
				start++;
			} else {
				sortedArr[i] = es;
				end--;
			}
		}
		return sortedArr;
	}
}
