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
		this.hp = hp;
	}

	public int getMp() {
		return mp;
	}

	public void setMp(int mp) {
		this.mp = mp;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Wand getWand() {
		return wand;
	}

	public void setWand(Wand wand) {
		this.wand = wand;
	}
}
