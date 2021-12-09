package work1;

import java.util.HashMap;

public class School {
	public static void main(String[] args) {
		
		Human h1 = new Human("田中", 20);
		Human h2 = new Human("佐藤", 30);
		Human h3 = new Human("鈴木", 40);
		
		HashMap<Integer, Human> map = new HashMap<>();
		map.put(1, h1);
		map.put(2, h2);
		map.put(3, h3);
		
		for(int i = 1; i <= map.size(); i++) {
			Human h = map.get(i);
			h.introduction();
		}
		
	}

}
