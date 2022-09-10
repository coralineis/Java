package game;

public class Wand {
	private String name;
	private double power;

	public String getName() {
		return name;
	}
	public void setName(String name) {
		if (name == null || name.length() < 3) {
			throw new IllegalArgumentException("名前が短すぎる。処理を中断。");
		}
		this.name = name;
	}
	public double getPower() {
		return power;
	}
	public void setPower(double power) {
		if (power < 0.5 || power > 100.0) {
			throw new IllegalArgumentException("杖に設定されようとしている魔力が異常です。");
		}
		this.power = power;
	}
}
