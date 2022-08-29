
public class Example9 {
	public static void main(String[] args) {
		int count = 0;
		int sum = 0;

		for (int a = 1; a <= 10; a++) {
			if (a % 2 == 0) {
				count++;
				sum += a;
			}
		}
		System.out.println("1~10までに偶数は" + count + "個");
		System.out.println("1~10までの偶数の合計は" + sum);
	}
}
