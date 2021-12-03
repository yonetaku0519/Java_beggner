package beginner_05;

public class Work04 {

	public static void main(String[] args) {
		int[] num = {1,2,3,4,5};
		
		for(int i: num) {
			if((i % 2) == 0) {
				System.out.println(i);
			}
		}
	}

}
