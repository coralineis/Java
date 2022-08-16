
public class Practice0303 {
	public static void main(String[] args) {
		int isHungry = 1;
		String food = "トマト";
		System.out.println("こんにちは");

		System.out.println(isHungry == 0 ? "お腹がいっぱいです" : "腹ペコです");

		if (isHungry == 0) {
			System.out.println("お腹がいっぱいです");
		} else {
			System.out.println("はらぺこです");
		}

		if (isHungry == 1) {
			System.out.println(food + "をいただきます");
		}

		System.out.println("ごちそうさまでした");
	}
}
