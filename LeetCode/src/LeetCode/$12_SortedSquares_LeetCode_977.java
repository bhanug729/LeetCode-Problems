package LeetCode;

import java.util.Arrays;

public class $12_SortedSquares_LeetCode_977 {

	public static void main(String[] args) {
		System.out.println(Arrays.toString(sortedSquares(new int[] { -4, -1, 0, 3, 10 })));
		System.out.println(Arrays.toString(sortedSquares(new int[] { -7, -3, 2, 3, 11 })));
	}

	public static int[] sortedSquares(int[] nums) {
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
