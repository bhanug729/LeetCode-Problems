package LeetCode;

public class $10_MissingNumber_LeetCode_268 {

	public static void main(String[] args) {
		System.out.println(missingNumber(new int[] { 9, 6, 4, 2, 3, 5, 7, 0, 1 }));
		System.out.println(missingNumber(new int[] { 0, 1, 2, 3, 4, 6 }));
	}

	public static int missingNumber(int[] nums) {
		int len = nums.length;

		int actSum = len * (len + 1) / 2;
		int currSum = 0;

		for (int i = 0; i < len; i++) {
			currSum += nums[i];
		}

		return actSum - currSum;
	}
}
