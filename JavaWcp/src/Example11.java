
public class Example11 {
	public static void main(String[] args) {
		int [] array = new int[20];
		for (int i = 1; i < array.length; i++) {
			array[i] = array[i - 1] + 5;
		}

		for (int i = 0; i < array.length; i++) {
			System.out.print(array[i]);
			if (i <array.length - 1) {
				System.out.print(",");
			}
		}

		System.out.println();
		for (int i = 0; i < (array.length - 10); i++) {
			if (array[i] % 2 != 0) {
				System.out.print(array[i]);
				if (i < array.length - 11) {
					System.out.print(",");
				}
			}
		}

		System.out.println();
		for (int i = 11; i > array.length - 11 && i < array.length; i++) {
			if (array[i] % 2 == 0) {
				System.out.print(array[i]);
				if (i < array.length - 2) {
					System.out.print(",");
				}
			}
		}
	}
}
