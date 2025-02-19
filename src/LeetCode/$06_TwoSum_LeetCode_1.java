package LeetCode;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class $06_TwoSum_LeetCode_1 {

	public static void main(String[] args) {
		System.out.println(Arrays.toString(twoSum(new int[] { 2, 7, 11, 15 }, 9)));
		System.out.println(Arrays.toString(twoSum(new int[] { 2, 3, 4 }, 6)));
		System.out.println(Arrays.toString(twoSum(new int[] { -1, 0 }, -1)));
	}

	public static int[] twoSum(int[] nums, int target) {
		int start = 0, end = nums.length - 1;
		int sum;

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

		return new int[] { start+1, end+1 };
	}
}
