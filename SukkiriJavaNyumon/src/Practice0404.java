
public class Practice0404 {
	public static void main(String[] args) {
		int[] numbers = {3, 4, 9};
		System.out.println("1桁の数字を入力してください");
		int input = new java.util.Scanner(System.in).nextInt();

		for (int i : numbers) {
			if (i == input) {
				System.out.println("アタリ！");
			}
		}
	}
}
