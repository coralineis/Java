package game;

public class Wizard extends Character{
	int mp;

	public void attack(Matango m) {
		System.out.println(this.name + "の攻撃！");
		System.out.println("敵に3ポイントのダメージ");
		m.hp -= 3;
	}

	public void fireball(Matango m) {
		System.out.println(this.name + "は火の玉を放った！");
		System.out.println("敵に20ポイントのダメージ");
		m.hp -= 20;
		this.mp -= 5;
	}

	public void heal(Hero h) {
		h.hp += 10;
		System.out.println(h.name + "のHPを10回復した！");
	}
}
