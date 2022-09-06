package game;

public class Main {
	public static void main(String[] args) {
		Sword s = new Sword();
		s.name = "炎の剣";
		s.damage = 10;

		Hero h1 = new Hero("ミナト");
		System.out.println(h1.name);

		Hero h2 = new Hero();
		System.out.println(h2.name);

		Wizard w = new Wizard();
		w.name = "スガワラ";
		w.hp = 50;

		Matango m1 = new Matango();
		m1.hp = 50;
		m1.suffix = 'A';

		Matango m2 = new Matango();
		m2.hp = 48;
		m2.suffix = 'B';

		h1.sit(5);
		h1.slip();
		h1.sit(25);
		h1.run();
		h1.attack();
	}
}
