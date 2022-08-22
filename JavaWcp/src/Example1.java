
public class Example1 {
	public static void main(String[] args) {
		int sum = 0;
		int count = 0;

		for (int a = 1; a <= 10; a++) {
			if (a % 2 == 0) {
				System.out.println(a);
				sum = sum + a;
				count++;
			}
		}
		System.out.println(sum);
		System.out.println(count);
	}
}
