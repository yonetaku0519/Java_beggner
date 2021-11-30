package beginner_04;

public class work04 {
	public static void main(String[] args) {
		int x = 5 + 6;
		if(x >= 10) {
			System.out.println("１０以上");
		}
		
		int y = 10 / 5;
		if(y >= 10) {
			System.out.println("１０以上");
		} else {
			System.out.println("１０未満");
		}
		
		int z = 11 % 3;
		if(z == 0) {
			System.out.println("割り算のあまりは０です");
		} else {
			System.out.println("余りは" + z);
		}
	}

}
