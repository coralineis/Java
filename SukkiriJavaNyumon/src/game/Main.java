package game;

public class Main {
	public static void main(String[] args) {
		Character[] c = new Character[5];
		c[0] = new Hero();
		c[1] = new Hero();
		c[2] = new Thief();
		c[3] = new Wizard();
		c[4] = new Wizard();

		for (Character ch : c) {
			ch.hp += 50;
		}

		Monster[] monsters = new Monster[3];
		monsters[0] = new Slime();
		monsters[1] = new Slime();
		monsters[2] = new Slime();

		for (Monster m : monsters) {
			m.run();
		}
	}
}
