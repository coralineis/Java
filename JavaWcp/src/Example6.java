
public class Example6 {
	public static void main(String[] args) {
		for (int a = 1; a <= 10; a++) {
			if (a % 2 == 0) {
				System.out.print(a);
				if (a < 10) {
					System.out.print(",");
				}
			}
		}
	}
}
