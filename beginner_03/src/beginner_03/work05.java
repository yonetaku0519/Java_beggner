package beginner_03;

public class work05 {
	public static void main(String[] args) {
		int[] x = {10, 20, 30};
		String[] s = {"aa", "bb"};
		
		System.out.println("x0" + x[0]);
		System.out.println("x1" + x[1]);
		System.out.println("x2" + x[2]);
		System.out.println("s0" + s[0]);
		System.out.println("s1" + s[1]);
		
		int[] x2 = x;
		System.out.println("x2[0]" + x2[0]);
		System.out.println("x2[1]" + x2[1]);
		System.out.println("x2[2]" + x2[2]);
		
		x2[0] = 111;
		System.out.println("x[0]" + x[0]);
		
	}

}
