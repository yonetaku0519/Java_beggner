package beginner_10;

import java.util.HashMap;

public class MapSample {

	public static void main(String[] args) {
		HashMap<String, String> strMap = new HashMap<String, String>();
		strMap.put("value1", "yone");
		strMap.put("value2", "nyanjirou");
		strMap.put("value3", "luke");
		
		System.out.println("文字列のマップ");
		for(int i = 1; i <= strMap.size(); i++) {
			System.out.println(strMap.get("value" + i));
		}
		
		HashMap<String, Integer> intMap = new HashMap<String, Integer>();
		intMap.put("value1", 26);
		intMap.put("value2", 1);
		intMap.put("value3", 8);
		
		System.out.println("数値のマップ");
		for(int i = 1; i <= intMap.size(); i++) {
			System.out.println(intMap.get("value" + i));
		}

	}

}
