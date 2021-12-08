package beginner_10;

import java.util.ArrayList;
import java.util.Random;

public class PackageSample {

	public static void main(String[] args) {
		Random random = new Random();
		System.out.println("乱数の表示");
		System.out.println(random.nextInt());
		
		ArrayList<Integer> list = new ArrayList<Integer>();
		for(int i = 0; i < 10; i++) {
			list.add(random.nextInt());
		}
		System.out.println("配列内の乱数を表示");
		for(int number: list) {
			System.out.println(number);
		}

	}

}
