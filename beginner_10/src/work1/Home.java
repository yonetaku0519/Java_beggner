package work1;

import java.util.ArrayList;

public class Home {
	public static void main(String[] args) {
		
		Human h1 = new Human("田中", 20);
		Human h2 = new Human("佐藤", 30);
		Human h3 = new Human("鈴木", 40);
		
		ArrayList<Human> list = new ArrayList<>();
		list.add(h1);
		list.add(h2);
		list.add(h3);
		
		for(int i = 0; i <list.size(); i++) {
			Human h = list.get(i);
			h.introduction();
		}
		
	}

}
