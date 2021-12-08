package beginner_09;

public class Calc {
	
	int division(int i) throws OddNumberException{
		int div = i % 2;
		if(div != 0) {
			throw new OddNumberException();
		} else {
			return div;	
		}
		
		
	}

}
