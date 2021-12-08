package beginner_10;

import java.util.ArrayList;

public class ListSample {

	public static void main(String[] args) {
		ArrayList<String> stringList = new ArrayList<String>();
		stringList.add("ABC");
		stringList.add("DEF");
		stringList.add("GHI");
		
		System.out.println("Stringのリスト");
		for(String str: stringList) {
			System.out.println(str);
		}
		
		ArrayList<Integer> intList = new ArrayList<Integer>();
		intList.add(123);
		intList.add(456);
		intList.add(789);
		
		System.out.println("Integerのリスト");
		for(int i: intList) {
			System.out.println(i);
		}

	}

}
