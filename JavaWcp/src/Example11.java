
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
	}
}
