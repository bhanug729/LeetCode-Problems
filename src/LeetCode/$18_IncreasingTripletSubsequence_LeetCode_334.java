package LeetCode;

public class $18_IncreasingTripletSubsequence_LeetCode_334 {

	public static void main(String[] args) {
		System.out.println(increasingTriplet(new int[] { 2, 1, 5, 0, 4, 6 }));
		System.out.println(increasingTriplet(new int[] { 5, 4, 3, 2, 1 }));
	}

	public static boolean increasingTriplet(int[] nums) {
		int first = Integer.MAX_VALUE;
		int second = Integer.MAX_VALUE;

		for (int i = 0; i < nums.length; i++) {
			int el = nums[i];

			if (first >= el) {
				first = el;
			} else if (second >= el) {
				second = el;
			} else {
				return true;
			}
		}
		return false;
	}
}
