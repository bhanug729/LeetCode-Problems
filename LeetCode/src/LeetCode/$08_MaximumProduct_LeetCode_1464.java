package LeetCode;

public class $08_MaximumProduct_LeetCode_1464 {

	public static void main(String[] args) {
		System.out.println(twoSum(new int[] { 11, 2, 7, 0, 1 }));
		System.out.println(twoSum(new int[] { 1, 15, 7, 11, 15 }));
	}

	public static int twoSum(int[] nums) {
		int maxFirst = Integer.MIN_VALUE, maxSec = Integer.MIN_VALUE;

		for (int i = 0; i < nums.length; i++) {

			if (maxFirst < nums[i]) {
				maxSec = maxFirst;
				maxFirst = nums[i];
			} else if (maxSec < nums[i]) {
				maxSec = nums[i];
			}
		}
		return maxFirst * maxSec;
	}
}
