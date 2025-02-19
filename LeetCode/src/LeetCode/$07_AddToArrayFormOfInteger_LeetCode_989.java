package LeetCode;

import java.util.ArrayList;
import java.util.List;

public class $07_AddToArrayFormOfInteger_LeetCode_989 {

	public static void main(String[] args) {
		System.out.println(addToArrayForm(new int[] { 2, 7, 8, 5 }, 1239));
		System.out.println(addToArrayForm(new int[] { 9, 9, 8, 1 }, 13488));
	}

	public static List<Integer> addToArrayForm(int[] num, int k) {
		List<Integer> result = new ArrayList<>();

		int i = num.length - 1;
		while (i >= 0 || k > 0) {
			if (i >= 0) {
				k += num[i--];
			}

			result.add(0, k % 10);
			k /= 10;
		}
		return result;
	}
}
