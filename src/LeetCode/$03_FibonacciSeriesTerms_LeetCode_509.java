package LeetCode;

public class $03_FibonacciSeriesTerms_LeetCode_509 {

	public static void main(String[] args) {

		for (int i = 1; i <= 10; i++) {
			System.out.print(fibonacciSeriesTerms(i) + " ");
		}

		System.out.println();
		System.out.println(fibonacciSeriesTerms(1));
		System.out.println(fibonacciSeriesTerms(2));
		System.out.println(fibonacciSeriesTerms(3));
		System.out.println(fibonacciSeriesTerms(10));
		System.out.println(fibonacciSeriesTerms(20));

	}

	public static int fibonacciSeriesTerms(int num) {
		int first = 0, sec = 1;
		if (num <= 1)
			return first;
		if (num == 2)
			return sec;

		int i = 3, third;
		while (i <= num) {
			third = first + sec;
			first = sec;
			sec = third;
			i++;
		}
		return sec;
	}
}
