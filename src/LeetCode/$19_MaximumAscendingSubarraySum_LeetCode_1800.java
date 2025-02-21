package LeetCode;

public class $19_MaximumAscendingSubarraySum_LeetCode_1800 {

	public static void main(String[] args) {
		System.out.println(maxAscendingSum(new int[] { 10, 20, 30, 5, 10, 50 }));
		System.out.println(maxAscendingSum(new int[] { 10, 20, 30, 40, 50 }));
		System.out.println(maxAscendingSum(new int[] { 12, 17, 15, 13, 10, 11, 12 }));
	}

	public static int maxAscendingSum(int[] nums) {
		int maxSum = nums[0];
		int currSum = nums[0];

		for (int i = 1; i < nums.length; i++) {
			if (nums[i - 1] < nums[i]) {
				currSum += nums[i];
			} else {
				maxSum = Math.max(maxSum, currSum);
				currSum = nums[i];
			}
		}
		
		maxSum = Math.max(maxSum, currSum);
		return maxSum;
	}
}
