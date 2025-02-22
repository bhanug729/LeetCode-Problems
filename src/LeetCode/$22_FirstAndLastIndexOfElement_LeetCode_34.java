package LeetCode;

import java.util.Arrays;

public class $22_FirstAndLastIndexOfElement_LeetCode_34 {

	public static void main(String[] args) {
		System.out.println(Arrays.toString(searchRange(new int[] { 5, 7, 7, 8, 8, 8, 8, 8, 10 }, 8)));
		System.out.println(Arrays.toString(searchRange(new int[] { 5, 7, 7, 8, 8, 10 }, 6)));
		System.out.println(Arrays.toString(searchRange(new int[] {}, 0)));
	}

	public static int[] searchRange(int[] nums, int target) {
		int[] ans = new int[] { -1, -1 };

		if (nums.length <= 0) {
			return ans;
		}
		ans[0] = firstOcc(nums, target);
		ans[1] = lastOcc(nums, target);
		return ans;
	}

	public static int firstOcc(int[] nums, int target) {
		int start = 0, end = nums.length - 1;
		int result = -1;

		while (start <= end) {
			int mid = start + (end - start) / 2;

			if (nums[mid] == target) {
				result = mid;
				end--;
			} else if (nums[mid] < target) {
				start = mid + 1;
			} else {
				end = mid - 1;
			}
		}
		return result;
	}

	public static int lastOcc(int[] nums, int target) {
		int start = 0, end = nums.length - 1;
		int result = -1;

		while (start <= end) {
			int mid = start + (end - start) / 2;

			if (nums[mid] == target) {
				result = mid;
				start++;
			} else if (nums[mid] < target) {
				start = mid + 1;
			} else {
				end = mid - 1;
			}
		}
		return result;
	}
}
