package practice;

public class Computer extends TangibleAsset{
	String makerName;

	public Computer(String name, int price, String color, String makerName) {
		super(name, price, color);
		this.makerName = makerName;
	}

	public String gerMakerName() { return this.makerName; }
}
