
public class Example13 {
	public static void main(String[] args) {
		int [] array = new int [20];
		for (int i = 1; i < array.length; i++) {
			array[i] = array[i - 1] + 5;
		}

		System.out.print("要素数20の配列は ");
		for (int i = 0; i < array.length; i++) {
			System.out.print(array[i]);
			if (i < array.length - 1) {
				System.out.print(",");
			}
		}

		System.out.println();
		System.out.print("[0]~[10]:");
		for (int i = 0; i < array.length - 9; i++) {
			if (array[i] % 2 != 0) {
				System.out.print(array[i]);
				if (i < array.length - 11) {
					System.out.print(",");
				}
			}
		}

		System.out.println();
		System.out.print("[11]~[19]:");
		for (int i = 11; i > (array.length - 10) && i < array.length; i++) {
			if (array[i] % 2 == 0) {
				System.out.print(array[i]);
				if (i < array.length - 2) {
					System.out.print(",");
				}
			}
		}
	}
}
