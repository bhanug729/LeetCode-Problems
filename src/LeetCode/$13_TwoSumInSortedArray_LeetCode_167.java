package LeetCode;

import java.util.Arrays;

public class $13_TwoSumInSortedArray_LeetCode_167 {

	public static void main(String[] args) {
		System.out.println(Arrays.toString(twoSum(new int[] { 2, 7, 11, 15 }, 9)));
		System.out.println(Arrays.toString(twoSum(new int[] { 2, 7, 11, 15 }, 18)));
	}

	public static int[] twoSum(int[] nums, int target) {
		int start = 0, end = nums.length - 1;
		int sum = 0;

		while (start < end) {
			sum = nums[start] + nums[end];

			if (sum == target)
				break;

			if (sum < target) {
				start++;
			} else {
				end--;
			}
		}
		return new int[] { start + 1, end + 1 };
	}
}
