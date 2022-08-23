
public class Example3 {
	public static void main(String[] args) {
		int [] array = {2, 5, 6, 7, 9, 13, 15, 16, 18, 22, 23, 25, 29, 30, 33, 37, 39, 40, 43, 44};
		for (int i = 0; i < 11; i++) {
			if (array[i] % 2 != 0) {
				System.out.print(array[i]);
				if (i < 10) {
					System.out.print(",");
				}
			}
		}
	}
}
