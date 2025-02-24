package LeetCode;

public class $24_MinimumInRotatedSortedArray_LeetCode_153 {

	public static void main(String[] args) {
		System.out.println(findMin(new int[] { 4, 5, 6, 7, 0, 1, 2 }));
		System.out.println(findMin(new int[] { 3, 4, 5, 1, 2 }));
		System.out.println(findMin(new int[] { 11, 13, 15, 17 }));
		System.out.println(findMin(new int[] { 1 }));
	}

	public static int findMin(int[] nums) {
		int start = 0, end = nums.length - 1;

		if (nums.length == 1 || nums[start] < nums[end]) {
			return nums[0];
		}

		while (start <= end) {
			int mid = start + (end - start) / 2;

			if (mid != 0 && nums[mid - 1] > nums[mid]) {
				return nums[mid];

			} else if (mid != end && nums[mid] > nums[mid + 1]) {
				return nums[mid + 1];

			} else if (nums[start] <= nums[mid]) { // First part is sorted
				start = mid + 1;
			} else {
				end = mid - 1; // Second part is sorted
			}
		}

		return -1;
	}
}
