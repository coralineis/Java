package Chap16;

import java.util.*;
import Chap16.Hero;

public class Main {
	public static void main(String[] args) {
		Hero h1 = new Hero("斎藤");
		Hero h2 = new Hero("鈴木");
		Map<Hero, Integer> heros = new HashMap<Hero, Integer>();
		heros.put(h1, 3);
		heros.put(h2, 7);
		for (Hero key : heros.keySet()) {
			int value = heros.get(key);
			System.out.println(key.getName() + "が倒した敵＝" + value);
		}
	}
}