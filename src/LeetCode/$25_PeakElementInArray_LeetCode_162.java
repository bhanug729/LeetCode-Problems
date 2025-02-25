package LeetCode;

public class $25_PeakElementInArray_LeetCode_162 {

	public static void main(String[] args) {
		System.out.println(findPickElement(new int[] { 1, 2, 3, 1 }));
		System.out.println(findPickElement(new int[] { 1, 2, 1, 3, 5, 6, 4 }));
	}

	public static int findPickElement(int[] nums) {
		int start = 0, end = nums.length - 1;

		if (nums.length == 1 || nums[start] > nums[start + 1]) {
			return 0; // Index return

		} else if (nums[end] > nums[end - 1]) {
			return end;

		} else {
			start++;
			end--;
			while (start <= end) {
				int mid = start + (end - start) / 2;

				if (nums[mid] > nums[mid - 1] && nums[mid] > nums[mid + 1]) {
					return mid;
				} else if (nums[mid] < nums[mid + 1]) {
					start = mid + 1;
				} else {
					end = mid - 1;
				}
			}
		}
		return -1;
	}
}
