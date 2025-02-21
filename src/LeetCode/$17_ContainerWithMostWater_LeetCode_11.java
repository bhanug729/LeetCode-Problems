package LeetCode;

public class $17_ContainerWithMostWater_LeetCode_11 {

	public static void main(String[] args) {
		System.out.println(maxArea(new int[] { 1, 8, 6, 2, 5, 4, 8, 3, 7 }));
		System.out.println(maxArea(new int[] { 1, 2, 3, 4 }));
	}

	public static int maxArea(int[] hight) {
		int start = 0, end = hight.length - 1;
		int maxCap = 0;

		while (start < end) {
			int high = Math.min(hight[start], hight[end]);
			int width = end - start;
			int currCap = high * width;

			maxCap = Math.max(currCap, maxCap);

			if (hight[start] < hight[end]) {
				start++;
			} else {
				end--;
			}
		}
		return maxCap;
	}
}
