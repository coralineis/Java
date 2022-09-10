package game;

public class Wizard{
	private int hp;
	private int mp;
	private String name;
	private Wand wand;

	public void heal(Hero h) {
		int basePoint = 10;
		int recovPoint = (int)(basePoint * this.getWand().getPower());
		h.setHp(h.getHp() + recovPoint);
		System.out.println(h.getName() + "のHPを" + recovPoint +"回復した！");
	}

	public int getHp() {
		return hp;
	}

	public void setHp(int hp) {
		if (hp < 0) { this.hp = 0; } else { this.hp = hp; }
	}

	public int getMp() {
		return mp;
	}

	public void setMp(int mp) {
		if (mp < 0) {
			throw new IllegalArgumentException("mpは0以上。処理を中断。");
		}
		this.mp = mp;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		if (name == null || name.length() < 3) {
			throw new IllegalArgumentException("名前が短すぎる。処理を中断。");
		}
		this.name = name;
	}

	public Wand getWand() {
		return wand;
	}

	public void setWand(Wand wand) {
		if (wand == null) {
			throw new IllegalArgumentException("設定されようとしている杖がnullです。");
		}
		this.wand = wand;
	}
}
