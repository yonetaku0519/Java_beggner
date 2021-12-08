package beginner_09;

public class RunCalc {

	public static void main(String[] args) {
		Calc calc = new Calc();
		int i = 0;
		
		try {
			i = calc.division(5);
			System.out.println("あまりは" + i + "です");
		} catch(OddNumberException e) {
			e.printStackTrace();
			System.out.println("例外が発生しました");
		}

	}

}
