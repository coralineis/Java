package game;

public class Hero extends Character{
	private String name;
	private int hp;
	private Sword sword;

	public void bye() {
		System.out.println("勇者は別れを告げた");
	}

	private void die() {
		System.out.println(this.name + "は死んでしまった");
		System.out.println("GAME OVERです");
	}

	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		if (name == null) {
			throw new IllegalArgumentException("名前がnullである。処理を中断。");
		}
		if (name.length() <= 1) {
			throw new IllegalArgumentException("名前が短すぎる。処理を中断。");
		}
		if (name.length() >= 8) {
			throw new IllegalArgumentException("名前が長すぎる。処理を中断。");
		}
		this.name = name;
	}

	void sleep() {
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
