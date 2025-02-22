package LeetCode;

public class $16_LargestNumber_LeetCode_747 {

	public static void main(String[] args) {
		System.out.println(dominantIndex(new int[] { 6, 2, 1, 16, 1, 0 }));
		System.out.println(dominantIndex(new int[] { 1, 2, 3, 4 }));
	}

	public static int dominantIndex(int[] nums) {
		int max = Integer.MIN_VALUE, secMax = Integer.MIN_VALUE;
		int maxIndex = 0;

		for (int i = 0; i < nums.length; i++) {
			if (max < nums[i]) {
				secMax = max;
				max = nums[i];
				maxIndex = i;
			} else if (secMax < nums[i]) {
				secMax = nums[i];
			}
		}

		if (secMax * 2 <= max) {
			return maxIndex;
		} else {
			return -1;
		}
	}
}