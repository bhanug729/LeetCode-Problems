package LeetCode;

public class $23_SearchInRotatedSortedArray_LeetCode_33 {

	public static void main(String[] args) {
		System.out.println(search(new int[] { 4, 5, 6, 7, 0, 1, 2 }, 1));
		System.out.println(search(new int[] { 4, 5, 6, 0, 1, 2, 3 }, 6));
		System.out.println(search(new int[] { 4, 5, 6, 7, 0, 1, 2 }, 3));
		System.out.println(search(new int[] { 1 }, 0));
	}

	public static int search(int[] nums, int target) {
		int start = 0, end = nums.length - 1;

		while (start <= end) {
			int mid = start + (end - start) / 2;

			if (nums[mid] == target) {
				return mid;

			} else if (nums[start] <= nums[mid]) { // First part is sorted
				if (nums[start] <= target && target < nums[mid]) {
					end = mid - 1;
				} else {
					start = mid + 1;
				}

			} else { // Second part is sorted
				if (nums[mid] < target && target <= nums[end]) {
					start = mid + 1;
				} else {
					end = mid - 1;
				}
			}
		}
		return -1;
	}
}
