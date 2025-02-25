package LeetCode;

public class $27_SingleElementInSortedArray_LeetCode_540 {

	public static void main(String[] args) {
		System.out.println(singleNonDuplicate(new int[] { 1, 1, 2, 3, 3, 4, 4, 8, 8 }));
		System.out.println(singleNonDuplicate(new int[] { 3, 3, 7, 7, 10, 11, 11 }));
	}

	public static int singleNonDuplicate(int[] nums) {
		int start = 0, end = nums.length - 1;

		if (nums.length == 1 || nums[start] != nums[start + 1]) {
			return nums[0]; // Index return

		} else if (nums[end] != nums[end - 1]) {
			return nums[end];

		} else {
			while (start <= end) {
				int mid = start + (end - start) / 2;

				if (nums[mid] != nums[mid - 1] && nums[mid] != nums[mid + 1]) {
					return nums[mid];
				} else if (mid % 2 == 1) { // If mid index is odd
					if (nums[mid - 1] == nums[mid]) {
						start = mid + 1;
					} else {
						end = mid - 1;
					}
				} else { // if mid index is even
					if (nums[mid] == nums[mid + 1]) {
						start = mid + 1;
					} else {
						end = mid - 1;
					}
				}
			}
			return -1;
		}
	}
}