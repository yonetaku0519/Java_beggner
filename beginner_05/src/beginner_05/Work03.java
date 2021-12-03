package beginner_05;

public class Work03 {
	public static void main(String[] args) {
		int[] array = {1,2,3,4,5};
		for(int i = 0; i < array.length; i++) {
			System.out.println(array[i]);
		}
		System.out.println("");
		
		for(int j : array) {
			System.out.println(j);
		}
		System.out.println("");
		
		String[] arrayStr = {"A","B","C"};
		
		for(String str: arrayStr) {
			System.out.println(str);
		}
	}

}
