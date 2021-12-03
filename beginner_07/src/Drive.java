
public class Drive {

	public static void main(String[] args) {
		Car car = new Car(100, 0.8);
		car.message();
		
		car.customize(0.3);
		System.out.println("カスタマイズにより、燃費が3割向上");
		car.message();

	}

}
