package game;

public class Main {
	public static void main(String[] args) {
		Sword s = new Sword();
		s.name = "炎の剣";
		s.damage = 10;

		Hero h1 = new Hero();
		h1.name = "ミナト";
		h1.hp = 100;
		h1.sword = s;
		System.out.println("現在の武器は" + h1.sword.name);

		Hero h2 = new Hero();
		h2.name = "アサカ";
		h2.hp = 100;

		Wizard w = new Wizard();
		w.name = "スガワラ";
		w.hp = 50;
		w.heal(h1);
		w.heal(h2);
		w.heal(h2);

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
