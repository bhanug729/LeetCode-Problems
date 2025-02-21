package LeetCode;

public class $15_BulbSwitch_LeetCode_319 {

	public static void main(String[] args) {
		System.out.println(bulbSwitch(0));
		System.out.println(bulbSwitch(1));
		System.out.println(bulbSwitch(3));
		System.out.println(bulbSwitch(4));
		System.out.println(bulbSwitch(18));
	}

	public static int bulbSwitch(int num) {
		int count = 0, i = 1;
		while (i * i <= num) {
			count++;
			i++;
		}
		return count;
	}
}
