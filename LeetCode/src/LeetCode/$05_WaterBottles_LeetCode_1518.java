package LeetCode;

public class $05_WaterBottles_LeetCode_1518 {

	public static void main(String[] args) {
		System.out.println(WaterBottles(9, 3));
		System.out.println(WaterBottles(15, 4));
	}

	public static int WaterBottles(int numOffilledBottle, int numExchange) {
		int result = numOffilledBottle;
		int emptyBottle = numOffilledBottle;

		while (emptyBottle >= numExchange) {

			int newfilledBottle = emptyBottle / numExchange;
			emptyBottle %= numExchange;

			result += newfilledBottle;
			emptyBottle += newfilledBottle;
		}
		return result;
	}
}
