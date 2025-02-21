package LeetCode;

import java.util.HashMap;
import java.util.Map;

public class $20_LuckyIntegerInArray_LeetCode_1394 {

	public static void main(String[] args) {
		System.out.println(findLucky(new int[] { 2, 2, 3, 4 }));
		System.out.println(findLucky(new int[] { 1, 2, 2, 3, 3, 3 }));
		System.out.println(findLucky(new int[] { 2, 2, 2, 3, 3 }));
	}

	public static int findLucky(int[] arr) {
		Map<Integer, Integer> mp = new HashMap<>();
		int result = -1;

		for (int key : arr) {
			if (mp.containsKey(key)) {
				mp.put(key, mp.get(key) + 1);
			} else {
				mp.put(key, 1);
			}
		}

		for (int key : mp.keySet()) {

			if (key == mp.get(key)) {
				result = Math.max(result, key);
			}
		}

		return result;
	}
}
