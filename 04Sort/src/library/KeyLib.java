package library;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

class Fruit implements Comparable<Fruit> {
	private String name;
	private int score;

	public Fruit(String name, int score) {
		this.name = name;
		this.score = score;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getScore() {
		return score;
	}

	public void setScore(int score) {
		this.score = score;
	}

	@Override
	public int compareTo(Fruit other) {
		if (this.score < other.score) {
			return -1;
		}
		return 1;
	}

}

public class KeyLib {
	public static void main(String[] args) {
		List<Fruit> fruits = new ArrayList<Fruit>();

		fruits.add(new Fruit("바나나", 2));
		fruits.add(new Fruit("사과", 5));
		fruits.add(new Fruit("당근", 3));

		Collections.sort(fruits);

		for (int i = 0; i < fruits.size(); i++) {
			System.out.print("(" + fruits.get(i).getName() + "," + fruits.get(i).getScore() + ")");
		}
	}
}
