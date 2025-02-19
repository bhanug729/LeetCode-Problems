package LeetCode;

public class $09_MedianOfTwoSortedArray_LeetCode_4 {

	public static void main(String[] args) {
		System.out.println(findMedianSortedArrays(new int[] { 1, 3 }, new int[] { 2 }));
		System.out.println(findMedianSortedArrays(new int[] { 1, 2 }, new int[] { 3, 4 }));
	}

	public static double findMedianSortedArrays(int[] nums1, int[] nums2) {
		int[] merged = merge(nums1, nums2);
		int len = merged.length;

		if (len % 2 == 0) {
			return (double) (merged[len / 2] + merged[len / 2 - 1]) / 2;
		}
		return (double) merged[len / 2];
	}

	public static int[] merge(int[] nums1, int[] nums2) {
		int[] mergedArray = new int[nums1.length + nums2.length];

		int p1 = 0, p2 = 0, p3 = 0;
		while (p1 < nums1.length || p2 < nums2.length) {

			int val1 = p1 < nums1.length ? nums1[p1] : Integer.MAX_VALUE;
			int val2 = p2 < nums2.length ? nums2[p2] : Integer.MAX_VALUE;

			if (val1 < val2) {
				mergedArray[p3] = val1;
				p1++;
			} else {
				mergedArray[p3] = val2;
				p2++;
			}
			p3++;
		}
		return mergedArray;
	}
}
