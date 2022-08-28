
public class Example5 {
	public static void main(String[] args) {
		int count = 0;
		int sum = 0;

		for (int a = 1; a <= 10; a++) {
			if (a % 2 == 0) {
				count ++;
				sum += a;
			}
		}
		System.out.println(count);
		System.out.println(sum);
	}
}
