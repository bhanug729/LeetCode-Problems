package LeetCode;

public class $02_IsPowerOfTwo_LeetCode_231 {

	public static void main(String[] args) {
		System.out.println(isPowerOfTwo(-111));
		System.out.println(isPowerOfTwo(0));
		System.out.println(isPowerOfTwo(1));
		System.out.println(isPowerOfTwo(2));
		System.out.println(isPowerOfTwo(3));
		System.out.println(isPowerOfTwo(10));
		System.out.println(isPowerOfTwo(256));
	}

	public static Boolean isPowerOfTwo(int num) {

		if (num < 1)
			return false;
		if (num == 1)
			return true;

		while (num % 2 == 0) {
			num /= 2;
		}

		return num == 1;
	}
}
