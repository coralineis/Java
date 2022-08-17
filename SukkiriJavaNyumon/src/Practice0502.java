
public class Practice0502 {
	public static void main(String[] args) {
		String title = "カメについて";
		String address = "test@example.com";
		String text = "カメカメカメカメ";

		email(title, address, text);
	}

	public static void email(String title, String address, String text) {
		System.out.println(address + "に、以下のメールを送信しました。");
		System.out.println("件名： " + title);
		System.out.println("本文： " + text);
	}
}
