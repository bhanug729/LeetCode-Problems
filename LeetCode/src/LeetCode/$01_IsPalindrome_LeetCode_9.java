package LeetCode;

public class $01_IsPalindrome_LeetCode_9 {

	public static void main(String[] args) {
		System.out.println(isPalindrome(0));
		System.out.println(isPalindrome(1));
		System.out.println(isPalindrome(11));
		System.out.println(isPalindrome(121));
		System.out.println(isPalindrome(4114));
		System.out.println(isPalindrome(123));
		System.out.println(isPalindrome(1000));
	}

	public static Boolean isPalindrome(int num) {

		if (num < 0)
			return false;

		int x = num, rev = 0;
		while (x > 0) {
			rev = rev * 10 + x % 10;
			x /= 10;
		}

		return num == rev;
	}
}
