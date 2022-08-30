
public class Example12 {
	public static void main(String[] args) {
		System.out.println("1問目");
		for (int i = 1; i < 11; i++) {
			if (i % 2 == 0) {
				System.out.println(i);
			}
		}

		System.out.println("2問目");
		int count = 0;
		int sum = 0;

		for (int i = 1; i < 11; i++) {
			if (i % 2 == 0) {
				count++;
				sum += i;
			}
		}
		System.out.println("1~10までに偶数は" + count + "コ");
		System.out.println("1~10までの偶数の合計は" + sum);
	}
}
