package LeetCode;

public class Exercise {

	public static void main(String[] args) {
		System.out.println(majorityElement(new int[] { 3, 2, 3 }));
		System.out.println(majorityElement(new int[] { 2, 2, 1, 1, 1, 2, 2 }));
	}

	// Leetcode_169. Majority Element
	public static int majorityElement(int[] nums) {
		int count = 0;
		int candidate = 0;

		for (int num : nums) {
			if (count == 0) {
				candidate = num;
			}
			if (num == candidate) {
				count++;
			} else {
				count--;
			}
		}
		return candidate;
	}
}
