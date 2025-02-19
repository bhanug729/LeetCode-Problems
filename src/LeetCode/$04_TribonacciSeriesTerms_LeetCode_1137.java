package LeetCode;

public class $04_TribonacciSeriesTerms_LeetCode_1137 {

	public static void main(String[] args) {

		for (int i = 1; i <= 10; i++) {
			System.out.print(tribonacciSeriesTerms(i) + " ");
		}

		System.out.println();
		System.out.println(tribonacciSeriesTerms(1));
		System.out.println(tribonacciSeriesTerms(2));
		System.out.println(tribonacciSeriesTerms(3));
		System.out.println(tribonacciSeriesTerms(10));
		System.out.println(tribonacciSeriesTerms(20));

	}

	public static int tribonacciSeriesTerms(int num) {
		int first = 0, second = 1, third = 1;
		if (num <= 1)
			return first;
		if (num == 2)
			return second;
		if (num == 3)
			return third;

		int i = 4, fourth;
		while (i <= num) {
			fourth = first + second + third;
			first = second;
			second = third;
			third = fourth;
			i++;
		}
		return third;
	}
}
