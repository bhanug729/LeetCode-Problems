package LeetCode;

import java.util.Arrays;

public class $14_ProductExceptSelf_LeetCode_238 {

	public static void main(String[] args) {
		System.out.println(Arrays.toString(productExceptSelf(new int[] { 1, 2, 3, 4 })));
		System.out.println(Arrays.toString(productExceptSelf(new int[] { -1, 1, 0, -3, 3 })));
	}

	public static int[] productExceptSelf(int[] nums) {
		int n = nums.length;
		int[] right = new int[n];

		int prod = 1;
		for (int i = n - 1; i >= 0; i--) {
			prod *= nums[i];
			right[i] = prod;
		}
		int[] result = new int[n];
		int left=1;
		
		for (int i=0; i<n-1; i++) {
			result[i] = left * right[i+1];
			left *= nums[i];
		}
		result[n-1] = left;
		return result;
	}
}
