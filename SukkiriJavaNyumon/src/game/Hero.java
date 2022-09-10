package game;

public class Hero extends Character{
	String name = "ミナト";
	int hp = 100;
	Sword sword;

	public void bye() {
		System.out.println("勇者は別れを告げた");
	}

	public void die() {
		System.out.println(this.name + "は死んでしまった");
		System.out.println("GAME OVERです");
	}

	public void sleep() {
		this.hp = 100;
		System.out.println(this.name + "は眠って回復した");
	}

	public void attack(Monster m) {
		System.out.println(this.name + "の攻撃！");
		System.out.println("5ポイントのダメージを与えた！");
		this.hp -= 2;
		if ( this.hp <= 0) {
			this.die();
		}
	}

	public final void slip() {
		this.hp -= 5;
		System.out.println(this.name + "は転んだ！");
		System.out.println("5のダメージ");
	}

	public void run() {
		System.out.println(this.name + "は逃げ出した！");
	}
}
